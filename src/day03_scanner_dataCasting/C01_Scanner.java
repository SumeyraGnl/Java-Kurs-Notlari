package day03_scanner_dataCasting;

import java.util.Scanner;

public class C01_Scanner {

    public static void main(String[] args) {

        Scanner scan= new Scanner(System.in);

        System.out.println("Lutfen isminizi giriniz");

        String isim = scan.nextLine();

        System.out.println("Lutfen soyisminizi giriniz");

        String soyisim = scan.nextLine();

        System.out.println("Lutfen yasinizi giriniz");

        double yas = scan.nextDouble();


        System.out.println("isminiz : " +isim);
        System.out.println("soyisminiz : " +soyisim);
        System.out.println("yasiniz : " +yas);
        System.out.println("Kaydiniz basariyla tamamlanmiştir");
        


    }
}
