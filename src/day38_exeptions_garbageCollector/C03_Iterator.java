package day38_exeptions_garbageCollector;

import java.util.Arrays;

public class C03_Iterator {
    public static void main(String[] args) {

        int[] arr = {3,8,1,9,15};

        // tum elementleri yazdirirn
        // for-each ile

        for (int each:arr
             ) {
            System.out.print(each +" "); // 3 8 1 9 15
        }

        System.out.println("");

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");  // 3 8 1 9 15

        }

        // Index kullanmadan tum elementleri 3 artirip kaydedin
        // index istenmedigi icin normal loop kullanamayız
        // for-each loop ile deneyelim

        System.out.println("");

        for (int each:arr
             ) {

            each += 3;

            System.out.print(each +" ");
        }


        System.out.println("");
        System.out.println(Arrays.toString(arr));
    }
}
