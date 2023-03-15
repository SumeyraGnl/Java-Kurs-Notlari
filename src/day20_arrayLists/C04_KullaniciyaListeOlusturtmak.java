package day20_arrayLists;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class C04_KullaniciyaListeOlusturtmak {
    public static void main(String[] args) {
        // Kullanicidan istedigi kadar isim alip,
        // Q' ya bastiginda girdigi isimleri bize liste olarak döndürecek bir method olusturun


        System.out.println(kullaniciyaListOlusturtma());

    }
    public static List<String > kullaniciyaListOlusturtma(){
        Scanner scan=new Scanner(System.in);
        List<String> isimler=new ArrayList<>();
        String girilenisim="";

        do {
            System.out.println("Listeye eklemek icin bir isim girin" + "\n Bitirmek icin Q'ya basin");
               girilenisim=scan.nextLine();
            if (!girilenisim.equalsIgnoreCase("q")) {
                isimler.add(girilenisim);
            }

        }while (!girilenisim.equalsIgnoreCase("q"));

        return isimler;
    }


}
