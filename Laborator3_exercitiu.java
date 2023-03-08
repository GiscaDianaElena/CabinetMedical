public class Aliment {
    private long dataExp;
    private string ingrediente;
    private double pret;
    private double calorii;
    private string tipAliment;
    public Aliment(long dataExp, string ingrediente, double pret, double calorii) {
        this.dataExp = dataExp;
        this.ingrediente = ingrediente;
        this.pret = pret;
        this.calorii = calorii;
        this.tipAliment = tipAliment;
    }

    public long getDataExp() {
        return dataExp;
    }

    public void setDataExp(long dataExp) {
        this.dataExp = dataExp;
    }

    public string getIngrediente() {
        return ingrediente;
    }

    public void setIngrediente(string ingrediente) {
        this.ingrediente = ingrediente;
    }

    public double getPret() {
        return pret;
    }

    public void setPret(double pret) {
        this.pret = pret;
    }

    public double getCalorii() {
        return calorii;
    }

    public void setCalorii(double calorii) {
        this.calorii = calorii;
    }

    public string getTipAliment() {
        return tipAliment;
    }

    public void setTipAliment(string tipAliment) {
        this.tipAliment = tipAliment;
    }
}

public class Carne extends Aliment {
    public Carne(long dataExp, string ingrediente, double pret, double calorii, string tipAliment) {
        super(dataExp, ingrediente, pret, 1.05, "carne");
    }
}

public class Lapte extends Aliment{
    public Lapte(long dataExp, string ingrediente, double pret, double calorii, string tipAliment){
        super(dataExp, ingrediente, pret, 3.05, "lapte");
    }
}

public class Cereale extends Aliment {
    public Cereale(long dataExp, string ingrediente, dobule pret, double calorii, string tipAliment){
        super(dataExp, ingrediente, pret, 2.56, "cereale");
    }
}

public enum Categorii {
    LACTATE, PAINE, MEZELURI
}

public class Main{

    public static void main(string args){

        Carne pui = new Carne(20.05.2023, "carne, condimente, sare, piper, boia dulce", 4, 300, "carne de pui");
        Lapte Nesquik = new Lapte(1.04.2023, "cacao, zahar", 10, 376, "pudra de cacao instant");
        Cereale musli = new Cereale(20.02.2024, "orez, grau integral, faina de grau", 15, 150, "fulgi de ovaz");

        List<Aliment> aliment = new ArrayList<>();
        aliment.add(pui);
        aliment.add(Nesquik);
        aliment.add(musli);

        alimente.stream().forEach(aliment -> {
            System.out.println("Data Expirarii " + aliment.getdataExp());
            System.out.println("Ingrediente: " + aliment.getIngrediente());
            System.out.printlm("Pret: " + aliment.getPret());
            System.out.println("Calorii: " + aliment.getCalorii());
            System.out.println("Tip Aliment: " + aliment.getTipAliment());
            System.out.println();
        });
    }

    List<Aliment> alimenteSortate = alimente.stream()
            .sorted(Comparator.comparingDouble(Aliment::getCalorii))
            .toList();
}
