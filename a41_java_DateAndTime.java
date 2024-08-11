package Java;

import java.util.Date;

public class a41_java_DateAndTime {
    public static void main(String[] args) {
        /*
        java stores time in millisec since 1 jan 1970.
        Java assume that 1900 is starting year.

         */
        System.out.println(Long.MAX_VALUE);
        System.out.println(System.currentTimeMillis());
        System.out.println((Long.MAX_VALUE)/1000/60/60/24/365);
        System.out.println(System.currentTimeMillis()/1000/60/60/24/365);

        //OLD WAYS TO USE DATE AND TIME IN JAVA WHICH IS DEPLICATED (DATE CLASS)
        Date d = new Date();
        System.out.println(d.getDate());
        System.out.println(d.getDay());


    }
}
