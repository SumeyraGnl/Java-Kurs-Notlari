package day18_multiDimensionalArrays;

import java.util.Arrays;

public class C02_StringSplitMethodu {
    public static void main(String[] args) {

        // Bir String'i istedigimiz parcalara ayirmak icin String Split Methodu kullanilir

        String str= "Java candir can, bundan suphesi olan var mi?";

        // str kac kelimedir?

        String[] kelimeler= str.split(" ");
        System.out.println(Arrays.toString(kelimeler));  // [Java, candir, can,, bundan, suphesi, olan, var, mi?]

        String[] kelime1=str.split("a");
        System.out.println(Arrays.toString(kelime1)); //[J, v,  c, ndir c, n, bund, n suphesi ol, n v, r mi?]==>a'yi sildi,a'dan ayirdi

        System.out.println("Kelime sayisi: " + kelimeler.length);  // Kelime sayisi: 8
        

        // en uzun kelime kac harflidir?

        int enUzunKelimeLength=kelimeler[0].length();

        for (int i = 0; i < kelimeler.length; i++) {
            if (kelimeler[i].length()>enUzunKelimeLength){
                enUzunKelimeLength= kelimeler[i].length();
            }

        }
        System.out.println("En uzun kelimenin karakter sayisi: " + enUzunKelimeLength);  // En uzun kelimenin karakter sayisi: 7

        // bir string'i karakterlerine ayirmak istersek
        String[] karakterler=str.split("");
        System.out.println(Arrays.toString(karakterler)); // [J, a, v, a,  , c, a, n, d, i, r,  , c, a, n, ,,  , b,.....
        System.out.println("Cumledeki karakter sayisi: "+karakterler.length);  // 44





    }
}
