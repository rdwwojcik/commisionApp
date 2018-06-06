package commision.core.entities.pma;

import javax.persistence.Entity;
import javax.persistence.Table;
import java.util.Date;

/**
 * Created by radoslaw.wojcik on 2017-08-17.
 */
@Entity
@Table(name = "pma_active")
public class PmaActive extends Pma {

    private String  typHandl;
    private String  lider;
    private Date    dataZam;
    private Double  abonamentBrutto;
    private Double  liczbaAbonam;
    private String  sprzedazRatalna;
    private Double  sumaRat;
    private Integer bonusZaRaty;
    private Double  prowPodstRh;
    private String  koszykCel;
    private Double  planIlosciowy;
    private Double  wagaKoszyka;
    private Double  realPlanu;
    private Double  prcRealPlanu;
    private Double  wspPremiiSprzed;
    private Double  wykWazoneRh;
    private Double  premiaSprzedRh;
    private Integer wolumenSprzedRh;
    private Double  wspWolumenowyRh;
    private Double  premiaWolumenowaRh;
    private String  idPortfKl;
    private String  idPortfSprzedawcy;
    private String  typPortf;
    private Double  wielkoscPortf;
    private Integer wielkoscZespolu;
    private Double  stawkaPortf;
    private Double  srWazonaRealKpi;
    private Double  premiaPortfRh;
    private Double  wspNadprowPart;
    private Double  premiaPodstPart;
    private Double  planIlPart;
    private Double  realPlanuPart;
    private Double  prcRealPlanuPart;
    private Double  wspPremiiSprzedPart;
    private Double  premiaSprzedPart;
    private Double  wspWynPortfPart;
    private Double  premiaPortfPart;
    private Double  planIlLid;
    private Double  realPlanuLid;
    private Double  prcRealPlanuLid;
    private Double  wspPremiiSprzedLid;
    private Double  premiaSprzedLid;
    private Double  wspNadprowLid;
    private Double  premiaPodstLid;
    private Double  premiaTotal;
    private Integer ilosc;
    private Double  cenaHurtTerm;
    private String  login;
    private String  powodNal;
    private Integer idDystryktu;
    private String  dystrykt;
    private Double  vat;
    private String  miasto;
    private String  ulica;
    private String  budynek;
    private Long    idLokalizacji;
    private Long    idLokaluKlienta;
    private Long    globalId;
    private String  promocja;

    public String getTypHandl() {
        return typHandl;
    }

    public void setTypHandl(String typHandl) {
        this.typHandl = typHandl;
    }

    public String getLider() {
        return lider;
    }

    public void setLider(String lider) {
        this.lider = lider;
    }

    public Date getDataZam() {
        return dataZam;
    }

    public void setDataZam(Date dataZam) {
        this.dataZam = dataZam;
    }

    public Double getAbonamentBrutto() {
        return abonamentBrutto;
    }

    public void setAbonamentBrutto(Double abonamentBrutto) {
        this.abonamentBrutto = abonamentBrutto;
    }

    public Double getLiczbaAbonam() {
        return liczbaAbonam;
    }

    public void setLiczbaAbonam(Double liczbaAbonam) {
        this.liczbaAbonam = liczbaAbonam;
    }

    public String getSprzedazRatalna() {
        return sprzedazRatalna;
    }

    public void setSprzedazRatalna(String sprzedazRatalna) {
        this.sprzedazRatalna = sprzedazRatalna;
    }

    public Double getSumaRat() {
        return sumaRat;
    }

    public void setSumaRat(Double sumaRat) {
        this.sumaRat = sumaRat;
    }

    public Integer getBonusZaRaty() {
        return bonusZaRaty;
    }

    public void setBonusZaRaty(Integer bonusZaRaty) {
        this.bonusZaRaty = bonusZaRaty;
    }

    public Double getProwPodstRh() {
        return prowPodstRh;
    }

    public void setProwPodstRh(Double prowPodstRh) {
        this.prowPodstRh = prowPodstRh;
    }

    public String getKoszykCel() {
        return koszykCel;
    }

    public void setKoszykCel(String koszykCel) {
        this.koszykCel = koszykCel;
    }

    public Double getPlanIlosciowy() {
        return planIlosciowy;
    }

    public void setPlanIlosciowy(Double planIlosciowy) {
        this.planIlosciowy = planIlosciowy;
    }

    public Double getWagaKoszyka() {
        return wagaKoszyka;
    }

    public void setWagaKoszyka(Double wagaKoszyka) {
        this.wagaKoszyka = wagaKoszyka;
    }

