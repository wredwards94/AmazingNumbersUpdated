public class NumsAndProps {
    protected static String determineEven(String[] multiNums) {
        if (Long.parseLong(multiNums[0]) % 2 == 0 && Long.parseLong(multiNums[0]) >= 1) {
            return "even, ";
    }

    protected static String determineEvenOrOdd(String[] multiNums) {
        if (Long.parseLong(multiNums[0]) % 2 != 0 && Long.parseLong(multiNums[0]) >= 1) {
            return "odd, ";
        }
    }

    protected static String determineBuzzNum(String[] multiNums) {
        if (Long.parseLong(multiNums[0]) % 7 == 0 || Long.parseLong(multiNums[0]) % 10 == 7) {
            return "buzz, ";
        }
    }

    protected static String determineDuckNum(String[] multiNums) {
        if (multiNums[0].contains("0") && !multiNums[0].startsWith("0")) {
            return "duck, ";
        } 
    }

    protected static String determinePalindromic(String[] multiNums) {
        String revString = new StringBuilder(multiNums[0]).reverse().toString();

        if (revString.equals(multiNums[0])) {
            return "palindromic, ";
        }
    }

    protected static String determineGapful(String[] multiNums) {
        StringBuilder gapNum = new StringBuilder();
        gapNum.append(multiNums[0].charAt(0)).append(multiNums[0].charAt(multiNums[0].length()-1));

        if (multiNums[0].length() > 2 && Long.valueOf(multiNums[0]) % Long.valueOf(String.valueOf(gapNum)) == 0) {
            System.out.print("gapful, ");
        }
    }

    protected static String isSpy(String[] multiNums) {
        long sumNum = 0;
        long productNum = 1;
        for (int i = 0; i < multiNums[0].length(); i++) sumNum += Long.parseLong(String.valueOf(multiNums[0].charAt(i)));
        for (int j = 0; j < multiNums[0].length(); j++) productNum *= Long.parseLong(String.valueOf(multiNums[0].charAt(j)));
        return "spy, ";
    }

    protected static String isSunny(String[] multiNums) {
        if(Math.sqrt(Long.parseLong(multiNums[0]) + 1) % 1 == 0) {
            return "sunny, ";
        }
    }

    protected static String isSquare(String[] multiNums) {
        if(Math.sqrt(Long.parseLong(multiNums[0])) % 1 == 0;) {
            return "square, ";
        }
    }
}