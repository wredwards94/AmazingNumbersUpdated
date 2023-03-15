public class SingleNum {
    static void singleNum(String num) {
        if (!num.contains(" ") && num.equals("exit") || Long.parseLong(num) < 0) {
            System.out.println("\nThe first parameter should be a natural number or zero.");
        } else if (!num.equals("0") && Long.parseLong(num) > 0) {
            System.out.println("\nProperties of " + num
                    + "\n\t\teven: " + isEven(num)
                    + "\n\t\todd: " + isOdd(num)
                    + "\n\t\tbuzz: " + isBuzz(num)
                    + "\n\t\tduck: " + isDuck(num)
                    + "\n\t\tpalindromic: " + isPalindromic(num)
                    + "\n\t\tgapful: " + isGapful(num)
                    + "\n\t\tspy: " + isSpy(num)
                    + "\n\t\tsunny: " + isSunny(num)
                    + "\n\t\tsquare: " + isSquare(num)
                    + "\n\t\tjumping: " + isJumping(num));
        }
    }
    static boolean isEven(String num) {
        // method with only one parameter
        return (Long.parseLong(num) % 2 == 0);
    }
    static boolean isOdd(String num) {
        return (Long.parseLong(num) % 2 != 0);
    }

    static boolean isBuzz(String num) {
        return (Long.parseLong(num) % 7 == 0 || Long.parseLong(num) % 10 == 7);
    }

    static boolean isDuck(String num) {
        return num.contains("0") && !num.startsWith("0");
    }
    static boolean isPalindromic(String num) {
        String revString = new StringBuilder(num).reverse().toString();
        return revString.equals(num);
    }

    static boolean isGapful(String num) {
        return num.length() > 2 && Long.parseLong(num) % Long.parseLong(String.valueOf(num.charAt(0)) + num.charAt(num.length() - 1)) == 0;
    }

    static boolean isSpy(String num) {
        long sumNum = 0;
        long productNum = 1;
        for (int i = 0; i < num.length(); i++) sumNum += Long.parseLong(String.valueOf(num.charAt(i)));
        for (int j = 0; j < num.length(); j++) productNum *= Long.parseLong(String.valueOf(num.charAt(j)));
        return sumNum == productNum;
    }

    static boolean isSunny(String num) {
        return Math.sqrt(Long.parseLong(num) + 1) % 1 == 0;
    }

    static boolean isSquare(String num) {
        return Math.sqrt(Long.parseLong(num)) % 1 == 0;
    }

    static boolean isJumping(String num) {
        int i = 0;
        int j = 1;
        boolean jumpingNum = false;
        while (j <= num.length() - 1) {
            if (Math.abs(Long.parseLong(String.valueOf(num.charAt(i) - num.charAt(j)))) == 1) {
                jumpingNum = true;
                i++;
                j++;
            } else {
                jumpingNum = false;
                break;
            }
        }
        return jumpingNum;
    }
}