package day12_forLoops;

import java.util.Scanner;

public class C02_Forloop {
    public static void main(String[] args) {

        // Kullanicidan baslangic ve bitis degeri olarak pozitif sayilar alin,
        // sinirlar dahil olarak aralarindaki tum sayilarin toplamini yazdirin.
        // Bitis degeri baslangic degerinden kucukse, uyari yazdirip islemi sonlandirin.

        Scanner scan=new Scanner(System.in);

        System.out.print("Baslangic sayısı: ");
        int bas=scan.nextInt();
        System.out.print("Bitis sayisi: ");
        int bit= scan.nextInt();

        int sayitoplami=0;

            if (bas>bit){
                System.out.println("Baslangic degeri bitis degerinden kücük olmali");
            }else{
                for (int i = bas; i <=bit ; i++) {
                     // sayitoplami=sayitoplami+i; ==> bu ifadenin yerine sayitoplami += 1 daha pratik
                    sayitoplami += i;
                }
            }

        System.out.print("sayılar toplami: " +sayitoplami);



    }
}
