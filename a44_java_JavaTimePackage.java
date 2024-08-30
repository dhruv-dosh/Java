package Java;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class a44_java_JavaTimePackage {
    public static void main(String[] args) {
        //IN CLASS DATES ARE IMMUTABLE WHILE IN CALENDAR THEY ARE MUTABLE
        LocalDate d = LocalDate.now();
        System.out.println(d);
        System.out.println(LocalTime.now());
        System.out.println(LocalDateTime.now());


        //DATE TIME FORMATTER
        LocalDateTime dt = LocalDateTime.now();
        //DateTimeFormatter df = DateTimeFormatter.ofPattern("dd-mm-yyyy");// you can get info of d,m,y,etc. from java doc
        DateTimeFormatter df2 = DateTimeFormatter.ISO_LOCAL_DATE;
        String myDate = dt.format(df2);
        System.out.println(myDate);

    }
}
