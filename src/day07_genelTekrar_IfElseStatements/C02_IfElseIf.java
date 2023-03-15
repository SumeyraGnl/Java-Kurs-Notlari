package day07_genelTekrar_IfElseStatements;

import java.util.Scanner;

public class C02_IfElseIf {
    public static void main(String[] args) {

        //Ogrencinin notu 85 ve ustu ise AA,
        //(85 ve ustu degilse) 65 ve ustu ise BB,
        //(65 ve ustu de degilse) 50 ve ustu ise CC,
        //(geriye kalanlar) DD

        Scanner scan=new Scanner(System.in);

        System.out.println("Lutfen notunuzu giriniz");

        double not= scan.nextDouble();

        if (not<0 || not>100){
            System.out.println("Notunuzu yanlıs girdiniz,lutfen tekrar giriniz");
        }else if (not>=85){
            System.out.println("Notunuz: AA");
        }else if (not>=65){
            System.out.println("Notunuz: BB");
        }else if (not>=50){
            System.out.println("Notunuz: CC");
        }else
            System.out.println("Notunuz: DD");
    }
}
