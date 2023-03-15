package day14_methodOverloading_whileLoop;

public class C04_MethodOverloading {
    public static void main(String[] args) {

        /*
                     JAVA OVERLOADING KURALLARI
            1- isim ve parametreleri ayni olan birden fazla method olusturulamaz
            2- data turleri farkli olan parametrelerin yerlerini degistirirsek
               java yeni bir method olarak kabul eder (int, double) (double,int)

            Overloading olan class'larda
            Java hangi method'un calistirilacagina su sekilde karar verir:

            1- cagrilan isimde method var mi ?
            2- method call'da kullanilan arguments(yazilanlar) ile method'lardaki
               parametrelerin %100 uyumlu oldugu var mi ?
            3- argument ile parametre ayni olmasa bile
               verilen argumentleri kabul edecek parametre var mi ?
            4- Casting ile birden fazla method'u kullanabiliyorsa
               daha az casting ile calisacak method'u kullanir
         */

        topla(5,3);  // İki tamsayinin toplami: 8
        topla(4.5 , 3.2);  // İki double sayinin toplami: 7.7
        topla(5 , 3.2);  //  int ve double sayilarin toplami: 8.2

        // topla("ali","veli");  ===> CTE bu argument'leri kabul edebilecek parametre yok

        topla('a', 'b');  // İki tamsayinin toplami: 195
        topla(3f, 4f);  //İki double sayinin toplami: 7.0
        topla(3f , 4);  // double ve int sayilarin toplami: 7.0


    }
    public static void topla(int a , int b){

        System.out.println("İki tamsayinin toplami: " + (a+b));
    }

    public static void topla(double a, double b){

        System.out.println("İki double sayinin toplami: " + (a+b));
    }

    public static void topla(int sayi1, double sayi2){

        System.out.println("int ve double sayilarin toplami: " + (sayi1+sayi2));
    }

    public static void topla(double sayi1 , int sayi2){

        System.out.println("double ve int sayilarin toplami: " + (sayi1+sayi2));
    }









}
