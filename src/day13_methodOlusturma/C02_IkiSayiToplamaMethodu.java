package day13_methodOlusturma;

import java.util.Scanner;

public class C02_IkiSayiToplamaMethodu {

    public static void main(String[] args) {

        // kullanicidan 2 sayi alip
        // toplamlarini yazdiran bir method olusturun
        // void =====> sadece yazdiran


        ikiSayiTopla();      // method kol.methodun adini yazmak
        ikiSayiTopla();      // method cagrilmazsa calismaz

    }

    public static void ikiSayiTopla(){
        Scanner scan=new Scanner(System.in);
        System.out.println("Toplamak üzere 2 sayi giriniz");
        double sayi1= scan.nextDouble();
        double sayi2=scan.nextDouble();
        System.out.println("İki sayinin toplami: " + (sayi1+sayi2));


    }





}