
public class Main {
    public static void main(String[] args) {

        Sedan sedanCoupe = new Sedan("BMW 4.30 GrandCoupe" , 22000 , 1750000 , 5);
        System.out.println("Aracın Modeli: " + sedanCoupe.getModel() + "\n" + "Kullanim Kilometresi: " + sedanCoupe.getKullanimKm() + "\n" + "Aracin Degeri: " + sedanCoupe.getFiyat() + "\n" + "Aracin Kapi Sayisi: " + sedanCoupe.getKapi());
        System.out.println("--------------------------------------");
        sedanCoupe.arabayiSur(10000);
        sedanCoupe.satisFiyati(1680000);
        System.out.println("--------------------------------------");
        System.out.println("Aracın Modeli: " + sedanCoupe.getModel() + "\n" + "Kullanim Kilometresi: " + sedanCoupe.getKullanimKm() + "\n" + "Aracin Degeri: " + sedanCoupe.getFiyat() + "\n" + "Aracin Kapi Sayisi: " + sedanCoupe.getKapi());

        System.out.println("--------------------------------------");

        Hatchbackc Hatchbackyeni = new Hatchbackc("Volkswagen Scirocco" , 58000 , 1340000 , 3);
        System.out.println("Aracın Modeli: " + Hatchbackyeni.getModel() + "\n" + "Kullanim Kilometresi: " + Hatchbackyeni.getKullanimKm() + "\n" + "Aracin Degeri: " + Hatchbackyeni.getFiyat() + "\n" + "Aracin Kapi Sayisi: " + Hatchbackyeni.getKapi());
        System.out.println("--------------------------------------");
        Hatchbackyeni.arabayiSur(20000);
        Hatchbackyeni.satisFiyati(1270000);
        System.out.println("Aracın Modeli: " + Hatchbackyeni.getModel() + "\n" + "Kullanim Kilometresi: " + Hatchbackyeni.getKullanimKm() + "\n" + "Aracin Degeri: " + Hatchbackyeni.getFiyat() + "\n" + "Aracin Kapi Sayisi: " + Hatchbackyeni.getKapi());
    }
    }