package main.com.trakHive.utils;
import java.time.DateTimeException;
import java.time.LocalDate;
import java.time.Year;
import java.time.format.DateTimeParseException;

public class InputValidator {
    public static boolean isValidYear(int year) {
        return year > 0 && year <= Year.now().getValue();
    }
    public static boolean isNonEmpty(String input) {
        return input != null && !input.trim().isEmpty();
    }
    public static boolean isValidEmail(String email) {
        //TODO
    }
    public static boolean isValidRating(double rating, double min, double max) {
        return rating >= min && rating <= max;
    }
    public static boolean isValidDate(String dateStr) {
        try {
            LocalDate.parse(dateStr);
            return true;
        } catch (DateTimeParseException e) {
            return false;
        }
    }
    public static boolean isValidLength(String str, int minLengh, int maxLength) {
        return str != null && str.length() >= minLengh && str.length() <= maxLength;
    }
    public static boolean isValidBoolean(String str) {
        return "true".equalsIgnoreCase(str) || "false".equalsIgnoreCase(str);
    }

}
