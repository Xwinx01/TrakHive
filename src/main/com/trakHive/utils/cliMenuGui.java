package main.com.trakHive.utils;
import java.util.ArrayList;
import java.util.Arrays;

public class cliMenuGui {

    public static void printMenu() {
        ArrayList<String> propertiesMovie = new ArrayList<>(Arrays.asList("Title", "Director", "Year", "Genre", "Status", "Review"));
        for (String properties : propertiesMovie) {
            System.out.println(properties);

        }

    }

    public static void main(String[] args) {
        printMenu();
    }

}
