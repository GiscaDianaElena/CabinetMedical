import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Apartament implements Comparable<Apartament>{
    private int nrApartament;
    private double pret;
    private double dimensiune;
    private string dataInchriereCumparare;
    private string adresa;
    private int nrCamere;
    private int nrBai;
    private boolean areSufragerie;
    private boolean areBucatarie;
    private int nrDormitoare;

    public Apartament(int nrApartament, double pret, double dimensiune, string dataInchriereCumparare, string adresa,
                      int nrCamere, boolean areSufragerie, boolean areBucatarie, int nrBai, int nrDormitoare){
        this.nrApartament = nrApartament;
        this.pret = pret;
        this.dimensiune = dimensiune;
        this.dataInchriereCumparare = dataInchriereCumparare;
        this.adresa = adresa;
        this.nrCamere = nrCamere;
        this.areSufragerie = areSufragerie;
        this.areBucatarie = areBucatarie;
        this.nrBai = nrBai;
        this.nrDormitoare = nrDormitoare;
    }

    public int getNrApartament() {
        return nrApartament;
    }

    public void setNrApartament(int nrApartament) {
        this.nrApartament = nrApartament;
    }

    public double getPret() {
        return pret;
    }

    public void setPret(double pret) {
        this.pret = pret;
    }

    public double getDimensiune() {
        return dimensiune;
    }

    public void setDimensiune(double dimensiune) {
        this.dimensiune = dimensiune;
    }

    public string getDataInchriereCumparare() {
        return dataInchriereCumparare;
    }

    public void setDataInchriereCumparare(string dataInchriereCumparare) {
        this.dataInchriereCumparare = dataInchriereCumparare;
    }

    public string getAdresa() {
        return adresa;
    }

    public void setAdresa(string adresa) {
        this.adresa = adresa;
    }

    public int getNrCamere() {
        return nrCamere;
    }

    public void setNrCamere(int nrCamere) {
        this.nrCamere = nrCamere;
    }

    @Override
    public int compareTo(Apartament o) {
        return Integer.compare(nrCamere, o.nrCamere);
    }

    public boolean isAreSufragerie() {
        return areSufragerie;
    }

    public void setAreSufragerie(boolean areSufragerie) {
        this.areSufragerie = areSufragerie;
    }

    public boolean isAreBucatarie() {
        return areBucatarie;
    }

    public void setAreBucatarie(boolean areBucatarie) {
        this.areBucatarie = areBucatarie;
    }

    public int getNrBai() {
        return nrBai;
    }

    public void setNrBai(int nrBai) {
        this.nrBai = nrBai;
    }

    public int getNrDormitoare() {
        return nrDormitoare;
    }

    public void setNrDormitoare(int nrDormitoare) {
        this.nrDormitoare = nrDormitoare;
    }
}
