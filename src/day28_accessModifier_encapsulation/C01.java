package day28_accessModifier_encapsulation;

public class C01 {
    // Access Modifiers (erisim belirleyici) bir class uyesinin scope’unu yani nerelerden
    //erisilebilecegini belirler.


    String str;  // class level'deki her class uyesinin access modifier'i olur
                 // eger access modifier'i gorunmuyorsa Java o class uyesini
                // default access modifier olarak isaretler

    static String s;


    private int b;
    private static int c=10;

    public static int a;
    public int d;

    public static void main(String[] args) {

        int sayi=10;
        // public int sayi2=20;
        // static String b;
        // privite char c;
        // bir method icerisinde public, protected, private gibi access modifier'lar
        // veya static keyword KULLANILAMAZ

          //System.out.println(b); static olmadigi icin ulasılamaz
        System.out.println(c);

          //  str="Java";  ==> static olmadigi icin ulasilamaz
        s="hava";

        a=10;
        // d=20;   static olmadigi icin


    }

    void method1(){
        System.out.println(b);
        System.out.println(c);

        str="Java";
        s="hava";

        a=10;
        d=20;

    }

    static void method2(){


    }

    public void method3(){

    }


}
