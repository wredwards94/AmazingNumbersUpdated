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

        return revString.equals(multiNums[0]) ? "palindromic" : "";
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
}