    public Double getRealPlanu() {
        return realPlanu;
    }

    public void setRealPlanu(Double realPlanu) {
        this.realPlanu = realPlanu;
    }

    public Double getPrcRealPlanu() {
        return prcRealPlanu;
    }

    public void setPrcRealPlanu(Double prcRealPlanu) {
        this.prcRealPlanu = prcRealPlanu;
    }

    public Double getWspPremiiSprzed() {
        return wspPremiiSprzed;
    }

    public void setWspPremiiSprzed(Double wspPremiiSprzed) {
        this.wspPremiiSprzed = wspPremiiSprzed;
    }

    public Double getWykWazoneRh() {
        return wykWazoneRh;
    }

    public void setWykWazoneRh(Double wykWazoneRh) {
        this.wykWazoneRh = wykWazoneRh;
    }

    public Double getPremiaSprzedRh() {
        return premiaSprzedRh;
    }

    public void setPremiaSprzedRh(Double premiaSprzedRh) {
        this.premiaSprzedRh = premiaSprzedRh;
    }

    public Integer getWolumenSprzedRh() {
        return wolumenSprzedRh;
    }

    public void setWolumenSprzedRh(Integer wolumenSprzedRh) {
        this.wolumenSprzedRh = wolumenSprzedRh;
    }

    public Double getWspWolumenowyRh() {
        return wspWolumenowyRh;
    }

    public void setWspWolumenowyRh(Double wspWolumenowyRh) {
        this.wspWolumenowyRh = wspWolumenowyRh;
    }

    public Double getPremiaWolumenowaRh() {
        return premiaWolumenowaRh;
    }

    public void setPremiaWolumenowaRh(Double premiaWolumenowaRh) {
        this.premiaWolumenowaRh = premiaWolumenowaRh;
    }

    public String getIdPortfKl() {
        return idPortfKl;
    }

    public void setIdPortfKl(String idPortfKl) {
        this.idPortfKl = idPortfKl;
    }

    public String getIdPortfSprzedawcy() {
        return idPortfSprzedawcy;
    }

    public void setIdPortfSprzedawcy(String idPortfSprzedawcy) {
        this.idPortfSprzedawcy = idPortfSprzedawcy;
    }

    public String getTypPortf() {
        return typPortf;
    }

    public void setTypPortf(String typPortf) {
        this.typPortf = typPortf;
    }

    public Double getWielkoscPortf() {
        return wielkoscPortf;
    }

    public void setWielkoscPortf(Double wielkoscPortf) {
        this.wielkoscPortf = wielkoscPortf;
    }

    public Integer getWielkoscZespolu() {
        return wielkoscZespolu;
    }

    public void setWielkoscZespolu(Integer wielkoscZespolu) {
        this.wielkoscZespolu = wielkoscZespolu;
    }

    public Double getStawkaPortf() {
        return stawkaPortf;
    }

    public void setStawkaPortf(Double stawkaPortf) {
        this.stawkaPortf = stawkaPortf;
    }

    public Double getSrWazonaRealKpi() {
        return srWazonaRealKpi;
    }

    public void setSrWazonaRealKpi(Double srWazonaRealKpi) {
        this.srWazonaRealKpi = srWazonaRealKpi;
    }

    public Double getPremiaPortfRh() {
        return premiaPortfRh;
    }

    public void setPremiaPortfRh(Double premiaPortfRh) {
        this.premiaPortfRh = premiaPortfRh;
    }

    public Double getWspNadprowPart() {
        return wspNadprowPart;
    }

    public void setWspNadprowPart(Double wspNadprowPart) {
        this.wspNadprowPart = wspNadprowPart;
    }

    public Double getPremiaPodstPart() {
        return premiaPodstPart;
    }

    public void setPremiaPodstPart(Double premiaPodstPart) {
        this.premiaPodstPart = premiaPodstPart;
    }

    public Double getPlanIlPart() {
        return planIlPart;
    }

    public void setPlanIlPart(Double planIlPart) {
        this.planIlPart = planIlPart;
    }

    public Double getRealPlanuPart() {
        return realPlanuPart;
    }

    public void setRealPlanuPart(Double realPlanuPart) {
        this.realPlanuPart = realPlanuPart;
    }

    public Double getPrcRealPlanuPart() {
        return prcRealPlanuPart;
    }

    public void setPrcRealPlanuPart(Double prcRealPlanuPart) {
        this.prcRealPlanuPart = prcRealPlanuPart;
    }

    public Double getWspPremiiSprzedPart() {
        return wspPremiiSprzedPart;
    }

