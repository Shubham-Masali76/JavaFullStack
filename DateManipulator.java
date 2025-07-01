// Create DateManipulator class to convert String to date, date to String and to find out number of days between two dates. 

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class DateManipulator {

    private final DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");

    public LocalDate stringToDate(String dateStr) {
        return LocalDate.parse(dateStr, formatter);
    }

    public String dateToString(LocalDate date) {
        return date.format(formatter);
    }

    public long daysBetween(String date1, String date2) {
        LocalDate d1 = stringToDate(date1);
        LocalDate d2 = stringToDate(date2);
        return ChronoUnit.DAYS.between(d1, d2);
    }

    public static void main(String[] args) {
        DateManipulator dm = new DateManipulator();
        System.out.println("Parsed Date: " + dm.stringToDate("2025-06-01"));
        System.out.println("Date to String: " + dm.dateToString(LocalDate.now()));
        System.out.println("Days between: " + dm.daysBetween("2025-06-01", "2025-06-30"));
    }
}
