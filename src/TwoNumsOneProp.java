public class TwoNumsOneProp {
    static void twoNumsOneProp(String num) {
        String[] multiNums = num.split(" ");
        int counter = 0;

        switch (multiNums[2].toUpperCase()) {
            case "EVEN" -> {
                while (counter < Long.parseLong(multiNums[1])) {
                    if (Long.parseLong(multiNums[0]) % 2 == 0 && Long.parseLong(multiNums[0]) >= 1) {
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
                        counter++;
                    }
                    multiNums[0] = String.valueOf(Long.parseLong(multiNums[0]) + 1);
                }
                System.out.println();
            }
            case "ODD" -> {
                while (counter < Long.parseLong(multiNums[1])) {
                    if (Long.parseLong(multiNums[0]) % 2 != 0 && Long.parseLong(multiNums[0]) >= 1) {
                        System.out.print("\n" + multiNums[0] + " is ");
                        System.out.print(NumsAndProps.determineOdd(multiNums));
                        System.out.print(NumsAndProps.determineEven(multiNums));
                        System.out.print(NumsAndProps.determineBuzz(multiNums));
                        System.out.print(NumsAndProps.determineDuck(multiNums));
                        System.out.print(NumsAndProps.determinePalindromic(multiNums));
                        System.out.print(NumsAndProps.determineGapful(multiNums));
                        System.out.print(NumsAndProps.determineSpy(multiNums));
                        System.out.print(NumsAndProps.determineSunny(multiNums));
                        System.out.print(NumsAndProps.determineSquare(multiNums));
                        counter++;
                    }
                    multiNums[0] = String.valueOf(Long.parseLong(multiNums[0]) + 1);
                }
                System.out.println();
            }
            case "BUZZ" -> {
                while (counter < Long.parseLong(multiNums[1])) {
                    if (Long.parseLong(multiNums[0]) % 7 == 0 || Long.parseLong(multiNums[0]) % 10 == 7) {
                        System.out.print("\n" + multiNums[0] + " is ");
                        System.out.print(NumsAndProps.determineBuzz(multiNums));
                        System.out.print(NumsAndProps.determineEven(multiNums));
                        System.out.print(NumsAndProps.determineOdd(multiNums));
                        System.out.print(NumsAndProps.determineDuck(multiNums));
                        System.out.print(NumsAndProps.determinePalindromic(multiNums));
                        System.out.print(NumsAndProps.determineGapful(multiNums));
                        System.out.print(NumsAndProps.determineSpy(multiNums));
                        System.out.print(NumsAndProps.determineSunny(multiNums));
                        System.out.print(NumsAndProps.determineSquare(multiNums));
                        counter++;
                    }
                    multiNums[0] = String.valueOf(Long.parseLong(multiNums[0]) + 1);
                }
                System.out.println();
            }
            case "DUCK" -> {
                while (counter < Long.parseLong(multiNums[1])) {
                    if (multiNums[0].contains("0") && !multiNums[0].startsWith("0")) {
                        System.out.print("\n" + multiNums[0] + " is ");
                        System.out.print(NumsAndProps.determineDuck(multiNums));
                        System.out.print(NumsAndProps.determineEven(multiNums));
                        System.out.print(NumsAndProps.determineOdd(multiNums));
                        System.out.print(NumsAndProps.determineBuzz(multiNums));
                        System.out.print(NumsAndProps.determinePalindromic(multiNums));
                        System.out.print(NumsAndProps.determineGapful(multiNums));
                        System.out.print(NumsAndProps.determineSpy(multiNums));
                        System.out.print(NumsAndProps.determineSunny(multiNums));
                        System.out.print(NumsAndProps.determineSquare(multiNums));
                        counter++;
                    }
                    multiNums[0] = String.valueOf(Long.parseLong(multiNums[0]) + 1);
                }
                System.out.println();
            }
            case "PALINDROMIC" -> {
                while (counter < Long.parseLong(multiNums[1])) {
                    String revString = new StringBuilder(multiNums[0]).reverse().toString();
                    if (revString.equals(multiNums[0])) {
                        System.out.print("\n" + multiNums[0] + " is ");
                        System.out.print(NumsAndProps.determinePalindromic(multiNums));
                        System.out.print(NumsAndProps.determineEven(multiNums));
                        System.out.print(NumsAndProps.determineOdd(multiNums));
                        System.out.print(NumsAndProps.determineBuzz(multiNums));
                        System.out.print(NumsAndProps.determineDuck(multiNums));
                        System.out.print(NumsAndProps.determineGapful(multiNums));
                        System.out.print(NumsAndProps.determineSpy(multiNums));
                        System.out.print(NumsAndProps.determineSunny(multiNums));
                        System.out.print(NumsAndProps.determineSquare(multiNums));
                    }
                    multiNums[0] = String.valueOf(Long.parseLong(multiNums[0]) + 1);
                }
                System.out.println();
            }
            case "GAPFUL" -> {
                while (counter < Long.parseLong(multiNums[1])) {
                    StringBuilder gapNum = new StringBuilder();
                    gapNum.append(multiNums[0].charAt(0)).append(multiNums[0].charAt(multiNums[0].length() - 1));
                    if (multiNums[0].length() > 2 && Long.parseLong(multiNums[0]) % Long.parseLong(String.valueOf(gapNum)) == 0) {
                        System.out.print("\n" + multiNums[0] + " is ");
                        System.out.print(NumsAndProps.determineGapful(multiNums));
                        System.out.print(NumsAndProps.determineEven(multiNums));
                        System.out.print(NumsAndProps.determineOdd(multiNums));
                        System.out.print(NumsAndProps.determineBuzz(multiNums));
                        System.out.print(NumsAndProps.determineDuck(multiNums));
                        System.out.print(NumsAndProps.determinePalindromic(multiNums));
                        System.out.print(NumsAndProps.determineSpy(multiNums));
                        System.out.print(NumsAndProps.determineSunny(multiNums));
                        System.out.print(NumsAndProps.determineSquare(multiNums));
                        counter++;
                    }
                    multiNums[0] = String.valueOf(Long.parseLong(multiNums[0]) + 1);
                }
                System.out.println();
            }
            case "SPY" -> {
                long sumNum = 0;
                long productNum = 1;
                while (counter < Long.parseLong(multiNums[1])) {

                    for (int i = 0; i < multiNums[0].length(); i++) sumNum += Long.parseLong(String.valueOf(multiNums[0].charAt(i)));
                    for (int j = 0; j < multiNums[0].length(); j++) productNum *= Long.parseLong(String.valueOf(multiNums[0].charAt(j)));

                    if (sumNum == productNum) {
                        System.out.print("\n" + multiNums[0] + " is ");
                        System.out.print(NumsAndProps.determineSpy(multiNums));
                        System.out.print(NumsAndProps.determineEven(multiNums));
                        System.out.print(NumsAndProps.determineOdd(multiNums));
                        System.out.print(NumsAndProps.determineBuzz(multiNums));
                        System.out.print(NumsAndProps.determineDuck(multiNums));
                        System.out.print(NumsAndProps.determinePalindromic(multiNums));
                        System.out.print(NumsAndProps.determineGapful(multiNums));
                        System.out.print(NumsAndProps.determineSunny(multiNums));
                        System.out.print(NumsAndProps.determineSquare(multiNums));
                        counter++;
                    }
                    multiNums[0] = String.valueOf(Long.parseLong(multiNums[0]) + 1);
                    sumNum = 0;
                    productNum = 1;
                }
                System.out.println();
            }
            case "SQUARE" -> {
                while (counter < Long.parseLong(multiNums[1])) {
                    if (Math.sqrt(Long.parseLong(multiNums[0])) % 1 == 0) {
                        System.out.print("\n" + multiNums[0] + " is ");
                        System.out.print(NumsAndProps.determineSquare(multiNums));
                        System.out.print(NumsAndProps.determineEven(multiNums));
                        System.out.print(NumsAndProps.determineOdd(multiNums));
                        System.out.print(NumsAndProps.determineBuzz(multiNums));
                        System.out.print(NumsAndProps.determineDuck(multiNums));
                        System.out.print(NumsAndProps.determinePalindromic(multiNums));
                        System.out.print(NumsAndProps.determineGapful(multiNums));
                        System.out.print(NumsAndProps.determineSpy(multiNums));
                        System.out.print(NumsAndProps.determineSunny(multiNums));
                        counter++;
                    }
                    multiNums[0] = String.valueOf(Long.parseLong(multiNums[0]) + 1);
                }
                System.out.println();
            }
            case "SUNNY" -> {
                while (counter < Long.parseLong(multiNums[1])) {
                    if (Math.sqrt(Long.parseLong(multiNums[0] + 1)) % 1 == 0) {
                        System.out.print("\n" + multiNums[0] + " is ");
                        System.out.print(NumsAndProps.determineSunny(multiNums));
                        System.out.print(NumsAndProps.determineEven(multiNums));
                        System.out.print(NumsAndProps.determineOdd(multiNums));
                        System.out.print(NumsAndProps.determineBuzz(multiNums));
                        System.out.print(NumsAndProps.determineDuck(multiNums));
                        System.out.print(NumsAndProps.determinePalindromic(multiNums));
                        System.out.print(NumsAndProps.determineGapful(multiNums));
                        System.out.print(NumsAndProps.determineSpy(multiNums));
                        System.out.print(NumsAndProps.determineSquare(multiNums));
                        counter++;
                    }
                    multiNums[0] = String.valueOf(Long.parseLong(multiNums[0]) + 1);
                }
                System.out.println();
            }
            default -> {
                System.out.println("\nThe property [" + multiNums[2].toUpperCase() + "] is wrong.");
                System.out.println("Available properties: [EVEN, ODD, BUZZ, DUCK, PALINDROMIC, GAPFUL, SPY, SQUARE, SUNNY]");
            }
        }
    }
}
