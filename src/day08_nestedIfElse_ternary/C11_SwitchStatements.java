package day08_nestedIfElse_ternary;

import java.util.Scanner;

public class C11_SwitchStatements {
    public static void main(String[] args) {

        // Kullanicidan bir harf isteyin
        // o harfle baslayan gun ismi varsa yazdirin
        // yoksa "gecersiz harf" yazdirin

        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen bir harf giriniz");
        char harf=scan.next().charAt(0);
         harf=Character.toUpperCase(harf);

         if (harf=='P'){
             System.out.println("Pazartesi , Persembe , Pazar");
         } else if (harf=='S') {
             System.out.println("Sali");
         } else if (harf=='C') {
             System.out.println("Carsamba , Cuma , Cumartesi");
         }else{
             System.out.println("Gecersiz harf");
         }
        System.out.println("===================");
         // daha düzenli ve daha kullanisli olarak switch statement kullanabiliriz
        // switch statements ,onune yazilan degiskene esit olan case i calistirir
        // calısmaya basladiktan sonra break gorene kadar ,sonuna devam eder

        switch (harf) {
            case'P' :
                System.out.println("Pazartesi , Persembe , Pazar");
                break;

            case 'S' :
                System.out.println("Sali");
                break;

            case 'C':
                System.out.println("Carsamba , Cuma , Cumartesi");
                break;

            default:
                System.out.println("Gecersiz harf");

        }





    }
}
