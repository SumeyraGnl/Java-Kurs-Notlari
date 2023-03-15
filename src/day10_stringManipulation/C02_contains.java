package day10_stringManipulation;

public class C02_contains {
    public static void main(String[] args) {

        // contains de "var mi" diye bakilir. varsa true yazdirir,yoksa false yazdirir.

        String str="Java ogren, isi kap";
        System.out.println(str.contains("Java"));  // true  (str string'i "Java" icerir mi)

        String s="ka";
        System.out.println(str.contains(s));  // true  (str string'i, s string'ini icerir mi)
        System.out.println(str.contains("a"));  // true
        System.out.println(str.contains(" "));  //true
        System.out.println(str.contains("")); // true
        System.out.println(str.contains("java"));  //false  (buyuk-kucuk harf hassasiyeti var)


    }
}
