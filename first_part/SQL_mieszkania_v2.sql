/*
Created: 18.11.2022
Modified: 03.12.2022
Project: BDBT_SpoldzielniaMieszkaniowaB
Model: model_logiczny
Author: Agnieszka Kordel and Weronika Skalska
Database: Oracle 18c
*/


-- Create sequences section -------------------------------------------------

CREATE SEQUENCE spoldzielniaMieszkaniowaSeq1
 INCREMENT BY 1
 START WITH 1
 NOMAXVALUE
 NOMINVALUE
 CACHE 20
/

CREATE SEQUENCE WlascicielSeq2
 INCREMENT BY 1
 START WITH 1
 NOMAXVALUE
 NOMINVALUE
 CACHE 20
/

CREATE SEQUENCE NieruchomoscSeq3
 NOMAXVALUE
 NOMINVALUE
 CACHE 20
/

CREATE SEQUENCE AdresSeq4
 INCREMENT BY 1
 START WITH 1
 NOMAXVALUE
 NOMINVALUE
 CACHE 20
/

CREATE SEQUENCE PocztaSeq5
 INCREMENT BY 1
 START WITH 1
 NOMAXVALUE
 NOMINVALUE
 CACHE 20
/

CREATE SEQUENCE ZrodlaEnergiiSeq6
 INCREMENT BY 1
 START WITH 1
 NOMAXVALUE
 NOMINVALUE
 CACHE 20
/

CREATE SEQUENCE CzesciWspolneSeq7
 INCREMENT BY 1
 START WITH 1
 NOMAXVALUE
 NOMINVALUE
 CACHE 20
/

CREATE SEQUENCE MieszkancySeq8
 INCREMENT BY 1
 START WITH 1
 NOMAXVALUE
 NOMINVALUE
 CACHE 20
/

CREATE SEQUENCE PracownikSeq9
 INCREMENT BY 1
 START WITH 1
 NOMAXVALUE
 NOMINVALUE
 CACHE 20
/

CREATE SEQUENCE CzynszSeq10
 INCREMENT BY 1
 START WITH 1
 NOMAXVALUE
 NOMINVALUE
 CACHE 20
/

CREATE SEQUENCE WynagrodzenieSeq11
 INCREMENT BY 1
 START WITH 1
 NOMAXVALUE
 NOMINVALUE
 CACHE 20
/

CREATE SEQUENCE StanowiskoSeq12
 INCREMENT BY 1
 START WITH 1
 NOMAXVALUE
 NOMINVALUE
 CACHE 20
/

CREATE SEQUENCE MieszkanieSeq13
 INCREMENT BY 1
 START WITH 1
 NOMAXVALUE
 NOMINVALUE
 CACHE 20
/

-- Create tables section -------------------------------------------------

-- Table Nieruchomosci

CREATE TABLE Nieruchomosci(
  nr_nieruchomosci Varchar2(100 ) NOT NULL,
  l_pieter Integer NOT NULL,
  p_calkowita Float(126) NOT NULL,
  p_uzytkowa Float(126) NOT NULL,
  data_wybudowania Date,
  Kanalizacja Char(1 ) NOT NULL,
  Podatek Number(10,2) NOT NULL,
  Hipoteka Char(1 ),
  Nr_Spoldzielni_Mieszkaniowej Integer NOT NULL,
  Nr_mieszkanca Integer,
  nr_adresu Integer NOT NULL,
  Id_zrodla_energii Integer NOT NULL
)
/

-- Create indexes for table Nieruchomosci

CREATE INDEX IX_Zarzadza ON Nieruchomosci (Nr_Spoldzielni_Mieszkaniowej)
/

CREATE INDEX IX_mieszka_na ON Nieruchomosci (Nr_mieszkanca)
/

CREATE INDEX IX_Relationship12 ON Nieruchomosci (nr_adresu)
/

CREATE INDEX IX_Relationship13 ON Nieruchomosci (Id_zrodla_energii)
/

-- Add keys for table Nieruchomosci

