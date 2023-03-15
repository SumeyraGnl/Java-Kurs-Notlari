package day10_stringManipulation;

public class C03_startsWith_endsWith {
    public static void main(String[] args) {

           // startsWith  "-ile baslar mi"  diye bakar

        String str="Java harika";
        System.out.println(str.startsWith("java"));  // false   ("java" ile baslar mı)
        System.out.println(str.startsWith("Ja")); // true   ("Ja" ile baslar mi)

        System.out.println(str.startsWith(str));  // true
        System.out.println(str.startsWith("ha")); // false
        System.out.println(str.startsWith("")); // true  (hiclik ile mi baslar)

        System.out.println("============");

        //startsWith  "-ile biter mi"  diye bakar

        System.out.println(str.endsWith("a"));  // true
        System.out.println(str.endsWith("ka"));  // true
        System.out.println(str.endsWith("Java harika"));  // true
        System.out.println(str.endsWith(""));  // true
        System.out.println(str.endsWith("ha"));  //false

        System.out.println(str.endsWith(str.substring(str.length() - 1)));  //true


    }
}
