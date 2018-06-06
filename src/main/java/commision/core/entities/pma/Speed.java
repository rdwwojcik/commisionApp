package commision.core.entities.pma;

import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import java.util.Date;

//@Entity
public class Speed {

    @Id
//    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String source;
    private String year;
    private String month;
    private String week;
    @Temporal(TemporalType.DATE)
    private Date date;
    private Integer corr_flg;
    private String corrRegistrationIds;
    private String corrReason;
    private Double abonamentBazowy;
    private Double abonamentSredni;
    private String adresInstBudynek;
    private String adresInstKod;
    private String adresInstMiasto;
    private String adresInstMieszkanie;
    private String adresInstUlica;
    private Integer aliasIlosc;
    private Double aliasWartosc;
    private String dataAktywacji;
    private String dataAnulowania;
    private String dataBilingu;
    private String dataDeaktywacji;
    private String dataKoncaPoprzUmowy;
    private String dataKoncaUmowy;
    private String dataPoczatkuUmowy;
    private String dataRejestracji;
    private String dataSkompletowania;
    private String dataUmowy;
    private String dataWyniku;
    private String dataWynikuPoprz;
    private String dostawaFaktury;
    private String dostawaSprzetu;
    private String dostawaUmowy;
    private String fromDttm;
    private String idz;
    private String idzPoprz;
    private String idAlias;
    private String idDi;
    private String idDiPoprz;
    private String idDiTr;
    private String idDystryktu;
    private String idGrupyProduktow;
    private String idKanalu;
    private String ch1Name;
    private String ch2Name;
    private String ch3Name;
    private String ch4Name;
    private String ch5Name;
    private String ch7Name;
    private String kanalRap;
    private Long idKlienta;
    private Long idPartnera;
    private Long idPos;
    private Long idProduktu;
    private String idRegionu;
    private Long idSprzedawcy;
    private Long idSprzedawcyAktywacji;
    private Long idSprzedawcyUmowy;
    private Long idZamowienia;
    private Integer ilosc;
    private Double kwotaZobowiazania;
    private Double liczba_uslug;
    private Long loadId;
    private Long loadIdFirst;
    private String modelSprzetu;
    private String nazwaKlienta;
    private String nazwaProduktu;
    private String nrSeryjnySprzetu;
    private String numerEwidencyjny;
    private String numerUslugi;
    private String numerZamowienia;
    private String numerZamowieniaPoprz;
    private String occurNum;
    private Double okresLojalnosciowy;
    private Double oplataAktywacyjna;
    private String planTaryfowy;
    private String planTaryfowyPoprz;
    private String poziomNegocjacji;
    private String predkosc;
    private String predkoscPoprz;
    private String proces;
    private String produktGlowny;
    private String typBundla;
    private String promocja;
    private String przyczynaAnulowania;
    private String idSegment;
    private String statusZamowienia;
    private String systemZrodlowy;
    private String typZamowienia;
    private Long userId;
    private String validFromDttm;
    private String validToDttm;
    private Double wartosc;
    private Double wartoscSprzetu;
    private Double zobowiazanieMiesieczne;
    private String alias;
    private String alias02;
    private String opisPoz;
    private String chmix;
    private String agent;
    private String posSerwus;
    private String posBscs;
    private String posName;
    private String posCity;
    private String usrSerwus;
    private String usrNazwisko;
    private String usrImie;
    private String usrKpx;
    private String usrIfs;
    private String usrBscs;
    private String usrOtsa;
    private String segment;
    private String idRegionuStr;
    private String regionStr;
    private Integer idDystryktStr;
    private String dystryktStr;
    private String dm;
    private String adm;
    private Integer idSegmentuBudKli;
    private Integer idRegionuKli;
    private String nazwaRegionuKli;
    private Integer idDystryktKli;
    private String nazwaDystryktuKli;
    private String nazwaMikrorynkuKli;
    private Long idLokalizacjiKli;
    private Long idLokaluKli;
    private String kodPocztowyKli;
    private String cmc13;
    private String geoDlugosc;
    private String geoSzerokosc;
    private String murakamiM;
    private String flagaMnpM;
    private String nipM;
    private String nrSieciM;
    private String czyBeztermM;
    private String typM;
    private String typ2M;
    private String rodzM;
    private String rodz2M;
    private String kanalM;
    private String brandM;
    private String planyTaryfowy;
    private String migrZetM;
    private String naProbM;
    private String kodAktM;
    private String idOfertyM;
    private String rataM;
    private String ofertaWylaczonaM;
    private String migrZet;
    private String poziomNegocjacjiM;
    private String planyTaryfowyPoprz;
    private String nazwaOfertyM;
    private String kodDeaktywacji;
    private String iloscDniM;
    private String numerTelefonu;
    private String wartoscSubsydia;
    private String oplataLacze;
    private String aliasSpiu;
    private String numerZamowieniaM;
    private String idOfertM;
    private String ruleAreaId;
    private String idMikrorynkuKli;
    private String idUser;
    private String idPunktu;
    private String idFirmy;
    private String kanal;
    private String zgodaMkt;
    private String miastoKli;
    private String pickup;
    private String voucher;
    private String voucherId;
    private String voucherBonus;
    private String modelSecondary;
    private String cenaTerminalaSecondary;
    private String idMiejscowosciKli;
    private String flagaVhbb;
    private String myOrange;
    private String myOrangeDayNo;
    private String myOrangeData;
    private String numerKonta;
    private String no;
    private String zaliczOpl;
    private String zaliczXrds;
    private String zaliczXdm;
    private String zaliczKpos;
    private String zaliczAdm;
    private String zaliczPh;
    private String zaliczRh;
    private String usrImieEfektywny;
    private String usrNazwiskoEfektywny;
    private String usrSerwusEfektywny;
    private String dystryktEfektywny;
    private String idDystryktEfektywny;
    private String regionEfektywny;
    private String idRegionuEfektywny;
    private String dystryktBgt;
    private String idDystryktBgt;
    private String regionBgt;
    private String idRegionuBgt;
    private String ofertaWylaczonaOper;
    private String ofertaWylaczonaBgt;
    private String kampaFbb;
    private String kampaLte;
    @Temporal(TemporalType.DATE)
    private Date dataAktualizacji;
    private String segmentBuc;
    private String kampaniaNazwa;
    private String sol;
    private String stronaNamiaru;
    private Long customerGlobalId;
    private String sloPredkosc;
    private String technologiaBb;
    private String technologiaBbPrzed;
    private String technologiaBbPo;
//    @Column(columnDefinition = "date default sysdate")
    @Temporal(TemporalType.DATE)
    private Date czasBazy;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public String getMonth() {
        return month;
    }

