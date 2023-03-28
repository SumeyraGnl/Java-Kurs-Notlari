package day36_exeptions;

public class C03_TryCatch {
    public static void main(String[] args) {

        int sayi1 = 20;
        int sayi2 = 0;


        try {

            System.out.println(sayi1/sayi2);  // ==> bu  satirda hata yakalarsa deneme 1,2,3 ignore eder,catch devreye girer
            System.out.println("deneme1");
            System.out.println("deneme2");
            System.out.println("deneme3");


        } catch (ArithmeticException e) {

            System.out.println("Bolen sifir olmamali");

        }

        /*
        Bir try blogundan exeption olusursa
        o satirdan catch satrina kadar aradaki tum kodlar IGNORE edilir

        eger try blogunda exeption olusmazsa
        catch devreye girmez
        (if-else gibi)
         */


    }
}
