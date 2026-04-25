package bdbt_spoldzielnia_mieszkaniowa.SpringApplication;

import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
@Configuration
public class AppController implements WebMvcConfigurer {

    @Autowired
    private SpoldzielnieMieszkanioweDAO daoSpoldzielnie = new SpoldzielnieMieszkanioweDAO(new JdbcTemplate());
    @Autowired
    private PracownikDAO daoPracownik = new PracownikDAO(new JdbcTemplate());


    public void addViewControllers(ViewControllerRegistry registry) {
        registry.addViewController("/index").setViewName("index");
        registry.addViewController("/").setViewName("index");
        registry.addViewController("/main").setViewName("main");
        registry.addViewController("/login").setViewName("login");
        registry.addViewController("/main_admin").setViewName("admin/main_admin");
        registry.addViewController("/main_user").setViewName("user/main_user");

        //all views to admin/spoldzielnie_mieszkaniowe
        registry.addViewController("/spoldzielnie_mieszkaniowe/main").setViewName("admin/spoldzielnie_mieszkaniowe/main");
        registry.addViewController("/spoldzielnie_mieszkaniowe/new").setViewName("admin/spoldzielnie_mieszkaniowe/new");
        registry.addViewController("/spoldzielnie_mieszkaniowe/edit").setViewName("admin/spoldzielnie_mieszkaniowe/edit");
        registry.addViewController("delete/spoldzielnie_mieszkaniowe/main").setViewName("admin/spoldzielnie_mieszkaniowe/main");

        //all views to admin/pracownik
        registry.addViewController("/pracownik/main").setViewName("admin/pracownik/main");
        registry.addViewController("/pracownik/new").setViewName("admin/pracownik/new");
        registry.addViewController("/pracownik/edit").setViewName("admin/pracownik/edit");
        registry.addViewController("delete/pracownik/main").setViewName("admin/pracownik/main");
    }


    @Controller
    public class DashboardController
    {
        @RequestMapping("/main")
        public String defaultAfterLogin
                (HttpServletRequest request) {
            if
            (request.isUserInRole("ADMIN")) {
                return "redirect:/main_admin";
            }
            else if
            (request.isUserInRole("USER")) {
                return "redirect:/main_user";
            }
            else
            {
                return "redirect:/index";
            }
        }
    }

    //RequestMaping annotation intercepts the HTTP requests and runs the method
    @RequestMapping(value={"/main_admin"})
    public String showAdminPage(Model model) {
        return "admin/main_admin";
    }

    @RequestMapping(value={"/main_user"})
    public String showUserPage(Model model) {
        return "user/main_user";
    }



    //Mapping methods for reading/creating/editing/deleting concerning table SPOLDZIELNIE_MIESZKANIOWE
    @RequestMapping("/spoldzielnie_mieszkaniowe/main")
    public String viewSpoldzielnieMieszkaniowePage(Model model) {
        //call the DAO method to get the data
        List<SpoldzielnieMieszkaniowe> listSpoldzielnieMieszkaniowe = daoSpoldzielnie.list();
        System.out.println(listSpoldzielnieMieszkaniowe);
        model.addAttribute("listSpoldzielnieMieszkaniowe", listSpoldzielnieMieszkaniowe);

        return "admin/spoldzielnie_mieszkaniowe/main";
    }
    @RequestMapping("/spoldzielnie_mieszkaniowe/new")
    public String showNewSpoldzielnieMieszkaniowe(Model model) {
        SpoldzielnieMieszkaniowe newSpoldzielnieMieszkaniowe = new SpoldzielnieMieszkaniowe();
        model.addAttribute("newSpoldzielnieMieszkaniowe", newSpoldzielnieMieszkaniowe);

        return "admin/spoldzielnie_mieszkaniowe/new";
    }

