public class Utilitati{
    private int numarBai;
    private int numarCamere;
    private boolean areBalcon;
    private boolean areAragaz;
    private boolean areMasa;
    private boolean areTacamuri;
    private boolean areScaune;
    private boolean areCanapea;
    private boolean areTV;
    private boolean aerConditionat;
    private boolean arePat;
    private boolean areDulap;
    private boolean areNoptiere;

    public Utilitati(int numarBai, int numarCamere, boolean areBalcon, boolean areAragaz, boolean areMasa,
                     boolean areTacamuri, boolean areScaune, boolean areCanapea, boolean areTV,
                     boolean aerConditionat, boolean arePat, boolean areDulap, boolean areNoptiere){
        this.numarBai = numarBai;
        this.numarCamere = numarCamere;
        this.areBalcon = areBalcon;
        this.areAragaz = areAragaz;
        this.areMasa = areMasa;
        this.areTacamuri = areTacamuri;
        this.areScaune = areScaune;
        this.areCanapea = areCanapea;
        this.areTV = areTV;
        this.aerConditionat = aerConditionat;
        this.arePat = arePat;
        this.areDulap = areDulap;
        this.areNoptiere = areNoptiere;
    }

    public int getNumarBai() {
        return numarBai;
    }

    public void setNumarBai(int numarBai) {
        this.numarBai = numarBai;
    }

    public int getNumarCamere() {
        return numarCamere;
    }

    public void setNumarCamere(int numarCamere) {
        this.numarCamere = numarCamere;
    }

    public boolean isAreBalcon() {
        return areBalcon;
    }

    public void setAreBalcon(boolean areBalcon) {
        this.areBalcon = areBalcon;
    }

    public boolean isAreAragaz() {
        return areAragaz;
    }

    public void setAreAragaz(boolean areAragaz) {
        this.areAragaz = areAragaz;
    }

    public boolean isAreMasa() {
        return areMasa;
    }

    public void setAreMasa(boolean areMasa) {
        this.areMasa = areMasa;
    }

    public boolean isAreTacamuri() {
        return areTacamuri;
    }

    public void setAreTacamuri(boolean areTacamuri) {
        this.areTacamuri = areTacamuri;
    }

    public boolean isAreScaune() {
        return areScaune;
    }

    public void setAreScaune(boolean areScaune) {
        this.areScaune = areScaune;
    }

    public boolean isAreCanapea() {
        return areCanapea;
    }

    public void setAreCanapea(boolean areCanapea) {
        this.areCanapea = areCanapea;
    }

    public boolean isAreTV() {
        return areTV;
    }

    public void setAreTV(boolean areTV) {
        this.areTV = areTV;
    }

    public boolean isAerConditionat() {
        return aerConditionat;
    }

    public void setAerConditionat(boolean aerConditionat) {
        this.aerConditionat = aerConditionat;
    }

    public boolean isArePat() {
        return arePat;
    }

    public void setArePat(boolean arePat) {
        this.arePat = arePat;
    }

    public boolean isAreDulap() {
        return areDulap;
    }

    public void setAreDulap(boolean areDulap) {
        this.areDulap = areDulap;
    }

    public boolean isAreNoptiere() {
        return areNoptiere;
    }

    public void setAreNoptiere(boolean areNoptiere) {
        this.areNoptiere = areNoptiere;
    }
}
