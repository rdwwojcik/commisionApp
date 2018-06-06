package commision.core.entities.pma;

import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * Created by radoslaw.wojcik on 2017-08-17.
 */
@Entity
@Table(name = "pma_sso")
public class PmaSso extends Pma {

    private String  kodDodatkowy;
    private String  typKoszyka;
    private String  kombinacjaAbon;
    private Integer wspBudzetu;
    private Double  wartUslugiDod;
    private Double  wartTerminali;
    private Double  wartKredytu;
    private Double  deltaAbon;
    private Double  planIl;
    private Double  realPlanuIl;
    private Double  prcRealPlanuIl;
    private Double  planWart;
    private Double  realPlanuWart;
    private Double  prcRealPlanuWart;
    private Double  wspP;
    private Double  bonusMies;
    private Double  wspY;
    private Double  sumaQ;
    private Double  wspS;
    private Double  premiaSiec;
    private Integer sd;
    private Double  abonPrzedUtrz;
    private Double  abonPoUtrz;
    private Double  srRach3Mies;
    private Double  abonDoCelu;
    private Double  wartKontraktuCel;
    private Double  cenaHutTerm;
    private Double  kwotaKredytu;
    private Integer poziomNeg;
    private Integer liUsl;
    private Integer liTerminali;
    private Integer ofertaGotowa;
    private Long    nrKontaAbon;
    private String  procesSprzedazy;
    private String  login;
    private String  snCode;
    private String  spCode;
    private String  powodNal;
    private Double  aktReklamowa;
    private String  zestawNagrod;
    private String  leadTyp;
    private Long    globalId;
    private Long    sdKontrakt;
    private Long    sdPracownika;
    private Long    sdKlienta;
    private String  poziomSalonu;
    private Integer ilosc;
    private String  zdarzenieRatalne;
    private String  rodzajOferty;
    private Double  bazaRh;
    private Double  planIlRh;
    private Double  realPlanuIlRh;
    private Double  prcRealPlanuIlRh;
    private Double  wspPIlRh;
    private Double  planWartRh;
    private Double  realPlanuWartRh;
    private Double  prcRealPlanuWartRh;
    private Double  wspPWartRh;
    private Double  wagaKoszykaRh;
    private Double  wspKorekcyjnyRh;
    private Double  realWazKoszRh;
    private Double  realWazKoszRhWarunek;
    private Double  wspKpiRh;
    private Double  prowizjaRhInf;
    private Double  prowZaRealCeluAgRh;
    private Double  bazaKsso;
    private Double  planIlKsso;
    private Double  realPlanuIlKsso;
    private Double  prcRealPlanuIlKsso;
    private Double  wspPIlKsso;
    private Double  planWartKsso;
    private Double  realPlanuWartKsso;
    private Double  prcRealPlanuWartKsso;
    private Double  wspPWartKsso;
    private Double  wagaKoszykaKsso;
    private Double  wspKorekcyjnyKsso;
    private Double  realWazKoszKsso;
    private Double  realWazKoszKssoWarunek;
    private Double  wspKpiKsso;
    private Double  prowizjaKssoInf;
    private Double  prowZaRealCeluAgKsso;
    private String  newColumn;
    private Long    idKoszyka;

    public String getNewColumn() {
        return newColumn;
    }

    public void setNewColumn(String newColumn) {
        this.newColumn = newColumn;
    }

    public String getKodDodatkowy() {
        return kodDodatkowy;
    }

    public void setKodDodatkowy(String kodDodatkowy) {
        this.kodDodatkowy = kodDodatkowy;
    }

    public String getTypKoszyka() {
        return typKoszyka;
    }

    public void setTypKoszyka(String typKoszyka) {
        this.typKoszyka = typKoszyka;
    }

    public String getKombinacjaAbon() {
        return kombinacjaAbon;
    }

    public void setKombinacjaAbon(String kombinacjaAbon) {
        this.kombinacjaAbon = kombinacjaAbon;
    }

