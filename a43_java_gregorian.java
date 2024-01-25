package Java;

import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.TimeZone;

public class a43_java_gregorian {
    public static void main(String[] args) {
        // IT IS A CONCRETE CLASS
        GregorianCalendar g = new GregorianCalendar();
        System.out.println(g.isLeapYear(2029));
        System.out.println(g.getTime());

        //TIMEZONE CLASS IS USED TO CREATE TIMEZONE IN JAVA
        //SOME OF THE IMPORTANT METHOD OF TIME ZONE CLASS ARE
        //getAvailableIds();->get all the available ids
        //getId();-> get id of current timezone
        //getDefault(); -> get default id of current timezone
        System.out.println(TimeZone.getAvailableIDs()[0]);
        System.out.println(TimeZone.getAvailableIDs()[1]);
        System.out.println(TimeZone.getAvailableIDs()[2]);
        System.out.println(TimeZone.getAvailableIDs()[3]);
        System.out.println(TimeZone.getAvailableIDs()[4]);


    }
}
