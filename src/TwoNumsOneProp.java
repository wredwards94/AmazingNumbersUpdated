public class TwoNumsOneProp {
    static void twoNumsOneProp(String[] oneProp) {
        NumMenu.COUNTER = 0;

        if (Long.parseLong(oneProp[0]) < 0) {
            System.out.println("\nThe first parameter should be a natural number.");
        } else if (Long.parseLong(oneProp[1]) <= 0) {
            System.out.println("\nThe second parameter should be a natural number.");
        } else {
            switch (oneProp[2].toUpperCase()) {
            case "EVEN" -> {
                while (NumMenu.COUNTER < Long.parseLong(oneProp[1])) {
                    if (SingleNum.isEven(oneProp[0])) {
                        System.out.print("\n" + oneProp[0] + " is ");
                        System.out.print(NumsAndProps.determineEven(oneProp));
                        System.out.print(NumsAndProps.determineOdd(oneProp));
                        System.out.print(NumsAndProps.determineBuzz(oneProp));
                        System.out.print(NumsAndProps.determineDuck(oneProp));
                        System.out.print(NumsAndProps.determinePalindromic(oneProp));
                        System.out.print(NumsAndProps.determineGapful(oneProp));
                        System.out.print(NumsAndProps.determineSpy(oneProp));
                        System.out.print(NumsAndProps.determineSunny(oneProp));
                        System.out.print(NumsAndProps.determineSquare(oneProp));
                        NumMenu.COUNTER++;
                    }
                    oneProp[0] = String.valueOf(Long.parseLong(oneProp[0]) + 1);
                }
                System.out.println();
            }
            case "ODD" -> {
                while (NumMenu.COUNTER < Long.parseLong(oneProp[1])) {
                    if (SingleNum.isOdd(oneProp[0])) {
                        System.out.print("\n" + oneProp[0] + " is ");
                        System.out.print(NumsAndProps.determineOdd(oneProp));
                        System.out.print(NumsAndProps.determineBuzz(oneProp));
                        System.out.print(NumsAndProps.determineDuck(oneProp));
                        System.out.print(NumsAndProps.determinePalindromic(oneProp));
                        System.out.print(NumsAndProps.determineGapful(oneProp));
                        System.out.print(NumsAndProps.determineSpy(oneProp));
                        System.out.print(NumsAndProps.determineSunny(oneProp));
                        System.out.print(NumsAndProps.determineSquare(oneProp));
                        NumMenu.COUNTER++;
                    }
                    oneProp[0] = String.valueOf(Long.parseLong(oneProp[0]) + 1);
                }
                System.out.println();
            }
            case "BUZZ" -> {
                while (NumMenu.COUNTER < Long.parseLong(oneProp[1])) {
                    if (SingleNum.isBuzz(oneProp[0])) {
                        System.out.print("\n" + oneProp[0] + " is ");
                        System.out.print(NumsAndProps.determineBuzz(oneProp));
                        System.out.print(NumsAndProps.determineEven(oneProp));
                        System.out.print(NumsAndProps.determineOdd(oneProp));
                        System.out.print(NumsAndProps.determineDuck(oneProp));
                        System.out.print(NumsAndProps.determinePalindromic(oneProp));
                        System.out.print(NumsAndProps.determineGapful(oneProp));
                        System.out.print(NumsAndProps.determineSpy(oneProp));
                        System.out.print(NumsAndProps.determineSunny(oneProp));
                        System.out.print(NumsAndProps.determineSquare(oneProp));
                        NumMenu.COUNTER++;
                    }
                    oneProp[0] = String.valueOf(Long.parseLong(oneProp[0]) + 1);
                }
                System.out.println();
            }
            case "DUCK" -> {
                while (NumMenu.COUNTER < Long.parseLong(oneProp[1])) {
                    if (SingleNum.isDuck(oneProp[0])) {
                        System.out.print("\n" + oneProp[0] + " is ");
                        System.out.print(NumsAndProps.determineDuck(oneProp));
                        System.out.print(NumsAndProps.determineEven(oneProp));
                        System.out.print(NumsAndProps.determineOdd(oneProp));
                        System.out.print(NumsAndProps.determineBuzz(oneProp));
                        System.out.print(NumsAndProps.determinePalindromic(oneProp));
                        System.out.print(NumsAndProps.determineGapful(oneProp));
                        System.out.print(NumsAndProps.determineSpy(oneProp));
                        System.out.print(NumsAndProps.determineSunny(oneProp));
                        System.out.print(NumsAndProps.determineSquare(oneProp));
                        NumMenu.COUNTER++;
                    }
                    oneProp[0] = String.valueOf(Long.parseLong(oneProp[0]) + 1);
                }
                System.out.println();
            }
            case "PALINDROMIC" -> {
                while (NumMenu.COUNTER < Long.parseLong(oneProp[1])) {
                    if (SingleNum.isPalindromic(oneProp[0])) {
                        System.out.print("\n" + oneProp[0] + " is ");
                        System.out.print(NumsAndProps.determinePalindromic(oneProp));
                        System.out.print(NumsAndProps.determineEven(oneProp));
                        System.out.print(NumsAndProps.determineOdd(oneProp));
                        System.out.print(NumsAndProps.determineBuzz(oneProp));
                        System.out.print(NumsAndProps.determineDuck(oneProp));
                        System.out.print(NumsAndProps.determineGapful(oneProp));
                        System.out.print(NumsAndProps.determineSpy(oneProp));
                        System.out.print(NumsAndProps.determineSunny(oneProp));
                        System.out.print(NumsAndProps.determineSquare(oneProp));
                        NumMenu.COUNTER++;
                    }
                    oneProp[0] = String.valueOf(Long.parseLong(oneProp[0]) + 1);
                }
                System.out.println();
            }
            case "GAPFUL" -> {
                while (NumMenu.COUNTER < Long.parseLong(oneProp[1])) {
                    if (SingleNum.isGapful(oneProp[0])) {
                        System.out.print("\n" + oneProp[0] + " is ");
                        System.out.print(NumsAndProps.determineGapful(oneProp));
                        System.out.print(NumsAndProps.determineEven(oneProp));
                        System.out.print(NumsAndProps.determineOdd(oneProp));
                        System.out.print(NumsAndProps.determineBuzz(oneProp));
                        System.out.print(NumsAndProps.determineDuck(oneProp));
                        System.out.print(NumsAndProps.determinePalindromic(oneProp));
                        System.out.print(NumsAndProps.determineSpy(oneProp));
                        System.out.print(NumsAndProps.determineSunny(oneProp));
                        System.out.print(NumsAndProps.determineSquare(oneProp));
                        NumMenu.COUNTER++;
                    }
                    oneProp[0] = String.valueOf(Long.parseLong(oneProp[0]) + 1);
                }
                System.out.println();
            }
            case "SPY" -> {
                while (NumMenu.COUNTER < Long.parseLong(oneProp[1])) {
                    if (SingleNum.isSpy(oneProp[0])) {
                        System.out.print("\n" + oneProp[0] + " is ");
                        System.out.print(NumsAndProps.determineSpy(oneProp));
                        System.out.print(NumsAndProps.determineEven(oneProp));
                        System.out.print(NumsAndProps.determineOdd(oneProp));
                        System.out.print(NumsAndProps.determineBuzz(oneProp));
                        System.out.print(NumsAndProps.determineDuck(oneProp));
                        System.out.print(NumsAndProps.determinePalindromic(oneProp));
                        System.out.print(NumsAndProps.determineGapful(oneProp));
                        System.out.print(NumsAndProps.determineSunny(oneProp));
                        System.out.print(NumsAndProps.determineSquare(oneProp));
                        NumMenu.COUNTER++;
                    }
                    oneProp[0] = String.valueOf(Long.parseLong(oneProp[0]) + 1);
                }
                System.out.println();
            }
            case "SQUARE" -> {
                while (NumMenu.COUNTER < Long.parseLong(oneProp[1])) {
                    if (SingleNum.isSquare(oneProp[0])) {
                        System.out.print("\n" + oneProp[0] + " is ");
                        System.out.print(NumsAndProps.determineSquare(oneProp));
                        System.out.print(NumsAndProps.determineEven(oneProp));
                        System.out.print(NumsAndProps.determineOdd(oneProp));
                        System.out.print(NumsAndProps.determineBuzz(oneProp));
                        System.out.print(NumsAndProps.determineDuck(oneProp));
                        System.out.print(NumsAndProps.determinePalindromic(oneProp));
                        System.out.print(NumsAndProps.determineGapful(oneProp));
                        System.out.print(NumsAndProps.determineSpy(oneProp));
                        System.out.print(NumsAndProps.determineSunny(oneProp));
                        NumMenu.COUNTER++;
                    }
                    oneProp[0] = String.valueOf(Long.parseLong(oneProp[0]) + 1);
                }
                System.out.println();
            }
            case "SUNNY" -> {
                while (NumMenu.COUNTER < Long.parseLong(oneProp[1])) {
                    if (SingleNum.isSunny(oneProp[0])) {
                        System.out.print("\n" + oneProp[0] + " is ");
                        System.out.print(NumsAndProps.determineSunny(oneProp));
                        System.out.print(NumsAndProps.determineEven(oneProp));
                        System.out.print(NumsAndProps.determineOdd(oneProp));
                        System.out.print(NumsAndProps.determineBuzz(oneProp));
                        System.out.print(NumsAndProps.determineDuck(oneProp));
                        System.out.print(NumsAndProps.determinePalindromic(oneProp));
                        System.out.print(NumsAndProps.determineGapful(oneProp));
                        System.out.print(NumsAndProps.determineSpy(oneProp));
                        System.out.print(NumsAndProps.determineSquare(oneProp));
                        NumMenu.COUNTER++;
                    }
                    oneProp[0] = String.valueOf(Long.parseLong(oneProp[0]) + 1);
                }
                System.out.println();
            }
            default -> {
                System.out.println("\nThe property [" + oneProp[2].toUpperCase() + "] is wrong.");
                System.out.println("Available properties: [BUZZ, DUCK, PALINDROMIC, GAPFUL, SPY, SQUARE, SUNNY, EVEN, ODD]");
            }
        }
        }

    }
}
