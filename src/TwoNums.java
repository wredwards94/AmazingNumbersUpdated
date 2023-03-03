public class TwoNums {
    static void twoNums(String parameters) {
        String[] multiNums = parameters.split(" ");
        if (multiNums[0].equals("exit") || Long.parseLong(multiNums[0]) < 0) {
            System.out.println("\nThe first parameter should be a natural number or zero.");
        } else if (multiNums[1].equals("exit") || Long.parseLong(multiNums[1]) <= 0) {
            System.out.println("\nThe second parameter should be a natural number.");
        } else if (!multiNums[0].equals("exit") || Long.parseLong(multiNums[0]) > 0) {
            for (int i = 0; i < Long.parseLong(multiNums[1]); i++) {
                System.out.print("\n" + multiNums[0] + " is ");
                NumsAndProps.determineEven(multiNums);
                NumsAndProps.determineOdd(multiNums);
                NumsAndProps.determineBuzz(multiNums);
                NumsAndProps.determineDuck(multiNums);
                NumsAndProps.determinePalindromic(multiNums);
                NumsAndProps.determineGapful(multiNums);
                NumsAndProps.determineSpy(multiNums);
                NumsAndProps.determineSunny(multiNums);
                NumsAndProps.determineSquare(multiNums);
                multiNums[0] = String.valueOf(Long.parseLong(multiNums[0])+ 1);
            }
            System.out.println();
        }
    }
}
