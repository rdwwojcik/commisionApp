package commision.core.entities.pma;

import commision.core.entities.BaseImportFileEntity;

import javax.persistence.*;
import java.util.Date;

/**
 * Created by radoslaw.wojcik on 2017-08-17.
 */
@Entity
public abstract class Pma extends BaseImportFileEntity {

    private Long idKodIndex;
    private Long idSso;
    private Long idUser;
    private Long idSekcji;
    private Long idPlanuTaryf;
    private Long idIfsCodeC;
    private Long idStawkaProw;
    @Temporal(TemporalType.DATE)
    private Date dataProwizji;
    private String nazwaSekcji;
    private String kodDealera;
    private String kodGlowny;
    @Temporal(TemporalType.DATE)
    private Date   dataStatusu;
    @Temporal(TemporalType.DATE)
    private Date   dataDeaktywacji;
    private String nrKontraktu;
    private String idKontraktu;
    private String tymczasowyMsisdn;
    private String msisdn;
    private String koszykUslug;
    private String nazwaPlanuTaryf;
    private String nazwaUslugi;
    private String kodPromocji;
    private String uslSkladoweAbonamentu;
    private String kodAktywacji;
    private String typPn;
    private Double dlUmowy;
    private Double abonamentNetto;
    private Double oplataAktywacyjna;
    private String modelTerminala;
    private Double wartoscKontraktu;
    private Double wspZ;
    private Double premiaPodstawowa;
    private Double kwotaDoWyplaty;
    private String selfReplacement;
    private String imei;
    private Double cenaZakTermKlienta;
    private String idZdarzenia;
    private String szerszyOpis;
    private Double subsydia;
    private String idPlanu;
    private String idOferty;
    private String nip;
    private String nazwaTypuZdarzenia;
    private Integer korekta;
    private Double wspClawback;

    private String ifsAkcja;
    private Integer ifsBlanketOrder;
    private String ifsCodeA;
    private String ifsCodeB;
    private String ifsCodeC;
    private String ifsCodeD;
    private String ifsCodeE;
    private String ifsCodeF;
    private String ifsCodeG;
    private String ifsCodeH;
    private String ifsCodeI;
    private String ifsCurrencyCode;
    @Temporal(TemporalType.DATE)
    private Date   ifsdateOfSale;
    private String ifsErrorDesc;
    private Long   ifsId;
    @Temporal(TemporalType.DATE)
    private Date   ifsInvoiceDate;
    private Integer ifsLineNo;
    private String ifsNoteText;
    private Integer ifsOrderNo;
    private String ifsPartDesc;
    private String ifsPartNo;
    private String ifsPeriod;
    private String ifsPlan;
    private Double ifsPrice;
    private String ifsPrjId;
    private String ifsProwizja;
    private Integer ifsQuantity;
    private String ifsReleanseNo;
    private Long   ifsRowVersion;
    private String ifsStatus;
    private Integer ifsSuplier;
    private Long   ifsSuplierIfs;
    private String ifsType;
//    @Column(name = "czas_bazy", columnDefinition = "date default sysdate")
    @Temporal(TemporalType.DATE)
    private Date czasBazy;

    public Long getIdSso() {
        return idSso;
    }

    public void setIdSso(Long idSso) {
        this.idSso = idSso;
    }

    public Date getDataProwizji() {
        return dataProwizji;
    }

    public void setDataProwizji(Date dataProwizji) {
        this.dataProwizji = dataProwizji;
    }

    public String getNazwaSekcji() {
        return nazwaSekcji;
    }

    public void setNazwaSekcji(String nazwaSekcji) {
        this.nazwaSekcji = nazwaSekcji;
    }

    public String getKodDealera() {
        return kodDealera;
    }

    public void setKodDealera(String kodDealera) {
        this.kodDealera = kodDealera;
    }

    public String getKodGlowny() {
        return kodGlowny;
    }

    public void setKodGlowny(String kodGlowny) {
        this.kodGlowny = kodGlowny;
    }

    public Date getDataStatusu() {
        return dataStatusu;
    }

    public void setDataStatusu(Date dataStatusu) {
        this.dataStatusu = dataStatusu;
    }

    public Date getDataDeaktywacji() {
        return dataDeaktywacji;
    }

    public void setDataDeaktywacji(Date dataDeaktywacji) {
        this.dataDeaktywacji = dataDeaktywacji;
    }

    public String getNrKontraktu() {
        return nrKontraktu;
    }

