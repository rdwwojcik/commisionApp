package commision.core.fileobjectreaders;

import commision.core.entities.BaseImportFileEntity;
import org.apache.log4j.Logger;
import commision.core.entities.pma.Pma;
import commision.core.entities.pma.PmaActive;
import commision.core.util.CellParser;

/**
 * Created by Radek on 29.10.2017.
 */
public class ReadPmaActive extends ObjectFileReader<BaseImportFileEntity> {

    private final static Logger logger = Logger.getLogger(ReadPmaActive.class);

    @Override
    public Pma getRow(String[] row) {
        PmaActive active = new PmaActive();
        String[] headers = getHeaders();

        for(int i = 0; i < headers.length; i++){
            String header = headers[i].toLowerCase().trim();
            String value = row[i];
//            logger.info("Header: " + header + " Value: " + value);
            if(header.equals("|===|"))
                continue;

            switch (header){
                case "nazwa sekcji": { active.setNazwaSekcji(value); break; }
                case "kod dealera": { active.setKodDealera(value); break; }
                case "czesc glowna kodu": { active.setKodGlowny(value); break; }
                case "typ handlowca": { active.setTypHandl(value); break; }
                case "lider": { active.setLider(value); break; }
                case "data statusu": { active.setDataStatusu(CellParser.parseStringToDate(value)); break; }
                case "data zamówienia": { active.setDataZam(CellParser.parseStringToDate(value)); break; }
                case "data deaktywacji": { active.setDataDeaktywacji(CellParser.parseStringToDate(value)); break; }
                case "numer kontraktu": { active.setNrKontraktu(value); break; }
                case "id kontraktu": { active.setIdKontraktu(value); break; }
                case "tymczasowy msisdn": { active.setTymczasowyMsisdn(value); break; }
                case "msisdn": { active.setMsisdn(value); break; }
                case "koszyk uslug": { active.setKoszykUslug(value); break; }
                case "nazwa planu taryfowego": { active.setNazwaPlanuTaryf(value); break; }
                case "nazwa uslugi": { active.setNazwaUslugi(value); break; }
                case "kod promocji": { active.setKodPromocji(value); break; }
                case "uslugi skladowe abonamentu": { active.setUslSkladoweAbonamentu(value); break; }
                case "kod aktywacji": { active.setKodAktywacji(value); break; }
                case "typ pn": { active.setTypPn(value); break; }
                case "dlugosc umowy": { active.setDlUmowy(CellParser.parseStringToDouble(value)); break; }
                case "abonament brutto": { active.setAbonamentBrutto(CellParser.parseStringToDouble(value)); break; }
                case "liczba abonamentow": { active.setLiczbaAbonam(CellParser.parseStringToDouble(value)); break; }
                case "sprzedaz ratalna": { active.setSprzedazRatalna(value); break; }
                case "model terminala": { active.setModelTerminala(value); break; }
                case "suma rat": { active.setSumaRat(CellParser.parseStringToDouble(value)); break; }
                case "bonus za raty": { active.setBonusZaRaty(CellParser.parseStringToInt(value)); break; }
                case "wynagrodzenie podstawowe rh": { active.setProwPodstRh(CellParser.parseStringToDouble(value)); break; }
                case "koszyk celowany": { active.setKoszykCel(value); break; }
                case "plan ilosciowy rh": { active.setPlanIlosciowy(CellParser.parseStringToDouble(value)); break; }
                case "waga koszyka": { active.setWagaKoszyka(CellParser.parseStringToDouble(value)); break; }
                case "wykonanie planu rh": { active.setRealPlanu(CellParser.parseStringToDouble(value)); break; }
                case "% realizacji planu rh": { active.setPrcRealPlanu(CellParser.parseStringToDouble(value)); break; }
                case "wspolczynnik premii sprzedazowej rh": { active.setWspPremiiSprzed(CellParser.parseStringToDouble(value)); break; }
                case "wykonanie wazone rh": { active.setWykWazoneRh(CellParser.parseStringToDouble(value)); break; }
                case "premia sprzedazowa rh": { active.setPremiaSprzedRh(CellParser.parseStringToDouble(value)); break; }
                case "wolumen sprzedazy rh": { active.setWolumenSprzedRh(CellParser.parseStringToInt(value)); break; }
                case "wspolczynnik wolumenowy rh": { active.setWspWolumenowyRh(CellParser.parseStringToDouble(value)); break; }
                case "premia wolumenowa rh": { active.setPremiaWolumenowaRh(CellParser.parseStringToDouble(value)); break; }
                case "id portfela klienta": { active.setIdPortfKl(value); break; }
                case "id portfela sprzedawcy": { active.setIdPortfSprzedawcy(value); break; }
                case "typ portfela": { active.setTypPortf(value); break; }
                case "wielkosc portfela": { active.setWielkoscPortf(CellParser.parseStringToDouble(value)); break; }
                case "wielkosc zespolu": { active.setWielkoscZespolu(CellParser.parseStringToInt(value)); break; }
                case "stawka portfelowa": { active.setStawkaPortf(CellParser.parseStringToDouble(value)); break; }
                case "średnia ważona realizacji kpi": { active.setSrWazonaRealKpi(CellParser.parseStringToDouble(value)); break; }
                case "premia portfelowa rh/lidera": { active.setPremiaPortfRh(CellParser.parseStringToDouble(value)); break; }
                case "współczynnik nadprowizji partnera": { active.setWspNadprowPart(CellParser.parseStringToDouble(value)); break; }
                case "wynagrodzenie podstawowe partnera": { active.setPremiaPodstPart(CellParser.parseStringToDouble(value)); break; }
                case "plan ilościowy partnera": { active.setPlanIlPart(CellParser.parseStringToDouble(value)); break; }
                case "wykonanie planu partnera": { active.setRealPlanuPart(CellParser.parseStringToDouble(value)); break; }
                case "% realizacji planu partnera": { active.setPrcRealPlanuPart(CellParser.parseStringToDouble(value)); break; }
                case "współczynnik premii sprzedażowej partnera": { active.setWspPremiiSprzedPart(CellParser.parseStringToDouble(value)); break; }
                case "premia sprzedażowa partnera": { active.setPremiaSprzedPart(CellParser.parseStringToDouble(value)); break; }
                case "współczynnik wynagrodzenia portfelowego partnera": { active.setWspWynPortfPart(CellParser.parseStringToDouble(value)); break; }
                case "premia portfelowa partnera": { active.setPremiaPortfPart(CellParser.parseStringToDouble(value)); break; }
                case "plan ilościowy lidera": { active.setPlanIlLid(CellParser.parseStringToDouble(value)); break; }
                case "wykonanie planu lidera": { active.setRealPlanuLid(CellParser.parseStringToDouble(value)); break; }
                case "% realizacji planu lidera": { active.setPrcRealPlanuLid(CellParser.parseStringToDouble(value)); break; }
                case "współczynnik premii sprzedażowej lidera": { active.setWspPremiiSprzedLid(CellParser.parseStringToDouble(value)); break; }
                case "premia sprzedażowa lidera": { active.setPremiaSprzedLid(CellParser.parseStringToDouble(value)); break; }
                case "współczynnik nadprowizji lidera": { active.setWspNadprowLid(CellParser.parseStringToDouble(value)); break; }
                case "nadprowizja lidera": { active.setPremiaPodstLid(CellParser.parseStringToDouble(value)); break; }
                case "prowizja total": { active.setPremiaTotal(CellParser.parseStringToDouble(value)); break; }
                case "abonament netto": { active.setAbonamentNetto(CellParser.parseStringToDouble(value)); break; }
                case "oplata aktywacyjna": { active.setOplataAktywacyjna(CellParser.parseStringToDouble(value)); break; }
                case "wartosc kontraktu": { active.setWartoscKontraktu(CellParser.parseStringToDouble(value)); break; }
                case "wartosc wsp.z": { active.setWspZ(CellParser.parseStringToDouble(value)); break; }
                case "premia podstawowa": { active.setPremiaPodstawowa(CellParser.parseStringToDouble(value)); break; }
                case "kwota do wyplaty": { active.setKwotaDoWyplaty(CellParser.parseStringToDouble(value)); break; }
                case "self replacement": { active.setSelfReplacement(value); break; }
                case "ilosc": { active.setIlosc(CellParser.parseStringToInt(value)); break; }
                case "imei": { active.setImei(value); break; }
                case "cena zakupu terminali przez klienta": { active.setCenaZakTermKlienta(CellParser.parseStringToDouble(value)); break; }
                case "cena hurtowa terminali": { active.setCenaHurtTerm(CellParser.parseStringToDouble(value)); break; }
                case "subsydia": { active.setSubsydia(CellParser.parseStringToDouble(value)); break; }
                case "login": { active.setLogin(value); break; }
                case "powod naliczenia": { active.setPowodNal(value); break; }
                case "nazwa typu zdarzenia": { active.setNazwaTypuZdarzenia(value); break; }
                case "id zdarzenia": { active.setIdZdarzenia(value); break; }
                case "szerszy opis": { active.setSzerszyOpis(value); break; }
                case "nip": { active.setNip(value); break; }
                case "wspolczynnik clawback": { active.setWspClawback(CellParser.parseStringToDouble(value)); break; }
                case "korekta": { active.setKorekta(CellParser.parseStringToInt(value)); break; }
                case "id planu": { active.setIdPlanu(value); break; }
                case "id oferty": { active.setIdOferty(value); break; }
                case "id dystryktu klienta": { active.setIdDystryktu(CellParser.parseStringToInt(value)); break; }
                case "dystrykt klienta": { active.setDystrykt(value); break; }
                case "vat": { active.setVat(CellParser.parseStringToDouble(value)); break; }
                case "miasto": { active.setMiasto(value); break; }
                case "ulica": { active.setUlica(value); break; }
                case "budynek": { active.setBudynek(value); break; }
                case "id lokalizacji klienta": { active.setIdLokalizacji(CellParser.parseStringToLong(value)); break; }
                case "id lokalu klienta": { active.setIdLokaluKlienta(CellParser.parseStringToLong(value)); break; }
                case "global id": { active.setGlobalId(CellParser.parseStringToLong(value)); break; }
                case "promocja": { active.setPromocja(value); break; }
                case "ifs_akcja": { active.setIfsAkcja(value); break;}
                case "ifs_blanket_order": { active.setIfsBlanketOrder(CellParser.parseStringToInt(value)); break;}
                case "ifs_code_a": { active.setIfsCodeA(value); break;}
                case "ifs_code_b": { active.setIfsCodeB(value); break;}
                case "ifs_code_c": { active.setIfsCodeC(value); break;}
                case "ifs_code_d": { active.setIfsCodeD(value); break;}
                case "ifs_code_e": { active.setIfsCodeE(value); break;}
                case "ifs_code_f": { active.setIfsCodeF(value); break;}
                case "ifs_code_g": { active.setIfsCodeG(value); break;}
                case "ifs_code_h": { active.setIfsCodeH(value); break;}
                case "ifs_code_i": { active.setIfsCodeI(value); break;}
                case "ifs_currency_code": { active.setIfsCurrencyCode(value); break;}
                case "ifs_date_of_sales": { active.setIfsdateOfSale(CellParser.parseStringToDate(value)); break;}
                case "ifs_error_desc": { active.setIfsErrorDesc(value); break;}
                case "ifs_id": { active.setIfsId(CellParser.parseStringToLong(value)); break;}
                case "ifs_invoice_date": { active.setIfsInvoiceDate(CellParser.parseStringToDate(value)); break;}
                case "ifs_line_no": { active.setIfsLineNo(CellParser.parseStringToInt(value)); break;}
                case "ifs_note_text": { active.setIfsNoteText(value); break;}
                case "ifs_order_no": { active.setIfsOrderNo(CellParser.parseStringToInt(value)); break;}
                case "ifs_part_desc": { active.setIfsPartDesc(value); break;}
                case "ifs_part_no": { active.setIfsPartNo(value); break;}
                case "ifs_period": { active.setIfsPeriod(value); active.setDataProwizji(CellParser.parseYearMonthToDate(value)); break;}
                case "ifs_plan": { active.setIfsPlan(value); break;}
                case "ifs_price": { active.setIfsPrice(CellParser.parseStringToDouble(value)); break;}
                case "ifs_prj_id": { active.setIfsPrjId(value); break;}
                case "ifs_prowizja": { active.setIfsProwizja(value); break;}
                case "ifs_quantity": { active.setIfsQuantity(CellParser.parseStringToInt(value)); break;}
                case "ifs_release_no": { active.setIfsReleanseNo(value); break;}
                case "ifs_rowversion": { active.setIfsRowVersion(CellParser.parseStringToLong(value)); break;}
                case "ifs_status": { active.setIfsStatus(value); break;}
                case "ifs_supplier": { active.setIfsSuplier(CellParser.parseStringToInt(value)); break;}
                case "ifs_supplier_ifs": { active.setIfsSuplierIfs(CellParser.parseStringToLong(value)); break;}
                case "ifs_type": { active.setIfsType(value); break;}
            }
        }
            
        return active;
    }
}
