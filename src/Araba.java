public class Araba {
    private String kasaTipi;
    private String model;
    private int kullanimKm;
    private int fiyat;
    private int kapi;

    public String getKasaTipi() {
        return kasaTipi;
    }

    public String getModel() {
        return model;
    }

    public int getKullanimKm() {
        return kullanimKm;
    }

    public int getFiyat() {
        return fiyat;
    }

    public int getKapi() {
        return kapi;
    }

    public void setKasaTipi(String kasaTipi) {
        this.kasaTipi = kasaTipi;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setKullanimKm(int kullanimKm) {
        this.kullanimKm = kullanimKm;
    }

    public void setFiyat(int fiyat) {
        this.fiyat = fiyat;
    }

    public void setKapi(int kapi) {
        this.kapi = kapi;
    }

    public Araba(String kasaTipi, String model, int kullanimKm, int fiyat, int kapi) {
        this.kasaTipi = kasaTipi;
        this.model = model;
        this.kullanimKm = kullanimKm;
        this.fiyat = fiyat;
        this.kapi = kapi;
    }
    public void arabayiSur(int surulenKm){
        this.kullanimKm += surulenKm;
        System.out.println("Arabanın yeni kilometresi: "+ this.kullanimKm);
    }
    public int satisFiyati(int yeniSatisFiyati){
        return this.fiyat = yeniSatisFiyati;
    }
}
