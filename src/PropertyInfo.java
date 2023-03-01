import java.util.Scanner;

public class PropertyInfo {
    protected static void propInfo(Scanner scanner) {
        String input;
        do {
            System.out.println("");
            System.out.println("Please enter a valid property for more information or 'back' for main menu:");
          System.out.println("Available properties: [EVEN, ODD, BUZZ, DUCK, PALINDROMIC, GAPFUL, SPY, SQUARE, SUNNY]");
            input = scanner.nextLine();

          switch(input.toUpperCase()) {
            case "EVEN" -> {
              System.out.println("\nEven numbers are numbers that end with 0, 2, 4, 6, or 8");
            }
            case "ODD" -> {
              System.out.println("\nOdd numbers are numbers that end with 1, 3, 5, 7, or 9");
            }
            case "BUZZ" -> {
              System.out.println("Buzz numbers are numbers that are either divisible by 7 or end with 7.");
              System.out.println("For example, the number 14 is a buzz number, since it is divisible by 7 without a remainder; the number 17 ends with 7, so it is also a buzz number");
            }
            case "DUCK" -> {
              System.out.println("\nDuck numbers are positive numbers that contains zeroes. For example: 3210, 8050896, 70709 are Duck numbers.");
            }
            case "PALINDROMIC" -> {
              System.out.println("\nPalindromic numbers are numbers that are symmetrical. For example: 17371 is a palindromic number. Single digits are also palindromic. Example: 5.");
            }
          }
        }while (!input.equalsIgnoreCase("back"));
    }
}