ALTER TABLE Nieruchomosci ADD CONSTRAINT nr_nieruchomosci PRIMARY KEY (nr_nieruchomosci)
/

-- Table blok

CREATE TABLE blok(
  Nr_nieruchomosci Varchar2(100 ) NOT NULL,
  l_mieszkan Integer NOT NULL,
  p_cz_wspolnej Float(126) NOT NULL,
  Winda Char(1 ) NOT NULL
)
/

-- Add keys for table blok

ALTER TABLE blok ADD CONSTRAINT Unique_Identifier1 PRIMARY KEY (Nr_nieruchomosci)
/

-- Table Mieszkania

CREATE TABLE Mieszkania(
  nr_mieszkania Integer NOT NULL,
  nr_pietra Integer NOT NULL,
  nr_bloku Integer NOT NULL,
  Telewizja Char(1 ) NOT NULL,
  miejsce_parkingowe Integer NOT NULL,
  Nr_mieszkanca Integer NOT NULL,
  nr_nieruchomosci Varchar2(100 )
)
/

-- Create indexes for table Mieszkania

CREATE INDEX IX_Zawiera ON Mieszkania (nr_nieruchomosci)
/

CREATE INDEX IX_Wynajmuje ON Mieszkania (Nr_mieszkanca)
/

-- Add keys for table Mieszkania

ALTER TABLE Mieszkania ADD CONSTRAINT Unique_Identifier2 PRIMARY KEY (nr_mieszkania)
/

-- Table Domy

CREATE TABLE Domy(
  Nr_nieruchomosci Varchar2(100 ) NOT NULL,
  p_ogrodu Float(126) NOT NULL,
  l_pokoi Integer NOT NULL,
  l_osob Integer
)
/

-- Add keys for table Domy

ALTER TABLE Domy ADD CONSTRAINT Unique_Identifier3 PRIMARY KEY (Nr_nieruchomosci)
/

-- Table spoldzielnie_mieszkaniowe

CREATE TABLE spoldzielnie_mieszkaniowe(
  Nr_Spoldzielni_Mieszkaniowej Integer NOT NULL,
  Nazwa Varchar2(20 ) NOT NULL,
  Data_zalozenia Date NOT NULL,
  nr_adresu Integer NOT NULL
)
/

-- Create indexes for table spoldzielnie_mieszkaniowe

CREATE INDEX IX_Relationship1 ON spoldzielnie_mieszkaniowe (nr_adresu)
/

-- Add keys for table spoldzielnie_mieszkaniowe

ALTER TABLE spoldzielnie_mieszkaniowe ADD CONSTRAINT spoldzielniaPK PRIMARY KEY (Nr_Spoldzielni_Mieszkaniowej)
/

-- Table Pracownik

CREATE TABLE Pracownik(
  nr_pracownika Integer NOT NULL,
  Imie Varchar2(10 ) NOT NULL,
  Nazwisko Varchar2(15 ) NOT NULL,
  PESEL Char(20 ) NOT NULL,
  Nr_telefonu Varchar2(12 ) NOT NULL,
  Email Varchar2(20 ),
  Data_urodzenia Date,
  Nr_Spoldzielni_Mieszkaniowej Integer NOT NULL,
  nr_adresu Integer NOT NULL,
  Nr_stanowiska Integer NOT NULL
)
/

-- Create indexes for table Pracownik

CREATE INDEX IX_Zatrudnia ON Pracownik (Nr_Spoldzielni_Mieszkaniowej)
/

CREATE INDEX IX_Relationship3 ON Pracownik (nr_adresu)
/

CREATE INDEX IX_Relationship4 ON Pracownik (Nr_stanowiska)
/

-- Add keys for table Pracownik

ALTER TABLE Pracownik ADD CONSTRAINT PracownikPK PRIMARY KEY (nr_pracownika)
/

-- Table Mieszkancy

