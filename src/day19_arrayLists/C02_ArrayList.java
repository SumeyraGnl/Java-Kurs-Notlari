package day19_arrayLists;

import day17_arrays.C06_ArrayElemanEklemeMetodu;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class C02_ArrayList {
    public static void main(String[] args) {

         /*
            ArrayList, uzunlugu esnek bir listedir
            Array altyapisini kullanir ancak ekleme ve silme gibi islemlerde daha avantajlidir
            ArrayList'in tek dezavantaji var
            o da elementleri tek tek eklememiz gerekmesi
         */

        int[] arr = {3,4};
        arr = C06_ArrayElemanEklemeMetodu.arrayeElementEkle(arr,5);   // [3, 4, 5]
        arr = C06_ArrayElemanEklemeMetodu.arrayeElementEkle(arr,13);  // [3, 4, 5, 13]


        System.out.println(Arrays.toString(arr));

        List<String> harfler = new ArrayList<>();  // bos bir list olusturur

        System.out.println(harfler);  // []

        harfler.add("s");
        harfler.add("l");
        harfler.add("a");

        System.out.println(harfler);  // [s, l, a]







    }
}
