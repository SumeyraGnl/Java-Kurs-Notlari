package day22_constructor;

public class C07_arabaRunner {
    public static void main(String[] args) {

        C06_Araba araba1= new C06_Araba();
        araba1.marka = "Toyota";
        araba1.model = "Corolla";
        araba1.hasarliMi = false;
        araba1.yil = 2017;
        araba1.fiyat = 5250;

        System.out.println("Marka: " +araba1.marka + ", Model: " + araba1.model);

        System.out.println(araba1);

        C06_Araba araba2=new C06_Araba("Honda", "Jazz",true,2010,3000); // constructor olusturduktan sonra

        System.out.println(araba2);

        C06_Araba araba3=new C06_Araba("WV","Jetta",false,2013,7200);

        System.out.println(araba3);





    }
}
