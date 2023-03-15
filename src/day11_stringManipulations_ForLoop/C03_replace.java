package day11_stringManipulations_ForLoop;

public class C03_replace {
    public static void main(String[] args) {

        //replace; Metin icerisindeki karakter ya da bir parcasinin,
        //          istenilen karakter ya da metinle degistirilmesini saglar.

        String str="Java Candir";

        System.out.println(str.replace('J', 'H')); //Hava Candir

        System.out.println(str.replace("a", ""));  //Jv Cndir.  Butun a' lari degistirir.

        System.out.println(str.replace("Java", "X"));  //  X Candir

        System.out.println(str.replace("v", "yayaya")); //Jayayayaa Candir

        str.replace("va","lala"); // yapilan degisiklik bu satir icindir.
                                                  // yazdirilmadigi icin gormeyiz
                                                  // atama yapilmadigi icin de kalici olmaz

              // str' daki space' leri yok edin
        str=str.replace(" " , "");

        System.out.println(str);  // JavaCandir

               // replaceFirst sadece 1.istenen karakterin yerini degistirir, digerlerini degistirmez

        System.out.println(str.replaceFirst("a", ""));  // JvaCandir ==> sadece 1.a'nın degerini degistirdi
        System.out.println(str.replaceFirst("C", "K"));  //  JavaKandir  ==> ilk C'yi degistirdi

    }
}
