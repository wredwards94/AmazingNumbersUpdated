public class NumsAndProps {
    static String determineEven(String[] multiNums) {
        return (Long.parseLong(multiNums[0]) % 2 == 0 && Long.parseLong(multiNums[0]) >= 1) ? "even, " : "";

    }

    static String determineOdd(String[] multiNums) {
        return (Long.parseLong(multiNums[0]) % 2 != 0 && Long.parseLong(multiNums[0]) >= 1) ? "odd, " : "";
    }

    static String determineBuzz(String[] multiNums) {
        return (Long.parseLong(multiNums[0]) % 7 == 0 || Long.parseLong(multiNums[0]) % 10 == 7) ? "buzz, " : "";
    }

    static String determineDuck(String[] multiNums) {
        return (multiNums[0].contains("0") && !multiNums[0].startsWith("0")) ? "duck, " : "";
    }

    static String determinePalindromic(String[] multiNums) {
        String revString = new StringBuilder(multiNums[0]).reverse().toString();

        return revString.equals(multiNums[0]) ? "palindromic, " : "";
    }

    static String determineGapful(String[] multiNums) {

        return(multiNums[0].length() > 2 && Long.parseLong(multiNums[0]) % Long.parseLong(String.valueOf(multiNums[0].charAt(0)) + multiNums[0].charAt(multiNums[0].length() - 1)) == 0) ? "gapful, ": "";
    }

    static String determineSpy(String[] multiNums) {
        long sumNum = 0;
        long productNum = 1;
        for (int i = 0; i < multiNums[0].length(); i++) sumNum += Long.parseLong(String.valueOf(multiNums[0].charAt(i)));
        for (int j = 0; j < multiNums[0].length(); j++) productNum *= Long.parseLong(String.valueOf(multiNums[0].charAt(j)));
        return (sumNum == productNum) ? "spy, " : "";
    }

    static String determineSunny(String[] multiNums) {
        return (Math.sqrt(Long.parseLong(multiNums[0]) + 1) % 1 == 0) ? "sunny, " : "";
    }

    static String determineSquare(String[] multiNums) {
        return (Math.sqrt(Long.parseLong(multiNums[0])) % 1 == 0) ? "square, " : "";
    }

    static String determineJumping (String[] multiNums) {
        String jumpingNum = "";
        int i = 0;
        int j = 1;
        while (j <= multiNums[0].length() - 1) {
            if (Math.abs(Long.parseLong(String.valueOf(multiNums[0].charAt(i) -
                    multiNums[0].charAt(j)))) == 1) {
                jumpingNum = "jumping, ";
                i++;
                j++;
            } else {
                jumpingNum = "";
                break;
            }
        }
        return jumpingNum;
    }

    static void stringCompare(String[] twoProps) {

        if(!twoProps[2].equalsIgnoreCase(Properties.EVEN.properties) && !twoProps[2].equalsIgnoreCase(Properties.ODD.properties) &&
                !twoProps[2].equalsIgnoreCase(Properties.BUZZ.properties) && !twoProps[2].equalsIgnoreCase(Properties.DUCK.properties) &&
                !twoProps[2].equalsIgnoreCase(Properties.PALINDROMIC.properties) && !twoProps[2].equalsIgnoreCase(Properties.GAPFUL.properties) &&
                !twoProps[2].equalsIgnoreCase(Properties.SPY.properties) && !twoProps[2].equalsIgnoreCase(Properties.SQUARE.properties) &&
                !twoProps[2].equalsIgnoreCase(Properties.SUNNY.properties)
                && !twoProps[3].equalsIgnoreCase(Properties.EVEN.properties) && !twoProps[3].equalsIgnoreCase(Properties.ODD.properties) &&
                !twoProps[3].equalsIgnoreCase(Properties.BUZZ.properties) && !twoProps[3].equalsIgnoreCase(Properties.DUCK.properties) &&
                !twoProps[3].equalsIgnoreCase(Properties.PALINDROMIC.properties) && !twoProps[3].equalsIgnoreCase(Properties.GAPFUL.properties) &&
                !twoProps[3].equalsIgnoreCase(Properties.SPY.properties) && !twoProps[3].equalsIgnoreCase(Properties.SQUARE.properties) &&
                !twoProps[3].equalsIgnoreCase(Properties.SUNNY.properties)) {
            System.out.println("\nThe properties [" + twoProps[2].toUpperCase() +", " + twoProps[3].toUpperCase() + "] are wrong.");
            System.out.println("Available properties: [BUZZ, DUCK, PALINDROMIC, GAPFUL, SPY, SQUARE, SUNNY, JUMPING, EVEN, ODD]");
        } else if (!twoProps[2].equalsIgnoreCase(Properties.EVEN.properties) && !twoProps[2].equalsIgnoreCase(Properties.ODD.properties) &&
                !twoProps[2].equalsIgnoreCase(Properties.BUZZ.properties) && !twoProps[2].equalsIgnoreCase(Properties.DUCK.properties) &&
                !twoProps[2].equalsIgnoreCase(Properties.PALINDROMIC.properties) && !twoProps[2].equalsIgnoreCase(Properties.GAPFUL.properties) &&
                !twoProps[2].equalsIgnoreCase(Properties.SPY.properties) && !twoProps[2].equalsIgnoreCase(Properties.SQUARE.properties) &&
                !twoProps[2].equalsIgnoreCase(Properties.SUNNY.properties)) {
            System.out.println("\nThe property [" + twoProps[2].toUpperCase() + "] is wrong.");
            System.out.println("Available properties: [BUZZ, DUCK, PALINDROMIC, GAPFUL, SPY, SQUARE, SUNNY, JUMPING, EVEN, ODD]");
        } else if (!twoProps[3].equalsIgnoreCase(Properties.EVEN.properties) && !twoProps[3].equalsIgnoreCase(Properties.ODD.properties) &&
                !twoProps[3].equalsIgnoreCase(Properties.BUZZ.properties) && !twoProps[3].equalsIgnoreCase(Properties.DUCK.properties) &&
                !twoProps[3].equalsIgnoreCase(Properties.PALINDROMIC.properties) && !twoProps[3].equalsIgnoreCase(Properties.GAPFUL.properties) &&
                !twoProps[3].equalsIgnoreCase(Properties.SPY.properties) && !twoProps[3].equalsIgnoreCase(Properties.SQUARE.properties) &&
                !twoProps[3].equalsIgnoreCase(Properties.SUNNY.properties)){
            System.out.println("\nThe property [" + twoProps[3].toUpperCase() + "] is wrong.");
            System.out.println("Available properties: [BUZZ, DUCK, PALINDROMIC, GAPFUL, SPY, SQUARE, SUNNY, JUMPING, EVEN, ODD]");
        } else {
            mutuallyExclusive(twoProps[2], twoProps[3]);
        }
    }

    static void mutuallyExclusive(String first, String second) {
        String masterKey = first.toUpperCase() + second.toUpperCase();

        if (masterKey.contains("EVEN") && masterKey.contains("ODD")) {
            System.out.println("\nThe request contains mutually exclusive properties: [" + first.toUpperCase() + ", " +
                    second.toUpperCase() + "]\n" + "There are no numbers with these properties.");
        } else if (masterKey.contains("DUCK") && masterKey.contains("SPY")) {
            System.out.println("\nThe request contains mutually exclusive properties: [" + first.toUpperCase() + ", " +
                    second.toUpperCase() + "]\n" + "There are no numbers with these properties.");
        } else if (masterKey.contains("SUNNY") && masterKey.contains("SQUARE")) {
            System.out.println("\nThe request contains mutually exclusive properties: [" + first.toUpperCase() + ", " +
                    second.toUpperCase() + "]\n" + "There are no numbers with these properties.");
        }
    }

}