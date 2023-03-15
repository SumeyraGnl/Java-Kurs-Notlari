package day06_bagimsizIfCümleleri;

import java.util.Scanner;

public class C05_ifElseStatements {
    public static void main(String[] args) {
        /*
             Eger bir olay icin sadece 2 olasılık varsa
             ve bu olasılıklardan birisi mutlaka calisacaksa
             if / else statements kullanırız

             if / else statement'da if bady'si veya else bady'si mutlaka calişir
             İkisinin birden calisma yada ikisinin birden calismama ihtimali yoktur
             muutlaka bir tanesi calisir
         */


        //Soru 5- Kullanicidan notunu alin 50 veya daha buyukse “Sinifi Gectin”,
        //50’den kucukse “Maalesef kaldin” yazdirin.

        Scanner scan=new Scanner(System.in);

        System.out.println("Lütfen notunuzu giriniz");
         double not= scan.nextDouble();
         if (not>=50 && not<=100){
             System.out.println("Sinifi gectin");
         } else{
             System.out.println("Malesef kaldin");
         }


        // Kullanicidan pozitif bir tamsayi alin
        // sayinin tek veya cift sayi oldugunu yazdirin

        System.out.println("pozitif bir tamsayi giriniz");
         int sayi=scan.nextInt();
         if(sayi%2==0){
             System.out.println("Girilen sayi cift sayidir");
         } else {
             System.out.println("Girilen sayı tek sayıdır");
         }


        // Kullanicidan pozitif bir tamsayi alin
        // 5 ile bolunup bolunmedigini yazdirin

        if (sayi%5==0){
            System.out.println("Girilen sayi 5 ile tam olarak bölünebilir ");
        } else {
            System.out.println("Girilen sayi 5 ile tam olarak bölünemez");
        }


    }
}