    @RequestMapping(value = "spoldzielnie_mieszkaniowe/save", method = RequestMethod.POST)
    public String saveSpoldzielnieMieszkaniowe(@ModelAttribute("newSpoldzielnieMieszkaniowe") SpoldzielnieMieszkaniowe newSpoldzielnieMieszkaniowe) {
        daoSpoldzielnie.save(newSpoldzielnieMieszkaniowe);

        return "redirect:spoldzielnie_mieszkaniowe/main";
    }
    @RequestMapping("/edit/{nr_spoldzielni_mieszkaniowej}")
    public ModelAndView showEditFormSpoldzielnieMieszkaniowe(@PathVariable(name = "nr_spoldzielni_mieszkaniowej") int nr_spoldzielni_mieszkaniowej) {
        ModelAndView mav = new ModelAndView("admin/spoldzielnie_mieszkaniowe/edit");
        SpoldzielnieMieszkaniowe editSpoldzielnieMieszkaniowe = daoSpoldzielnie.get(nr_spoldzielni_mieszkaniowej);
        mav.addObject("editSpoldzielnieMieszkaniowe", editSpoldzielnieMieszkaniowe);

        return mav;
    }
    @RequestMapping(value = "spoldzielnie_mieszkaniowe/update", method = RequestMethod.POST)
    public String updateSpoldzielnieMieszkaniowe(@ModelAttribute("editSpoldzielnieMieszkaniowe") SpoldzielnieMieszkaniowe spoldzielnieMieszkaniowe) {
        daoSpoldzielnie.update(spoldzielnieMieszkaniowe);

        return "redirect:spoldzielnie_mieszkaniowe/main";
    }
    @RequestMapping("/delete/{nr_spoldzielni_mieszkaniowej}")
    public String deleteSpoldzielnieMieszkaniowe(@PathVariable(name = "nr_spoldzielni_mieszkaniowej") int nr_spoldzielni_mieszkaniowej) {
        daoSpoldzielnie.delete(nr_spoldzielni_mieszkaniowej);
        return "redirect:/spoldzielnie_mieszkaniowe/main";
    }

    //Mapping methods for reading/creating/editing/deleting concerning table PRACOWNIK
    @RequestMapping("/pracownik/main")
    public String viewPracownikPage(Model model) {
        //call the DAO method to get the data
        List<Pracownik> listPracownik = daoPracownik.list();
        model.addAttribute("listPracownik", listPracownik);

        return "admin/pracownik/main";
    }
    @GetMapping("/pracownik/new")
    public String showNewPracownik(Model model) {
        Pracownik newPracownik= new Pracownik();
        model.addAttribute("newPracownik", newPracownik);
        return "admin/pracownik/new";
    }

    @RequestMapping(value = "/pracownik/save", method = RequestMethod.POST)
    public String savePracownik(@Valid @ModelAttribute("newPracownik") Pracownik newPracownik,BindingResult bindingResult) {
        if (bindingResult.hasErrors()) {
            return "admin/pracownik/new";
        }
        daoPracownik.save(newPracownik);
        return "redirect:/pracownik/main";
    }
    @RequestMapping("/edit/{nrPracownika}")
    public ModelAndView showEditFormPracownik(@PathVariable(name = "nrPracownika") int nrPracownika) {
        ModelAndView mav = new ModelAndView("admin/pracownik/edit");
        Pracownik editPracownik = daoPracownik.get(nrPracownika);
        mav.addObject("editPracownik", editPracownik);
        return mav;
    }
    @RequestMapping(value = "pracownik/update", method = RequestMethod.POST)
    public String updatePracownik(@ModelAttribute("editPracownik") Pracownik pracownik) {
        daoPracownik.update(pracownik);

        return "redirect:pracownik/main";
    }
    @RequestMapping("/delete/{nrPracownika}")
    public String deletePracownik(@PathVariable(name = "nrPracownika") int nrPracownika) {
        daoPracownik.delete(nrPracownika);
        return "redirect:/pracownik/main";
    }

}