    public Integer getWspBudzetu() {
        return wspBudzetu;
    }

    public void setWspBudzetu(Integer wspBudzetu) {
        this.wspBudzetu = wspBudzetu;
    }

    public Double getWartUslugiDod() {
        return wartUslugiDod;
    }

    public void setWartUslugiDod(Double wartUslugiDod) {
        this.wartUslugiDod = wartUslugiDod;
    }

    public Double getWartTerminali() {
        return wartTerminali;
    }

    public void setWartTerminali(Double wartTerminali) {
        this.wartTerminali = wartTerminali;
    }

    public Double getWartKredytu() {
        return wartKredytu;
    }

    public void setWartKredytu(Double wartKredytu) {
        this.wartKredytu = wartKredytu;
    }

    public Double getDeltaAbon() {
        return deltaAbon;
    }

    public void setDeltaAbon(Double deltaAbon) {
        this.deltaAbon = deltaAbon;
    }

    public Double getPlanIl() {
        return planIl;
    }

    public void setPlanIl(Double planIl) {
        this.planIl = planIl;
    }

    public Double getRealPlanuIl() {
        return realPlanuIl;
    }

    public void setRealPlanuIl(Double realPlanuIl) {
        this.realPlanuIl = realPlanuIl;
    }

    public Double getPrcRealPlanuIl() {
        return prcRealPlanuIl;
    }

    public void setPrcRealPlanuIl(Double prcRealPlanuIl) {
        this.prcRealPlanuIl = prcRealPlanuIl;
    }

    public Double getPlanWart() {
        return planWart;
    }

    public void setPlanWart(Double planWart) {
        this.planWart = planWart;
    }

    public Double getRealPlanuWart() {
        return realPlanuWart;
    }

    public void setRealPlanuWart(Double realPlanuWart) {
        this.realPlanuWart = realPlanuWart;
    }

    public Double getPrcRealPlanuWart() {
        return prcRealPlanuWart;
    }

    public void setPrcRealPlanuWart(Double prcRealPlanuWart) {
        this.prcRealPlanuWart = prcRealPlanuWart;
    }

    public Double getWspP() {
        return wspP;
    }

    public void setWspP(Double wspP) {
        this.wspP = wspP;
    }

    public Double getBonusMies() {
        return bonusMies;
    }

    public void setBonusMies(Double bonusMies) {
        this.bonusMies = bonusMies;
    }

    public Double getWspY() {
        return wspY;
    }

    public void setWspY(Double wspY) {
        this.wspY = wspY;
    }

    public Double getSumaQ() {
        return sumaQ;
    }

    public void setSumaQ(Double sumaQ) {
        this.sumaQ = sumaQ;
    }

    public Double getWspS() {
        return wspS;
    }

    public void setWspS(Double wspS) {
        this.wspS = wspS;
    }

    public Double getPremiaSiec() {
        return premiaSiec;
    }

    public void setPremiaSiec(Double premiaSiec) {
        this.premiaSiec = premiaSiec;
    }

    public Integer getSd() {
        return sd;
    }

    public void setSd(Integer sd) {
        this.sd = sd;
    }

    public Double getAbonPrzedUtrz() {
        return abonPrzedUtrz;
    }

    public void setAbonPrzedUtrz(Double abonPrzedUtrz) {
        this.abonPrzedUtrz = abonPrzedUtrz;
    }

    public Double getAbonPoUtrz() {
        return abonPoUtrz;
    }

    public void setAbonPoUtrz(Double abonPoUtrz) {
        this.abonPoUtrz = abonPoUtrz;
    }

    public Double getSrRach3Mies() {
        return srRach3Mies;
    }

    public void setSrRach3Mies(Double srRach3Mies) {
        this.srRach3Mies = srRach3Mies;
    }

    public Double getAbonDoCelu() {
        return abonDoCelu;
    }

