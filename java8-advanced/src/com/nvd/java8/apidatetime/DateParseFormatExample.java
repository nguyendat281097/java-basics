package com.nvd.java8.apidatetime;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/*In the APIs of LocalDate, LocalTime, LocalDateTime,... provide two methods for analyzing and formatting DateTime.
 * format(pattern): used to convert a DateTime value to a corresponding String with pattern provided.
 * parse(str, pattern): used to convert a String with pattern provided to a corresponding DateTime
 *  
 */

public class DateParseFormatExample {
	public static void main(String[] args) {
		 
        // Format LocalDate examples
        LocalDate date = LocalDate.now();
        System.out.println("Default format of LocalDate = " + date);
        System.out.println(date.format(DateTimeFormatter.ofPattern("d::MMM::yyyy")));
        System.out.println(date.format(DateTimeFormatter.BASIC_ISO_DATE));
 
        // Format LocalDateTime examples
        LocalDateTime dateTime = LocalDateTime.now();
        System.out.println("\nDefault format of LocalDateTime = " + dateTime);
        System.out.println(dateTime.format(DateTimeFormatter.ofPattern("d::MMM::yyyy HH::mm::ss")));
        System.out.println(dateTime.format(DateTimeFormatter.BASIC_ISO_DATE));
 
        // Format Instant Example
        Instant timestamp = Instant.now();
        System.out.println("\nDefault format of Instant = " + timestamp);
 
        // Parse examples
        LocalDateTime dt = LocalDateTime.parse("27::Apr::2014 21::39::48",
                DateTimeFormatter.ofPattern("d::MMM::yyyy HH::mm::ss"));
        System.out.println("\nDefault format after parsing = " + dt);
    }
}
