package day05_incrementDecrement_Concatenation;

public class C01_incrementDecrement {
    public static void main(String[] args) {

         // a'nin degerini 3 artirin ve yeni degerini olusturacaginiz b variable'ina atayin
        int a=20;

          // a=a+3;
        a += 3;
        int b = a;

        System.out.println("a: " + a + ", b: " +b);  // a: 23, b: 23

        a=20;
         //a'nın degerini b'ye atayın,sonra a'nın degerini 3 artıtın
        b=a;
        a +=3;
        System.out.println("a: " + a +", b: " + b);



            //a'nin degerini yazdırın ve sonra a'yi 5 artirin

        a=20;
        System.out.println("a: " +a);
        a+=5;

        // a'nin degerini 2 azaltin ve sonra a'nin degerini yazdirin

        a=20;
        a-=2;
        System.out.println("a: " +a);

    }
}
