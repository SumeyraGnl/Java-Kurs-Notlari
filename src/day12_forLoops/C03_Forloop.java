package day12_forLoops;

import java.util.Scanner;

public class C03_Forloop {
    public static void main(String[] args) {

        //Soru 4- Kullanicidan baslangic ve bitis degeri olarak pozitif sayilar alin
        // sinirlar dahil olarak aralarindaki tum sayilarin toplamini yazdirin.
        // Bitis degeri baslangic degerinden kucuk olsa da program calissin

        Scanner scan=new Scanner(System.in);

        System.out.print("Baslangic sayısı: ");
        int bas=scan.nextInt();
        System.out.print("Bitis sayisi: ");
        int bit= scan.nextInt();

        int sayilartoplami=0;

          if (bas<bit) {
              for (int i = bas; i <= bit; i++) {
                  sayilartoplami += i;
              }

          }else{
            for (int i = bas; i >=bit ; i--) {
                sayilartoplami += i;

            }
        }
        System.out.println("sayilar toplami: " +sayilartoplami);












    }
}
