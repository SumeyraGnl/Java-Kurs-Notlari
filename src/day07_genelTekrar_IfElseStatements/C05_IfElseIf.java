package day07_genelTekrar_IfElseStatements;

import java.util.Scanner;

public class C05_IfElseIf {
    public static void main(String[] args) {

        //Kullanicinin kilo(kg) ve boyunu(cm) isteyip vucut kitle endeksini
        //hesaplayin (kilo*10000 / (boy *boy)) vucut kitle endeksi
        // 30’dan buyukse obez,
        // 25-30 arasi ise kilolu,
        // 20-25 arasi ise normal,
        // 20’den kucukse zayif yazdirin.

        Scanner scan=new Scanner(System.in);

        System.out.println("Lutfen kilonuzu kg olarak giriniz: ");
        double kilo= scan.nextDouble();

        System.out.println("Lutfen boyunuzu cm olarak giriniz: ");
        double boy= scan.nextDouble();

        double VucutKitleEndeksi= (kilo*10000) / (boy*boy) ;
        System.out.println("Vucut Kitle Endeksiniz: " +VucutKitleEndeksi);

        if (kilo<=0 || boy<=0 || boy>300 || kilo>500){
            System.out.println("Yanlis giris yaptiniz, tekrar giris yapiniz");
        }else if (VucutKitleEndeksi>30){
            System.out.println("Obez");
        }else if (VucutKitleEndeksi>25){
            System.out.println("Kilolu");
        } else if (VucutKitleEndeksi>20) {
            System.out.println("Normal");           //buradan sonra geriye kalanlar zayıftır dıye else yapıp bırakabilrdik te..
        } else if (VucutKitleEndeksi<20){          //else ile bitmiş olurdu.
            System.out.println("Zayif");
                                                     //else{
                                                     //     System.out.println("Zayıf");
                                                     // }
        }


    }
    }

