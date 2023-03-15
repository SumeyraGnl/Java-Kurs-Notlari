package day08_nestedIfElse_ternary;

import java.util.Scanner;

public class C05_Ternary {
    public static void main(String[] args) {

           //Kullanicidan bir tamsayi alip mutlak degerine cevirip yazdirin

        Scanner scan=new Scanner(System.in);
        System.out.println("Bir tamsayi giriniz");
        int sayi= scan.nextInt();

           //if else ile yazdirirsak
        if (sayi>=0){
            System.out.println(sayi);
        }else{
            sayi=sayi*(-1);         // yada direk System.out.println(sayi*(-1)); yazdirilabilir
            System.out.println(sayi);
        }

           //Ternary ile yazdirirsak

          // atama yaparsak su sekilde;
        sayi= sayi>=0 ? sayi : sayi*(-1);
        System.out.println(sayi);

           // direk yazdirirsak su sekilde;
        System.out.println(sayi>=0 ? sayi : sayi*(-1));




    }
}
