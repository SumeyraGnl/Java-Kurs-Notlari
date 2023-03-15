package day07_genelTekrar_IfElseStatements;

import java.util.Scanner;

public class C04_IfElseIf {
    public static void main(String[] args) {

              //Kullanicidan cinsiyetini ve yasini alin, Kadin, 60 yas ve uzeri , Erkek 65
              //yas ve uzeri emekli olabilir. Cinsiyet ve yasini dikkate alarak “Emekli
              //olabilirsin” veya “Emekli olmak icin .. Yil daha calisman gerekir” yazdirin.

        Scanner scan=new Scanner(System.in);

        System.out.println("Lutfen cinsiyetinizi giriniz.Cinsiyetinizi K yada E ile belirtiniz");

        char cns=scan.next().charAt(0);

        System.out.println("Lutfen yasinizi giriniz");

        int yas=scan.nextInt();

        if (cns=='K' && yas>=60  || cns=='E' && yas>=65){
            System.out.println("Emekli olabilirsin");
        }else if (cns=='K' && yas<60){
            System.out.println("Emekli olmak icin" +(60-yas) + "yil daha calisman gerekir");
        }else if (cns=='E' && yas<65){
            System.out.println("Emekli olmak icin" +(65-yas) + "yil daha calisman gerekir");
        }

        // yas<60 ve yas<65 yazmayabiliriz. çünkü yukarıda yası belirttik yas>=60 ve yas>=65 diye
        }
}