    public void setNrKontraktu(String nrKontraktu) {
        this.nrKontraktu = nrKontraktu;
    }

    public String getIdKontraktu() {
        return idKontraktu;
    }

    public void setIdKontraktu(String idKontraktu) {
        this.idKontraktu = idKontraktu;
    }

    public String getTymczasowyMsisdn() {
        return tymczasowyMsisdn;
    }

    public void setTymczasowyMsisdn(String tymczasowyMsisdn) {
        this.tymczasowyMsisdn = tymczasowyMsisdn;
    }

    public String getMsisdn() {
        return msisdn;
    }

    public void setMsisdn(String msisdn) {
        this.msisdn = msisdn;
    }

    public String getKoszykUslug() {
        return koszykUslug;
    }

    public void setKoszykUslug(String koszykUslug) {
        this.koszykUslug = koszykUslug;
    }

    public String getNazwaPlanuTaryf() {
        return nazwaPlanuTaryf;
    }

    public void setNazwaPlanuTaryf(String nazwaPlanuTaryf) {
        this.nazwaPlanuTaryf = nazwaPlanuTaryf;
    }

    public String getNazwaUslugi() {
        return nazwaUslugi;
    }

    public void setNazwaUslugi(String nazwaUslugi) {
        this.nazwaUslugi = nazwaUslugi;
    }

    public String getKodPromocji() {
        return kodPromocji;
    }

    public void setKodPromocji(String kodPromocji) {
        this.kodPromocji = kodPromocji;
    }

    public String getUslSkladoweAbonamentu() {
        return uslSkladoweAbonamentu;
    }

    public void setUslSkladoweAbonamentu(String uslSkladoweAbonamentu) {
        this.uslSkladoweAbonamentu = uslSkladoweAbonamentu;
    }

    public String getKodAktywacji() {
        return kodAktywacji;
    }

    public void setKodAktywacji(String kodAktywacji) {
        this.kodAktywacji = kodAktywacji;
    }

    public String getTypPn() {
        return typPn;
    }

    public void setTypPn(String typPn) {
        this.typPn = typPn;
    }

    public Double getDlUmowy() {
        return dlUmowy;
    }

    public void setDlUmowy(Double dlUmowy) {
        this.dlUmowy = dlUmowy;
    }

    public Double getAbonamentNetto() {
        return abonamentNetto;
    }

    public void setAbonamentNetto(Double abonamentNetto) {
        this.abonamentNetto = abonamentNetto;
    }

    public Double getOplataAktywacyjna() {
        return oplataAktywacyjna;
    }

    public void setOplataAktywacyjna(Double oplataAktywacyjna) {
        this.oplataAktywacyjna = oplataAktywacyjna;
    }

    public String getModelTerminala() {
        return modelTerminala;
    }

    public void setModelTerminala(String modelTerminala) {
        this.modelTerminala = modelTerminala;
    }

    public Double getWartoscKontraktu() {
        return wartoscKontraktu;
    }

    public void setWartoscKontraktu(Double wartoscKontraktu) {
        this.wartoscKontraktu = wartoscKontraktu;
    }

    public Double getWspZ() {
        return wspZ;
    }

    public void setWspZ(Double wspZ) {
        this.wspZ = wspZ;
    }

    public Double getPremiaPodstawowa() {
        return premiaPodstawowa;
    }

    public void setPremiaPodstawowa(Double premiaPodstawowa) {
        this.premiaPodstawowa = premiaPodstawowa;
    }

    public Double getKwotaDoWyplaty() {
        return kwotaDoWyplaty;
    }

    public void setKwotaDoWyplaty(Double kwotaDoWyplaty) {
        this.kwotaDoWyplaty = kwotaDoWyplaty;
    }

    public String getSelfReplacement() {
        return selfReplacement;
    }

    public void setSelfReplacement(String selfReplacement) {
        this.selfReplacement = selfReplacement;
    }

    public String getImei() {
        return imei;
    }

    public void setImei(String imei) {
        this.imei = imei;
    }

    public Double getCenaZakTermKlienta() {
        return cenaZakTermKlienta;
    }

    public void setCenaZakTermKlienta(Double cenaZakTermKlienta) {
        this.cenaZakTermKlienta = cenaZakTermKlienta;
    }

    public String getIdZdarzenia() {
        return idZdarzenia;
    }

    public void setIdZdarzenia(String idZdarzenia) {
        this.idZdarzenia = idZdarzenia;
    }

    public String getSzerszyOpis() {
        return szerszyOpis;
    }

