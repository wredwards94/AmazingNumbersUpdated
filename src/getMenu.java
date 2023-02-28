import java.util.Scanner;

public class getMenu {
    protected static void menu() {
        Scanner scanner = new Scanner(System.in);
        String input;
        /*System.out.println("""
                Supported requests:
                - enter a natural number to know its properties;
                - enter two natural numbers to obtain the properties of the list:
                  * the first parameter represents a starting number;
                  * the second parameter shows how many consecutive numbers are to be printed;
                - two natural numbers and a property to search for;
                - separate the parameters with one space;
                - enter 0 to exit.""");*/
        do {
            System.out.println("\nEnter 'properties' for property info or 'numbers' to gather their properties:");
            input = scanner.nextLine();
            if (input.equalsIgnoreCase("properties")) {
                PropertyInfo.propInfo(scanner);
            }
        } while (!input.equalsIgnoreCase("exit"));
        scanner.close();
    }
}