    public void setWspPremiiSprzedPart(Double wspPremiiSprzedPart) {
        this.wspPremiiSprzedPart = wspPremiiSprzedPart;
    }

    public Double getPremiaSprzedPart() {
        return premiaSprzedPart;
    }

    public void setPremiaSprzedPart(Double premiaSprzedPart) {
        this.premiaSprzedPart = premiaSprzedPart;
    }

    public Double getWspWynPortfPart() {
        return wspWynPortfPart;
    }

    public void setWspWynPortfPart(Double wspWynPortfPart) {
        this.wspWynPortfPart = wspWynPortfPart;
    }

    public Double getPremiaPortfPart() {
        return premiaPortfPart;
    }

    public void setPremiaPortfPart(Double premiaPortfPart) {
        this.premiaPortfPart = premiaPortfPart;
    }

    public Double getPlanIlLid() {
        return planIlLid;
    }

    public void setPlanIlLid(Double planIlLid) {
        this.planIlLid = planIlLid;
    }

    public Double getRealPlanuLid() {
        return realPlanuLid;
    }

    public void setRealPlanuLid(Double realPlanuLid) {
        this.realPlanuLid = realPlanuLid;
    }

    public Double getPrcRealPlanuLid() {
        return prcRealPlanuLid;
    }

    public void setPrcRealPlanuLid(Double prcRealPlanuLid) {
        this.prcRealPlanuLid = prcRealPlanuLid;
    }

    public Double getWspPremiiSprzedLid() {
        return wspPremiiSprzedLid;
    }

    public void setWspPremiiSprzedLid(Double wspPremiiSprzedLid) {
        this.wspPremiiSprzedLid = wspPremiiSprzedLid;
    }

    public Double getPremiaSprzedLid() {
        return premiaSprzedLid;
    }

    public void setPremiaSprzedLid(Double premiaSprzedLid) {
        this.premiaSprzedLid = premiaSprzedLid;
    }

    public Double getWspNadprowLid() {
        return wspNadprowLid;
    }

    public void setWspNadprowLid(Double wspNadprowLid) {
        this.wspNadprowLid = wspNadprowLid;
    }

    public Double getPremiaPodstLid() {
        return premiaPodstLid;
    }

    public void setPremiaPodstLid(Double premiaPodstLid) {
        this.premiaPodstLid = premiaPodstLid;
    }

    public Double getPremiaTotal() {
        return premiaTotal;
    }

    public void setPremiaTotal(Double premiaTotal) {
        this.premiaTotal = premiaTotal;
    }

    public Integer getIlosc() {
        return ilosc;
    }

    public void setIlosc(Integer ilosc) {
        this.ilosc = ilosc;
    }

    public Double getCenaHurtTerm() {
        return cenaHurtTerm;
    }

    public void setCenaHurtTerm(Double cenaHurtTerm) {
        this.cenaHurtTerm = cenaHurtTerm;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPowodNal() {
        return powodNal;
    }

    public void setPowodNal(String powodNal) {
        this.powodNal = powodNal;
    }

    public Integer getIdDystryktu() {
        return idDystryktu;
    }

    public void setIdDystryktu(Integer idDystryktu) {
        this.idDystryktu = idDystryktu;
    }

    public String getDystrykt() {
        return dystrykt;
    }

    public void setDystrykt(String dystrykt) {
        this.dystrykt = dystrykt;
    }

    public Double getVat() {
        return vat;
    }

    public void setVat(Double vat) {
        this.vat = vat;
    }

    public String getMiasto() {
        return miasto;
    }

    public void setMiasto(String miasto) {
        this.miasto = miasto;
    }

    public String getUlica() {
        return ulica;
    }

    public void setUlica(String ulica) {
        this.ulica = ulica;
    }

    public String getBudynek() {
        return budynek;
    }

    public void setBudynek(String budynek) {
        this.budynek = budynek;
    }

    public Long getIdLokalizacji() {
        return idLokalizacji;
    }

    public void setIdLokalizacji(Long idLokalizacji) {
        this.idLokalizacji = idLokalizacji;
    }

    public Long getGlobalId() {
        return globalId;
    }

    public void setGlobalId(Long globalId) {
        this.globalId = globalId;
    }

    public String getPromocja() {
        return promocja;
    }

    public void setPromocja(String promocja) {
        this.promocja = promocja;
    }

    public Long getIdLokaluKlienta() {
        return idLokaluKlienta;
    }

    public void setIdLokaluKlienta(Long idLokaluKlienta) {
        this.idLokaluKlienta = idLokaluKlienta;
    }

}
