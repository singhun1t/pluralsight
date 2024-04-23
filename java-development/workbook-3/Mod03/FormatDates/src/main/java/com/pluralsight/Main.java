package com.pluralsight;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.TimeZone;

public class Main {
    public static void main(String[] args) {
        LocalDate date = LocalDate.now();

        LocalDateTime today = LocalDateTime.now();

        DateTimeFormatter fmt = DateTimeFormatter.ofPattern("MM/dd/yyyy");
        String formattedDate = date.format(fmt);
        System.out.println(formattedDate);

        DateTimeFormatter lmt = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        String formattedDate2 = date.format(lmt);
        System.out.println(formattedDate2);

        DateTimeFormatter zmt = DateTimeFormatter.ofPattern("MMMM d, yyyy");
        String formattedDate3 = date.format(zmt);
        System.out.println(formattedDate3);

        //formatting in GMT time
        Date date1 = new Date();
        SimpleDateFormat requiredFormat = new SimpleDateFormat("EEEE, MMM dd, yyyy HH:mm 'in GMT'");
        requiredFormat.setTimeZone(TimeZone.getTimeZone("GMT"));
        String gmtTime = requiredFormat.format(date1);
        System.out.println(gmtTime);
        /*
        DateTimeFormatter jmt = DateTimeFormatter.ofPattern("EEEE, MMM dd, yyyy HH:mm");
        String formattedDate4 = today.format(jmt);
        System.out.println(formattedDate4);

         */

        DateTimeFormatter pmt = DateTimeFormatter.ofPattern("H:mm 'on' dd-MMM-yyyy 'in local time zone' " );
        String formattedDate5 = today.format(pmt);
        System.out.println(formattedDate5);

    }
}
