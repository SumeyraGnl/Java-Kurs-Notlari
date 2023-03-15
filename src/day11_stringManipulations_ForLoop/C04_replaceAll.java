package day11_stringManipulations_ForLoop;

public class C04_replaceAll {
    public static void main(String[] args) {
         // regex kullanılır ama char kullanilmaz

        String str="J1a23va34 5C54and65ir87";

        // str' daki sayilari methodla temizleyin.


        /*
        Eger degistirmek istedigimiz metin tek bir metin degil,
        ortak özelligi olan farkli metinler ise
                  - tum sayilar
                  - sayi olmayanlarin tumu
                  - tum space'ler
                  - space olmayan tum karakterler
            bu ortak ozellikleri belirtmek icin Java regex tanimlamistir
            Regex (Regular Expressions)
              \\s : space             \\S : space olmayan hersey
              \\s+ : yanyana birden fazla space
              \\d : digits            \\D : digit olmayan hersey
              \\w : harf,rakam,_    \\W : harf,rakam,_ olmayan hersey

         */
          str=str.replaceAll("\\d", "");
        System.out.println("str' in yeni hali: " +str);  // str' in yeni hali: Java Candir

    }
}
