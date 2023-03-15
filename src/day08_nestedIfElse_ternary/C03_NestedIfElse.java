package day08_nestedIfElse_ternary;

import java.util.Scanner;

public class C03_NestedIfElse {
    public static void main(String[] args) {

        //Kullanicidan cinsiyetini ve yasini alin, Kadin, 60 yas ve uzeri , Erkek 65
        //yas ve uzeri emekli olabilir. Cinsiyet ve yasini dikkate alarak “Emekli
        //olabilirsin” veya “Emekli olmak icin .. Yil daha calisman gerekir” yazdirin.
        //hatalı giriş olursa kullanıcıyı uyarın

        //Bu defa ana degisken yas olsun
        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen yasinizi giriniz");
        double yas = scan.nextDouble();
        System.out.println("Lutfen cinsiyetinizi giriniz.Cinsiyetinizi K yada E ile belirtiniz");
        char cns = scan.next().charAt(0);

        if (yas < 16 || yas > 80) {
            System.out.println("Gecersiz yas girisi yaptiniz,lutfen tekrar giris yapiniz");


        } else if (yas < 60) {  //16-60 yas arası
            if (cns == 'k' || cns == 'K') {
                System.out.println("Emekli olabilmeniz icin" + (60 - yas) + "daha calismalisiniz");
            } else if (cns == 'e' || cns == 'E') {
                System.out.println("Emekli olabilmeniz icin" + (65 - yas) + "daha calismalisiniz");
            } else {
                System.out.println("Gecersiz cinsiyet");
            }

        } else if (yas < 65) {  //60-65 yas arası
            if (cns == 'k' || cns == 'K') {
                System.out.println("Emekli olabilirsiniz");
            } else if (cns == 'e' || cns == 'E') {
                System.out.println("Emekli olabilmeniz icin" + (65 - yas) + "daha calismalisiniz");
            } else {
                System.out.println("Gecersiz cinsiyet");
            }



        } else {   //65-80 yas arası
            if (cns=='k' || cns=='K' || cns=='e' || cns=='E'){
                System.out.println("Emekli olabilirsiniz");
            }else{
                System.out.println("Gecersiz cinsiyet");
            }

        }
    }
}
