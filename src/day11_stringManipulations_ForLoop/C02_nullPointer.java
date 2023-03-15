package day11_stringManipulations_ForLoop;

public class C02_nullPointer {
    public static void main(String[] args) {

        // null bir deger degildir
        // null bir pointer 'dir
        // yanina yazildigi non-primitive variable' a deger atanmadigini isaret eder

        String str;  // str olusturuldu fakat deger atanmadi

        // Java method icerisinde deger atanmadan variable olusturulmasina izin verir,
        // ama deger atanmadan kullanilmasina izin vermez

              //System.out.println(str);   CTE
              //str.concat("Java");   CTE

        // Bazen programlarda variable'lar olusturulur ama
        // daha sonra deger atanacagi icin deger atamasi yapilmaz
        // deger atamasi yapilmadan listeleme bile CTE verdigi icin
        // deger verilmedigini isaretleyecek, ama CTE olusmasini engelleyecek
        // bir cozum olarak null pointer olusturumustur.

        str=null;  //  str="null" degil
                   // null olarak isaretlenmis , degeri null atanmis degil

        System.out.println(str);  // null
                 //System.out.println(str.concat("Java"));  // Run Time Error----NullPointerException
                 //System.out.println(str.length());  // Run Time Error----NullPointerException
        System.out.println(str+ "Java");  // null+Java
        String str2=str+ "Java";
        System.out.println("str2: " +str2);  // str2: nullJava

           // str=null; hicbir methodla kullanilamaz, sadece yazdirilabilir yada toplama ile islem yapabiliriz

           // sadece nun-primitive ' lerde olur
                // int sayi=null;   => kabul etmez.Primitive variable' lara null olmaz
        Integer sayi=null;

        // biz genelde String bir ifade olusturup, sonra deger atayacaksak
        // hiclik degeri atariz

       String str3="";   //str3 ' e deger atanmistir
                         // atanan deger hiclik 'tir

        System.out.println(str3.concat("Java"));   // Java

          // System.out.println(str.isEmpty());  //  NullPointerException

          // null olarak isaretlenen bir String HIC BIR METHOD'LA  kullanilamaz
          // sadece yazdirilabilir veya + ile kullanilabilir

        System.out.println(str3.isEmpty());  // true


    }
}
