package day04_dataCasting_WrapperClass;
public class C01_AsciiTable {

    public static void main(String[] args) {

          //  a=97
        System.out.println(5+ 'a');

        char ilkHarf=101;  //e

        char ikiHarf=105;  //i

        ikiHarf=110;   //n

        System.out.println(ilkHarf);

        System.out.println(ikiHarf);

        char girilenChar= 'f';

        System.out.println(girilenChar+1);  //102+1=103

        System.out.println("Girilen Harfin Bir Sonrası : " +(char)(girilenChar+1));

        girilenChar= 'M';

        System.out.println("Girilen Harfin İki Öncesi : " + (char)(girilenChar-2));










    }
}
