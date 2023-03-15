public class TwoNums {
    static void twoNums(String[] multiNums) {
        //String[] multiNums = parameters.split(" ");
        if (multiNums[0].equals("exit") || Long.parseLong(multiNums[0]) < 0) {
            System.out.println("\nThe first parameter should be a natural number or zero.");
        } else if (multiNums[1].equals("exit") || Long.parseLong(multiNums[1]) <= 0) {
            System.out.println("\nThe second parameter should be a natural number.");
        } else if (!multiNums[0].equals("exit") || Long.parseLong(multiNums[0]) > 0) {
            for (int i = 0; i < Long.parseLong(multiNums[1]); i++) {
                System.out.print("\n" + multiNums[0] + " is ");
                System.out.print(NumsAndProps.determineEven(multiNums));
                System.out.print(NumsAndProps.determineOdd(multiNums));
                System.out.print(NumsAndProps.determineBuzz(multiNums));
                System.out.print(NumsAndProps.determineDuck(multiNums));
                System.out.print(NumsAndProps.determinePalindromic(multiNums));
                System.out.print(NumsAndProps.determineGapful(multiNums));
                System.out.print(NumsAndProps.determineSpy(multiNums));
                System.out.print(NumsAndProps.determineSunny(multiNums));
                System.out.print(NumsAndProps.determineSquare(multiNums));
                System.out.print(NumsAndProps.determineJumping(multiNums));
                multiNums[0] = String.valueOf(Long.parseLong(multiNums[0])+ 1);
            }
            System.out.println();
        }
    }
}