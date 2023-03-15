package day14_methodOverloading_whileLoop;

public class C02_isAsal {
    public static void main(String[] args) {
        // Verilen 1'den buyuk bir tamsayi icin
        // sayi asal ise true
        // sayi asal degil ise false dönen bir method olusturun


        System.out.println(isAsal(20));  // false

        boolean sonuc=isAsal(43);  // sonuc variable' ina true degeri atar
        System.out.println(sonuc);
    }

    public static boolean isAsal (int sayi){

        int flag=0;

        for (int i = 2; i < sayi ; i++) {
            if (sayi%i==0){
                flag ++;
                break;
            }

        }
        if (sayi==2){
            return true;
        }else if (flag==0) {
            return true;
        }else{
            return false;
        }





    }





}