CREATE TABLE Mieszkancy(
  Nr_mieszkanca Integer NOT NULL,
  Imie Varchar2(10 ) NOT NULL,
  Nazwisko Varchar2(15 ) NOT NULL,
  PESEL Char(11 ) NOT NULL,
  Nr_telefonu Varchar2(12 ) NOT NULL,
  Email Varchar2(20 ),
  Data_urodzenia Date,
  Czy_miejsce_parkingowe Integer,
  Nr_Spoldzielni_Mieszkaniowej Integer NOT NULL,
  Nr_adresu Integer NOT NULL
)
/

-- Create indexes for table Mieszkancy

CREATE INDEX IX_Posiada ON Mieszkancy (Nr_Spoldzielni_Mieszkaniowej)
/

CREATE INDEX IX_Relationship6 ON Mieszkancy (Nr_adresu)
/

-- Add keys for table Mieszkancy

ALTER TABLE Mieszkancy ADD CONSTRAINT MieszkaniecPK PRIMARY KEY (Nr_mieszkanca)
/

-- Table Czesci_wspolne

CREATE TABLE Czesci_wspolne(
  Nr_czesci_wspolnej Integer NOT NULL,
  Powierzchnia Float(126) NOT NULL,
  Czy_czesc_w_budynku Char(1 ) NOT NULL,
  Czy_dla_dzieci Char(1 ),
  Nr_Spoldzielni_Mieszkaniowej Integer NOT NULL,
  nr_adresu Integer NOT NULL
)
/

-- Create indexes for table Czesci_wspolne

CREATE INDEX IX_Dysponuje ON Czesci_wspolne (Nr_Spoldzielni_Mieszkaniowej)
/

CREATE INDEX IX_Relationship9 ON Czesci_wspolne (nr_adresu)
/

-- Add keys for table Czesci_wspolne

ALTER TABLE Czesci_wspolne ADD CONSTRAINT CzescWspolnaPK PRIMARY KEY (Nr_czesci_wspolnej)
/

-- Table Nieruchomosci_Pracownicy

CREATE TABLE Nieruchomosci_Pracownicy(
  nr_nieruchomosci Varchar2(100 ) NOT NULL,
  nr_pracownika Integer NOT NULL
)
/

-- Table Adresy

CREATE TABLE Adresy(
  Nr_adresu Integer NOT NULL,
  Nr_lokalu Varchar2(5 ) NOT NULL,
  Ulica Varchar2(30 ) NOT NULL,
  Miasto Varchar2(20 ) NOT NULL,
  Nr_poczty Integer NOT NULL
)
/

-- Create indexes for table Adresy

CREATE UNIQUE INDEX IX_Relationship_01 ON Adresy (Nr_poczty)
/

-- Add keys for table Adresy

ALTER TABLE Adresy ADD CONSTRAINT PK_Adresy PRIMARY KEY (Nr_adresu)
/

-- Table and Columns comments section

COMMENT ON COLUMN Adresy.Nr_adresu IS 'Unikatowy klucz główny encji adres'
/
COMMENT ON COLUMN Adresy.Nr_lokalu IS 'Numer lokalu
'
/
COMMENT ON COLUMN Adresy.Ulica IS 'Ulica'
/
COMMENT ON COLUMN Adresy.Miasto IS 'Miasto danego adresu.'
/

-- Table Wlasciciele

CREATE TABLE Wlasciciele(
  Nr_wlasciciela Integer NOT NULL,
  Imie Varchar2(20 ) NOT NULL,
  Nazwisko Varchar2(30 ) NOT NULL,
  nr_nieruchomosci Varchar2(100 ),
  Nr_Spoldzielni_Mieszkaniowej Integer
)
/

-- Create indexes for table Wlasciciele

CREATE INDEX IX_Relationship22 ON Wlasciciele (nr_nieruchomosci)
/

CREATE INDEX IX_Relationship2 ON Wlasciciele (Nr_Spoldzielni_Mieszkaniowej)
/

-- Add keys for table Wlasciciele

ALTER TABLE Wlasciciele ADD CONSTRAINT PK_Wlasciciele PRIMARY KEY (Nr_wlasciciela)
/

-- Table and Columns comments section

