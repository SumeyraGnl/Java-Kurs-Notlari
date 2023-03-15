package day04_dataCasting_WrapperClass;

import java.util.Scanner;

public class C02_AsciiTable {

    public static void main(String[] args) {

          // Soru 2- Kullanicidan bir harf alin ve alfabede o harften sonraki 3 harfi yazdirin.

        Scanner scan=new Scanner(System.in);

        System.out.println("Bir harf giriniz");

        char girilenHarf=scan.nextLine().charAt(0);

        System.out.println("Girilen Harf: " + girilenHarf+
                           "\nGirilen harften sonraki 3 harf : " +
                             (char)(girilenHarf+1)  + ", " +
                             (char)(girilenHarf+2)  + ", " +
                             (char)(girilenHarf+3)  + ", " );




}
}