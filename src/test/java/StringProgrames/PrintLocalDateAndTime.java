package StringProgrames;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class PrintLocalDateAndTime {
    public static void main(String[] args) {
        LocalDateTime currentDate = LocalDateTime.now();
        System.out.println(currentDate);
    }
}