    public void setAbonDoCelu(Double abonDoCelu) {
        this.abonDoCelu = abonDoCelu;
    }

    public Double getWartKontraktuCel() {
        return wartKontraktuCel;
    }

    public void setWartKontraktuCel(Double wartKontraktuCel) {
        this.wartKontraktuCel = wartKontraktuCel;
    }

    public Double getCenaHutTerm() {
        return cenaHutTerm;
    }

    public void setCenaHutTerm(Double cenaHutTerm) {
        this.cenaHutTerm = cenaHutTerm;
    }

    public Double getKwotaKredytu() {
        return kwotaKredytu;
    }

    public void setKwotaKredytu(Double kwotaKredytu) {
        this.kwotaKredytu = kwotaKredytu;
    }

    public Integer getPoziomNeg() {
        return poziomNeg;
    }

    public void setPoziomNeg(Integer poziomNeg) {
        this.poziomNeg = poziomNeg;
    }

    public Integer getLiUsl() {
        return liUsl;
    }

    public void setLiUsl(Integer liUsl) {
        this.liUsl = liUsl;
    }

    public Integer getLiTerminali() {
        return liTerminali;
    }

    public void setLiTerminali(Integer liTerminali) {
        this.liTerminali = liTerminali;
    }

    public Integer getOfertaGotowa() {
        return ofertaGotowa;
    }

    public void setOfertaGotowa(Integer ofertaGotowa) {
        this.ofertaGotowa = ofertaGotowa;
    }

    public Long getNrKontaAbon() {
        return nrKontaAbon;
    }

    public void setNrKontaAbon(Long nrKontaAbon) {
        this.nrKontaAbon = nrKontaAbon;
    }

    public String getProcesSprzedazy() {
        return procesSprzedazy;
    }

