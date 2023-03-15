package day15_doWhileLoop_scope;

public class C05_LocalVariable {

    public static void main(String[] args) {

        //  scope ===> kullanim alani

        /*
            1- bir method icerisinde olusturulan variable 'in scope 'u o method'dur
               baska bir method 'da KULLANILAMAZ
               bu variable' lara local variable denir.
            2- Her ne kadar bir methodun icinde olsalar da
               Loop' larin da ayri bir scope' u vardir
               Loop icerisinde olusturulan variable'lar
               Loop disinda kullanilamazlar.
            3- Local variable'lari deger atamadan olusturabiliriz
               ancak deger atamadan KULLANAMAYIZ

         */

        String isim="Ali Can";

        int sayi;  // ============>>  local variable
          //System.out.println(sayi);


            // sayi++;

        for (int i = 0; i < 10; i++) {
            int j=i;
        }
            //System.out.println(i);   ====> for loop un dısında kullanamayız
            //System.out.println(j);

    }

    public static void baskaMethod(){

          // System.out.println(isim);
        int sayi= 5;

    }




}
