package day19_arrayLists;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class C05_TekrarlardanKurtulma {
    public static void main(String[] args) {

        // verilen bir array'den tekrar eden sayilari silip
        // her bir elementin sadece bir kez kullanildigi bir hale donusturun

        int[] arr = {3,4,5,6,3,4,2,3,5,4,6,5,4,3,5,7};

        // bir tane bos list olusturalim
        // array'deki her bir elemani ele alalim
        // ele aldigimiz element list'de yoksa ekleyelim, varsa eklemeyelim
        // boylece benzersiz elementlerden olusan bir list olusturalim

        List<Integer> yeniArr = new ArrayList<>();

        for (int i = 0; i < arr.length; i++) {
            if (!yeniArr.contains(arr[i])){

                yeniArr.add(arr[i]);
            }

        }
        System.out.println(yeniArr);  // [3, 4, 5, 6, 2, 7]

        // istenen listeyi list olarak elde ettik
        // Ama array'imiz aynen duruyor  [3, 4, 5, 6, 3, 4, 2, 3, 5, 4, 6, 5, 4, 3, 5, 7]
        // bunu arr'ye direk atayamayiz

        // List 'te length olmadigi icin ,uzunluk size alinir

        arr=new int[yeniArr.size()];  // [0, 0, 0, 0, 0, 0]

        for (int i = 0; i < arr.length; i++) {
            arr[i]=yeniArr.get(i);

        }

        System.out.println(Arrays.toString(arr)); //  [3, 4, 5, 6, 2, 7]









    }
}
