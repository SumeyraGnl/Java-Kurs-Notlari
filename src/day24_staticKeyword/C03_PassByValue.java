package day24_staticKeyword;

import java.util.Arrays;

public class C03_PassByValue {

    // method' a gonderdigimiz; list , array gibi bir obje ise;
    // eger method'da  new  diye yeni bir deger atamasi yoksa,
    // sadece elementler degisiyorsa o zaman bizim main methoddaki elementlerde degismis olur.

    // eger method'da new keyword ile objemize yeni deger atanmissa,
    // o zaman yeni method ile atanmis deger methodda kalir,
    // bizim main method'daki hem list'imiz array'imiz hemde icindeki elementler degismez.


    public static void main(String[] args) {

        int[] arr = {3,4,5};

        elementleriArtir(arr,4);  // method'da array : [7, 8, 9]

        System.out.println("Method call'dan sonra : " +Arrays.toString(arr));  // Method call'dan sonra : [7, 8, 9]

    }

    public static void elementleriArtir(int[] arr, int artisMiktari){

        for (int i = 0; i < arr.length; i++) {

            arr[i] += artisMiktari;

        }

        System.out.println("method'da array : " + Arrays.toString(arr));


    }


}
