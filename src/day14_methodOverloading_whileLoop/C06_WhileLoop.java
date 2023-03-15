package day14_methodOverloading_whileLoop;

import java.util.Scanner;

public class C06_WhileLoop {
    public static void main(String[] args) {

        // kullanicidan toplanmak uzere sayilar alin
        // toplam 500 olursa veya 500'u gecerse
        // kac sayi girdigini ve sayilarin toplamini yazdirin

        Scanner scan=new Scanner(System.in);

        int sayi=0;
        int toplam=0;
        int girilenSayiAdedi=0;

        while (toplam<500){  // toplam 500'den kucuk oldugu surece
            System.out.println("Toplamak uzere bir tamsayi giriniz.");

            sayi= scan.nextInt();

            toplam += sayi;

            girilenSayiAdedi++;


        }

        System.out.println("Toplam " +girilenSayiAdedi + " adet sayi girildi ve toplami: " +toplam);




    }
}
