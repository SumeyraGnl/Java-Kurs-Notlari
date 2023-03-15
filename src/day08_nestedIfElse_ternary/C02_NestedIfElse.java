package day08_nestedIfElse_ternary;

import java.util.Scanner;

public class C02_NestedIfElse {
    public static void main(String[] args) {

        //Kullanicidan cinsiyetini ve yasini alin, Kadin, 60 yas ve uzeri , Erkek 65
        //yas ve uzeri emekli olabilir. Cinsiyet ve yasini dikkate alarak “Emekli
        //olabilirsin” veya “Emekli olmak icin .. Yil daha calisman gerekir” yazdirin.
        //hatalı giriş olursa kullanıcıyı uyarın

                //önce degiskenlerden BİRİNE GÖRE ANA YAPIYI olusturalim
                //Bu soruda cinsiyeti ana degisken yapalim

        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen yasinizi giriniz");
         double yas= scan.nextDouble();
        System.out.println("Lutfen cinsiyetinizi giriniz.Cinsiyetinizi K yada E ile belirtiniz");
        char cns=scan.next().charAt(0);

        if (cns=='k' || cns=='K'){    //kadınlar icin durumları yaz
            if (yas<16 || yas>80){
                System.out.println("Gecersiz yas girisi yaptiniz,lutfen tekrar giris yapiniz");
            } else if (yas<60) {
                System.out.println("Emekli olabilmeniz icin" +(60-yas) +"daha calismalisiniz");
            }else {
                System.out.println("Emekli olabilirsiniz");
            }


        } else if (cns=='e' || cns=='E'){   //erkekler icin durumları yaz
            if (yas<16 || yas>80){
                System.out.println("Gecersiz yas girisi yaptiniz,lutfen tekrar giris yapiniz");
            } else if (yas<65) {
                System.out.println("Emekli olabilmeniz icin" +(65-yas) +"daha calismalisiniz");
            }else{
                System.out.println("Emekli olabilirsiniz");
            }


        }else{
            System.out.println("Yanlis cinsiyet girisi,lutfen yeniden deneyin");
        }


    }
}
