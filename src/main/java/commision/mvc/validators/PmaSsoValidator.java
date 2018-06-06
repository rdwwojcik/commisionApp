package commision.mvc.validators;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.Errors;
import org.springframework.validation.Validator;
import org.springframework.web.multipart.MultipartFile;
import commision.core.fileobjectreaders.ObjectFileReader;

import java.io.IOException;

/**
 * Created by Radek on 20.11.2017.
 */
public class PmaSsoValidator implements Validator {

    private ObjectFileReader fileReader;

    @Autowired
    public PmaSsoValidator(ObjectFileReader fileReader) {
        this.fileReader = fileReader;
    }

    @Override
    public boolean supports(Class<?> aClass) {
        return MultipartFile.class.equals(aClass);
    }

    @Override
    public void validate(Object o, Errors errors) {
        MultipartFile multipartFile = (MultipartFile) o;
        String filename = multipartFile.getOriginalFilename();
        String extension = filename.substring(filename.lastIndexOf("."));
        try {
            fileReader.saveFile(multipartFile.getInputStream(), extension);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void saveFileToDisk(){

    }

    private String[] fileHeaders = {"Nazwa sekcji", "Kod dealera", "Czesc glowna kodu", "Czesc dodatkowa kodu", "Data statusu"
            , "Data deaktywacji", "Numer kontraktu", "ID kontraktu", "Tymczasowy MSISDN", "MSISDN", "Typ koszyka (netto/brutto)"
            , "Nowy Koszyk usług", "Nazwa planu taryfowego", "Nazwa uslugi", "Kod promocji", "Uslugi skladowe abonamentu"
            , "Kod aktywacji", "Kombinacja abonamentow", "Typ PN", "Dlugosc umowy", "Abonament", "Wspolczynnik budzetu"
            , "Wartosc uslugi dodanej", "Oplata aktywacyjna", "Model terminala", "Wartosc terminali", "Wartosc kredytu"
            , "Delta abonamentow", "Wspolczynnik Z", "Premia podstawowa", "Cel ilosciowy", "Realizacja celu ilosciowego"
            , "% realizacji celu ilosciowego", "Cel wartosciowy", "Realizacja celu wartosciowego", "% realizacji celu wartosciowego"
            , "Wspolczynnik P (ilosc+wartosc)", "Bonus miesieczny", "Wspolczynik Y", "Suma Q", "Wspolczynik S", "Premia za sieciowosc"
            , "Kwota do wyplaty", "Self replacement", "SD", "Abonament przed utrzymaniem", "Abonament po utrzymaniu"
            , "Sredni rachunek z ostatnich 3 miesiecy", "Wartosc kontraktu", "Abonament do celu", "Wartosc kontraktu cel", "IMEI"
            , "Cena zakupu terminali przez Klienta", "Cena hurtowa terminali", "Kwota kredytu", "Subsydia", "Poziom negocjacji"
            , "Liczba uslug", "Liczba terminali", "Oferta gotowa", "Numer konta abonenckiego", "Proces sprzedazy", "Login", "SNCODE"
            , "SPCODE", "Powod naliczenia", "Nazwa typu zdarzenia", "ID zdarzenia", "Aktywnosc promocyjno-reklamowa (COOP)"
            , "Szerszy opis", "Zestaw nagród", "Lead typ", "Customer global id", "SD Kontrakt", "SD ID Pracownika", "SD ID Klienta"
            , "ID planu", "ID oferty", "Nip", "Wspolczynnik Clawback", "Poziom Salonu", "Ilosc", "Zdarzenie ratalne", "Rodzaj oferty"
            , "Korekta", "Baza sprzedawcy", "Cel ilosciowy sprzedawcy", "Wykonanie celu ilosciowego sprzedawcy"
            , "% realizacji celu ilosciowego sprzedawcy", "Wspolczynnik P (ilosc)", "Cel wartosciowy sprzedawcy"
            , "Wykonanie celu wartosciowego sprzedawcy", "% realizacji celu wartosciowego sprzedawcy", "Wspolczynnik P (wartosc)"
            , "Waga koszyka sprzedwcy", "Wspolczynnik korekcyjny sprzedawcy", "Realizacja wazona koszykow sprzedawcy"
            , "Realizacja wazona koszykow sprzedawcy (warunek wypłaty)", "Współczynnik KPI sprzedawcy"
            , "Prowizja dla sprzedawcy (informacja)", "Prowizja za realizację celu Agenta (100%) - sprzedawca (informacja)"
            , "Baza kierownika", "Cel ilosciowy kierownika", "Wykonanie celu ilosciowego kierownika", "% realizacji celu ilosciowego kierownika"
            , "Wspolczynnik P (ilosc)", "Cel wartosciowy kierownika", "Wykonanie celu wartosciowego kierownika"
            , "% realizacji celu wartosciowego kierownika", "Wspolczynnik P (wartosc)", "Waga koszyka kierownika", "Wspolczynnik korekcyjny kierownika"
            , "Realizacja wazona koszykow kierownika", "Realizacja wazona koszykow kierownika (warunek wypłaty)", "Współczynnik KPI kierownika"
            , "Prowizja dla kierownika (informacja)", "Prowizja za realizację celu Agenta (100%) - kierownik (informacja)", "IFS_AKCJA"
            , "IFS_BLANKET_ORDER", "IFS_CODE_A", "IFS_CODE_B", "IFS_CODE_C", "IFS_CODE_D", "IFS_CODE_E", "IFS_CODE_F", "IFS_CODE_G", "IFS_CODE_H"
            , "IFS_CODE_I", "IFS_CURRENCY_CODE", "IFS_DATE_OF_SALES", "IFS_ERROR_DESC", "IFS_ID", "IFS_INVOICE_DATE", "IFS_LINE_NO", "IFS_NOTE_TEXT"
            , "IFS_ORDER_NO", "IFS_PART_DESC", "IFS_PART_NO", "IFS_PERIOD", "IFS_PLAN", "IFS_PRICE", "IFS_PRJ_ID", "IFS_PROWIZJA", "IFS_QUANTITY"
            , "IFS_RELEASE_NO", "IFS_ROWVERSION", "IFS_STATUS", "IFS_SUPPLIER", "IFS_SUPPLIER_IFS", "IFS_TYPE",
    };
}
