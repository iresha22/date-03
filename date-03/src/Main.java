import java.text.SimpleDateFormat;
import java.time.Month;
import java.time.OffsetDateTime;
import java.time.format.DateTimeFormatter;

public class Main {
    public static void main(String[] args) {
        OffsetDateTime birthday = OffsetDateTime.parse("2023-03-01T13:00:00Z");
        int year = birthday.getYear();
        System.out.println(year);
        Month month = birthday.getMonth();
        System.out.println(month);
        int day = birthday.getDayOfMonth();
        System.out.println(day);
        String dayOfWeek = String.valueOf(birthday.getDayOfWeek());
        System.out.println(dayOfWeek);



    }
}
