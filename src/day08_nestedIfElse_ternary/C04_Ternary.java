package day08_nestedIfElse_ternary;

import java.util.Scanner;

public class C04_Ternary {
    public static void main(String[] args) {

          //Kullanicidan pozitif bir tamsayi alin
          //sayi cift ise "sayi cift"
          //degilse "tek sayi" yazdirin

        Scanner scan=new Scanner(System.in);
        System.out.println("Pozitif bir tamsayi giriniz");
        int sayi= scan.nextInt();

        // if else ile yazdırsaydık

        if (sayi%2==0){
            System.out.println("sayi cift");
        }else{
            System.out.println("tek sayi");
        }

            //Ternary ile yazdırırsak

        System.out.println(sayi%2==0 ? "sayi cift" : "tek sayi");
    }
}
