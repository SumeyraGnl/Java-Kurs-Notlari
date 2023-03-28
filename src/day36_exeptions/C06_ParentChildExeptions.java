package day36_exeptions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class C06_ParentChildExeptions {
    public static void main(String[] args) {

        String doyaYolu = "src/day36_exeptions/text.txt";

        FileInputStream fis = null;
        try {

            fis = new FileInputStream(doyaYolu);
            int k=0;
            while((k= fis.read() ) != (-1)) {
                System.out.print((char) k);
            }

        } catch (FileNotFoundException e) {


        } catch (IOException e) {

        }

        /*
        Eger kodumuzda birden fazla exeption ihtimali varsa
        ve bu exeption 'lar arasinda parent-child iliskisi varsa

            1- Ya sadece parent'i yazariz
               cunku parent exception, child exception'lari da kapsar

            2- Veya ikisini de yazmak istiyorsak
               once child exception'i
               sonra parent exception'i yazmaliyiz
         */


    }
}