COMMENT ON COLUMN Wlasciciele.Nr_wlasciciela IS 'Unikalny numer właściela.'
/
COMMENT ON COLUMN Wlasciciele.Imie IS 'Imię właściciela'
/
COMMENT ON COLUMN Wlasciciele.Nazwisko IS 'Nazwisko właściela'
/

-- Table Poczty

CREATE TABLE Poczty(
  Nr_poczty Integer NOT NULL,
  Kod_poczty Char(6 ) NOT NULL,
  Poczta Varchar2(20 ) NOT NULL
)
/

-- Add keys for table Poczty

ALTER TABLE Poczty ADD CONSTRAINT PK_Poczty PRIMARY KEY (Nr_poczty)
/

ALTER TABLE Poczty ADD CONSTRAINT Kod_poczty UNIQUE (Kod_poczty)
/

-- Table and Columns comments section

COMMENT ON COLUMN Poczty.Nr_poczty IS 'Unikatowy numer poczty'
/
COMMENT ON COLUMN Poczty.Kod_poczty IS 'Kod poczty'
/
COMMENT ON COLUMN Poczty.Poczta IS 'Miejsce poczty.'
/

-- Table Stanowiska

CREATE TABLE Stanowiska(
  Nr_stanowiska Integer NOT NULL,
  Nazwa_stanowiska Varchar2(20 ) NOT NULL,
  Opis Varchar2(400 ) NOT NULL
)
/

-- Add keys for table Stanowiska

ALTER TABLE Stanowiska ADD CONSTRAINT PK_Stanowiska PRIMARY KEY (Nr_stanowiska)
/

-- Table and Columns comments section

COMMENT ON COLUMN Stanowiska.Nr_stanowiska IS 'Unikatowy numer stanowiska'
/
COMMENT ON COLUMN Stanowiska.Nazwa_stanowiska IS 'Nazwa stanowiska'
/
COMMENT ON COLUMN Stanowiska.Opis IS 'Opis stanowiska'
/

-- Table Wynagrodzenia

CREATE TABLE Wynagrodzenia(
  Nr_wynagrodzenia Integer NOT NULL,
  Data_wynagrodzenia Date NOT NULL,
  Kwota Number(8,2) NOT NULL,
  Kwota_dot Number(8,2) NOT NULL,
  nr_pracownika Integer NOT NULL
)
/

-- Create indexes for table Wynagrodzenia

CREATE INDEX IX_Relationship66 ON Wynagrodzenia (nr_pracownika)
/

-- Add keys for table Wynagrodzenia

ALTER TABLE Wynagrodzenia ADD CONSTRAINT PK_Wynagrodzenia PRIMARY KEY (Nr_wynagrodzenia)
/

-- Table and Columns comments section

COMMENT ON COLUMN Wynagrodzenia.Nr_wynagrodzenia IS 'Unikatowy numer wynagrodzenia'
/
COMMENT ON COLUMN Wynagrodzenia.Data_wynagrodzenia IS 'Data wynagrodzenia'
/
COMMENT ON COLUMN Wynagrodzenia.Kwota IS 'Wysokość wynagrodzenia'
/
COMMENT ON COLUMN Wynagrodzenia.Kwota_dot IS 'Wysokość premii'
/

-- Table Czynsze

CREATE TABLE Czynsze(
  Nr_czynszu Integer NOT NULL,
  Oplata_za_media Number(5,2) NOT NULL,
  Kwota Number(5,2) NOT NULL,
  Nr_mieszkanca Integer NOT NULL,
  nr_mieszkania Integer NOT NULL
)
/

-- Create indexes for table Czynsze

CREATE INDEX IX_Relationship7 ON Czynsze (Nr_mieszkanca)
/

CREATE INDEX IX_Relationship11 ON Czynsze (nr_mieszkania)
/

-- Add keys for table Czynsze

ALTER TABLE Czynsze ADD CONSTRAINT PK_Czynsze PRIMARY KEY (Nr_czynszu)
/

-- Table and Columns comments section

