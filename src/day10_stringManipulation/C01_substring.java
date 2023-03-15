package day10_stringManipulation;

public class C01_substring {
    public static void main(String[] args) {

        String str="Java ne kadar guzel";
            // substring iki farkli sekilde kullanilabilir.
            // 1- tek parametre olursa, o index'den baslar sonuna kadar yazdirir.

        System.out.println(str.substring(8));  //kadar guzel

        System.out.println(str.substring(0));  //Java ne kadar guzel

        System.out.println(str.substring(str.length()-3));  //zel

        System.out.println(str.substring(str.length()));  // hiclik

           //System.out.println(str.charAt(str.length()));  // burada 19.index'i yazdir diyor.
                                                            // str' in uzunlugu 19,son harfin index'i 18
                                                            // 19.index de karakter yok.bu nedenle hiclik yazdirir


        //2- iki parametre olursa ; baslangicIndex' inden(dahil) baslar
        //    bitisIndex' ine(haric) kadar olan bolumu yazdirir.

        System.out.println(str.substring(5, 7));  // ne  (7-5=2 karakter yazdiracak. 5 ve 6 yi)
        System.out.println(str.substring(3, 4));  // a   (4-3=1 karakter yazdiracak. 3 ü)
        System.out.println(str.substring(0, 1)); // J

        //str'in 5.index'deki karakterini yazdirin

        System.out.println(str.charAt(5)); // n
        System.out.println(str.substring(5, 6)); // n

        System.out.println(str.substring(2,2));  //  hiclik

          //System.out.println(str.substring(5, 1)); // run time error

        System.out.println(str.substring(0, (str.length() - 3)));  //Java ne kadar gu


    }
}