    public void setSzerszyOpis(String szerszyOpis) {
        this.szerszyOpis = szerszyOpis;
    }

    public Double getSubsydia() {
        return subsydia;
    }

    public void setSubsydia(Double subsydia) {
        this.subsydia = subsydia;
    }

    public String getIdPlanu() {
        return idPlanu;
    }

    public void setIdPlanu(String idPlanu) {
        this.idPlanu = idPlanu;
    }

    public String getIdOferty() {
        return idOferty;
    }

    public void setIdOferty(String idOferty) {
        this.idOferty = idOferty;
    }

    public String getNip() {
        return nip;
    }

    public void setNip(String nip) {
        this.nip = nip;
    }

    public String getNazwaTypuZdarzenia() {
        return nazwaTypuZdarzenia;
    }

    public void setNazwaTypuZdarzenia(String nazwaTypuZdarzenia) {
        this.nazwaTypuZdarzenia = nazwaTypuZdarzenia;
    }

    public Integer getKorekta() {
        return korekta;
    }

    public void setKorekta(Integer korekta) {
        this.korekta = korekta;
    }

    public Double getWspClawback() {
        return wspClawback;
    }

    public void setWspClawback(Double wspClawback) {
        this.wspClawback = wspClawback;
    }

    public String getIfsAkcja() {
        return ifsAkcja;
    }

    public void setIfsAkcja(String ifsAkcja) {
        this.ifsAkcja = ifsAkcja;
    }

    public Integer getIfsBlanketOrder() {
        return ifsBlanketOrder;
    }

    public void setIfsBlanketOrder(Integer ifsBlanketOrder) {
        this.ifsBlanketOrder = ifsBlanketOrder;
    }

    public String getIfsCodeA() {
        return ifsCodeA;
    }

    public void setIfsCodeA(String ifsCodeA) {
        this.ifsCodeA = ifsCodeA;
    }

    public String getIfsCodeB() {
        return ifsCodeB;
    }

    public void setIfsCodeB(String ifsCodeB) {
        this.ifsCodeB = ifsCodeB;
    }

    public String getIfsCodeC() {
        return ifsCodeC;
    }

    public void setIfsCodeC(String ifsCodeC) {
        this.ifsCodeC = ifsCodeC;
    }

    public String getIfsCodeD() {
        return ifsCodeD;
    }

    public void setIfsCodeD(String ifsCodeD) {
        this.ifsCodeD = ifsCodeD;
    }

    public String getIfsCodeE() {
        return ifsCodeE;
    }

    public void setIfsCodeE(String ifsCodeE) {
        this.ifsCodeE = ifsCodeE;
    }

    public String getIfsCodeF() {
        return ifsCodeF;
    }

    public void setIfsCodeF(String ifsCodeF) {
        this.ifsCodeF = ifsCodeF;
    }

    public String getIfsCodeG() {
        return ifsCodeG;
    }

    public void setIfsCodeG(String ifsCodeG) {
        this.ifsCodeG = ifsCodeG;
    }

    public String getIfsCodeH() {
        return ifsCodeH;
    }

    public void setIfsCodeH(String ifsCodeH) {
        this.ifsCodeH = ifsCodeH;
    }

    public String getIfsCodeI() {
        return ifsCodeI;
    }

    public void setIfsCodeI(String ifsCodeI) {
        this.ifsCodeI = ifsCodeI;
    }

    public String getIfsCurrencyCode() {
        return ifsCurrencyCode;
    }

    public void setIfsCurrencyCode(String ifsCurrencyCode) {
        this.ifsCurrencyCode = ifsCurrencyCode;
    }

    public Date getIfsdateOfSale() {
        return ifsdateOfSale;
    }

    public void setIfsdateOfSale(Date ifsdateOfSale) {
        this.ifsdateOfSale = ifsdateOfSale;
    }

    public String getIfsErrorDesc() {
        return ifsErrorDesc;
    }

    public void setIfsErrorDesc(String ifsErrorDesc) {
        this.ifsErrorDesc = ifsErrorDesc;
    }

    public Long getIfsId() {
        return ifsId;
    }

    public void setIfsId(Long ifsId) {
        this.ifsId = ifsId;
    }

    public Date getIfsInvoiceDate() {
        return ifsInvoiceDate;
    }

    public void setIfsInvoiceDate(Date ifsInvoiceDate) {
        this.ifsInvoiceDate = ifsInvoiceDate;
    }

    public Integer getIfsLineNo() {
        return ifsLineNo;
    }

