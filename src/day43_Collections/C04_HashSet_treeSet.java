package day43_Collections;

import java.util.*;

public class C04_HashSet_treeSet {
    public static void main(String[] args) {
         /*
        bir hashset ve bir treeSet oluşturalım
        bir loop ile içlerine 150000 eleman ekleyelim
        işlem sürelerini kıyaslayalım
         */

        Random rnd = new Random();
        int sayi;
        Set<Integer> hashSet=new HashSet<>();
        Set<Integer> treeSet=new TreeSet<>();




        Long hashStart=System.currentTimeMillis();
        for (int i = 0; i < 150000; i++) {
            sayi= rnd.nextInt(125000);
            hashSet.add(sayi);

        }
        Long hashFinish =System.currentTimeMillis();



        Long treeStart=System.currentTimeMillis();
        for (int i = 0; i < 150000; i++) {
            sayi= rnd.nextInt(125000);
            treeSet.add(sayi);

        }

        Long treeFinish=System.currentTimeMillis();

        System.out.println("Hash Islem Suresi: " + (hashFinish-hashStart));
        System.out.println("Tree Islem Suresi: " + (treeFinish-treeStart));




    }

}
