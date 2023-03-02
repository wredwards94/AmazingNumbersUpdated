import java.util.Scanner;

public class GetMenu {
    protected static void menu() {
        Scanner scanner = new Scanner(System.in);
        String input;

        do {
            System.out.println("\nEnter 'properties' for property info, 'numbers' to gather their properties, or 'exit' to exit:");
            input = scanner.nextLine();
            if (input.equalsIgnoreCase("properties")) {
                PropertyInfo.propInfo(scanner);
            } else if (input.equalsIgnoreCase("numbers")) {
                NumMenu.numMenu(scanner);
            } else if (input.equalsIgnoreCase("exit")) {
                System.out.println("\nGoodbye!");
            }
        } while (!input.equalsIgnoreCase("exit"));
        scanner.close();
    }
}