COMMENT ON COLUMN Czynsze.Nr_czynszu IS 'Unikatowy numer czynszu.'
/
COMMENT ON COLUMN Czynsze.Oplata_za_media IS 'Wysokosc_oplaty_za_media'
/
COMMENT ON COLUMN Czynsze.Kwota IS 'Wysokość płaconego miesięcznie czynszu.'
/

-- Table Zrodla_energii

CREATE TABLE Zrodla_energii(
  Id_zrodla_energii Integer NOT NULL,
  Nazwa Varchar2(20 ) NOT NULL,
  Opis Varchar2(400 ) NOT NULL
)
/

-- Add keys for table Zrodla_energii

ALTER TABLE Zrodla_energii ADD CONSTRAINT PK_Zrodla_energii PRIMARY KEY (Id_zrodla_energii)
/

-- Table and Columns comments section

COMMENT ON COLUMN Zrodla_energii.Id_zrodla_energii IS 'Unikatowy identyfikator źródła energii.'
/
COMMENT ON COLUMN Zrodla_energii.Nazwa IS 'Nazwa źródła energii.'
/
COMMENT ON COLUMN Zrodla_energii.Opis IS 'Opis źródła energii.'
/

-- Table Podatki

CREATE TABLE Podatki(
  Nr_podatku Number(10,2) NOT NULL,
  Kwota Number(6,2) NOT NULL,
  Opis Char(400 ) NOT NULL,
  nr_nieruchomosci Varchar2(100 ) NOT NULL
)
/

-- Create indexes for table Podatki

CREATE INDEX IX_Relationship14 ON Podatki (nr_nieruchomosci)
/

-- Table and Columns comments section

COMMENT ON COLUMN Podatki.Nr_podatku IS 'Unikatowy numer podatkowy.'
/
COMMENT ON COLUMN Podatki.Kwota IS 'Kwota podatku.'
/
COMMENT ON COLUMN Podatki.Opis IS 'Czego dotyczy podatek.'
/

-- Trigger for sequence NieruchomoscSeq3 for column nr_nieruchomosci in table Nieruchomosci ---------
CREATE OR REPLACE TRIGGER ts_Nieruchomosci_NieruchomoscSeq3 BEFORE INSERT
ON Nieruchomosci FOR EACH ROW
BEGIN
  :new.nr_nieruchomosci := NieruchomoscSeq3.nextval;
END;
/
CREATE OR REPLACE TRIGGER tsu_Nieruchomosci_NieruchomoscSeq3 AFTER UPDATE OF nr_nieruchomosci
ON Nieruchomosci FOR EACH ROW
BEGIN
  RAISE_APPLICATION_ERROR(-20010,'Cannot update column nr_nieruchomosci in table Nieruchomosci as it uses sequence.');
END;
/

-- Trigger for sequence MieszkanieSeq13 for column nr_mieszkania in table Mieszkania ---------
CREATE OR REPLACE TRIGGER ts_Mieszkania_MieszkanieSeq13 BEFORE INSERT
ON Mieszkania FOR EACH ROW
BEGIN
  :new.nr_mieszkania := MieszkanieSeq13.nextval;
END;
/
CREATE OR REPLACE TRIGGER tsu_Mieszkania_MieszkanieSeq13 AFTER UPDATE OF nr_mieszkania
ON Mieszkania FOR EACH ROW
BEGIN
  RAISE_APPLICATION_ERROR(-20010,'Cannot update column nr_mieszkania in table Mieszkania as it uses sequence.');
END;
/

-- Trigger for sequence spoldzielniaMieszkaniowaSeq1 for column Nr_Spoldzielni_Mieszkaniowej in table spoldzielnie_mieszkaniowe ---------
CREATE OR REPLACE TRIGGER ts_spoldzielnie_mieszkaniowe_spoldzielniaMieszkaniowaSeq1 BEFORE INSERT
ON spoldzielnie_mieszkaniowe FOR EACH ROW
BEGIN
  :new.Nr_Spoldzielni_Mieszkaniowej := spoldzielniaMieszkaniowaSeq1.nextval;
