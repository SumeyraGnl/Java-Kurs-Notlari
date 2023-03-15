package day11_stringManipulations_ForLoop;

public class C05_replaceAll_repeat_trim {
    public static void main(String[] args) {

        String str="J&ava54 C+an01dir,,,";

        //str' i Java Candir haline getirin

        str=str.replaceAll("\\d","");  // J&ava C+andir,,,
        str=str.replaceAll(" " , "5");  // J&ava5C+andir,,,
        str=str.replaceAll("\\W", "");  // Java5Candir
        str=str.replaceAll("\\d"," ");  // Java Candir

        System.out.println(str);

          // repeat(tekrar sayisi): Bir String’i tekrarSayisi kadar tekrar ettirir.

        String str2="Java...";
        System.out.println(str2.repeat(3));  // Java...Java...Java...

        // trim(kesmek): Bir String’in basinda ve sonunda (varsa) bulunan space’leri siler.

        String str3="  Java  ";
        System.out.println(str3.trim());  // Java







    }
}
