package commision.core.entities.pma;

import javax.persistence.Entity;
import javax.persistence.Table;
import java.util.Date;

/**
 * Created by radoslaw.wojcik on 2017-08-17.
 */
@Entity
@Table(name = "pma_kkb")
public class PmaKkb extends Pma {

    private String  kodDodatkowy;
    private Date    dataPrzyjeciaZam;
    private Date    dataRealizacjiZam;
    private Date    dataRozliczeniaZam;
    private String  cenaZakTerminaliKl;
    private Double  wartTermTab;
    private Integer typHandlowca;
    private Integer czyNowyKlient;
    private Integer czyPotencjalnyKlient;
    private String  status;
    private Integer portfelizacja;
    private String  rodzajKorPremiiPodst;
    private Double  wartKorPremiiPodst;
    private Double  wspBgc;
    private Double  premiaBgc;
    private Double  wspYHandl;
    private Double  bonusLiniiCelHandl;
    private Integer wynRyczaltoweHandl;
    private Double  prowizjaHandl;
    private Double  bonusSieciowy;
    private Double  wspYAgenta;
    private Double  bonusLiniiCelAgenta;
    private Double  wynRyczaltoweAgenta;
    private Double  prowizjaAgenta;
    private Double  wartKorProwizji;
    private Double  wspZwrotu;
    private Integer celDotykalnosc;
    private Integer celKonwergencja;
    private Integer realCelDotykalnosc;
    private Integer realCelKonwergencja;
    private Double  prcRealCelDotykalnosc;
    private Double  prcRealCelkonwergencja;
    private Double  stawkaHandl;
    private Double  stawkaAgenta;
    private Double  wynPortfHandl;
    private Double  wynPortfAgenta;
    private Double  wynPortfSubAgenta;
    private String  nazwaLiniiCelowanej;
    private Double  celLinii;
    private Double  minLinii;
    private Double  realLinii;
    private Double  maxBonus;
    private Double  prcRealLiniiCel;
    private Double  yCzastkowe;
    private String  nazwaFirmy;
    private String  korekty;
    private Integer iloscLoczy;
    private Long    nrZamowienia;
    private String  operKod;
    private Double  abonamentLg;
    private Double  srRata;
    private Double  sumRat;
    private String  czyRata;
    private String  priorytet;
    private Double  wartKredytu;
    private String  idCrm;
    private String  idSerwus;
    private String  idSezam;
    private String  idSokx;
    private String  actMsisdn;
    private String  idEasy;

    public String getKodDodatkowy() {
        return kodDodatkowy;
    }

    public void setKodDodatkowy(String kodDodatkowy) {
        this.kodDodatkowy = kodDodatkowy;
    }

    public Date getDataPrzyjeciaZam() {
        return dataPrzyjeciaZam;
    }

    public void setDataPrzyjeciaZam(Date dataPrzyjeciaZam) {
        this.dataPrzyjeciaZam = dataPrzyjeciaZam;
    }

    public Date getDataRealizacjiZam() {
        return dataRealizacjiZam;
    }

    public void setDataRealizacjiZam(Date dataRealizacjiZam) {
        this.dataRealizacjiZam = dataRealizacjiZam;
    }

    public Date getDataRozliczeniaZam() {
        return dataRozliczeniaZam;
    }

    public void setDataRozliczeniaZam(Date dataRozliczeniaZam) {
        this.dataRozliczeniaZam = dataRozliczeniaZam;
    }

    public String getCenaZakTerminaliKl() {
        return cenaZakTerminaliKl;
    }

    public void setCenaZakTerminaliKl(String cenaZakTerminaliKl) {
        this.cenaZakTerminaliKl = cenaZakTerminaliKl;
    }

    public Double getWartTermTab() {
        return wartTermTab;
    }

    public void setWartTermTab(Double wartTermTab) {
        this.wartTermTab = wartTermTab;
    }

    public Integer getTypHandlowca() {
        return typHandlowca;
    }

    public void setTypHandlowca(Integer typHandlowca) {
        this.typHandlowca = typHandlowca;
    }

    public Integer getCzyNowyKlient() {
        return czyNowyKlient;
    }

    public void setCzyNowyKlient(Integer czyNowyKlient) {
        this.czyNowyKlient = czyNowyKlient;
    }

    public Integer getCzyPotencjalnyKlient() {
        return czyPotencjalnyKlient;
    }

