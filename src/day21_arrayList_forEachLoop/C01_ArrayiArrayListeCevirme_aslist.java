package day21_arrayList_forEachLoop;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class C01_ArrayiArrayListeCevirme_aslist {
    public static void main(String[] args) {
        Integer[] arr = {3,5,6,7,3,2,3,5,8,7,1,2,3,4,5,8};

        // arr array'inin elementlerini iceren bir arrayList olusturun

        List<Integer> sayilar= new ArrayList<>();

        for (int i = 0; i < arr.length; i++) {

            sayilar.add(arr[i]);

        }
        System.out.println("Sayilar listesi: " + sayilar);

        /*
             Java'da bir array'i arrayList'e cevirmek icin kullanilan asList() vardir
             ancak kullanimi tavsiye edilmez, cunku 2 tane buyuk dezavantaji vardir

           1- asList() kullanilarak array'den list'e cevrilen listelerde
              ekleme / silme gibi uzunlugu degistiren method'lar kullanilamaz

           2- Arka planda array ve array'den donusturdugumuz list beraber hareket eder
              birinde yaptigimiz update'ler otekine de islenir
         */

        List<Integer> arraydanList= Arrays.asList(arr);
        System.out.println("Arraydan liste cevrilen: " + arraydanList);

        // iki list'e de 11 ekleyelim

        sayilar.add(11);
         // arraydanList.add(11);  // UnsupportedOperationException ==> arraydan liste asList ile cevirince
                                   // ekleme yaptırmıyor
        System.out.println("Sayilar listesi: " + sayilar);
        System.out.println("Arraydan liste cevrilen: " + arraydanList);

        // iki listin 0.index'indeki elementleri silelim

        sayilar.remove(0);
          // arraydanList.remove(0);  // UnsupportedOperationException ==> arraydan liste asList ile cevirince
                                      // silme islemi yaptırmıyor
        System.out.println("Sayilar listesi: " + sayilar);
        System.out.println("Arraydan liste cevrilen: " + arraydanList);

        //  2.dezavantaj

        System.out.println("Array         : " + Arrays.toString(arr));
        System.out.println("Array'dan list: "+ arraydanList);

        // array'in bir elementine yeni deger atayalım

        arr[0]=22;
        System.out.println("=======array'i degistirdikten sonra=========");

        System.out.println("Array         : " + Arrays.toString(arr));
        System.out.println("Array'dan list: "+ arraydanList);

        // list'in bir elementini update edelim

        arraydanList.set(1,45);
        System.out.println("=======list'i degistirdikten sonra=========");

        System.out.println("Array         : " + Arrays.toString(arr));
        System.out.println("Array'dan list: "+ arraydanList);





    }
}
