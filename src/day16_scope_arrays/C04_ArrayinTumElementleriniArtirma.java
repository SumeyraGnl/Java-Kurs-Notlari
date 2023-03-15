package day16_scope_arrays;

import java.util.Arrays;

public class C04_ArrayinTumElementleriniArtirma {
    public static void main(String[] args) {

        int[] fiyatlar={15,25,30,10,50};

        // tüm ürünlere 3 lira fiyat düzenlemesi yapin

        for (int i = 0; i < fiyatlar.length; i++) {

            fiyatlar[i] +=3;

        }
        System.out.println(Arrays.toString(fiyatlar));




    }
}

