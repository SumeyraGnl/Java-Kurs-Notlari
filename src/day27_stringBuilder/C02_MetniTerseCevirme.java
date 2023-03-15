package day27_stringBuilder;

public class C02_MetniTerseCevirme {
    public static void main(String[] args) {

        // verilen bir metni tersine cevirin

        String str= "Java Candir.";

        StringBuilder sb = new StringBuilder(str);

        System.out.println(sb.reverse());  // .ridnaC avaJ

        System.out.println(sb);  // .ridnaC avaJ ==> mutible oldugu icin string builder degistirilebilir

        sb.reverse();
        System.out.println(sb);


        // string builder'i , stringe cevirmek icin to String kullanilir.
        // StringBuilder a=new StringBuilder("Java");
        // System.out.println(a.toString());    ===> stringe cevirir
    }
}
