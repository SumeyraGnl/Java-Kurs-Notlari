package day13_methodOlusturma;

public class C05_StringiTerseCevirme {

    public static void main(String[] args) {

        // Verilen bir String'i tersine cevirip
        // bize donduren bir method olusturun

        System.out.println(stringTersineCevir("olacak galiba"));


    }

    public static String stringTersineCevir(String metin){

        String tersMetin="";
        for (int i = metin.length()-1; i >=0 ; i--) {
            tersMetin += metin.charAt(i);

        }

      return tersMetin;


    }



}
