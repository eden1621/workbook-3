package com.pluralsight;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Mod03 {
    public static void main(String[] args) {
        // Get current date and time
        LocalDateTime now = LocalDateTime.now();

        // Format 1: MM/dd/yyyy
        DateTimeFormatter format1 = DateTimeFormatter.ofPattern("MM/dd/yyyy");
        System.out.println(now.format(format1));

        // Format 2: yyyy-MM-dd
        DateTimeFormatter format2 = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        System.out.println(now.format(format2));

        // Format 3: MMMM d, yyyy
        DateTimeFormatter format3 = DateTimeFormatter.ofPattern("MMMM d, yyyy");
        System.out.println(now.format(format3));

        // Format 4: EEEE, MMM d, yyyy
        DateTimeFormatter format4 = DateTimeFormatter.ofPattern("EEEE, MMM d, yyyy");
        System.out.println(now.format(format4));




    }
}
