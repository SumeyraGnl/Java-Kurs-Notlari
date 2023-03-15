package day12_forLoops;

import java.util.Scanner;

public class C04_Faktoriyel {
    public static void main(String[] args) {

        //Soru 5- Kullanicidan 20’den kucuk bir sayi alip,
        //        bu sayinin faktoryel degerini hesaplayin.

        Scanner scan=new Scanner(System.in);
        System.out.print("Lutfen 20'den kücük bir sayı degeri girin: ");
        int sayi= scan.nextInt();

        int faktoriyel=1;


        for (int i = sayi; i >=1 ; i--) {
            faktoriyel *= i;
        }
        System.out.println(sayi+ "!=" + faktoriyel);







    }
}
