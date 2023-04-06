package day42_Queue;

import java.util.Set;
import java.util.TreeSet;

public class C03_Set {
    public static void main(String[] args) {

        // Set unique bakiyor
        // Set index yapisini desteklemez

        Set<String> ogrenciler = new TreeSet<>();

        ogrenciler.add("Emre");
        ogrenciler.add("Kerem");
        ogrenciler.add("Duygu");
        ogrenciler.add("Burcu");

        System.out.println(ogrenciler);//[Burcu, Duygu, Emre, Kerem]  ==> treeSet dogal sıralamaya gore olusturdu
        ogrenciler.add("Ahmet");
        System.out.println(ogrenciler);//[Ahmet, Burcu, Duygu, Emre, Kerem]
        ogrenciler.add("Kerem"); //==> unique oldugu icin eski Kerem'i sildi yeni Kerem'i ekledi
        System.out.println(ogrenciler);//[Ahmet, Burcu, Duygu, Emre, Kerem]

    }
}
