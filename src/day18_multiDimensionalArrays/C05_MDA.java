package day18_multiDimensionalArrays;

public class C05_MDA {
    public static void main(String[] args) {

        int[][] arr = {{3,5,7},{1,2,3,4},{1,2},{7}};

        // toplam element sayisi kactır ?

        int toplamElementSayisi=0;

        for (int i = 0; i < arr.length; i++) {

            toplamElementSayisi += arr[i].length;

        }

        System.out.println("Toplam Element Sayisi: " +toplamElementSayisi);  // 10
        
        // tum elementlerin toplamini bulun

        // MDA'lerde her bir elementi elden gecirmek istiyorsak
        // kat sayisi kadar nested for-loop kullaniriz

        int elementlerToplam=0;

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                elementlerToplam += arr[i][j];

            }

        }
        System.out.println("Elementlerin toplami: " + elementlerToplam);  // 35



    }
}
