import java.util.Scanner;

public class PropertyInfo {
    protected static void propInfo(Scanner scanner) {
        String input;
        do {
            System.out.println("");
            System.out.println("Please enter a valid property for more information or 'back' for main menu:");
          System.out.println("Available properties: [EVEN, ODD, BUZZ, DUCK, PALINDROMIC, GAPFUL, SPY, SQUARE, SUNNY]");
            input = scanner.nextLine();
        }while (!input.equalsIgnoreCase("back"));
    }
}
