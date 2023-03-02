import java.util.Scanner;

public class PropertyInfo {
    protected static void propInfo(Scanner scanner) {
        String input;
        do {
            System.out.println("\nPlease enter a valid property for more information or 'back' for main menu:");
            System.out.println("Available properties: [EVEN, ODD, BUZZ, DUCK, PALINDROMIC, GAPFUL, SPY, SQUARE, SUNNY]");
            input = scanner.nextLine();

          switch(input.toUpperCase()) {
            case "EVEN" -> System.out.println("\nEven numbers are numbers that end with 0, 2, 4, 6, or 8");
            case "ODD" -> System.out.println("\nOdd numbers are numbers that end with 1, 3, 5, 7, or 9");
            case "BUZZ" -> {
              System.out.println("\nBuzz numbers are numbers that are either divisible by 7 or end with 7.");
              System.out.println("For example, the number 14 is a buzz number, since it is divisible by 7 without a remainder; the number 17 ends with 7, so it is also a buzz number");
            }
            case "DUCK" -> System.out.println("\nDuck numbers are positive numbers that contains zeroes. For example: 3210, 8050896, 70709 are Duck numbers.");
            case "PALINDROMIC" -> System.out.println("\nPalindromic numbers are numbers that are symmetrical. For example: 17371 is a palindromic number. Single digits are also palindromic. Example: 5.");
            case "GAPFUL" -> {
                System.out.println("\nGapful numbers are numbers that contains at least 3 digits and is divisible by the concatenation of its first and last digit without a remainder.");
                System.out.println("132 is a Gapful number, as 132 % 12 == 0. Another good example of a Gapful number is 7881, as 7881 % 71 == 0.");
            }
            case "SPY" -> System.out.println("\nSpy numbers are numbers that the sum of all digits is equal to the product of all digits. " +
                      "For example: 123. 1 + 2 + 3 = 6 & 1 * 2 * 3 = 6 so therefore 123 is a spy number");
            case "SUNNY" -> System.out.println("\nSunny numbers are numbers that needed +1 added to them to make a perfect square. " + "" +
                        "For example: 8 is a sunny number because you can add 1 to it to make 9 which is a perfect square.");
            case "SQUARE" -> System.out.println("\nSquare numbers are numbers that are perfect squares. " +
                        "For example: 9 is a square number, since it equals 32 and can be written as 3×3.");
          }
        }while (!input.equalsIgnoreCase("back"));
    }
}
