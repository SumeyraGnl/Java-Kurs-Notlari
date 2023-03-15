package day17_arrays;

import java.util.Arrays;

public class C04_SagaKaydirma {
    public static void main(String[] args) {

        // Verilen int bir array'deki tum elementleri bir saga kaydirip
        // sondaki elementi de en basa alip kaydedin
        // orn: [3,4,5,6]  ====> son hali : [6,3,4,5]

        int[] arr={3,4,5,6,7,8};
        int temp=arr[arr.length-1];

        for (int i = 0; i < arr.length-1; i++) {

               // arr[3]=arr[2];
               // arr[2]=arr[1];
               // arr[1]=arr[0];
               // arr[0]=temp;   aslında bu sekildede yapılabilirdi.otomatiklestirmek icin dinamik olmasi icin;

            arr[arr.length-1-i] = arr[arr.length-2-i];

        }
        arr[0]=temp;

        System.out.println(Arrays.toString(arr));

    }
}
