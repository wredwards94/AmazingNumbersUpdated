import java.util.Scanner;

public class NumMenu extends NumberFormatException{
    static void numMenu(Scanner scanner) {
        String parameters = "";
        System.out.println("""
                \nSupported requests:
                - enter a natural number to know its properties;
                  * Ex: 4
                - enter two natural numbers to obtain the properties of the list:
                  * the first parameter represents a starting number; Ex 45
                  * the second parameter shows how many consecutive numbers are to be printed;
                  * Ex: 34 6
                - two natural numbers and a property or with two properties to search for;
                  * separate the parameters with one space;
                  * Ex: 34 5 even or 456 4 spy duck
                - enter back for main menu.""");

        do {
            // loops until user enters a positive number or 0
            try {
                System.out.print("\nEnter a request or 'back' for main menu: ");
                parameters = scanner.nextLine();

                if(parameters.contains(" ")) {
                    String[] multiNums = parameters.split(" ");
                    if (multiNums.length == 4) {
                        TwoNumsTwoProps.twoNumsTwoProps(multiNums);
                    } else if (multiNums.length == 3) {
                        TwoNumsOneProp.twoNumsOneProp(multiNums);
                    } else if (multiNums.length == 2) {
                        TwoNums.twoNums(multiNums);
                    }
                } else if (!parameters.equalsIgnoreCase("back")) {
                    SingleNum.singleNum(parameters);
                }
            }catch (Exception e) {
                System.out.println("\nPlease enter parameters in the correct format: '45', '34 6', '34 5 even', or '456 4 spy duck' ");
            }
        } while (!parameters.equals("back"));
    }
}
