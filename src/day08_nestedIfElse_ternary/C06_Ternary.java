package day08_nestedIfElse_ternary;

public class C06_Ternary {
    public static void main(String[] args) {

           // Ternary operatoru ya direk sout icerisinde kullanilir
           // ya da bir degiskene atama yapilacak sekilde yazilir

        int sayi=15;

          //sayi%2==0 ? "sayi cift" : "sayi tek" ;   bu sekilde yazilirsa java hata verir

          // ya bu sekilde;
        System.out.println(sayi%2==0 ? "sayi cift" : "sayi tek");

          //ya da bu sekilde yazilabilir.
         String sonuc=sayi%2==0 ? "sayi cift" : "sayi tek";


          //eger true oldugundaki sonuc ile false oldugundaki sonuc
        // farkli data turlerinde ise sout icinde yazdirilir fakat bir degiskene atama yapilamaz

        //sayi cift ise "sayi cift" yazdirin
        // degilse sayinin 2 katini yazdirin

        System.out.println(sayi%2==0 ? "sayi cift" : sayi*2);

           //String sonuc2= sayi%2==0 ? "sayi cift" : sayi*2 ;

    }
}
