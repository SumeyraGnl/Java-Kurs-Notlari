package day26_localTime_varargs;

import java.time.LocalDate;
import java.time.Period;

public class C06_PeriodOfTime {
    public static void main(String[] args) {

        // Period Of Time; iki tarih arasinda gecen sureyi yil,ayigun olarak verir

        LocalDate dogumTarihi = LocalDate.of(1986,2,2);
        LocalDate bugun= LocalDate.now();

        System.out.println(Period.between(dogumTarihi, bugun)); // P37Y1M8D

        System.out.println("Yas : "+Period.between(dogumTarihi,bugun).getYears()); // 37

        System.out.println("Yas : "+Period.between(dogumTarihi,bugun).getDays()); // 8



    }
}
