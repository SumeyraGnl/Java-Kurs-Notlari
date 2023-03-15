package day04_dataCasting_WrapperClass;

public class C04_WrapperClasses {
    public static void main(String[] args) {

        /* int ==> Integer
        char ==> Character
        byte ==> Byte
        boolean ==> Boolean


         */

        Integer sayi= 10;
        System.out.println(Integer.MIN_VALUE);  //-2147483648
        System.out.println(Integer.MAX_VALUE);  //2147483647

        String sonucStr="345";
        System.out.println(sonucStr + 10);   //34510

            // bu degere 10 ekleyin

           //  int sonuc=(int)sonucStr;
        // bu durumda Wrapper class'lar imdada yetisir

          int sonuc=Integer.parseInt(sonucStr);
           System.out.println(sonuc+10);   //355

        sonuc=Integer.valueOf(sonucStr);
        System.out.println(sonuc+10);  //355

        char krk='5';
        System.out.println(Character.isDigit(krk));  //true
        System.out.println(Character.isLetter(krk));  //false

        System.out.println(Character.isAlphabetic(krk));  //false


    }
}
