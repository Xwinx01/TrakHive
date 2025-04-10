package main.com.trakHive.utils;
import java.time.Year;

public class InputValidator {
    public static boolean isValidYear(int year) {
        return year > 0 && year <= Year.now().getValue();
    }
    public static boolean isNonEmpty(String input) {
        return input != null && !input.trim().isEmpty();
    }
    public static boolean isValidEmail(String email) {

    }
    public static boolean isValidRating(double rating, double min, double max) {
        return rating >= min && rating <= max;
    }

}
