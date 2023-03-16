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
