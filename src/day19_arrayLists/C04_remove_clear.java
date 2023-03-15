package day19_arrayLists;

import java.util.ArrayList;
import java.util.List;

public class C04_remove_clear {
    public static void main(String[] args) {

        // remove:  istedigimiz elemani siler
        // list atama yapmasakta kalıcı degisikligi saglar

        List<String> harfler = new ArrayList<>();

        harfler.add("A");
        harfler.add("B");
        harfler.add("K");

        System.out.println(harfler);  // [A, B, K]

        System.out.println(harfler.remove("B")); // true....boolean dondordugu icin true verdi
        System.out.println(harfler);  // [A, K]

        System.out.println(harfler.remove(0)); // A....string dondurdugu icin A dondu
        System.out.println(harfler);  // [K]


        List<Integer> sayilar = new ArrayList<>();

        sayilar.add(1);
        sayilar.add(3);
        sayilar.add(18);
        sayilar.add(2);

        System.out.println(sayilar);  // [1, 3, 18, 2]

         /*
            Eger sayilardan olusan bir list varsa
            remove method'una yazacagimiz sayiyi index olarak kabul eder


            Eger sayiyi silmek isterseniz
            remove method'undan once o sayiyi bir objeye(OBJE = NUN PRİMİTİVE(wrapper class)) atayip
            remove method'unda obje ismini yazabiliriz
         */

        sayilar.remove(1);  //  ===> index 1'deki 3'ü siler
        System.out.println(sayilar);  // [1, 18, 2]

        // 1'i silelim

        Integer silinecekSayi= 1;
        sayilar.remove(silinecekSayi);
        System.out.println(sayilar);  // [18, 2]

        // clear; tum elementleri siler

        sayilar.clear();  // ====> tum elementleri siler
        System.out.println(sayilar);  // []

    }
}
