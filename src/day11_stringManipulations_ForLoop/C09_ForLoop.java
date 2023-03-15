package day11_stringManipulations_ForLoop;

public class C09_ForLoop {
    public static void main(String[] args) {

        // 50'den baslayip, 100'e kadar(100 dahil)
        // sayilari yan yana, aralarinda bir bosluk olacak sekilde yazdirin

        for (int i = 50; i <=100 ; i++) {
            System.out.print(i+ " ");  // 50 51 52 53 54 55 56 57 58 59 60 61 62......100

        }
        System.out.println("");  //yukaridaki sout un devami olarak yazdirmamasi icin.
                                 // yukarida println degil print kullandigimiz icin

         // 3 basamakli sayilardan 23 ile bolunebilenleri
         // yan yana, aralarinda bir bosluk olacak sekilde yazdirin

        for (int i = 100; i <1000 ; i++) {
            if (i%23==0){
                System.out.print(i+ " ");  // 115 138 161 184 207 230 253 276 299 322.........989
            }

        }
        System.out.println("");
        // 20'den baslayip, 7'ser artarak 100'e kadar yazdirin
        // (100 yazdirmamiz gerekiyorsa yazdirin ama 100'u gecmeyin)

        for (int i = 20; i <=100 ; i+=7) {
            System.out.print(i+ " ");  // 20 27 34 41 48 55 62 69 76 83 90 97

        }

        System.out.println("");

        // 100'den baslayarak 1'e kadar (sinirlar dahil)
        // 7 ile bolunebilen sayilari yazdirin

        for (int i = 100; i >=1 ; i--) {
            if (i%7==0){
                System.out.print(i+ " ");  // 98 91 84 77 70 63 56 49 42 35 28 21 14 7
            }

        }



    }
}
