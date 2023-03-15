package day06_bagimsizIfCümleleri;

public class C01_ifStatements {
    public static void main(String[] args) {
        /*
            Buradaki sartlar birbirinden bagimsizdir
            uygun sayilar olursa 3 if body'si de calisabilir
            bazen de hicbir if body'si devreye girmeyebilir

            Bazen kodumuz konsolda hicbir sey yazdirmaz,
            ancak
            Process finished with exit code 0
            yazarsa kodun hicbir sorun olmadan calistigini anliyoruz

            sadece degerler sartlari saglamadigi icin
            konsolda bir sey yazdirilmaz.
         */

         int a= 10;
         int b= 130;

         if (a>b){
             System.out.println("a b'den büyüktür");
         }
         if (a%2==0){
             System.out.println("a cift sayidir");
         }
         if (b>100){
             System.out.println("b 100'den buyuktur");
         }

         boolean sonuc= a*7 > b;

           /*
           bazen if statement de, boolean bir ifade sart olarak yazılabilir
           bu durumda boolean variable degeri true ise if bady calisir,
           false ise if bady calismaz.
            */

         if (sonuc){
             System.out.println("istenen sart saglandi");
         }



    }
}