    public void setMonth(String month) {
        this.month = month;
    }

    public String getWeek() {
        return week;
    }

    public void setWeek(String week) {
        this.week = week;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Integer getCorr_flg() {
        return corr_flg;
    }

    public void setCorr_flg(Integer corr_flg) {
        this.corr_flg = corr_flg;
    }

    public String getCorrRegistrationIds() {
        return corrRegistrationIds;
    }

    public void setCorrRegistrationIds(String corrRegistrationIds) {
        this.corrRegistrationIds = corrRegistrationIds;
    }

    public String getCorrReason() {
        return corrReason;
    }

    public void setCorrReason(String corrReason) {
        this.corrReason = corrReason;
    }

    public Double getAbonamentBazowy() {
        return abonamentBazowy;
    }

    public void setAbonamentBazowy(Double abonamentBazowy) {
        this.abonamentBazowy = abonamentBazowy;
    }

    public Double getAbonamentSredni() {
        return abonamentSredni;
    }

    public void setAbonamentSredni(Double abonamentSredni) {
        this.abonamentSredni = abonamentSredni;
    }

    public String getAdresInstBudynek() {
        return adresInstBudynek;
    }

    public void setAdresInstBudynek(String adresInstBudynek) {
        this.adresInstBudynek = adresInstBudynek;
    }

    public String getAdresInstKod() {
        return adresInstKod;
    }

    public void setAdresInstKod(String adresInstKod) {
        this.adresInstKod = adresInstKod;
    }

    public String getAdresInstMiasto() {
        return adresInstMiasto;
    }

    public void setAdresInstMiasto(String adresInstMiasto) {
        this.adresInstMiasto = adresInstMiasto;
    }

    public String getAdresInstMieszkanie() {
        return adresInstMieszkanie;
    }

    public void setAdresInstMieszkanie(String adresInstMieszkanie) {
        this.adresInstMieszkanie = adresInstMieszkanie;
    }

    public String getAdresInstUlica() {
        return adresInstUlica;
    }

    public void setAdresInstUlica(String adresInstUlica) {
        this.adresInstUlica = adresInstUlica;
    }

    public Integer getAliasIlosc() {
        return aliasIlosc;
    }

    public void setAliasIlosc(Integer aliasIlosc) {
        this.aliasIlosc = aliasIlosc;
    }

    public Double getAliasWartosc() {
        return aliasWartosc;
    }

    public void setAliasWartosc(Double aliasWartosc) {
        this.aliasWartosc = aliasWartosc;
    }

    public String getDataAktywacji() {
        return dataAktywacji;
    }

    public void setDataAktywacji(String dataAktywacji) {
        this.dataAktywacji = dataAktywacji;
    }

    public String getDataAnulowania() {
        return dataAnulowania;
    }

    public void setDataAnulowania(String dataAnulowania) {
        this.dataAnulowania = dataAnulowania;
    }

    public String getDataBilingu() {
        return dataBilingu;
    }

    public void setDataBilingu(String dataBilingu) {
        this.dataBilingu = dataBilingu;
    }

    public String getDataDeaktywacji() {
        return dataDeaktywacji;
    }

    public void setDataDeaktywacji(String dataDeaktywacji) {
        this.dataDeaktywacji = dataDeaktywacji;
    }

    public String getDataKoncaPoprzUmowy() {
        return dataKoncaPoprzUmowy;
    }

    public void setDataKoncaPoprzUmowy(String dataKoncaPoprzUmowy) {
        this.dataKoncaPoprzUmowy = dataKoncaPoprzUmowy;
    }

    public String getDataKoncaUmowy() {
        return dataKoncaUmowy;
    }

    public void setDataKoncaUmowy(String dataKoncaUmowy) {
        this.dataKoncaUmowy = dataKoncaUmowy;
    }

    public String getDataPoczatkuUmowy() {
        return dataPoczatkuUmowy;
    }

    public void setDataPoczatkuUmowy(String dataPoczatkuUmowy) {
        this.dataPoczatkuUmowy = dataPoczatkuUmowy;
    }

    public String getDataRejestracji() {
        return dataRejestracji;
    }

    public void setDataRejestracji(String dataRejestracji) {
        this.dataRejestracji = dataRejestracji;
    }

    public String getDataSkompletowania() {
        return dataSkompletowania;
    }

    public void setDataSkompletowania(String dataSkompletowania) {
        this.dataSkompletowania = dataSkompletowania;
    }

    public String getDataUmowy() {
        return dataUmowy;
    }

    public void setDataUmowy(String dataUmowy) {
        this.dataUmowy = dataUmowy;
    }

    public String getDataWyniku() {
        return dataWyniku;
    }

    public void setDataWyniku(String dataWyniku) {
        this.dataWyniku = dataWyniku;
    }

    public String getDataWynikuPoprz() {
        return dataWynikuPoprz;
    }

    public void setDataWynikuPoprz(String dataWynikuPoprz) {
        this.dataWynikuPoprz = dataWynikuPoprz;
    }

    public String getDostawaFaktury() {
        return dostawaFaktury;
    }

    public void setDostawaFaktury(String dostawaFaktury) {
        this.dostawaFaktury = dostawaFaktury;
    }

    public String getDostawaSprzetu() {
        return dostawaSprzetu;
    }

    public void setDostawaSprzetu(String dostawaSprzetu) {
        this.dostawaSprzetu = dostawaSprzetu;
    }

    public String getDostawaUmowy() {
        return dostawaUmowy;
    }

    public void setDostawaUmowy(String dostawaUmowy) {
        this.dostawaUmowy = dostawaUmowy;
    }

    public String getFromDttm() {
        return fromDttm;
    }

    public void setFromDttm(String fromDttm) {
        this.fromDttm = fromDttm;
    }

    public String getIdz() {
        return idz;
    }

    public void setIdz(String idz) {
        this.idz = idz;
    }

    public String getIdzPoprz() {
        return idzPoprz;
    }

    public void setIdzPoprz(String idzPoprz) {
        this.idzPoprz = idzPoprz;
    }

    public String getIdAlias() {
        return idAlias;
    }

    public void setIdAlias(String idAlias) {
        this.idAlias = idAlias;
    }

    public String getIdDi() {
        return idDi;
    }

    public void setIdDi(String idDi) {
        this.idDi = idDi;
    }

    public String getIdDiPoprz() {
        return idDiPoprz;
    }

    public void setIdDiPoprz(String idDiPoprz) {
        this.idDiPoprz = idDiPoprz;
    }

    public String getIdDiTr() {
        return idDiTr;
    }

    public void setIdDiTr(String idDiTr) {
        this.idDiTr = idDiTr;
    }

    public String getIdDystryktu() {
        return idDystryktu;
    }

    public void setIdDystryktu(String idDystryktu) {
        this.idDystryktu = idDystryktu;
    }

    public String getIdGrupyProduktow() {
        return idGrupyProduktow;
    }

    public void setIdGrupyProduktow(String idGrupyProduktow) {
        this.idGrupyProduktow = idGrupyProduktow;
    }

    public String getIdKanalu() {
        return idKanalu;
    }

    public void setIdKanalu(String idKanalu) {
        this.idKanalu = idKanalu;
    }

    public String getCh1Name() {
        return ch1Name;
    }

    public void setCh1Name(String ch1Name) {
        this.ch1Name = ch1Name;
    }

    public String getCh2Name() {
        return ch2Name;
    }

    public void setCh2Name(String ch2Name) {
        this.ch2Name = ch2Name;
    }

    public String getCh3Name() {
        return ch3Name;
    }

    public void setCh3Name(String ch3Name) {
        this.ch3Name = ch3Name;
    }

    public String getCh4Name() {
        return ch4Name;
    }

    public void setCh4Name(String ch4Name) {
        this.ch4Name = ch4Name;
    }

    public String getCh5Name() {
        return ch5Name;
    }

    public void setCh5Name(String ch5Name) {
        this.ch5Name = ch5Name;
    }

    public String getCh7Name() {
        return ch7Name;
    }

    public void setCh7Name(String ch7Name) {
        this.ch7Name = ch7Name;
    }

    public String getKanalRap() {
        return kanalRap;
    }

    public void setKanalRap(String kanalRap) {
        this.kanalRap = kanalRap;
    }

    public Long getIdKlienta() {
        return idKlienta;
    }

    public void setIdKlienta(Long idKlienta) {
        this.idKlienta = idKlienta;
    }

    public Long getIdPartnera() {
        return idPartnera;
    }

    public void setIdPartnera(Long idPartnera) {
        this.idPartnera = idPartnera;
    }

    public Long getIdPos() {
        return idPos;
    }

    public void setIdPos(Long idPos) {
        this.idPos = idPos;
    }

    public Long getIdProduktu() {
        return idProduktu;
    }

    public void setIdProduktu(Long idProduktu) {
        this.idProduktu = idProduktu;
    }

    public String getIdRegionu() {
        return idRegionu;
    }

    public void setIdRegionu(String idRegionu) {
        this.idRegionu = idRegionu;
    }

    public Long getIdSprzedawcy() {
        return idSprzedawcy;
    }

    public void setIdSprzedawcy(Long idSprzedawcy) {
        this.idSprzedawcy = idSprzedawcy;
    }

    public Long getIdSprzedawcyAktywacji() {
        return idSprzedawcyAktywacji;
    }

    public void setIdSprzedawcyAktywacji(Long idSprzedawcyAktywacji) {
        this.idSprzedawcyAktywacji = idSprzedawcyAktywacji;
    }

    public Long getIdSprzedawcyUmowy() {
        return idSprzedawcyUmowy;
    }

    public void setIdSprzedawcyUmowy(Long idSprzedawcyUmowy) {
        this.idSprzedawcyUmowy = idSprzedawcyUmowy;
    }

    public Long getIdZamowienia() {
        return idZamowienia;
    }

    public void setIdZamowienia(Long idZamowienia) {
        this.idZamowienia = idZamowienia;
    }

    public Integer getIlosc() {
        return ilosc;
    }

    public void setIlosc(Integer ilosc) {
        this.ilosc = ilosc;
    }

    public Double getKwotaZobowiazania() {
        return kwotaZobowiazania;
    }

    public void setKwotaZobowiazania(Double kwotaZobowiazania) {
        this.kwotaZobowiazania = kwotaZobowiazania;
    }

    public Double getLiczba_uslug() {
        return liczba_uslug;
    }

    public void setLiczba_uslug(Double liczba_uslug) {
        this.liczba_uslug = liczba_uslug;
    }

    public Long getLoadId() {
        return loadId;
    }

    public void setLoadId(Long loadId) {
        this.loadId = loadId;
    }

    public Long getLoadIdFirst() {
        return loadIdFirst;
    }

    public void setLoadIdFirst(Long loadIdFirst) {
        this.loadIdFirst = loadIdFirst;
    }

    public String getModelSprzetu() {
        return modelSprzetu;
    }

    public void setModelSprzetu(String modelSprzetu) {
        this.modelSprzetu = modelSprzetu;
    }

    public String getNazwaKlienta() {
        return nazwaKlienta;
    }

    public void setNazwaKlienta(String nazwaKlienta) {
        this.nazwaKlienta = nazwaKlienta;
    }

    public String getNazwaProduktu() {
        return nazwaProduktu;
    }

    public void setNazwaProduktu(String nazwaProduktu) {
        this.nazwaProduktu = nazwaProduktu;
    }

    public String getNrSeryjnySprzetu() {
        return nrSeryjnySprzetu;
    }

    public void setNrSeryjnySprzetu(String nrSeryjnySprzetu) {
        this.nrSeryjnySprzetu = nrSeryjnySprzetu;
    }

    public String getNumerEwidencyjny() {
        return numerEwidencyjny;
    }

    public void setNumerEwidencyjny(String numerEwidencyjny) {
        this.numerEwidencyjny = numerEwidencyjny;
    }

    public String getNumerUslugi() {
        return numerUslugi;
    }

    public void setNumerUslugi(String numerUslugi) {
        this.numerUslugi = numerUslugi;
    }

    public String getNumerZamowienia() {
        return numerZamowienia;
    }

    public void setNumerZamowienia(String numerZamowienia) {
        this.numerZamowienia = numerZamowienia;
    }

    public String getNumerZamowieniaPoprz() {
        return numerZamowieniaPoprz;
    }

    public void setNumerZamowieniaPoprz(String numerZamowieniaPoprz) {
        this.numerZamowieniaPoprz = numerZamowieniaPoprz;
    }

    public String getOccurNum() {
        return occurNum;
    }

    public void setOccurNum(String occurNum) {
        this.occurNum = occurNum;
    }

    public Double getOkresLojalnosciowy() {
        return okresLojalnosciowy;
    }

    public void setOkresLojalnosciowy(Double okresLojalnosciowy) {
        this.okresLojalnosciowy = okresLojalnosciowy;
    }

    public Double getOplataAktywacyjna() {
        return oplataAktywacyjna;
    }

    public void setOplataAktywacyjna(Double oplataAktywacyjna) {
        this.oplataAktywacyjna = oplataAktywacyjna;
    }

    public String getPlanTaryfowy() {
        return planTaryfowy;
    }

    public void setPlanTaryfowy(String planTaryfowy) {
        this.planTaryfowy = planTaryfowy;
    }

    public String getPlanTaryfowyPoprz() {
        return planTaryfowyPoprz;
    }

    public void setPlanTaryfowyPoprz(String planTaryfowyPoprz) {
        this.planTaryfowyPoprz = planTaryfowyPoprz;
    }

    public String getPoziomNegocjacji() {
        return poziomNegocjacji;
    }

    public void setPoziomNegocjacji(String poziomNegocjacji) {
        this.poziomNegocjacji = poziomNegocjacji;
    }

    public String getPredkosc() {
        return predkosc;
    }

    public void setPredkosc(String predkosc) {
        this.predkosc = predkosc;
    }

    public String getPredkoscPoprz() {
        return predkoscPoprz;
    }

    public void setPredkoscPoprz(String predkoscPoprz) {
        this.predkoscPoprz = predkoscPoprz;
    }

    public String getProces() {
        return proces;
    }

    public void setProces(String proces) {
        this.proces = proces;
    }

    public String getProduktGlowny() {
        return produktGlowny;
    }

    public void setProduktGlowny(String produktGlowny) {
        this.produktGlowny = produktGlowny;
    }

    public String getTypBundla() {
        return typBundla;
    }

    public void setTypBundla(String typBundla) {
        this.typBundla = typBundla;
    }

    public String getPromocja() {
        return promocja;
    }

    public void setPromocja(String promocja) {
        this.promocja = promocja;
    }

    public String getPrzyczynaAnulowania() {
        return przyczynaAnulowania;
    }

    public void setPrzyczynaAnulowania(String przyczynaAnulowania) {
        this.przyczynaAnulowania = przyczynaAnulowania;
    }

    public String getIdSegment() {
        return idSegment;
    }

    public void setIdSegment(String idSegment) {
        this.idSegment = idSegment;
    }

    public String getStatusZamowienia() {
        return statusZamowienia;
    }

    public void setStatusZamowienia(String statusZamowienia) {
        this.statusZamowienia = statusZamowienia;
    }

    public String getSystemZrodlowy() {
        return systemZrodlowy;
    }

    public void setSystemZrodlowy(String systemZrodlowy) {
        this.systemZrodlowy = systemZrodlowy;
    }

    public String getTypZamowienia() {
        return typZamowienia;
    }

    public void setTypZamowienia(String typZamowienia) {
        this.typZamowienia = typZamowienia;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public String getValidFromDttm() {
        return validFromDttm;
    }

    public void setValidFromDttm(String validFromDttm) {
        this.validFromDttm = validFromDttm;
    }

    public String getValidToDttm() {
        return validToDttm;
    }

    public void setValidToDttm(String validToDttm) {
        this.validToDttm = validToDttm;
    }

    public Double getWartosc() {
        return wartosc;
    }

    public void setWartosc(Double wartosc) {
        this.wartosc = wartosc;
    }

    public Double getWartoscSprzetu() {
        return wartoscSprzetu;
    }

    public void setWartoscSprzetu(Double wartoscSprzetu) {
        this.wartoscSprzetu = wartoscSprzetu;
    }

    public Double getZobowiazanieMiesieczne() {
        return zobowiazanieMiesieczne;
    }

    public void setZobowiazanieMiesieczne(Double zobowiazanieMiesieczne) {
        this.zobowiazanieMiesieczne = zobowiazanieMiesieczne;
    }

    public String getAlias() {
        return alias;
    }

    public void setAlias(String alias) {
        this.alias = alias;
    }

    public String getAlias02() {
        return alias02;
    }

    public void setAlias02(String alias02) {
        this.alias02 = alias02;
    }

    public String getOpisPoz() {
        return opisPoz;
    }

    public void setOpisPoz(String opisPoz) {
        this.opisPoz = opisPoz;
    }

    public String getChmix() {
        return chmix;
    }

    public void setChmix(String chmix) {
        this.chmix = chmix;
    }

    public String getAgent() {
        return agent;
    }

    public void setAgent(String agent) {
        this.agent = agent;
    }

    public String getPosSerwus() {
        return posSerwus;
    }

    public void setPosSerwus(String posSerwus) {
        this.posSerwus = posSerwus;
    }

    public String getPosBscs() {
        return posBscs;
    }

    public void setPosBscs(String posBscs) {
        this.posBscs = posBscs;
    }

    public String getPosName() {
        return posName;
    }

    public void setPosName(String posName) {
        this.posName = posName;
    }

    public String getPosCity() {
        return posCity;
    }

    public void setPosCity(String posCity) {
        this.posCity = posCity;
    }

    public String getUsrSerwus() {
        return usrSerwus;
    }

    public void setUsrSerwus(String usrSerwus) {
        this.usrSerwus = usrSerwus;
    }

    public String getUsrNazwisko() {
        return usrNazwisko;
    }

    public void setUsrNazwisko(String usrNazwisko) {
        this.usrNazwisko = usrNazwisko;
    }

    public String getUsrImie() {
        return usrImie;
    }

    public void setUsrImie(String usrImie) {
        this.usrImie = usrImie;
    }

    public String getUsrKpx() {
        return usrKpx;
    }

    public void setUsrKpx(String usrKpx) {
        this.usrKpx = usrKpx;
    }

    public String getUsrIfs() {
        return usrIfs;
    }

    public void setUsrIfs(String usrIfs) {
        this.usrIfs = usrIfs;
    }

    public String getUsrBscs() {
        return usrBscs;
    }

    public void setUsrBscs(String usrBscs) {
        this.usrBscs = usrBscs;
    }

    public String getUsrOtsa() {
        return usrOtsa;
    }

    public void setUsrOtsa(String usrOtsa) {
        this.usrOtsa = usrOtsa;
    }

    public String getSegment() {
        return segment;
    }

    public void setSegment(String segment) {
        this.segment = segment;
    }

    public String getIdRegionuStr() {
        return idRegionuStr;
    }

    public void setIdRegionuStr(String idRegionuStr) {
        this.idRegionuStr = idRegionuStr;
    }

    public String getRegionStr() {
        return regionStr;
    }

    public void setRegionStr(String regionStr) {
        this.regionStr = regionStr;
    }

    public Integer getIdDystryktStr() {
        return idDystryktStr;
    }

    public void setIdDystryktStr(Integer idDystryktStr) {
        this.idDystryktStr = idDystryktStr;
    }

    public String getDystryktStr() {
        return dystryktStr;
    }

    public void setDystryktStr(String dystryktStr) {
        this.dystryktStr = dystryktStr;
    }

    public String getDm() {
        return dm;
    }

    public void setDm(String dm) {
        this.dm = dm;
    }

    public String getAdm() {
        return adm;
    }

    public void setAdm(String adm) {
        this.adm = adm;
    }

    public Integer getIdSegmentuBudKli() {
        return idSegmentuBudKli;
    }

    public void setIdSegmentuBudKli(Integer idSegmentuBudKli) {
        this.idSegmentuBudKli = idSegmentuBudKli;
    }

    public Integer getIdRegionuKli() {
        return idRegionuKli;
    }

    public void setIdRegionuKli(Integer idRegionuKli) {
        this.idRegionuKli = idRegionuKli;
    }

    public String getNazwaRegionuKli() {
        return nazwaRegionuKli;
    }

    public void setNazwaRegionuKli(String nazwaRegionuKli) {
        this.nazwaRegionuKli = nazwaRegionuKli;
    }

    public Integer getIdDystryktKli() {
        return idDystryktKli;
    }

    public void setIdDystryktKli(Integer idDystryktKli) {
        this.idDystryktKli = idDystryktKli;
    }

    public String getNazwaDystryktuKli() {
        return nazwaDystryktuKli;
    }

    public void setNazwaDystryktuKli(String nazwaDystryktuKli) {
        this.nazwaDystryktuKli = nazwaDystryktuKli;
    }

    public String getNazwaMikrorynkuKli() {
        return nazwaMikrorynkuKli;
    }

    public void setNazwaMikrorynkuKli(String nazwaMikrorynkuKli) {
        this.nazwaMikrorynkuKli = nazwaMikrorynkuKli;
    }

    public Long getIdLokalizacjiKli() {
        return idLokalizacjiKli;
    }

    public void setIdLokalizacjiKli(Long idLokalizacjiKli) {
        this.idLokalizacjiKli = idLokalizacjiKli;
    }

    public Long getIdLokaluKli() {
        return idLokaluKli;
    }

    public void setIdLokaluKli(Long idLokaluKli) {
        this.idLokaluKli = idLokaluKli;
    }

    public String getKodPocztowyKli() {
        return kodPocztowyKli;
    }

    public void setKodPocztowyKli(String kodPocztowyKli) {
        this.kodPocztowyKli = kodPocztowyKli;
    }

    public String getCmc13() {
        return cmc13;
    }

    public void setCmc13(String cmc13) {
        this.cmc13 = cmc13;
    }

    public String getGeoDlugosc() {
        return geoDlugosc;
    }

    public void setGeoDlugosc(String geoDlugosc) {
        this.geoDlugosc = geoDlugosc;
    }

    public String getGeoSzerokosc() {
        return geoSzerokosc;
    }

    public void setGeoSzerokosc(String geoSzerokosc) {
        this.geoSzerokosc = geoSzerokosc;
    }

    public String getMurakamiM() {
        return murakamiM;
    }

    public void setMurakamiM(String murakamiM) {
        this.murakamiM = murakamiM;
    }

    public String getFlagaMnpM() {
        return flagaMnpM;
    }

    public void setFlagaMnpM(String flagaMnpM) {
        this.flagaMnpM = flagaMnpM;
    }

    public String getNipM() {
        return nipM;
    }

    public void setNipM(String nipM) {
        this.nipM = nipM;
    }

    public String getNrSieciM() {
        return nrSieciM;
    }

    public void setNrSieciM(String nrSieciM) {
        this.nrSieciM = nrSieciM;
    }

    public String getCzyBeztermM() {
        return czyBeztermM;
    }

    public void setCzyBeztermM(String czyBeztermM) {
        this.czyBeztermM = czyBeztermM;
    }

    public String getTypM() {
        return typM;
    }

    public void setTypM(String typM) {
        this.typM = typM;
    }

    public String getTyp2M() {
        return typ2M;
    }

    public void setTyp2M(String typ2M) {
        this.typ2M = typ2M;
    }

    public String getRodzM() {
        return rodzM;
    }

    public void setRodzM(String rodzM) {
        this.rodzM = rodzM;
    }

    public String getRodz2M() {
        return rodz2M;
    }

    public void setRodz2M(String rodz2M) {
        this.rodz2M = rodz2M;
    }

    public String getKanalM() {
        return kanalM;
    }

    public void setKanalM(String kanalM) {
        this.kanalM = kanalM;
    }

    public String getBrandM() {
        return brandM;
    }

    public void setBrandM(String brandM) {
        this.brandM = brandM;
    }

    public String getPlanyTaryfowy() {
        return planyTaryfowy;
    }

    public void setPlanyTaryfowy(String planyTaryfowy) {
        this.planyTaryfowy = planyTaryfowy;
    }

    public String getMigrZetM() {
        return migrZetM;
    }

    public void setMigrZetM(String migrZetM) {
        this.migrZetM = migrZetM;
    }

    public String getNaProbM() {
        return naProbM;
    }

    public void setNaProbM(String naProbM) {
        this.naProbM = naProbM;
    }

    public String getKodAktM() {
        return kodAktM;
    }

    public void setKodAktM(String kodAktM) {
        this.kodAktM = kodAktM;
    }

    public String getIdOfertyM() {
        return idOfertyM;
    }

    public void setIdOfertyM(String idOfertyM) {
        this.idOfertyM = idOfertyM;
    }

    public String getRataM() {
        return rataM;
    }

    public void setRataM(String rataM) {
        this.rataM = rataM;
    }

    public String getOfertaWylaczonaM() {
        return ofertaWylaczonaM;
    }

    public void setOfertaWylaczonaM(String ofertaWylaczonaM) {
        this.ofertaWylaczonaM = ofertaWylaczonaM;
    }

    public String getMigrZet() {
        return migrZet;
    }

    public void setMigrZet(String migrZet) {
        this.migrZet = migrZet;
    }

    public String getPoziomNegocjacjiM() {
        return poziomNegocjacjiM;
    }

    public void setPoziomNegocjacjiM(String poziomNegocjacjiM) {
        this.poziomNegocjacjiM = poziomNegocjacjiM;
    }

    public String getPlanyTaryfowyPoprz() {
        return planyTaryfowyPoprz;
    }

    public void setPlanyTaryfowyPoprz(String planyTaryfowyPoprz) {
        this.planyTaryfowyPoprz = planyTaryfowyPoprz;
    }

    public String getNazwaOfertyM() {
        return nazwaOfertyM;
    }

    public void setNazwaOfertyM(String nazwaOfertyM) {
        this.nazwaOfertyM = nazwaOfertyM;
    }

    public String getKodDeaktywacji() {
        return kodDeaktywacji;
    }

    public void setKodDeaktywacji(String kodDeaktywacji) {
        this.kodDeaktywacji = kodDeaktywacji;
    }

    public String getIloscDniM() {
        return iloscDniM;
    }

    public void setIloscDniM(String iloscDniM) {
        this.iloscDniM = iloscDniM;
    }

    public String getNumerTelefonu() {
        return numerTelefonu;
    }

    public void setNumerTelefonu(String numerTelefonu) {
        this.numerTelefonu = numerTelefonu;
    }

    public String getWartoscSubsydia() {
        return wartoscSubsydia;
    }

    public void setWartoscSubsydia(String wartoscSubsydia) {
        this.wartoscSubsydia = wartoscSubsydia;
    }

    public String getOplataLacze() {
        return oplataLacze;
    }

    public void setOplataLacze(String oplataLacze) {
        this.oplataLacze = oplataLacze;
    }

    public String getAliasSpiu() {
        return aliasSpiu;
    }

    public void setAliasSpiu(String aliasSpiu) {
        this.aliasSpiu = aliasSpiu;
    }

    public String getNumerZamowieniaM() {
        return numerZamowieniaM;
    }

    public void setNumerZamowieniaM(String numerZamowieniaM) {
        this.numerZamowieniaM = numerZamowieniaM;
    }

    public String getIdOfertM() {
        return idOfertM;
    }

    public void setIdOfertM(String idOfertM) {
        this.idOfertM = idOfertM;
    }

    public String getRuleAreaId() {
        return ruleAreaId;
    }

    public void setRuleAreaId(String ruleAreaId) {
        this.ruleAreaId = ruleAreaId;
    }

    public String getIdMikrorynkuKli() {
        return idMikrorynkuKli;
    }

    public void setIdMikrorynkuKli(String idMikrorynkuKli) {
        this.idMikrorynkuKli = idMikrorynkuKli;
    }

    public String getIdUser() {
        return idUser;
    }

    public void setIdUser(String idUser) {
        this.idUser = idUser;
    }

    public String getIdPunktu() {
        return idPunktu;
    }

    public void setIdPunktu(String idPunktu) {
        this.idPunktu = idPunktu;
    }

    public String getIdFirmy() {
        return idFirmy;
    }

    public void setIdFirmy(String idFirmy) {
        this.idFirmy = idFirmy;
    }

    public String getKanal() {
        return kanal;
    }

    public void setKanal(String kanal) {
        this.kanal = kanal;
    }

    public String getZgodaMkt() {
        return zgodaMkt;
    }

    public void setZgodaMkt(String zgodaMkt) {
        this.zgodaMkt = zgodaMkt;
    }

    public String getMiastoKli() {
        return miastoKli;
    }

    public void setMiastoKli(String miastoKli) {
        this.miastoKli = miastoKli;
    }

    public String getPickup() {
        return pickup;
    }

    public void setPickup(String pickup) {
        this.pickup = pickup;
    }

    public String getVoucher() {
        return voucher;
    }

    public void setVoucher(String voucher) {
        this.voucher = voucher;
    }

    public String getVoucherId() {
        return voucherId;
    }

    public void setVoucherId(String voucherId) {
        this.voucherId = voucherId;
    }

    public String getVoucherBonus() {
        return voucherBonus;
    }

    public void setVoucherBonus(String voucherBonus) {
        this.voucherBonus = voucherBonus;
    }

    public String getModelSecondary() {
        return modelSecondary;
    }

    public void setModelSecondary(String modelSecondary) {
        this.modelSecondary = modelSecondary;
    }

    public String getCenaTerminalaSecondary() {
        return cenaTerminalaSecondary;
    }

    public void setCenaTerminalaSecondary(String cenaTerminalaSecondary) {
        this.cenaTerminalaSecondary = cenaTerminalaSecondary;
    }

    public String getIdMiejscowosciKli() {
        return idMiejscowosciKli;
    }

    public void setIdMiejscowosciKli(String idMiejscowosciKli) {
        this.idMiejscowosciKli = idMiejscowosciKli;
    }

    public String getFlagaVhbb() {
        return flagaVhbb;
    }

    public void setFlagaVhbb(String flagaVhbb) {
        this.flagaVhbb = flagaVhbb;
    }

    public String getMyOrange() {
        return myOrange;
    }

    public void setMyOrange(String myOrange) {
        this.myOrange = myOrange;
    }

    public String getMyOrangeDayNo() {
        return myOrangeDayNo;
    }

    public void setMyOrangeDayNo(String myOrangeDayNo) {
        this.myOrangeDayNo = myOrangeDayNo;
    }

    public String getMyOrangeData() {
        return myOrangeData;
    }

    public void setMyOrangeData(String myOrangeData) {
        this.myOrangeData = myOrangeData;
    }

    public String getNumerKonta() {
        return numerKonta;
    }

    public void setNumerKonta(String numerKonta) {
        this.numerKonta = numerKonta;
    }

    public String getNo() {
        return no;
    }

    public void setNo(String no) {
        this.no = no;
    }

    public String getZaliczOpl() {
        return zaliczOpl;
    }

    public void setZaliczOpl(String zaliczOpl) {
        this.zaliczOpl = zaliczOpl;
    }

    public String getZaliczXrds() {
        return zaliczXrds;
    }

    public void setZaliczXrds(String zaliczXrds) {
        this.zaliczXrds = zaliczXrds;
    }

    public String getZaliczXdm() {
        return zaliczXdm;
    }

    public void setZaliczXdm(String zaliczXdm) {
        this.zaliczXdm = zaliczXdm;
    }

    public String getZaliczKpos() {
        return zaliczKpos;
    }

    public void setZaliczKpos(String zaliczKpos) {
        this.zaliczKpos = zaliczKpos;
    }

    public String getZaliczAdm() {
        return zaliczAdm;
    }

    public void setZaliczAdm(String zaliczAdm) {
        this.zaliczAdm = zaliczAdm;
    }

    public String getZaliczPh() {
        return zaliczPh;
    }

    public void setZaliczPh(String zaliczPh) {
        this.zaliczPh = zaliczPh;
    }

    public String getZaliczRh() {
        return zaliczRh;
    }

    public void setZaliczRh(String zaliczRh) {
        this.zaliczRh = zaliczRh;
    }

    public String getUsrImieEfektywny() {
        return usrImieEfektywny;
    }

    public void setUsrImieEfektywny(String usrImieEfektywny) {
        this.usrImieEfektywny = usrImieEfektywny;
    }

    public String getUsrNazwiskoEfektywny() {
        return usrNazwiskoEfektywny;
    }

    public void setUsrNazwiskoEfektywny(String usrNazwiskoEfektywny) {
        this.usrNazwiskoEfektywny = usrNazwiskoEfektywny;
    }

    public String getUsrSerwusEfektywny() {
        return usrSerwusEfektywny;
    }

    public void setUsrSerwusEfektywny(String usrSerwusEfektywny) {
        this.usrSerwusEfektywny = usrSerwusEfektywny;
    }

    public String getDystryktEfektywny() {
        return dystryktEfektywny;
    }

    public void setDystryktEfektywny(String dystryktEfektywny) {
        this.dystryktEfektywny = dystryktEfektywny;
    }

    public String getIdDystryktEfektywny() {
        return idDystryktEfektywny;
    }

    public void setIdDystryktEfektywny(String idDystryktEfektywny) {
        this.idDystryktEfektywny = idDystryktEfektywny;
    }

    public String getRegionEfektywny() {
        return regionEfektywny;
    }

    public void setRegionEfektywny(String regionEfektywny) {
        this.regionEfektywny = regionEfektywny;
    }

    public String getIdRegionuEfektywny() {
        return idRegionuEfektywny;
    }

    public void setIdRegionuEfektywny(String idRegionuEfektywny) {
        this.idRegionuEfektywny = idRegionuEfektywny;
    }

    public String getDystryktBgt() {
        return dystryktBgt;
    }

    public void setDystryktBgt(String dystryktBgt) {
        this.dystryktBgt = dystryktBgt;
    }

    public String getIdDystryktBgt() {
        return idDystryktBgt;
    }

    public void setIdDystryktBgt(String idDystryktBgt) {
        this.idDystryktBgt = idDystryktBgt;
    }

    public String getRegionBgt() {
        return regionBgt;
    }

    public void setRegionBgt(String regionBgt) {
        this.regionBgt = regionBgt;
    }

    public String getIdRegionuBgt() {
        return idRegionuBgt;
    }

    public void setIdRegionuBgt(String idRegionuBgt) {
        this.idRegionuBgt = idRegionuBgt;
    }

    public String getOfertaWylaczonaOper() {
        return ofertaWylaczonaOper;
    }

    public void setOfertaWylaczonaOper(String ofertaWylaczonaOper) {
        this.ofertaWylaczonaOper = ofertaWylaczonaOper;
    }

    public String getOfertaWylaczonaBgt() {
        return ofertaWylaczonaBgt;
    }

    public void setOfertaWylaczonaBgt(String ofertaWylaczonaBgt) {
        this.ofertaWylaczonaBgt = ofertaWylaczonaBgt;
    }

    public String getKampaFbb() {
        return kampaFbb;
    }

    public void setKampaFbb(String kampaFbb) {
        this.kampaFbb = kampaFbb;
    }

    public String getKampaLte() {
        return kampaLte;
    }

    public void setKampaLte(String kampaLte) {
        this.kampaLte = kampaLte;
    }

    public Date getDataAktualizacji() {
        return dataAktualizacji;
    }

    public void setDataAktualizacji(Date dataAktualizacji) {
        this.dataAktualizacji = dataAktualizacji;
    }

    public String getSegmentBuc() {
        return segmentBuc;
    }

    public void setSegmentBuc(String segmentBuc) {
        this.segmentBuc = segmentBuc;
    }

    public String getKampaniaNazwa() {
        return kampaniaNazwa;
    }

    public void setKampaniaNazwa(String kampaniaNazwa) {
        this.kampaniaNazwa = kampaniaNazwa;
    }

    public String getSol() {
        return sol;
    }

    public void setSol(String sol) {
        this.sol = sol;
    }

    public String getStronaNamiaru() {
        return stronaNamiaru;
    }

    public void setStronaNamiaru(String stronaNamiaru) {
        this.stronaNamiaru = stronaNamiaru;
    }

    public Long getCustomerGlobalId() {
        return customerGlobalId;
    }

    public void setCustomerGlobalId(Long customerGlobalId) {
        this.customerGlobalId = customerGlobalId;
    }

    public String getSloPredkosc() {
        return sloPredkosc;
    }

    public void setSloPredkosc(String sloPredkosc) {
        this.sloPredkosc = sloPredkosc;
    }

    public String getTechnologiaBb() {
        return technologiaBb;
    }

    public void setTechnologiaBb(String technologiaBb) {
        this.technologiaBb = technologiaBb;
    }

    public String getTechnologiaBbPrzed() {
        return technologiaBbPrzed;
    }

    public void setTechnologiaBbPrzed(String technologiaBbPrzed) {
        this.technologiaBbPrzed = technologiaBbPrzed;
    }

    public String getTechnologiaBbPo() {
        return technologiaBbPo;
    }

    public void setTechnologiaBbPo(String technologiaBbPo) {
        this.technologiaBbPo = technologiaBbPo;
    }

    public Date getCzasBazy() {
        return czasBazy;
    }

    public void setCzasBazy(Date czasBazy) {
        this.czasBazy = czasBazy;
    }
}
