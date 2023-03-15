package day26_localTime_varargs;

import java.time.LocalDateTime;

public class C04_LocalDateTime {
    public static void main(String[] args) {

        LocalDateTime ldt=LocalDateTime.now();

        System.out.println(ldt);  // 2023-03-09T21:55:14.502318500

        System.out.println(ldt.toLocalDate());
    }
}
