public class SingleNum {
    protected static void singleNum(String num) {
        if (!num.contains(" ") && num.equals("exit") || Long.parseLong(num) < 0) {
            System.out.println("\nThe first parameter should be a natural number or zero.");
        } else if (!num.equals("0") && Long.parseLong(num) > 0) {
            System.out.println("\nProperties of " + num);
            /*determineEvenOrOdd(num);
            determineBuzzNum(num);
            determineDuckNum(num);
            determinePalindromic(num);
            determineGapful(num);
            determineSpyNum(num);
            determineSunnySquare(num);*/
        }
    }
}