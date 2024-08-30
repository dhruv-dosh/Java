package Java;

import java.util.Calendar;
import java.util.TimeZone;

public class a42_java_CalendarClass {
    public static void main(String[] args) {
        //Calendar is abstract class
        Calendar c = Calendar.getInstance(TimeZone.getTimeZone("Asia/Kolkata"));
        System.out.println(c.getCalendarType());
        System.out.println(c.getTimeZone());
        System.out.println(c.getCalendarType());
        System.out.println(c.get(Calendar.DATE)+":"+(c.get(Calendar.MONTH)+1)+":"+(c.get(Calendar.YEAR)));
        System.out.println(c.get(Calendar.DAY_OF_MONTH));
        System.out.println(c.get(Calendar.DAY_OF_WEEK));
        System.out.println(c.get(Calendar.HOUR)+":"+c.get(Calendar.MINUTE)+":"+(c.get(Calendar.SECOND)));
        System.out.println(c.get(Calendar.HOUR_OF_DAY)+":"+c.get(Calendar.MINUTE)+":"+(c.get(Calendar.SECOND)));
    }
}
