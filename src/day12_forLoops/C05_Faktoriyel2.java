package day12_forLoops;

import java.util.Scanner;

public class C05_Faktoriyel2 {
    public static void main(String[] args) {

        //Soru 6- Kullanicidan 20’den kucuk bir sayi alip,
        //        bu sayinin faktoryel degerini hesaplayin.
        //        Konsolda faktoryel hesabinin yapilisini da yazdirin.
        //        Or : 6! = 6 * 5 * 4 * 3 * 2 * 1 = 720

        Scanner scan=new Scanner(System.in);
        System.out.print("Lutfen 20'den kücük bir sayı degeri girin: ");
        int sayi= scan.nextInt();

        int faktoriyel=1;

        System.out.print(sayi+"! = ");
        for (int i = sayi; i >=1 ; i--) {
            faktoriyel *= i;
            if (i != 1) {
                System.out.print(i + " * ");
            }else{
                System.out.print(i + " " );
            }
        }
        System.out.print("= " +faktoriyel);








    }
}
