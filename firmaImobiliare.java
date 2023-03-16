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
