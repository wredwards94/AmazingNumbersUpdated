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

    protected static boolean determineEvenOrOdd(String num) {
        // method with only one parameter
        long num1 = Long.parseLong(num);
        boolean even = false;
        boolean odd = false;
        if (num1 % 2 == 0 && num1 >= 1) {
            //System.out.println("This number is Even.");
            even = true;
            System.out.println("\t\teven: " + even);
            System.out.println("\t\todd: " + odd);
        } else if (num1 % 2 != 0 && num1 >= 1) {
            //System.out.println("This number is Odd.");
            odd = true;
            System.out.println("\t\teven: " + even);
            System.out.println("\t\todd: " + odd);
        }
}