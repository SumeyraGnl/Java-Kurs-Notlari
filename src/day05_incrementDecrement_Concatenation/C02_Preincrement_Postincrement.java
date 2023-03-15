package day05_incrementDecrement_Concatenation;

public class C02_Preincrement_Postincrement {
    public static void main(String[] args) {

        // a'nin degerini 1 artirin ve yeni degerini olusturacaginiz b variable'ina atayin

        int a=20;
        a++;
        int b= a;
        System.out.println("a : " +a+ ",b: " +b); //a : 21,b: 21

        //a'nın degerini b'ye atayın,sonra a'nın degerini 1 artıtın

        a=20;
        b=a;
        a++;
        System.out.println("a : " +a+ ",b: " +b);  // a : 21,b: 20

        //a'nin degerini yazdırın ve sonra a'yi 1 artirin

        a=20;
        System.out.println("a: " +a);  //a: 20
        a++;

       a=20;
        System.out.println("a: " + a++);  //a:20
        System.out.println("Bir sonraki adimda a: " +a);  //Bir sonraki adimda a: 21

        // a'nin degerini 1 azaltin ve sonra a'nin degerini yazdirin

        a=20;
        System.out.println("a: " + --a);  // a: 19
        System.out.println("Bir sonraki adimda a: " +a);  // Bir sonraki adimda a: 19
    }
}