    public void setProcesSprzedazy(String procesSprzedazy) {
        this.procesSprzedazy = procesSprzedazy;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getSnCode() {
        return snCode;
    }

    public void setSnCode(String snCode) {
        this.snCode = snCode;
    }

    public String getSpCode() {
        return spCode;
    }

    public void setSpCode(String spCode) {
        this.spCode = spCode;
    }

    public String getPowodNal() {
        return powodNal;
    }

    public void setPowodNal(String powodNal) {
        this.powodNal = powodNal;
    }

    public Double getAktReklamowa() {
        return aktReklamowa;
    }

    public void setAktReklamowa(Double aktReklamowa) {
        this.aktReklamowa = aktReklamowa;
    }

    public String getZestawNagrod() {
        return zestawNagrod;
    }

    public void setZestawNagrod(String zestawNagrod) {
        this.zestawNagrod = zestawNagrod;
    }

    public String getLeadTyp() {
        return leadTyp;
    }

    public void setLeadTyp(String leadTyp) {
        this.leadTyp = leadTyp;
    }

    public Long getGlobalId() {
        return globalId;
    }

    public void setGlobalId(Long globalId) {
        this.globalId = globalId;
    }

    public Long getSdKontrakt() {
        return sdKontrakt;
    }

    public void setSdKontrakt(Long sdKontrakt) {
        this.sdKontrakt = sdKontrakt;
    }

    public Long getSdPracownika() {
        return sdPracownika;
    }

    public void setSdPracownika(Long sdPracownika) {
        this.sdPracownika = sdPracownika;
    }

    public Long getSdKlienta() {
        return sdKlienta;
    }

    public void setSdKlienta(Long sdKlienta) {
        this.sdKlienta = sdKlienta;
    }

    public String getPoziomSalonu() {
        return poziomSalonu;
    }

    public void setPoziomSalonu(String poziomSalonu) {
        this.poziomSalonu = poziomSalonu;
    }

    public Integer getIlosc() {
        return ilosc;
    }

    public void setIlosc(Integer ilosc) {
        this.ilosc = ilosc;
    }

    public String getZdarzenieRatalne() {
        return zdarzenieRatalne;
    }

    public void setZdarzenieRatalne(String zdarzenieRatalne) {
        this.zdarzenieRatalne = zdarzenieRatalne;
    }

    public String getRodzajOferty() {
        return rodzajOferty;
    }

    public void setRodzajOferty(String rodzajOferty) {
        this.rodzajOferty = rodzajOferty;
    }

    public Double getBazaRh() {
        return bazaRh;
    }

    public void setBazaRh(Double bazaRh) {
        this.bazaRh = bazaRh;
    }

    public Double getPlanIlRh() {
        return planIlRh;
    }

    public void setPlanIlRh(Double planIlRh) {
        this.planIlRh = planIlRh;
    }

    public Double getRealPlanuIlRh() {
        return realPlanuIlRh;
    }

    public void setRealPlanuIlRh(Double realPlanuIlRh) {
        this.realPlanuIlRh = realPlanuIlRh;
    }

    public Double getPrcRealPlanuIlRh() {
        return prcRealPlanuIlRh;
    }

    public void setPrcRealPlanuIlRh(Double prcRealPlanuIlRh) {
        this.prcRealPlanuIlRh = prcRealPlanuIlRh;
    }

    public Double getWspPIlRh() {
        return wspPIlRh;
    }

    public void setWspPIlRh(Double wspPIlRh) {
        this.wspPIlRh = wspPIlRh;
    }

    public Double getPlanWartRh() {
        return planWartRh;
    }

    public void setPlanWartRh(Double planWartRh) {
        this.planWartRh = planWartRh;
    }

    public Double getRealPlanuWartRh() {
        return realPlanuWartRh;
    }

    public void setRealPlanuWartRh(Double realPlanuWartRh) {
        this.realPlanuWartRh = realPlanuWartRh;
    }

    public Double getPrcRealPlanuWartRh() {
        return prcRealPlanuWartRh;
    }

    public void setPrcRealPlanuWartRh(Double prcRealPlanuWartRh) {
        this.prcRealPlanuWartRh = prcRealPlanuWartRh;
    }

    public Double getWspPWartRh() {
        return wspPWartRh;
    }

    public void setWspPWartRh(Double wspPWartRh) {
        this.wspPWartRh = wspPWartRh;
    }

    public Double getWagaKoszykaRh() {
        return wagaKoszykaRh;
    }

    public void setWagaKoszykaRh(Double wagaKoszykaRh) {
        this.wagaKoszykaRh = wagaKoszykaRh;
    }

    public Double getWspKorekcyjnyRh() {
        return wspKorekcyjnyRh;
    }

    public void setWspKorekcyjnyRh(Double wspKorekcyjnyRh) {
        this.wspKorekcyjnyRh = wspKorekcyjnyRh;
    }

    public Double getRealWazKoszRh() {
        return realWazKoszRh;
    }

    public void setRealWazKoszRh(Double realWazKoszRh) {
        this.realWazKoszRh = realWazKoszRh;
    }

    public Double getRealWazKoszRhWarunek() {
        return realWazKoszRhWarunek;
    }

    public void setRealWazKoszRhWarunek(Double realWazKoszRhWarunek) {
        this.realWazKoszRhWarunek = realWazKoszRhWarunek;
    }

    public Double getWspKpiRh() {
        return wspKpiRh;
    }

    public void setWspKpiRh(Double wspKpiRh) {
        this.wspKpiRh = wspKpiRh;
    }

    public Double getProwizjaRhInf() {
        return prowizjaRhInf;
    }

    public void setProwizjaRhInf(Double prowizjaRhInf) {
        this.prowizjaRhInf = prowizjaRhInf;
    }

    public Double getProwZaRealCeluAgRh() {
        return prowZaRealCeluAgRh;
    }

    public void setProwZaRealCeluAgRh(Double prowZaRealCeluAgRh) {
        this.prowZaRealCeluAgRh = prowZaRealCeluAgRh;
    }

    public Double getBazaKsso() {
        return bazaKsso;
    }

    public void setBazaKsso(Double bazaKsso) {
        this.bazaKsso = bazaKsso;
    }

    public Double getPlanIlKsso() {
        return planIlKsso;
    }

    public void setPlanIlKsso(Double planIlKsso) {
        this.planIlKsso = planIlKsso;
    }

    public Double getRealPlanuIlKsso() {
        return realPlanuIlKsso;
    }

    public void setRealPlanuIlKsso(Double realPlanuIlKsso) {
        this.realPlanuIlKsso = realPlanuIlKsso;
    }

    public Double getPrcRealPlanuIlKsso() {
        return prcRealPlanuIlKsso;
    }

    public void setPrcRealPlanuIlKsso(Double prcRealPlanuIlKsso) {
        this.prcRealPlanuIlKsso = prcRealPlanuIlKsso;
    }

    public Double getWspPIlKsso() {
        return wspPIlKsso;
    }

    public void setWspPIlKsso(Double wspPIlKsso) {
        this.wspPIlKsso = wspPIlKsso;
    }

    public Double getPlanWartKsso() {
        return planWartKsso;
    }

    public void setPlanWartKsso(Double planWartKsso) {
        this.planWartKsso = planWartKsso;
    }

    public Double getRealPlanuWartKsso() {
        return realPlanuWartKsso;
    }

    public void setRealPlanuWartKsso(Double realPlanuWartKsso) {
        this.realPlanuWartKsso = realPlanuWartKsso;
    }

    public Double getPrcRealPlanuWartKsso() {
        return prcRealPlanuWartKsso;
    }

    public void setPrcRealPlanuWartKsso(Double prcRealPlanuWartKsso) {
        this.prcRealPlanuWartKsso = prcRealPlanuWartKsso;
    }

    public Double getWspPWartKsso() {
        return wspPWartKsso;
    }

    public void setWspPWartKsso(Double wspPWartKsso) {
        this.wspPWartKsso = wspPWartKsso;
    }

    public Double getWagaKoszykaKsso() {
        return wagaKoszykaKsso;
    }

    public void setWagaKoszykaKsso(Double wagaKoszykaKsso) {
        this.wagaKoszykaKsso = wagaKoszykaKsso;
    }

    public Double getWspKorekcyjnyKsso() {
        return wspKorekcyjnyKsso;
    }

    public void setWspKorekcyjnyKsso(Double wspKorekcyjnyKsso) {
        this.wspKorekcyjnyKsso = wspKorekcyjnyKsso;
    }

    public Double getRealWazKoszKsso() {
        return realWazKoszKsso;
    }

    public void setRealWazKoszKsso(Double realWazKoszKsso) {
        this.realWazKoszKsso = realWazKoszKsso;
    }

    public Double getRealWazKoszKssoWarunek() {
        return realWazKoszKssoWarunek;
    }

    public void setRealWazKoszKssoWarunek(Double realWazKoszKssoWarunek) {
        this.realWazKoszKssoWarunek = realWazKoszKssoWarunek;
    }

    public Double getWspKpiKsso() {
        return wspKpiKsso;
    }

    public void setWspKpiKsso(Double wspKpiKsso) {
        this.wspKpiKsso = wspKpiKsso;
    }

    public Double getProwizjaKssoInf() {
        return prowizjaKssoInf;
    }

    public void setProwizjaKssoInf(Double prowizjaKssoInf) {
        this.prowizjaKssoInf = prowizjaKssoInf;
    }

    public Double getProwZaRealCeluAgKsso() {
        return prowZaRealCeluAgKsso;
    }

    public void setProwZaRealCeluAgKsso(Double prowZaRealCeluAgKsso) {
        this.prowZaRealCeluAgKsso = prowZaRealCeluAgKsso;
    }

    public Long getIdKoszyka() {
        return idKoszyka;
    }

    public void setIdKoszyka(Long idKoszyka) {
        this.idKoszyka = idKoszyka;
    }
}
