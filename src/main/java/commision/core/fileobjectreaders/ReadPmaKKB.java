package commision.core.fileobjectreaders;


import commision.core.entities.BaseImportFileEntity;
import commision.core.entities.pma.Pma;
import commision.core.entities.pma.PmaKkb;
import commision.core.util.CellParser;

/**
 * Created by Radek on 29.10.2017.
 */
public class ReadPmaKKB extends ObjectFileReader<BaseImportFileEntity> {

    @Override
    public Pma getRow(String[] row) {
        PmaKkb pma = new PmaKkb();
        String[] headers = getHeaders();

        for(int i = 0; i < headers.length; i++){
            String header = headers[i].toLowerCase().trim();
            String value = row[i];
            switch (header){
                case "nazwa sekcji": { pma.setNazwaSekcji(value); break; }
                case "kod dealera": { pma.setKodDealera(value); break; }
                case "czesc glowna kodu": { pma.setKodGlowny(value); break; }
                case "czesc dodatkowa kodu": { pma.setKodDodatkowy(value); break;}
                case "data statusu": { pma.setDataStatusu(CellParser.parseStringToDate(value)); break;}
                case "data deaktywacji": { pma.setDataDeaktywacji(CellParser.parseStringToDate(value)); break;}
                case "data przyjecia zamowienia tp": { pma.setDataPrzyjeciaZam(CellParser.parseStringToDate(value)); break;}
                case "data realizacji zamowienia tp": { pma.setDataRealizacjiZam(CellParser.parseStringToDate(value)); break;}
                case "data rozliczenia zamowienia tp": { pma.setDataRozliczeniaZam(CellParser.parseStringToDate(value)); break;}
                case "numer kontraktu": { pma.setNrKontraktu(value); break;}
                case "numer kontraktu crm": { pma.setIdKontraktu(value); break;}
                case "tymczasowy msisdn": { pma.setTymczasowyMsisdn(value); break;}
                case "msisdn": { pma.setMsisdn(value); break;}
                case "kod koszyka": { pma.setKoszykUslug(value); break;}
                case "nazwa planu taryfowego": { pma.setNazwaPlanuTaryf(value); break;}
                case "nazwa uslugi": { pma.setNazwaUslugi(value); break;}
                case "kod promocji": { pma.setKodPromocji(value); break;}
                case "uslugi skladowe abonamentu": { pma.setUslSkladoweAbonamentu(value); break;}
                case "kod aktywacji": { pma.setKodAktywacji(value); break;}
                case "typ pn": { pma.setTypPn(value); break;}
                case "dlugosc umowy": { pma.setDlUmowy(CellParser.parseStringToDouble(value)); break;}
                case "abonament": { pma.setAbonamentNetto(CellParser.parseStringToDouble(value)); break;}
                case "oplata aktywacyjna": { pma.setOplataAktywacyjna(CellParser.parseStringToDouble(value)); break;}
                case "model terminala": { pma.setModelTerminala(value); break;}
                case "cena zakupu terminali przez klienta": { pma.setCenaZakTerminaliKl(value); break;}
                case "wartość terminala zgodna z tabelą": { pma.setWartTermTab(CellParser.parseStringToDouble(value)); break;}
                case "typ handlowca (0 dkb / 1 am)": { pma.setTypHandlowca(CellParser.parseStringToInt(value)); break;}
                case "czy nowy klient": { pma.setCzyNowyKlient(CellParser.parseStringToInt(value)); break;}
                case "czy potencjalny klient": { pma.setCzyPotencjalnyKlient(CellParser.parseStringToInt(value)); break;}
                case "status": { pma.setStatus(value); break;}
                case "wartosc kontraktu": { pma.setWartoscKontraktu(CellParser.parseStringToDouble(value)); break;}
                case "portfelizacja": { pma.setPortfelizacja(CellParser.parseStringToInt(value)); break;}
                case "rodzaj korekty premii podst.": { pma.setRodzajKorPremiiPodst(value); break;}
                case "wartosc korekty premii podst. (procent/wartosc)": { pma.setWartKorPremiiPodst(CellParser.parseStringToDouble(value)); break;}
                case "wspolczynnik z": { pma.setWspZ(CellParser.parseStringToDouble(value)); break;}
                case "premia podstawowa": { pma.setPremiaPodstawowa(CellParser.parseStringToDouble(value)); break;}
                case "wspolczynnik bgc": { pma.setWspBgc(CellParser.parseStringToDouble(value)); break;}
                case "premia bgc": { pma.setPremiaBgc(CellParser.parseStringToDouble(value)); break;}
                case "wartosc wspolczynnika y handl.": { pma.setWspYHandl(CellParser.parseStringToDouble(value)); break;}
                case "bonus real. linii celowanych handl.": { pma.setBonusLiniiCelHandl(CellParser.parseStringToDouble(value)); break;}
                case "wynagrodzenie ryczaltowe handl.": { pma.setWynRyczaltoweHandl(CellParser.parseStringToInt(value)); break;}
                case "prowizja handlowca": { pma.setProwizjaHandl(CellParser.parseStringToDouble(value)); break;}
                case "bonus sieciowy": { pma.setBonusSieciowy(CellParser.parseStringToDouble(value)); break;}
                case "wartosc wspolczynnika y agenta": { pma.setWspYAgenta(CellParser.parseStringToDouble(value)); break;}
                case "bonus real. linii celowanych agenta": { pma.setBonusLiniiCelAgenta(CellParser.parseStringToDouble(value)); break;}
                case "wynagrodzenie ryczaltowe agenta": { pma.setWynRyczaltoweAgenta(CellParser.parseStringToDouble(value)); break;}
                case "prowizja agenta": { pma.setProwizjaAgenta(CellParser.parseStringToDouble(value)); break;}
                case "wartosc korekty prowizji": { pma.setWartKorProwizji(CellParser.parseStringToDouble(value)); break;}
                case "kdw handl. + kdw agenta": { pma.setKwotaDoWyplaty(CellParser.parseStringToDouble(value)); break;}
                case "self replacement": { pma.setSelfReplacement(value); break;}
                case "wspolczynnik clawback": { pma.setWspClawback(CellParser.parseStringToDouble(value)); break;}
                case "wspolczynnik zwrotu": { pma.setWspZwrotu(CellParser.parseStringToDouble(value)); break;}
                case "cel na dotykalność/aktywność": { pma.setCelDotykalnosc(CellParser.parseStringToInt(value)); break;}
                case "cel na konwergencję": { pma.setCelKonwergencja(CellParser.parseStringToInt(value)); break;}
                case "realizacja celu na dotykalność/aktywność": { pma.setRealCelDotykalnosc(CellParser.parseStringToInt(value)); break;}
                case "realizacja celu na konwergencję": { pma.setRealCelKonwergencja(CellParser.parseStringToInt(value)); break;}
                case "% realizacji celu na dotyklność/aktywność": { pma.setPrcRealCelDotykalnosc(CellParser.parseStringToDouble(value)); break;}
                case "% realizacji celu na konwergencję": { pma.setPrcRealCelkonwergencja(CellParser.parseStringToDouble(value)); break;}
                case "stawka bazowa handl.": { pma.setStawkaHandl(CellParser.parseStringToDouble(value)); break;}
                case "stawka bazowa agenta": { pma.setStawkaAgenta(CellParser.parseStringToDouble(value)); break;}
                case "wynagrodzenie portfelowe handl.": { pma.setWynPortfHandl(CellParser.parseStringToDouble(value)); break;}
                case "wynagrodzenie portfelowe agenta": { pma.setWynPortfAgenta(CellParser.parseStringToDouble(value)); break;}
                case "wynagrodzenie portfelowe subgenta": { pma.setWynPortfSubAgenta(CellParser.parseStringToDouble(value)); break;}
                case "szerszy opis": { pma.setSzerszyOpis(value); break;}
                case "nazwa linii celowanej": { pma.setNazwaLiniiCelowanej(value); break;}
                case "cel linii": { pma.setCelLinii(CellParser.parseStringToDouble(value)); break;}
                case "minimum linii": { pma.setMinLinii(CellParser.parseStringToDouble(value)); break;}
                case "realizacja linii": { pma.setRealLinii(CellParser.parseStringToDouble(value)); break;}
                case "maksymalny bonus": { pma.setMaxBonus(CellParser.parseStringToDouble(value)); break;}
                case "% realizacji linii celowanej": { pma.setPrcRealLiniiCel(CellParser.parseStringToDouble(value)); break;}
                case "y czastkowe": { pma.setyCzastkowe(CellParser.parseStringToDouble(value)); break;}
                case "nip": { pma.setNip(value); break;}
                case "nazwa firmy": { pma.setNazwaFirmy(value); break;}
                case "imei": { pma.setImei(value); break;}
                case "korekty": { pma.setKorekty(value); break;}
                case "ilosc laczy": { pma.setIloscLoczy(CellParser.parseStringToInt(value)); break;}
                case "nr zamowienia": { pma.setNrZamowienia(CellParser.parseStringToLong(value)); break;}
                case "oper_kod": { pma.setOperKod(value); break;}
                case "id zdarzenia": { pma.setIdZdarzenia(value); break;}
                case "typ zdarzenia": { pma.setNazwaTypuZdarzenia(value); break;}
                case "abonament lg": { pma.setAbonamentLg(CellParser.parseStringToDouble(value)); break;}
                case "id planu": { pma.setIdPlanu(value); break;}
                case "id oferty": { pma.setIdOferty(value); break;}
                case "średnia rata": { pma.setSrRata(CellParser.parseStringToDouble(value)); break;}
                case "suma rat": { pma.setSumRat(CellParser.parseStringToDouble(value)); break;}
                case "flaga czy rata": { pma.setCzyRata(value); break;}
                case "priorytet": { pma.setPriorytet(value); break;}
                case "wartość kredytu": { pma.setWartKredytu(CellParser.parseStringToDouble(value)); break;}
                case "korekta": { pma.setKorekta(CellParser.parseStringToInt(value)); break;}
                case "subsydia": { pma.setSubsydia(CellParser.parseStringToDouble(value)); break;}
                case "cena zakupu terminala przez klienta": { pma.setCenaZakTermKlienta(CellParser.parseStringToDouble(value)); break;}
                case "id crm": { pma.setIdCrm(value); break;}
                case "id serwus": { pma.setIdSerwus(value); break;}
                case "id sezam": { pma.setIdSezam(value); break;}
                case "id sokx": { pma.setIdSokx(value); break;}
                case "act_msisdn": { pma.setActMsisdn(value); break;}
                case "id easy": { pma.setIdEasy(value); break;}
                case "ifs_akcja": { pma.setIfsAkcja(value); break;}
                case "ifs_blanket_order": { pma.setIfsBlanketOrder(CellParser.parseStringToInt(value)); break;}
                case "ifs_code_a": { pma.setIfsCodeA(value); break;}
                case "ifs_code_b": { pma.setIfsCodeB(value); break;}
                case "ifs_code_c": { pma.setIfsCodeC(value); break;}
                case "ifs_code_d": { pma.setIfsCodeD(value); break;}
                case "ifs_code_e": { pma.setIfsCodeE(value); break;}
                case "ifs_code_f": { pma.setIfsCodeF(value); break;}
                case "ifs_code_g": { pma.setIfsCodeG(value); break;}
                case "ifs_code_h": { pma.setIfsCodeH(value); break;}
                case "ifs_code_i": { pma.setIfsCodeI(value); break;}
                case "ifs_currency_code": { pma.setIfsCurrencyCode(value); break;}
                case "ifs_date_of_sales": { pma.setIfsdateOfSale(CellParser.parseStringToDate(value)); break;}
                case "ifs_error_desc": { pma.setIfsErrorDesc(value); break;}
                case "ifs_id": { pma.setIfsId(CellParser.parseStringToLong(value)); break;}
                case "ifs_invoice_date": { pma.setIfsInvoiceDate(CellParser.parseStringToDate(value)); break;}
                case "ifs_line_no": { pma.setIfsLineNo(CellParser.parseStringToInt(value)); break;}
                case "ifs_note_text": { pma.setIfsNoteText(value); break;}
                case "ifs_order_no": { pma.setIfsOrderNo(CellParser.parseStringToInt(value)); break;}
                case "ifs_part_desc": { pma.setIfsPartDesc(value); break;}
                case "ifs_part_no": { pma.setIfsPartNo(value); break;}
                case "ifs_period": { pma.setIfsPeriod(value); pma.setDataProwizji(CellParser.parseYearMonthToDate(value)); break;}
                case "ifs_plan": { pma.setIfsPlan(value); break;}
                case "ifs_price": { pma.setIfsPrice(CellParser.parseStringToDouble(value)); break;}
                case "ifs_prj_id": { pma.setIfsPrjId(value); break;}
                case "ifs_prowizja": { pma.setIfsProwizja(value); break;}
                case "ifs_quantity": { pma.setIfsQuantity(CellParser.parseStringToInt(value)); break;}
                case "ifs_release_no": { pma.setIfsReleanseNo(value); break;}
                case "ifs_rowversion": { pma.setIfsRowVersion(CellParser.parseStringToLong(value)); break;}
                case "ifs_status": { pma.setIfsStatus(value); break;}
                case "ifs_supplier": { pma.setIfsSuplier(CellParser.parseStringToInt(value)); break;}
                case "ifs_supplier_ifs": { pma.setIfsSuplierIfs(CellParser.parseStringToLong(value)); break;}
                case "ifs_type": { pma.setIfsType(value); break;}
            }
        }

        return pma;
    }
}