END;
/
CREATE OR REPLACE TRIGGER tsu_spoldzielnie_mieszkaniowe_spoldzielniaMieszkaniowaSeq1 AFTER UPDATE OF Nr_Spoldzielni_Mieszkaniowej
ON spoldzielnie_mieszkaniowe FOR EACH ROW
BEGIN
  RAISE_APPLICATION_ERROR(-20010,'Cannot update column Nr_Spoldzielni_Mieszkaniowej in table spoldzielnie_mieszkaniowe as it uses sequence.');
END;
/

-- Trigger for sequence PracownikSeq9 for column nr_pracownika in table Pracownik ---------
CREATE OR REPLACE TRIGGER ts_Pracownik_PracownikSeq9 BEFORE INSERT
ON Pracownik FOR EACH ROW
BEGIN
  :new.nr_pracownika := PracownikSeq9.nextval;
END;
/
CREATE OR REPLACE TRIGGER tsu_Pracownik_PracownikSeq9 AFTER UPDATE OF nr_pracownika
ON Pracownik FOR EACH ROW
BEGIN
  RAISE_APPLICATION_ERROR(-20010,'Cannot update column nr_pracownika in table Pracownik as it uses sequence.');
END;
/

-- Trigger for sequence CzesciWspolneSeq7 for column Nr_czesci_wspolnej in table Czesci_wspolne ---------
CREATE OR REPLACE TRIGGER ts_Czesci_wspolne_CzesciWspolneSeq7 BEFORE INSERT
ON Czesci_wspolne FOR EACH ROW
BEGIN
  :new.Nr_czesci_wspolnej := CzesciWspolneSeq7.nextval;
END;
/
CREATE OR REPLACE TRIGGER tsu_Czesci_wspolne_CzesciWspolneSeq7 AFTER UPDATE OF Nr_czesci_wspolnej
ON Czesci_wspolne FOR EACH ROW
BEGIN
  RAISE_APPLICATION_ERROR(-20010,'Cannot update column Nr_czesci_wspolnej in table Czesci_wspolne as it uses sequence.');
END;
/

-- Trigger for sequence AdresSeq4 for column Nr_adresu in table Adresy ---------
CREATE OR REPLACE TRIGGER ts_Adresy_AdresSeq4 BEFORE INSERT
ON Adresy FOR EACH ROW
BEGIN
  :new.Nr_adresu := AdresSeq4.nextval;
END;
/
CREATE OR REPLACE TRIGGER tsu_Adresy_AdresSeq4 AFTER UPDATE OF Nr_adresu
ON Adresy FOR EACH ROW
BEGIN
  RAISE_APPLICATION_ERROR(-20010,'Cannot update column Nr_adresu in table Adresy as it uses sequence.');
END;
/

-- Trigger for sequence WlascicielSeq2 for column Nr_wlasciciela in table Wlasciciele ---------
CREATE OR REPLACE TRIGGER ts_Wlasciciele_WlascicielSeq2 BEFORE INSERT
ON Wlasciciele FOR EACH ROW
BEGIN
  :new.Nr_wlasciciela := WlascicielSeq2.nextval;
END;
/
CREATE OR REPLACE TRIGGER tsu_Wlasciciele_WlascicielSeq2 AFTER UPDATE OF Nr_wlasciciela
ON Wlasciciele FOR EACH ROW
BEGIN
  RAISE_APPLICATION_ERROR(-20010,'Cannot update column Nr_wlasciciela in table Wlasciciele as it uses sequence.');
END;
/

-- Trigger for sequence PocztaSeq5 for column Nr_poczty in table Poczty ---------
CREATE OR REPLACE TRIGGER ts_Poczty_PocztaSeq5 BEFORE INSERT
ON Poczty FOR EACH ROW
BEGIN
  :new.Nr_poczty := PocztaSeq5.nextval;
END;
/
CREATE OR REPLACE TRIGGER tsu_Poczty_PocztaSeq5 AFTER UPDATE OF Nr_poczty
ON Poczty FOR EACH ROW
BEGIN
  RAISE_APPLICATION_ERROR(-20010,'Cannot update column Nr_poczty in table Poczty as it uses sequence.');
