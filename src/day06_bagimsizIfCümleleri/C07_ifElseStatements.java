package day06_bagimsizIfCümleleri;

import javax.security.sasl.SaslClient;
import java.util.Scanner;

public class C07_ifElseStatements {
    public static void main(String[] args) {

          //Soru 4- Kullanicidan bir karakter girmesini isteyin,
        // girilen karakterin buyuk harf olup olmadigini yazdirin.

        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen bir karakter giriniz");

        char krk=scan.next().charAt(0);

        // mesela f alalım.======>A ile Z arasında mı?

        if ('A'<=krk && krk<='Z'){
            System.out.println("Girilen karakter büyük harftir");
        } else {
            System.out.println("Girilen karakter büyük harf degildir");
        }



    }
}
