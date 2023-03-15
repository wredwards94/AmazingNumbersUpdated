public class TwoNumsOneProp {
    static void twoNumsOneProp(String[] oneProp) {
        //String[] oneProp = num.split(" ");
        int counter = 0;

        switch (oneProp[2].toUpperCase()) {
            case "EVEN" -> {
                while (counter < Long.parseLong(oneProp[1])) {
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
                        System.out.print(NumsAndProps.determineJumping(oneProp));
                        counter++;
                    }
                    oneProp[0] = String.valueOf(Long.parseLong(oneProp[0]) + 1);
                }
                System.out.println();
            }
            case "ODD" -> {
                while (counter < Long.parseLong(oneProp[1])) {
                    if (SingleNum.isOdd(oneProp[0])) {
                        System.out.print("\n" + oneProp[0] + " is ");
                        System.out.print(NumsAndProps.determineOdd(oneProp));
                        System.out.print(NumsAndProps.determineEven(oneProp));
                        System.out.print(NumsAndProps.determineBuzz(oneProp));
                        System.out.print(NumsAndProps.determineDuck(oneProp));
                        System.out.print(NumsAndProps.determinePalindromic(oneProp));
                        System.out.print(NumsAndProps.determineGapful(oneProp));
                        System.out.print(NumsAndProps.determineSpy(oneProp));
                        System.out.print(NumsAndProps.determineSunny(oneProp));
                        System.out.print(NumsAndProps.determineSquare(oneProp));
                        System.out.print(NumsAndProps.determineJumping(oneProp));
                        counter++;
                    }
                    oneProp[0] = String.valueOf(Long.parseLong(oneProp[0]) + 1);
                }
                System.out.println();
            }
            case "BUZZ" -> {
                while (counter < Long.parseLong(oneProp[1])) {
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
                        System.out.print(NumsAndProps.determineJumping(oneProp));
                        counter++;
                    }
                    oneProp[0] = String.valueOf(Long.parseLong(oneProp[0]) + 1);
                }
                System.out.println();
            }
            case "DUCK" -> {
                while (counter < Long.parseLong(oneProp[1])) {
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
                        System.out.print(NumsAndProps.determineJumping(oneProp));
                        counter++;
                    }
                    oneProp[0] = String.valueOf(Long.parseLong(oneProp[0]) + 1);
                }
                System.out.println();
            }
            case "PALINDROMIC" -> {
                while (counter < Long.parseLong(oneProp[1])) {
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
                        System.out.print(NumsAndProps.determineJumping(oneProp));
                        counter++;
                    }
                    oneProp[0] = String.valueOf(Long.parseLong(oneProp[0]) + 1);
                }
                System.out.println();
            }
            case "GAPFUL" -> {
                while (counter < Long.parseLong(oneProp[1])) {
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
                        System.out.print(NumsAndProps.determineJumping(oneProp));
                        counter++;
                    }
                    oneProp[0] = String.valueOf(Long.parseLong(oneProp[0]) + 1);
                }
                System.out.println();
            }
            case "SPY" -> {
                while (counter < Long.parseLong(oneProp[1])) {
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
                        System.out.print(NumsAndProps.determineJumping(oneProp));
                        counter++;
                    }
                    oneProp[0] = String.valueOf(Long.parseLong(oneProp[0]) + 1);
                }
                System.out.println();
            }
            case "SQUARE" -> {
                while (counter < Long.parseLong(oneProp[1])) {
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
                        System.out.print(NumsAndProps.determineJumping(oneProp));
                        counter++;
                    }
                    oneProp[0] = String.valueOf(Long.parseLong(oneProp[0]) + 1);
                }
                System.out.println();
            }
            case "SUNNY" -> {
                while (counter < Long.parseLong(oneProp[1])) {
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
                        System.out.print(NumsAndProps.determineJumping(oneProp));
                        counter++;
                    }
                    oneProp[0] = String.valueOf(Long.parseLong(oneProp[0]) + 1);
                }
                System.out.println();
            }
            case "JUMPING" -> {
                while (counter < Long.parseLong(oneProp[1])) {
                    if (SingleNum.isJumping(oneProp[0])) {
                        System.out.print("\n" + oneProp[0] + " is ");
                        System.out.print(NumsAndProps.determineJumping(oneProp));
                        System.out.print(NumsAndProps.determineEven(oneProp));
                        System.out.print(NumsAndProps.determineOdd(oneProp));
                        System.out.print(NumsAndProps.determineBuzz(oneProp));
                        System.out.print(NumsAndProps.determineDuck(oneProp));
                        System.out.print(NumsAndProps.determinePalindromic(oneProp));
                        System.out.print(NumsAndProps.determineGapful(oneProp));
                        System.out.print(NumsAndProps.determineSpy(oneProp));
                        System.out.print(NumsAndProps.determineSunny(oneProp));
                        System.out.print(NumsAndProps.determineSquare(oneProp));
                        counter++;
                    }
                    oneProp[0] = String.valueOf(Long.parseLong(oneProp[0]) + 1);
                }
                System.out.println();
            }
            default -> {
                System.out.println("\nThe property [" + oneProp[2].toUpperCase() + "] is wrong.");
                System.out.println("Available properties: [BUZZ, DUCK, PALINDROMIC, GAPFUL, SPY, SQUARE, SUNNY, JUMPING, EVEN, ODD]");
            }
        }
    }
}