    public void setCzyPotencjalnyKlient(Integer czyPotencjalnyKlient) {
        this.czyPotencjalnyKlient = czyPotencjalnyKlient;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Integer getPortfelizacja() {
        return portfelizacja;
    }

    public void setPortfelizacja(Integer portfelizacja) {
        this.portfelizacja = portfelizacja;
    }



    public Double getWartKorPremiiPodst() {
        return wartKorPremiiPodst;
    }

    public void setWartKorPremiiPodst(Double wartKorPremiiPodst) {
        this.wartKorPremiiPodst = wartKorPremiiPodst;
    }

    public Double getWspBgc() {
        return wspBgc;
    }

    public void setWspBgc(Double wspBgc) {
        this.wspBgc = wspBgc;
    }

    public Double getPremiaBgc() {
        return premiaBgc;
    }

    public void setPremiaBgc(Double premiaBgc) {
        this.premiaBgc = premiaBgc;
    }

    public Double getWspYHandl() {
        return wspYHandl;
    }

    public void setWspYHandl(Double wspYHandl) {
        this.wspYHandl = wspYHandl;
    }

    public Double getBonusLiniiCelHandl() {
        return bonusLiniiCelHandl;
    }

    public void setBonusLiniiCelHandl(Double bonusLiniiCelHandl) {
        this.bonusLiniiCelHandl = bonusLiniiCelHandl;
    }

    public Integer getWynRyczaltoweHandl() {
        return wynRyczaltoweHandl;
    }

    public void setWynRyczaltoweHandl(Integer wynRyczaltoweHandl) {
        this.wynRyczaltoweHandl = wynRyczaltoweHandl;
    }

    public Double getProwizjaHandl() {
        return prowizjaHandl;
    }

    public void setProwizjaHandl(Double prowizjaHandl) {
        this.prowizjaHandl = prowizjaHandl;
    }

    public Double getBonusSieciowy() {
        return bonusSieciowy;
    }

    public void setBonusSieciowy(Double bonusSieciowy) {
        this.bonusSieciowy = bonusSieciowy;
    }

    public Double getWspYAgenta() {
        return wspYAgenta;
    }

    public void setWspYAgenta(Double wspYAgenta) {
        this.wspYAgenta = wspYAgenta;
    }

    public Double getBonusLiniiCelAgenta() {
        return bonusLiniiCelAgenta;
    }

    public void setBonusLiniiCelAgenta(Double bonusLiniiCelAgenta) {
        this.bonusLiniiCelAgenta = bonusLiniiCelAgenta;
    }

    public Double getWynRyczaltoweAgenta() {
        return wynRyczaltoweAgenta;
    }

    public void setWynRyczaltoweAgenta(Double wynRyczaltoweAgenta) {
        this.wynRyczaltoweAgenta = wynRyczaltoweAgenta;
    }

    public Double getProwizjaAgenta() {
        return prowizjaAgenta;
    }

    public void setProwizjaAgenta(Double prowizjaAgenta) {
        this.prowizjaAgenta = prowizjaAgenta;
    }

    public Double getWartKorProwizji() {
        return wartKorProwizji;
    }

    public void setWartKorProwizji(Double wartKorProwizji) {
        this.wartKorProwizji = wartKorProwizji;
    }

    public Double getWspZwrotu() {
        return wspZwrotu;
    }

    public void setWspZwrotu(Double wspZwrotu) {
        this.wspZwrotu = wspZwrotu;
    }

    public Integer getCelDotykalnosc() {
        return celDotykalnosc;
    }

    public void setCelDotykalnosc(Integer celDotykalnosc) {
        this.celDotykalnosc = celDotykalnosc;
    }

    public Integer getCelKonwergencja() {
        return celKonwergencja;
    }

    public void setCelKonwergencja(Integer celKonwergencja) {
        this.celKonwergencja = celKonwergencja;
    }

    public Integer getRealCelDotykalnosc() {
        return realCelDotykalnosc;
    }

    public void setRealCelDotykalnosc(Integer realCelDotykalnosc) {
        this.realCelDotykalnosc = realCelDotykalnosc;
    }

    public Integer getRealCelKonwergencja() {
        return realCelKonwergencja;
    }

    public void setRealCelKonwergencja(Integer realCelKonwergencja) {
        this.realCelKonwergencja = realCelKonwergencja;
    }

    public Double getPrcRealCelDotykalnosc() {
        return prcRealCelDotykalnosc;
    }

    public void setPrcRealCelDotykalnosc(Double prcRealCelDotykalnosc) {
        this.prcRealCelDotykalnosc = prcRealCelDotykalnosc;
    }

    public Double getPrcRealCelkonwergencja() {
        return prcRealCelkonwergencja;
    }

    public void setPrcRealCelkonwergencja(Double prcRealCelkonwergencja) {
        this.prcRealCelkonwergencja = prcRealCelkonwergencja;
    }

    public Double getStawkaHandl() {
        return stawkaHandl;
    }

    public void setStawkaHandl(Double stawkaHandl) {
        this.stawkaHandl = stawkaHandl;
    }

    public Double getStawkaAgenta() {
        return stawkaAgenta;
    }

    public void setStawkaAgenta(Double stawkaAgenta) {
        this.stawkaAgenta = stawkaAgenta;
    }

    public Double getWynPortfHandl() {
        return wynPortfHandl;
    }

    public void setWynPortfHandl(Double wynPortfHandl) {
        this.wynPortfHandl = wynPortfHandl;
    }

    public Double getWynPortfAgenta() {
        return wynPortfAgenta;
    }

    public void setWynPortfAgenta(Double wynPortfAgenta) {
        this.wynPortfAgenta = wynPortfAgenta;
    }

    public Double getWynPortfSubAgenta() {
        return wynPortfSubAgenta;
    }

    public void setWynPortfSubAgenta(Double wynPortfSubAgenta) {
        this.wynPortfSubAgenta = wynPortfSubAgenta;
    }

    public String getNazwaLiniiCelowanej() {
        return nazwaLiniiCelowanej;
    }

    public void setNazwaLiniiCelowanej(String nazwaLiniiCelowanej) {
        this.nazwaLiniiCelowanej = nazwaLiniiCelowanej;
    }

    public Double getCelLinii() {
        return celLinii;
    }

    public void setCelLinii(Double celLinii) {
        this.celLinii = celLinii;
    }

    public Double getMinLinii() {
        return minLinii;
    }

    public void setMinLinii(Double minLinii) {
        this.minLinii = minLinii;
    }

    public Double getRealLinii() {
        return realLinii;
    }

    public void setRealLinii(Double realLinii) {
        this.realLinii = realLinii;
    }

    public Double getMaxBonus() {
        return maxBonus;
    }

    public void setMaxBonus(Double maxBonus) {
        this.maxBonus = maxBonus;
    }

    public Double getPrcRealLiniiCel() {
        return prcRealLiniiCel;
    }

    public void setPrcRealLiniiCel(Double prcRealLiniiCel) {
        this.prcRealLiniiCel = prcRealLiniiCel;
    }

    public Double getyCzastkowe() {
        return yCzastkowe;
    }

    public void setyCzastkowe(Double yCzastkowe) {
        this.yCzastkowe = yCzastkowe;
    }

    public String getNazwaFirmy() {
        return nazwaFirmy;
    }

    public void setNazwaFirmy(String nazwaFirmy) {
        this.nazwaFirmy = nazwaFirmy;
    }

    public Integer getIloscLoczy() {
        return iloscLoczy;
    }

    public void setIloscLoczy(Integer iloscLoczy) {
        this.iloscLoczy = iloscLoczy;
    }

    public Long getNrZamowienia() {
        return nrZamowienia;
    }

    public void setNrZamowienia(Long nrZamowienia) {
        this.nrZamowienia = nrZamowienia;
    }

    public String getOperKod() {
        return operKod;
    }

    public void setOperKod(String operKod) {
        this.operKod = operKod;
    }

    public Double getAbonamentLg() {
        return abonamentLg;
    }

    public void setAbonamentLg(Double abonamentLg) {
        this.abonamentLg = abonamentLg;
    }

    public Double getSrRata() {
        return srRata;
    }

    public void setSrRata(Double srRata) {
        this.srRata = srRata;
    }

    public Double getSumRat() {
        return sumRat;
    }

    public void setSumRat(Double sumRat) {
        this.sumRat = sumRat;
    }

    public String getCzyRata() {
        return czyRata;
    }

    public void setCzyRata(String czyRata) {
        this.czyRata = czyRata;
    }

    public String getPriorytet() {
        return priorytet;
    }

    public void setPriorytet(String priorytet) {
        this.priorytet = priorytet;
    }

    public Double getWartKredytu() {
        return wartKredytu;
    }

    public void setWartKredytu(Double wartKredytu) {
        this.wartKredytu = wartKredytu;
    }

    public String getIdCrm() {
        return idCrm;
    }

    public void setIdCrm(String idCrm) {
        this.idCrm = idCrm;
    }

    public String getIdSerwus() {
        return idSerwus;
    }

    public void setIdSerwus(String idSerwus) {
        this.idSerwus = idSerwus;
    }

    public String getIdSezam() {
        return idSezam;
    }

    public void setIdSezam(String idSezam) {
        this.idSezam = idSezam;
    }

    public String getIdSokx() {
        return idSokx;
    }

    public void setIdSokx(String idSokx) {
        this.idSokx = idSokx;
    }

    public String getActMsisdn() {
        return actMsisdn;
    }

    public void setActMsisdn(String actMsisdn) {
        this.actMsisdn = actMsisdn;
    }

    public String getIdEasy() {
        return idEasy;
    }

    public void setIdEasy(String idEasy) {
        this.idEasy = idEasy;
    }

    public String getRodzajKorPremiiPodst() {
        return rodzajKorPremiiPodst;
    }

    public void setRodzajKorPremiiPodst(String rodzajKorPremiiPodst) {
        this.rodzajKorPremiiPodst = rodzajKorPremiiPodst;
    }

    public String getKorekty() {
        return korekty;
    }

    public void setKorekty(String korekty) {
        this.korekty = korekty;
    }
}
