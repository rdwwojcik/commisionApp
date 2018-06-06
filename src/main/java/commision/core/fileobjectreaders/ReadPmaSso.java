package commision.core.fileobjectreaders;

import commision.core.entities.BaseImportFileEntity;
import org.apache.log4j.Logger;
import commision.core.entities.pma.Pma;
import commision.core.entities.pma.PmaSso;
import commision.core.util.CellParser;

/**
 * Created by Radek on 24.10.2017.
 */
public class ReadPmaSso extends ObjectFileReader<BaseImportFileEntity> {

    private static final Logger logger = Logger.getLogger(ReadPmaSso.class);

    @Override
    public Pma getRow(String[] row) {
        PmaSso sso = new PmaSso();
        String[] headers = getHeaders();
        for(int i = 0; i < headers.length; i++){
            String header = headers[i].toLowerCase().trim();
            String value = row[i];
            if(i==89)
                header += "89";
            if(i==93)
                header += "93";

            switch (header){
                case "nazwa sekcji": { sso.setNazwaSekcji(value); break; }
                case "kod dealera": { sso.setKodDealera(value); break; }
                case "czesc glowna kodu": { sso.setKodGlowny(value); break; }
                case "czesc dodatkowa kodu": { sso.setKodDodatkowy(value); break;}
                case "data statusu": { sso.setDataStatusu(CellParser.parseStringToDate(value)); break;}
                case "data deaktywacji": { sso.setDataDeaktywacji(CellParser.parseStringToDate(value)); break;}
                case "numer kontraktu": { sso.setNrKontraktu(value); break;}
                case "id kontraktu": { sso.setIdKontraktu(value); break;}
                case "tymczasowy msisdn": { sso.setTymczasowyMsisdn(value); break;}
                case "msisdn": { sso.setMsisdn(value); break;}
                case "typ koszyka (netto/brutto)": { sso.setTypKoszyka(value); break;}
                case "nowy koszyk uslug": { sso.setKoszykUslug(value); break;}
                case "nazwa planu taryfowego": { sso.setNazwaPlanuTaryf(value); break;}
                case "nazwa uslugi": { sso.setNazwaUslugi(value); break;}
                case "kod promocji": { sso.setKodPromocji(value); break;}
                case "uslugi skladowe abonamentu": { sso.setUslSkladoweAbonamentu(value); break;}
                case "kod aktywacji": { sso.setKodAktywacji(value); break;}
                case "kombinacja abonamentow": { sso.setKombinacjaAbon(value); break;}
                case "typ pn": { sso.setTypPn(value); break;}
                case "dlugosc umowy": { sso.setDlUmowy(CellParser.parseStringToDouble(value)); break;}
                case "abonament": { sso.setAbonamentNetto(CellParser.parseStringToDouble(value)); break;}
                case "wspolczynnik budzetu": { sso.setWspBudzetu(CellParser.parseStringToInt(value)); break;}
                case "wartosc uslugi dodanej": { sso.setWartUslugiDod(CellParser.parseStringToDouble(value)); break;}
                case "oplata aktywacyjna": { sso.setOplataAktywacyjna(CellParser.parseStringToDouble(value)); break;}
                case "model terminala": { sso.setModelTerminala(value); break;}
                case "wartosc terminali": { sso.setWartTerminali(CellParser.parseStringToDouble(value)); break;}
                case "wartosc kredytu": { sso.setWartKredytu(CellParser.parseStringToDouble(value)); break;}
                case "delta abonamentow": { sso.setDeltaAbon(CellParser.parseStringToDouble(value)); break;}
                case "wspolczynnik z": { sso.setWspZ(CellParser.parseStringToDouble(value)); break;}
                case "premia podstawowa": { sso.setPremiaPodstawowa(CellParser.parseStringToDouble(value)); break;}
                case "cel ilosciowy": { sso.setPlanIl(CellParser.parseStringToDouble(value)); break;}
                case "realizacja celu ilosciowego": { sso.setRealPlanuIl(CellParser.parseStringToDouble(value)); break;}
                case "% realizacji celu ilosciowego": { sso.setPrcRealPlanuIl(CellParser.parseStringToDouble(value)); break;}
                case "cel wartosciowy": { sso.setPlanWart(CellParser.parseStringToDouble(value)); break;}
                case "realizacja celu wartosciowego": { sso.setRealPlanuWart(CellParser.parseStringToDouble(value)); break;}
                case "% realizacji celu wartosciowego": { sso.setPrcRealPlanuWart(CellParser.parseStringToDouble(value)); break;}
                case "wspolczynnik p (ilosc+wartosc)": { sso.setWspP(CellParser.parseStringToDouble(value)); break;}
                case "bonus miesieczny": { sso.setBonusMies(CellParser.parseStringToDouble(value)); break;}
                case "wspolczynik y": { sso.setWspY(CellParser.parseStringToDouble(value)); break;}
                case "suma q": { sso.setSumaQ(CellParser.parseStringToDouble(value)); break;}
                case "wspolczynik s": { sso.setWspS(CellParser.parseStringToDouble(value)); break;}
                case "premia za sieciowosc": { sso.setPremiaSiec(CellParser.parseStringToDouble(value)); break;}
                case "kwota do wyplaty": { sso.setKwotaDoWyplaty(CellParser.parseStringToDouble(value)); break;}
                case "self replacement": { sso.setSelfReplacement(value); break;}
                case "sd": { sso.setSd(CellParser.parseStringToInt(value)); break;}
                case "abonament przed utrzymaniem": { sso.setAbonPrzedUtrz(CellParser.parseStringToDouble(value)); break;}
                case "abonament po utrzymaniu": { sso.setAbonPoUtrz(CellParser.parseStringToDouble(value)); break;}
                case "sredni rachunek z ostatnich 3 miesiecy": { sso.setSrRach3Mies(CellParser.parseStringToDouble(value)); break;}
                case "wartosc kontraktu": { sso.setWartoscKontraktu(CellParser.parseStringToDouble(value)); break;}
                case "abonament do celu": { sso.setAbonDoCelu(CellParser.parseStringToDouble(value)); break;}
                case "wartosc kontraktu cel": { sso.setWartKontraktuCel(CellParser.parseStringToDouble(value)); break;}
                case "imei": { sso.setImei(value); break;}
                case "cena zakupu terminali przez klienta": { sso.setCenaZakTermKlienta(CellParser.parseStringToDouble(value)); break;}
                case "cena hurtowa terminali": { sso.setCenaHutTerm(CellParser.parseStringToDouble(value)); break;}
                case "kwota kredytu": { sso.setKwotaKredytu(CellParser.parseStringToDouble(value)); break;}
                case "subsydia": { sso.setSubsydia(CellParser.parseStringToDouble(value)); break;}
                case "poziom negocjacji": { sso.setPoziomNeg(CellParser.parseStringToInt(value)); break;}
                case "liczba uslug": { sso.setLiUsl(CellParser.parseStringToInt(value)); break;}
                case "liczba terminali": { sso.setLiTerminali(CellParser.parseStringToInt(value)); break;}
                case "oferta gotowa": { sso.setOfertaGotowa(CellParser.parseStringToInt(value)); break;}
                case "numer konta abonenckiego": { sso.setNrKontaAbon(CellParser.parseStringToLong(value)); break;}
                case "proces sprzedazy": { sso.setProcesSprzedazy(value); break;}
                case "login": { sso.setLogin(value); break;}
                case "sncode": { sso.setSnCode(value); break;}
                case "spcode": { sso.setSpCode(value); break;}
                case "powod naliczenia": { sso.setPowodNal(value); break;}
                case "nazwa typu zdarzenia": { sso.setNazwaTypuZdarzenia(value); break;}
                case "id zdarzenia": { sso.setIdZdarzenia(value); break;}
                case "aktywnosc promocyjno-reklamowa (coop)": { sso.setAktReklamowa(CellParser.parseStringToDouble(value)); break;}
                case "szerszy opis": { sso.setSzerszyOpis(value); break;}
                case "zestaw nagrod": { sso.setZestawNagrod(value); break;}
                case "lead typ": { sso.setLeadTyp(value); break;}
                case "customer global id": { sso.setGlobalId(CellParser.parseStringToLong(value)); break;}
                case "sd kontrakt": { sso.setSdKontrakt(CellParser.parseStringToLong(value)); break;}
                case "sd id pracownika": { sso.setSdPracownika(CellParser.parseStringToLong(value)); break;}
                case "sd id klienta": { sso.setSdKlienta(CellParser.parseStringToLong(value)); break;}
                case "id planu": { sso.setIdPlanu(value); break;}
                case "id oferty": { sso.setIdOferty(value); break;}
                case "nip": { sso.setNip(value); break;}
                case "wspolczynnik clawback": { sso.setWspClawback(CellParser.parseStringToDouble(value)); break;}
                case "poziom salonu": { sso.setPoziomSalonu(value); break;}
                case "ilosc": { sso.setIlosc(CellParser.parseStringToInt(value)); break;}
                case "zdarzenie ratalne": { sso.setZdarzenieRatalne(value); break;}
                case "rodzaj oferty": { sso.setRodzajOferty(value); break;}
                case "korekta": { sso.setKorekta(CellParser.parseStringToInt(value)); break;}
                case "baza sprzedawcy": { sso.setBazaRh(CellParser.parseStringToDouble(value)); break;}
                case "cel ilosciowy sprzedawcy": { sso.setPlanIlRh(CellParser.parseStringToDouble(value)); break;}
                case "wykonanie celu ilosciowego sprzedawcy": { sso.setRealPlanuIlRh(CellParser.parseStringToDouble(value)); break;}
                case "% realizacji celu ilosciowego sprzedawcy": { sso.setPrcRealPlanuIlRh(CellParser.parseStringToDouble(value)); break;}
                case "wspolczynnik p (ilosc)89": { sso.setWspPIlRh(CellParser.parseStringToDouble(value)); break; }
                case "cel wartosciowy sprzedawcy": { sso.setPlanWartRh(CellParser.parseStringToDouble(value)); break;}
                case "wykonanie celu wartosciowego sprzedawcy": { sso.setRealPlanuWartRh(CellParser.parseStringToDouble(value)); break;}
                case "% realizacji celu wartosciowego sprzedawcy": { sso.setPrcRealPlanuWartRh(CellParser.parseStringToDouble(value)); break; }
                case "wspolczynnik p (wartosc)93": { sso.setWspPWartRh(CellParser.parseStringToDouble(value)); break;}
                case "waga koszyka sprzedwcy": { sso.setWagaKoszykaRh(CellParser.parseStringToDouble(value)); break;}
                case "wspolczynnik korekcyjny sprzedawcy": { sso.setWspKorekcyjnyRh(CellParser.parseStringToDouble(value)); break;}
                case "realizacja wazona koszykow sprzedawcy": { sso.setRealWazKoszRh(CellParser.parseStringToDouble(value)); break;}
                case "realizacja wazona koszykow sprzedawcy (warunek wypłaty)": { sso.setRealWazKoszRhWarunek(CellParser.parseStringToDouble(value)); break;}
                case "współczynnik kpi sprzedawcy": { sso.setWspKpiRh(CellParser.parseStringToDouble(value)); break;}
                case "prowizja dla sprzedawcy (informacja)": { sso.setProwizjaRhInf(CellParser.parseStringToDouble(value)); break;}
                case "prowizja za realizację celu agenta (100%) - sprzedawca (informacja)": { sso.setProwZaRealCeluAgRh(CellParser.parseStringToDouble(value)); break;}
                case "baza kierownika": { sso.setBazaKsso(CellParser.parseStringToDouble(value)); break;}
                case "cel ilosciowy kierownika": { sso.setPlanIlKsso(CellParser.parseStringToDouble(value)); break;}
                case "wykonanie celu ilosciowego kierownika": { sso.setRealPlanuIlKsso(CellParser.parseStringToDouble(value)); break;}
                case "% realizacji celu ilosciowego kierownika": { sso.setPrcRealPlanuIlKsso(CellParser.parseStringToDouble(value)); break;}
                case "wspolczynnik p (ilosc)": { sso.setWspPIlKsso(CellParser.parseStringToDouble(value)); break;}
                case "cel wartosciowy kierownika": { sso.setPlanWartKsso(CellParser.parseStringToDouble(value)); break;}
                case "wykonanie celu wartosciowego kierownika": { sso.setRealPlanuWartKsso(CellParser.parseStringToDouble(value)); break;}
                case "% realizacji celu wartosciowego kierownika": { sso.setPrcRealPlanuWartKsso(CellParser.parseStringToDouble(value)); break;}
                case "wspolczynnik p (wartosc)": { sso.setWspPWartKsso(CellParser.parseStringToDouble(value)); break;}
                case "waga koszyka kierownika": { sso.setWagaKoszykaKsso(CellParser.parseStringToDouble(value)); break;}
                case "wspolczynnik korekcyjny kierownika": { sso.setWspKorekcyjnyKsso(CellParser.parseStringToDouble(value)); break;}
                case "realizacja wazona koszykow kierownika": { sso.setRealWazKoszKsso(CellParser.parseStringToDouble(value)); break;}
                case "realizacja wazona koszykow kierownika (warunek wypłaty)": { sso.setRealWazKoszKssoWarunek(CellParser.parseStringToDouble(value)); break;}
                case "współczynnik kpi kierownika": { sso.setWspKpiKsso(CellParser.parseStringToDouble(value)); break;}
                case "prowizja dla kierownika (informacja)": { sso.setProwizjaKssoInf(CellParser.parseStringToDouble(value)); break;}
                case "prowizja za realizację celu agenta (100%) - kierownik (informacja)": { sso.setProwZaRealCeluAgKsso(CellParser.parseStringToDouble(value)); break;}
                case "ifs_akcja": { sso.setIfsAkcja(value); break;}
                case "ifs_blanket_order": { sso.setIfsBlanketOrder(CellParser.parseStringToInt(value)); break;}
                case "ifs_code_a": { sso.setIfsCodeA(value); break;}
                case "ifs_code_b": { sso.setIfsCodeB(value); break;}
                case "ifs_code_c": { sso.setIfsCodeC(value); break;}
                case "ifs_code_d": { sso.setIfsCodeD(value); break;}
                case "ifs_code_e": { sso.setIfsCodeE(value); break;}
                case "ifs_code_f": { sso.setIfsCodeF(value); break;}
                case "ifs_code_g": { sso.setIfsCodeG(value); break;}
                case "ifs_code_h": { sso.setIfsCodeH(value); break;}
                case "ifs_code_i": { sso.setIfsCodeI(value); break;}
                case "ifs_currency_code": { sso.setIfsCurrencyCode(value); break;}
                case "ifs_date_of_sales": { sso.setIfsdateOfSale(CellParser.parseStringToDate(value)); break;}
                case "ifs_error_desc": { sso.setIfsErrorDesc(value); break;}
                case "ifs_id": { sso.setIfsId(CellParser.parseStringToLong(value)); break;}
                case "ifs_invoice_date": { sso.setIfsInvoiceDate(CellParser.parseStringToDate(value)); break;}
                case "ifs_line_no": { sso.setIfsLineNo(CellParser.parseStringToInt(value)); break;}
                case "ifs_note_text": { sso.setIfsNoteText(value); break;}
                case "ifs_order_no": { sso.setIfsOrderNo(CellParser.parseStringToInt(value)); break;}
                case "ifs_part_desc": { sso.setIfsPartDesc(value); break;}
                case "ifs_part_no": { sso.setIfsPartNo(value); break;}
                case "ifs_period": { sso.setIfsPeriod(value); sso.setDataProwizji(CellParser.parseYearMonthToDate(value)); break;}
                case "ifs_plan": { sso.setIfsPlan(value); break;}
                case "ifs_price": { sso.setIfsPrice(CellParser.parseStringToDouble(value)); break;}
                case "ifs_prj_id": { sso.setIfsPrjId(value); break;}
                case "ifs_prowizja": { sso.setIfsProwizja(value); break;}
                case "ifs_quantity": { sso.setIfsQuantity(CellParser.parseStringToInt(value)); break;}
                case "ifs_release_no": { sso.setIfsReleanseNo(value); break;}
                case "ifs_rowversion": { sso.setIfsRowVersion(CellParser.parseStringToLong(value)); break;}
                case "ifs_status": { sso.setIfsStatus(value); break;}
                case "ifs_supplier": { sso.setIfsSuplier(CellParser.parseStringToInt(value)); break;}
                case "ifs_supplier_ifs": { sso.setIfsSuplierIfs(CellParser.parseStringToLong(value)); break;}
                case "ifs_type": { sso.setIfsType(value); break;}
            }
        }
        return sso;
    }
}
