package day15_doWhileLoop_scope;

public class C02_RakamlarToplaminiBul {

    // verilen pozitif bir tamsayinin
    // rakamlar toplamini bize donduren method olusturun

    public static int rakamlarToplaminiBul(int girilenSayi){

        int sayi=girilenSayi;
        int rakamlarToplami=0;
        int birlerBasamagi=0;

        int basamakSayisi=(sayi+"").length();

        for (int i = 1; i <= basamakSayisi ; i++) {

            birlerBasamagi=sayi%10;
            rakamlarToplami+=birlerBasamagi;
            sayi/=10;

        }

        return (rakamlarToplami);

            // main methodu olusturmadigimiz icin C01 klasinda calistiracagiz methodumuzu


    }

}