    public void setIfsLineNo(Integer ifsLineNo) {
        this.ifsLineNo = ifsLineNo;
    }

    public String getIfsNoteText() {
        return ifsNoteText;
    }

    public void setIfsNoteText(String ifsNoteText) {
        this.ifsNoteText = ifsNoteText;
    }

    public Integer getIfsOrderNo() {
        return ifsOrderNo;
    }

    public void setIfsOrderNo(Integer ifsOrderNo) {
        this.ifsOrderNo = ifsOrderNo;
    }

    public String getIfsPartDesc() {
        return ifsPartDesc;
    }

    public void setIfsPartDesc(String ifsPartDesc) {
        this.ifsPartDesc = ifsPartDesc;
    }

    public String getIfsPartNo() {
        return ifsPartNo;
    }

    public void setIfsPartNo(String ifsPartNo) {
        this.ifsPartNo = ifsPartNo;
    }

    public String getIfsPeriod() {
        return ifsPeriod;
    }

    public void setIfsPeriod(String ifsPeriod) {
        this.ifsPeriod = ifsPeriod;
    }

    public String getIfsPlan() {
        return ifsPlan;
    }

    public void setIfsPlan(String ifsPlan) {
        this.ifsPlan = ifsPlan;
    }

    public Double getIfsPrice() {
        return ifsPrice;
    }

    public void setIfsPrice(Double ifsPrice) {
        this.ifsPrice = ifsPrice;
    }

    public String getIfsPrjId() {
        return ifsPrjId;
    }

    public void setIfsPrjId(String ifsPrjId) {
        this.ifsPrjId = ifsPrjId;
    }

    public String getIfsProwizja() {
        return ifsProwizja;
    }

    public void setIfsProwizja(String ifsProwizja) {
        this.ifsProwizja = ifsProwizja;
    }

    public Integer getIfsQuantity() {
        return ifsQuantity;
    }

    public void setIfsQuantity(Integer ifsQuantity) {
        this.ifsQuantity = ifsQuantity;
    }

    public String getIfsReleanseNo() {
        return ifsReleanseNo;
    }

    public void setIfsReleanseNo(String ifsReleanseNo) {
        this.ifsReleanseNo = ifsReleanseNo;
    }

    public Long getIfsRowVersion() {
        return ifsRowVersion;
    }

    public void setIfsRowVersion(Long ifsRowVersion) {
        this.ifsRowVersion = ifsRowVersion;
    }

    public String getIfsStatus() {
        return ifsStatus;
    }

    public void setIfsStatus(String ifsStatus) {
        this.ifsStatus = ifsStatus;
    }

    public Integer getIfsSuplier() {
        return ifsSuplier;
    }

    public void setIfsSuplier(Integer ifsSuplier) {
        this.ifsSuplier = ifsSuplier;
    }

    public Long getIfsSuplierIfs() {
        return ifsSuplierIfs;
    }

    public void setIfsSuplierIfs(Long ifsSuplierIfs) {
        this.ifsSuplierIfs = ifsSuplierIfs;
    }

    public String getIfsType() {
        return ifsType;
    }

    public void setIfsType(String ifsType) {
        this.ifsType = ifsType;
    }

    public Date getCzasBazy() {
        return czasBazy;
    }

    public void setCzasBazy(Date czasBazy) {
        this.czasBazy = czasBazy;
    }

    public Long getIdKodIndex() {
        return idKodIndex;
    }

    public void setIdKodIndex(Long idKodIndex) {
        this.idKodIndex = idKodIndex;
    }

    public Long getIdSekcji() {
        return idSekcji;
    }

    public void setIdSekcji(Long idSekcji) {
        this.idSekcji = idSekcji;
    }

    public Long getIdPlanuTaryf() {
        return idPlanuTaryf;
    }

    public void setIdPlanuTaryf(Long idPlanuTaryf) {
        this.idPlanuTaryf = idPlanuTaryf;
    }

    public Long getIdIfsCodeC() {
        return idIfsCodeC;
    }

    public void setIdIfsCodeC(Long idIfsCodeC) {
        this.idIfsCodeC = idIfsCodeC;
    }

    public Long getIdUser() {
        return idUser;
    }

    public void setIdUser(Long idUser) {
        this.idUser = idUser;
    }

    public Long getIdStawkaProw() {
        return idStawkaProw;
    }

    public void setIdStawkaProw(Long idStawkaProw) {
        this.idStawkaProw = idStawkaProw;
    }
}
