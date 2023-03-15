package day12_forLoops;

public class C08_NestedForLoop {
    public static void main(String[] args) {

        // dinamik olarak verilen satir ve sutun sayisina gore
// yildizlardan bir dikdortgen olusturun

        /*

              * * * * *
              * * * * *
              * * * * *

         */
        int satirsayisi=3;
        int sutunSayisi=5;


        for (int k = 1; k <=satirsayisi ; k++) {  // satir sayisini takip eder

            for (int i = 1; i <=sutunSayisi ; i++) {  //sutun sayisini takip eder
                System.out.print("* ");

            }

            System.out.println("");  // icerideki forloop bitince yazdirilir
                                     // bir satirdaki tüm sutunlar bitince alt satira gecer
        }


        System.out.println("*****************");

        for (int i =1; i <=satirsayisi ; i++) {
            for (int j = 1; j <=sutunSayisi ; j++) {
                System.out.print("* ");

            }

            System.out.println("");

        }




    }
}
