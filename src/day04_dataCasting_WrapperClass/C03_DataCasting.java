package day04_dataCasting_WrapperClass;

public class C03_DataCasting {
    public static void main(String[] args) {

        int a=20;
        int b=6;

        System.out.println(a/b);   // 3

        double c=6;

        System.out.println(a/c);   //3.3333333333333335

        float d=6f;

        System.out.println(a/d);   //3.3333333

        System.out.println((double)(a/b) );  //3.0

        System.out.println((double)a/b);   //3.3333333333333335

        System.out.println(a/(double)b);   //3.3333333333333335

        int e=1673;
        System.out.println(e=e/10);  // 167

        System.out.println(e);  //167

        e=e/10;

        System.out.println(e);  //  16

        e=e/10;

        System.out.println(e);  //  1

         e=e/10;

        System.out.println(e);  // 0
    }
}
