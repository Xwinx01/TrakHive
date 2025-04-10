package main.com.trakHive.cli;
import java.util.Scanner;

public class cliMenu {
    int choice;

    public void menu(Scanner sc) {
        do {
            System.out.println("Please enter a number to proceed: ");
            System.out.println("1. View all media entries");
            System.out.println("2. Add a new media item");
            System.out.println("3. Search for a media item");
            System.out.println("4. Edit a media item");
            System.out.println("5. Delete a media item");
            System.out.println("6. Add or edit a review");
            System.out.println("7. View reviews");
            System.out.println("8. Export data (CSV/ JSON)");
            System.out.println("9. Settings / Preferences");
            System.out.println("10. Exit");
        }
        while (choice != 10);

        switch(choice) {
            case 1:

                break;
            case 2:


        }

    }


}
