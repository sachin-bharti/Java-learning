import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
//you improt sepratly all these clases or just import all the classes from Time packeg using "java.time.*";
public class DateTime {
    public static void main(String[] args) {
        LocalTime LT = LocalTime.now();
        LocalDate LD = LocalDate.now();
        LocalDateTime LDT = LocalDateTime.now();
        System.out.println();
        System.out.println("Current Time : "+ LT);
        System.out.println("Todays Date : " + LD);
        System.out.println("Current Date Time : "+ LDT);

    }
}