END;
/

-- Trigger for sequence StanowiskoSeq12 for column Nr_stanowiska in table Stanowiska ---------
CREATE OR REPLACE TRIGGER ts_Stanowiska_StanowiskoSeq12 BEFORE INSERT
ON Stanowiska FOR EACH ROW
BEGIN
  :new.Nr_stanowiska := StanowiskoSeq12.nextval;
END;
/
CREATE OR REPLACE TRIGGER tsu_Stanowiska_StanowiskoSeq12 AFTER UPDATE OF Nr_stanowiska
ON Stanowiska FOR EACH ROW
BEGIN
  RAISE_APPLICATION_ERROR(-20010,'Cannot update column Nr_stanowiska in table Stanowiska as it uses sequence.');
END;
/

-- Trigger for sequence WynagrodzenieSeq11 for column Nr_wynagrodzenia in table Wynagrodzenia ---------
CREATE OR REPLACE TRIGGER ts_Wynagrodzenia_WynagrodzenieSeq11 BEFORE INSERT
ON Wynagrodzenia FOR EACH ROW
BEGIN
  :new.Nr_wynagrodzenia := WynagrodzenieSeq11.nextval;
END;
/
CREATE OR REPLACE TRIGGER tsu_Wynagrodzenia_WynagrodzenieSeq11 AFTER UPDATE OF Nr_wynagrodzenia
ON Wynagrodzenia FOR EACH ROW
BEGIN
  RAISE_APPLICATION_ERROR(-20010,'Cannot update column Nr_wynagrodzenia in table Wynagrodzenia as it uses sequence.');
END;
/

-- Trigger for sequence CzynszSeq10 for column Nr_czynszu in table Czynsze ---------
CREATE OR REPLACE TRIGGER ts_Czynsze_CzynszSeq10 BEFORE INSERT
ON Czynsze FOR EACH ROW
BEGIN
  :new.Nr_czynszu := CzynszSeq10.nextval;
END;
/
CREATE OR REPLACE TRIGGER tsu_Czynsze_CzynszSeq10 AFTER UPDATE OF Nr_czynszu
ON Czynsze FOR EACH ROW
BEGIN
  RAISE_APPLICATION_ERROR(-20010,'Cannot update column Nr_czynszu in table Czynsze as it uses sequence.');
END;
/

-- Trigger for sequence ZrodlaEnergiiSeq6 for column Id_zrodla_energii in table Zrodla_energii ---------
CREATE OR REPLACE TRIGGER ts_Zrodla_energii_ZrodlaEnergiiSeq6 BEFORE INSERT
ON Zrodla_energii FOR EACH ROW
BEGIN
  :new.Id_zrodla_energii := ZrodlaEnergiiSeq6.nextval;
END;
/
CREATE OR REPLACE TRIGGER tsu_Zrodla_energii_ZrodlaEnergiiSeq6 AFTER UPDATE OF Id_zrodla_energii
ON Zrodla_energii FOR EACH ROW
BEGIN
  RAISE_APPLICATION_ERROR(-20010,'Cannot update column Id_zrodla_energii in table Zrodla_energii as it uses sequence.');
END;
/


-- Create foreign keys (relationships) section ------------------------------------------------- 

ALTER TABLE Mieszkania ADD CONSTRAINT Zawiera FOREIGN KEY (nr_nieruchomosci) REFERENCES blok (Nr_nieruchomosci)
/



ALTER TABLE Nieruchomosci ADD CONSTRAINT Zarzadza FOREIGN KEY (Nr_Spoldzielni_Mieszkaniowej) REFERENCES spoldzielnie_mieszkaniowe (Nr_Spoldzielni_Mieszkaniowej)
/



ALTER TABLE Pracownik ADD CONSTRAINT Zatrudnia FOREIGN KEY (Nr_Spoldzielni_Mieszkaniowej) REFERENCES spoldzielnie_mieszkaniowe (Nr_Spoldzielni_Mieszkaniowej)
/



