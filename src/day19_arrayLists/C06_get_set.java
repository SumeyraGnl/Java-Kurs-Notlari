package day19_arrayLists;

import java.util.ArrayList;
import java.util.List;

public class C06_get_set {
    public static void main(String[] args) {

        List<Integer>sayilar = new ArrayList<>();

       sayilar.add(3);
       sayilar.add(5);
       sayilar.add(2);

       // get: list icinden istedigimiz elementi getirmesi icin kullanırız

        System.out.println(sayilar);  // [3, 5, 2]

        System.out.println(sayilar.get(0));  //  3 =====>  0.index'i getir

        // son elementi yazdirin

        System.out.println(sayilar.get(sayilar.size()-1));  // 2

         // set: degeri update(guncellemek) icin kullanilir

        // 2 elementini 12 yapin

        System.out.println(sayilar.set(2, 12));  // 2  (burada guncelledigi degeri yazdirir)
        System.out.println(sayilar.set(1, 7)); // 5  (5' i guncelledim diyor)
        System.out.println(sayilar);  // [3, 7, 12]


    }
}
