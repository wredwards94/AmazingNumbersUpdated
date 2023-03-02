import java.util.Scanner;

public class NumMenu {
    protected static void numMenu(Scanner scanner) {
        String parameters;
        System.out.println("""
                \nSupported requests:
                - enter a natural number to know its properties;
                  * Ex: 4
                - enter two natural numbers to obtain the properties of the list:
                  * the first parameter represents a starting number;
                  * the second parameter shows how many consecutive numbers are to be printed;
                  * Ex: 34 6
                - two natural numbers and a property or with two properties to search for;
                  * separate the parameters with one space;
                  * Ex: 34 5 even or 456 4 spy duck
                - enter back for main menu.""");

        do {
            // loops until user enters a positive number or 0
            System.out.print("\nEnter a request: ");
            parameters = scanner.nextLine();

            if(parameters.contains(" ")) {
                String[] multiNums = parameters.split(" ");
                if (multiNums.length == 4) {
                    //TwoNumsAndTwoProps(parameters);
                    System.out.println("2 nums 2 props");
                } else if (multiNums.length == 3) {
                    //TwoNumsAndProp(parameters);
                    System.out.println("2 nums 1 prop");
                } else if (multiNums.length == 2) {
                    //twoNums(parameters);
                    System.out.println("2 nums");
                }
            } else if (!parameters.equalsIgnoreCase("back")) {
                System.out.println("single num");
                SingleNum.singleNum(parameters);
            }
        } while (!parameters.equals("back")) ;
    }
}
