package practice_basic_day06;

import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

public class Q09_ZoneDateTime {
    // Baska ülke veya bolgelerin saat dilimine gore zamani alma
    // Newyork un saat dilimine gore saat ?
    public static void main(String[] args) {
        ZonedDateTime zdt=ZonedDateTime.now(ZoneId.of("America/New_York"));
        //2022-04-04  T  16:45:23.730564300-04:00     [America/New_York]
        ZonedDateTime local=ZonedDateTime.now();
        //2022-04-04  T  23:45:23.751393100+03:00      [Asia/Istanbul]
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd.MM.yyyy   HH:mm");

        System.out.println("zdt = " + zdt);
        System.out.println("local = " + local);


        System.out.println("zdt = " + zdt.format(formatter));
        //04.04.2022   16:45

    }
}
