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

public class Apartament2Camere extends Apartament{
    public Apartament2Camere(int nrApartament, double pret, double dimensiune, string dataInchriereCumparare,
                             string adresa, int nrCamere, boolean areSufragerie, boolean areBucatarie,
                             int nrBai, int nrDormitoare) {
        super(40, 50.000, 70.5, '29.08.2022',
                'str. Splaiul Independentei nr. 45', 2, true, true,
                1, 1);
    }
}

public class Apartament3Camere extends Apartament{
    public Apartament3Camere(int nrApartament, double pret, double dimensiune, string dataInchriereCumparare,
                             string adresa, int nrCamere, boolean areSufragerie, boolean areBucatarie,
                             int nrBai, int nrDormitoare){
        super(25, 1.000, 90.2, '20.02.2023',
                'str. Calea Plevnei, nr. 10', 3, true, true,
                1, 2);
    }
}

public class Duplex extends Apartament{
    public Duplex(int nrApartament, double pret, double dimensiune, string dataInchriereCumparare,
                  string adresa, int nrCamere, boolean areSufragerie, boolean areBucatarie,
                  int nrBai, int nrDormitoare){
        super(9, 120.000, 130, '5.12.2021',
                'Cosmopolis, nr. 45', 4, true, true,
                3, 3);
    }
}

public class OpenSpace extends Apartament{
    public OpenSpace(int nrApartament, double pret, double dimensiune, string dataInchriereCumparare,
                     string adresa, int nrCamere, boolean areSufragerie, boolean areBucatarie,
                     int nrBai, int nrDormitoare){
        super(70, 3.000, 80.4, '15.01.2023',
                'Crangasi, str. Morii, nr. 100', 2, true, true,
                1);
    }
}

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

public class Bucatarie extends Utilitati{
    public Bucatarie(int numarBai, int numarCamere, boolean areBalcon, boolean areAragaz, boolean areMasa,
                     boolean areTacamuri, boolean areScaune,  boolean areCanapea, boolean areTV,
                     boolean aerConditionat, boolean arePat, boolean areDulap, boolean areNoptiere){
        super(numarBai, 1, false, true, true, true, true,
                false, true, false, false, false, false);
    }
}

public class Sufragerie extends Utilitati{
    public Sufragerie(int numarBai, int numarCamere, boolean areBalcon, boolean areAragaz, boolean areMasa,
                      boolean areTacamuri, boolean areScaune, boolean areCanapea, boolean areTV,
                      boolean aerConditionat, boolean arePat, boolean areDulap, boolean areNoptiere){
        super(numarBai, 1, true, false, false, false, true,
                true, true, true, false, false, false);
    }
}

public class Dormitor extends Utilitati{
    public Dormitor(int numarBai, int numarCamere, boolean areBalcon, boolean areAragaz, boolean areMasa,
                    boolean areTacamuri, boolean areScaune, boolean areCanapea, boolean areTV,
                    boolean aerConditionat, boolean arePat, boolean areDulap, boolean areNoptiere){
        super(1, 1, true, false, false, false,
                false, false, true, true, true, true, true);
    }
}

public class firmaImobiliare{
    private List<Apartament> apartamente;

    public firmaImobiliare(){
        this.apartamente = new ArrayList<>();
    }

    public void addApartament(Apartament apartament){
        apartamente.add(apartament);
    }

    public List<Apartament> getApartamente(){
        return apartamente;
    }

    public void sortareDupaNrCamere(){
        Collections.sort(apartamente, new Comparator<Apartament>() {
            @Override
            public int compare(Apartament o1, Apartament o2) {
                return Integer.compare(o1.getNrCamere(), o2.getNrCamere());
            }
        });
    }

    public void afisareUtilitati(){
        System.out.println("Apartamente " + apartamente.getNrApartament() + "utilitati: ");
        System.out.println("Bai: " + apartamente.getNrBai());
        System.out.println("Dormitoare: " + apartamente.getNrDormitoare());
        System.out.println("Balcon: " + (apartamente.areBalcon() ? "Yes" : "No"));
        System.out.println("Sufragerie: " + (apartamente.areSufragerie() ? "Yes" : "No"));
        System.out.println("Bucatarie: " + (apartamente.areBucatarie() ? "Yes" : "No"));
        System.out.println();
    }
}