ALTER TABLE Czesci_wspolne ADD CONSTRAINT Dysponuje FOREIGN KEY (Nr_Spoldzielni_Mieszkaniowej) REFERENCES spoldzielnie_mieszkaniowe (Nr_Spoldzielni_Mieszkaniowej)
/



ALTER TABLE Mieszkancy ADD CONSTRAINT Posiada FOREIGN KEY (Nr_Spoldzielni_Mieszkaniowej) REFERENCES spoldzielnie_mieszkaniowe (Nr_Spoldzielni_Mieszkaniowej)
/



ALTER TABLE Mieszkania ADD CONSTRAINT Wynajmuje FOREIGN KEY (Nr_mieszkanca) REFERENCES Mieszkancy (Nr_mieszkanca)
/



ALTER TABLE Nieruchomosci ADD CONSTRAINT mieszka_na FOREIGN KEY (Nr_mieszkanca) REFERENCES Mieszkancy (Nr_mieszkanca)
/



ALTER TABLE spoldzielnie_mieszkaniowe ADD CONSTRAINT Spoldzielnia_posiada_adres FOREIGN KEY (nr_adresu) REFERENCES Adresy (Nr_adresu)
/



ALTER TABLE Adresy ADD CONSTRAINT Adres_ma_poczte FOREIGN KEY (Nr_poczty) REFERENCES Poczty (Nr_poczty)
/



ALTER TABLE Pracownik ADD CONSTRAINT Pracownik_ma_adres FOREIGN KEY (nr_adresu) REFERENCES Adresy (Nr_adresu)
/



ALTER TABLE Pracownik ADD CONSTRAINT Pracownik_ma_stanowisko FOREIGN KEY (Nr_stanowiska) REFERENCES Stanowiska (Nr_stanowiska)
/



ALTER TABLE Wynagrodzenia ADD CONSTRAINT Pracownik_ma_wynagrodzenie FOREIGN KEY (nr_pracownika) REFERENCES Pracownik (nr_pracownika)
/



ALTER TABLE Czynsze ADD CONSTRAINT Placi_czynsz FOREIGN KEY (Nr_mieszkanca) REFERENCES Mieszkancy (Nr_mieszkanca)
/



ALTER TABLE Czesci_wspolne ADD CONSTRAINT Znajduje_sie FOREIGN KEY (nr_adresu) REFERENCES Adresy (Nr_adresu)
/



ALTER TABLE Czynsze ADD CONSTRAINT Mieszkanie_ma_czynsz FOREIGN KEY (nr_mieszkania) REFERENCES Mieszkania (nr_mieszkania)
/



ALTER TABLE Nieruchomosci ADD CONSTRAINT Nieruchomosc_znajduje_sie FOREIGN KEY (nr_adresu) REFERENCES Adresy (Nr_adresu)
/



ALTER TABLE Nieruchomosci ADD CONSTRAINT Posiada_zrodlo_energii FOREIGN KEY (Id_zrodla_energii) REFERENCES Zrodla_energii (Id_zrodla_energii)
/



ALTER TABLE Podatki ADD CONSTRAINT Podatek_obejmuje_nieruchomosc FOREIGN KEY (nr_nieruchomosci) REFERENCES Nieruchomosci (nr_nieruchomosci)
/



ALTER TABLE Wlasciciele ADD CONSTRAINT Jest_w_posiadaniu FOREIGN KEY (nr_nieruchomosci) REFERENCES Nieruchomosci (nr_nieruchomosci)
/



ALTER TABLE Wlasciciele ADD CONSTRAINT Spoldzielnia_ma_wlasciciela FOREIGN KEY (Nr_Spoldzielni_Mieszkaniowej) REFERENCES spoldzielnie_mieszkaniowe (Nr_Spoldzielni_Mieszkaniowej)
/



ALTER TABLE Mieszkancy ADD CONSTRAINT Mieszkanie_ma_adres FOREIGN KEY (Nr_adresu) REFERENCES Adresy (Nr_adresu)
/





