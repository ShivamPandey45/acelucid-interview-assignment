package org.example;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.ArrayList;
import java.util.List;

public class DateExtractor {
    public static void main(String[] args) {


        String text = "Hdjsh hfsjoj  12162002 how to connect with the databases";
        List<String> dates = findDates(text);
        System.out.println(dates);
    }

    public static List<String> findDates(String text) {
        List<String> dates = new ArrayList<>();
        // Regular expression to find dates in MMDDYYYY format
        String datePattern = "\\b(0[1-9]|1[0-2])(0[1-9]|[12][0-9]|3[01])\\d{4}\\b";
        Pattern pattern = Pattern.compile(datePattern);
        Matcher matcher = pattern.matcher(text);

        while (matcher.find()) {
            dates.add(matcher.group());
        }
        return dates;
    }
}
