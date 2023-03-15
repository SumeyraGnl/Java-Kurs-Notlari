package day12_forLoops;

public class C10_NestedForlop {
    public static void main(String[] args) {

        /*
                Verilen satir sayisina gore
                asagidaki sekli olusturan kod yaziniz

                *
                * *
                * * *
                * * * *
         */
        
           int sayi=4;
          for (int i = 1; i <=sayi ; i++) {  // satirlar Outer Loop / dis dongu
              for (int j =1; j <=i; j++) {  // sutunlar inner Loop / ic dongu
                  System.out.print("* ");
              }
               System.out.println("");

           }

        System.out.println("=============");

            //  Tersini yapacak olursak
        //    * * * *
        //    * * *
        //    * *
        //    *

          int satir=4;

          for (int i = 1; i <=satir; i++) {
              for (int j = satir; j>=i; j--) {
                System.out.print("* ");
            }
            System.out.println("");
        }

        
        
    }
}
