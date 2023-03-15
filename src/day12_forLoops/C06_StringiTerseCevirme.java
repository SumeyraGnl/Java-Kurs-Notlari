package day12_forLoops;

public class C06_StringiTerseCevirme {
    public static void main(String[] args) {

               //Soru 10 (interview)- Kullanicidan bir String isteyin
              //                      ve String’i tersine cevirip kaydedin.

        String input= "Sümeyra";

            // ridnaC avaJ ==> bu sekilde yazdirmasini istiyoruz

        String output="";

        for (int i = input.length()-1; i >=0 ; i--) {
            output += input.charAt(i);

        }
        System.out.println(output);












    }
}
