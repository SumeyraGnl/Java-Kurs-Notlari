package day15_doWhileLoop_scope;

public class C03_DoWhileLoop {
    public static void main(String[] args) {

        /*
            While loop' da bitis sarti kontrolu her zaman bady' den bir fazla calisir
            whilw loop 'da kullanicidan alacagimiz degerlere once bizim deger atamamiz gerekir
            bu da bazen hatalara sebep olabilir

         */
              // en az 1kere calissin diyorsak do while loop kullaniriz. do ' da kontrol sonda yapildigi icin
              // while loop da bady hic devreye girmeyebilir





        int sayi = 3;
        int toplam = 0;

        while (sayi > 0) {

            toplam += sayi * sayi;
            sayi--;

        }
        System.out.println("while toplam: " + toplam);

        sayi = 3;
        toplam = 0;

        do {
            toplam += sayi * sayi;
            sayi--;

        } while (sayi > 0);
        System.out.println("do while toplam: " + toplam);

    }

}
