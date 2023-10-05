package Task_02;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Cafe {
    public ArrayList<String> coffeeMenu;

    public Cafe() {
        coffeeMenu = new ArrayList<>();
    }

    public void loadMenuData() {
        File file = new File("coffees.txt");
        try {
            Scanner scanner = new Scanner(file);
            while (scanner.hasNextLine()) {
                String input = scanner.nextLine();
                coffeeMenu.add(input);
                // coffeeMenu.add(scanner.nextLine()); En anden måde at skrive det på.
            }

        } catch (FileNotFoundException e) {
            System.out.println("Something went wrong! The file is not found");
        }
    }
}
