package day20_arrayLists;

public class C08_BaskaClassdanKullanma {
    public static void main(String[] args) {
        // verilen sayinin pozitif tam bolenleri sayisi 10'dan cok ise "Guzel"
        // yoksa "Kotu" yazdirin

        int sayi = 3000;

        int pozitifTamBolenlerSayisi= C07_TamBolenlerListesi.pozitifBolenleriListesi(sayi).size();

        if (pozitifTamBolenlerSayisi>10){
            System.out.println("Guzel");
        }else{
            System.out.println("kotu");
        }






    }
}
