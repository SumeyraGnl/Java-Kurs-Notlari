package day03_scanner_dataCasting;

import java.util.Scanner;

public class C02_scanner {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Lutfen isminizi,soyisminizi ve yasinizi giriniz"+
                            "\nHer bilgiden sonra ENTER'a basiniz");

        char isimIlkHarf= scan.nextLine().charAt(0);

        String soyisim= scan.nextLine();

        double yas= scan.nextDouble();

        System.out.println("girilen bilgiler : "+ isimIlkHarf +' ' + soyisim+ ", "+yas);





    }
}
