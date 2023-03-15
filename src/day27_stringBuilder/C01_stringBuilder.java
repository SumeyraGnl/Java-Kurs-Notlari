package day27_stringBuilder;

public class C01_stringBuilder {
    public static void main(String[] args) {

        StringBuilder sb1= new StringBuilder();

        System.out.println(sb1.capacity());  // 16
        System.out.println(sb1.length());  // 0

        sb1.append("Mustafa");

        System.out.println(sb1.capacity());  // 16
        System.out.println(sb1.length());  //  7

        sb1.append(" Yilmazturk");

        System.out.println(sb1);  // Mustafa Yilmazturk (18 karakter)
        System.out.println(sb1.capacity());  // 34 ===>  2 * eski capacity + 2
        System.out.println(sb1.length());   //  18

        sb1.append(" javayi cok sever, sabah aksam Java calisir.");


        System.out.println(sb1.capacity());  //  70 ==> 2*34+2=70
        System.out.println(sb1.length());   //  62

        // 2.yontem

        StringBuilder sb2 = new StringBuilder("Java candir");

        System.out.println(sb2);  // Java candir
        System.out.println(sb2.capacity());  // 27
        System.out.println(sb2.length());  // 11

        // 3.yontem

        StringBuilder sb3 = new StringBuilder(11);

        sb3.append("54464423817");

        System.out.println(sb3);  // 54464423817
        System.out.println(sb3.capacity());  // 11
        System.out.println(sb3.length());  // 11

        sb3.append(" : TC No" );
        System.out.println(sb3);  // 54464423817 : TC No
        System.out.println(sb3.capacity());  // 24  ==> 2*11+2
        System.out.println(sb3.length());  // 19

        String str="Java Candir";

        sb3.append(str,4,str.length());
        System.out.println(sb3);  // 54464423817 : TC No Candir

        // trim:

        sb3.trimToSize();

        System.out.println(sb3.capacity());  // 26
        System.out.println(sb3.length());  // 26









    }
}
