package day16_scope_arrays;

import java.util.Arrays;

public class C03_ArrayElementleriniYazdirma {
    public static void main(String[] args) {

        int[] arr= {3,5,6,7,8,1,2};

        // Tum array'i yazdirin

        System.out.println(Arrays.toString(arr));  // [3, 5, 6, 7, 8, 1, 2]

        System.out.println(arr[3]);   // 7

        // Array'in tüm elementlerini yanyana aralarinde bir bosluk olacak sekilde yazdirin.

        for (int i = 0; i < arr.length; i++) {

            System.out.print(arr[i]+ " ");  // 3 5 6 7 8 1 2

        }



        }




    }

