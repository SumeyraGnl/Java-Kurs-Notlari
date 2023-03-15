package day26_localTime_varargs;

import java.time.LocalTime;

public class C01_LocalTime {
    public static void main(String[] args) {

        LocalTime saat1=LocalTime.of(20,15);
        System.out.println(saat1);  //  20:15

        LocalTime saat= LocalTime.now();
        System.out.println(saat);  // 06:21:56.563488300

        // LocalTime objesi olan saat variable'i canli bir saat degildir
        // olusturuldugu andaki local time'i sistemden alip kaydettigimiz sabit bir degerdir
        // kodun ilerleyen kisminda ne kadar sure gectigini gormek icin
        // saati yeniden almamiz gerekirse, yeni bir LocalTime objesi daha olusturmaliyiz

        System.out.println(saat.getHour());  // 6

        // get method'lari localTime objesinin saat, dakika, saniye ve nano degerlerini bize getirir

        System.out.println(saat.plusHours(2).plusMinutes(10));

        // plus methodu LocalTime objesine istedigimiz saati, dakikayi.... eklememizi saglar

        System.out.println(saat.minusMinutes(10).minusSeconds(10));

        // minus methodu LocalTime objesinden istedigimiz saati, dakikayi.... cıkarmamizi saglar

        System.out.println(saat.withSecond(0).withNano(0));

        System.out.println(saat.withSecond(10).withNano(20));

        // with; saat haricindeki diger degerleri degistirebilmemizi saglar

        System.out.println(saat.compareTo(saat1));  // ayniysa 0, ayni degilse -1 doner

        System.out.println(saat.isAfter(saat1));  // false
        System.out.println(saat.isBefore(saat1));  // true

        System.out.println(saat.toSecondOfDay());  // gunun kacinci saniyesinde : 24403


    }
}
