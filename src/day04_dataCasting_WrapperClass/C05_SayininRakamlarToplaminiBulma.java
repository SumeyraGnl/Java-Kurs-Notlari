package day04_dataCasting_WrapperClass;

import java.util.Scanner;

public class C05_SayininRakamlarToplaminiBulma {
    public static void main(String[] args) {

        // Kullanicidan 3 basamakli bir sayi alin
        // ve sayinin rakamlar toplamini yazdirin

        Scanner scan=new Scanner(System.in);

        System.out.println("Lutfen 3 basamakli poazitif bir tamsayi giriniz");

        int girilenSayi= scan.nextInt();

        int rakam= girilenSayi % 10 ;

        int rakamlarToplami= rakam;

        girilenSayi= girilenSayi/10;

        rakam= girilenSayi %10;

        rakamlarToplami= rakamlarToplami+rakam;

        girilenSayi= girilenSayi/10;

        rakam= girilenSayi %10;

        rakamlarToplami= rakamlarToplami+rakam;

        System.out.println("Girilen Sayinin Rakamlar Toplami: " +rakamlarToplami);


}
}
