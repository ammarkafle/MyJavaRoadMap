package MyLearnedTopics.Java.MLT_09_Java8Feature.DateTimeAPI;
import java.time.LocalDateTime;
import java.util.Date;

public class DateAndTime {
    public static void showDate() {

        System.out.println("Before Using LocalDateTime");
        Date date = new Date();
        System.out.println(date);
        System.out.println("\n");

        System.out.println("After Using LocalDateTime");
        LocalDateTime dateTime = LocalDateTime.now();
        System.out.println(dateTime);
        System.out.println("\n");
        int day = dateTime.getDayOfMonth();
        System.out.println("Today date is : " + day);
        // yyyy-MM-dd-HH-mm-ss.zzz
    }

    public static void main(String[] args) {
        showDate();
    }
}
