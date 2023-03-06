public class TwoNumsTwoProps {
    static void twoNumsTwoProps(String num) {
        String[] twoProps = num.split(" ");
        int counter = 0;
        long sumNum;
        long productNum;
        String revString = new StringBuilder(twoProps[0]).reverse().toString();
        StringBuilder gapNum = new StringBuilder();

        switch (twoProps[2].toUpperCase()) {
            case "EVEN" -> {
                while (counter < Long.parseLong(twoProps[1])) {
                    if (Long.parseLong(twoProps[0]) % 2 == 0 && Long.parseLong(twoProps[0]) >= 1 && twoProps[3].equalsIgnoreCase("BUZZ")) {
                        if (Long.parseLong(twoProps[0]) % 7 == 0 || Long.parseLong(twoProps[0]) % 10 == 7) {
                            System.out.print("\n" + twoProps[0] + " is ");
                            System.out.print(NumsAndProps.determineEven(twoProps));
                            System.out.print(NumsAndProps.determineBuzz(twoProps));
                            System.out.print(NumsAndProps.determineDuck(twoProps));
                            System.out.print(NumsAndProps.determinePalindromic(twoProps));
                            System.out.print(NumsAndProps.determineGapful(twoProps));
                            System.out.print(NumsAndProps.determineSpy(twoProps));
                            System.out.print(NumsAndProps.determineSunny(twoProps));
                            System.out.print(NumsAndProps.determineSquare(twoProps));
                            twoProps[0] = String.valueOf(Long.parseLong(twoProps[0]) + 1);
                            counter++;
                        }
                    } else if (Long.parseLong(twoProps[0]) % 2 == 0 && Long.parseLong(twoProps[0]) >= 1 && twoProps[3].equalsIgnoreCase("DUCK")) {
                        if (twoProps[0].contains("0") && !twoProps[0].startsWith("0")) {
                            System.out.print("\n" + twoProps[0] + " is ");
                            System.out.print(NumsAndProps.determineEven(twoProps));
                            System.out.print(NumsAndProps.determineDuck(twoProps));
                            System.out.print(NumsAndProps.determineBuzz(twoProps));
                            System.out.print(NumsAndProps.determinePalindromic(twoProps));
                            System.out.print(NumsAndProps.determineGapful(twoProps));
                            System.out.print(NumsAndProps.determineSpy(twoProps));
                            System.out.print(NumsAndProps.determineSunny(twoProps));
                            System.out.print(NumsAndProps.determineSquare(twoProps));
                            twoProps[0] = String.valueOf(Long.parseLong(twoProps[0]) + 1);
                            counter++;
                        }
                    } else if (Long.parseLong(twoProps[0]) % 2 == 0 && Long.parseLong(twoProps[0]) >= 1 && twoProps[3].equalsIgnoreCase("PALINDROMIC")) {
                        revString = new StringBuilder(twoProps[0]).reverse().toString();

                        if (revString.equals(twoProps[0])) {
                            System.out.print("\n" + twoProps[0] + " is ");
                            System.out.print(NumsAndProps.determineEven(twoProps));
                            System.out.print(NumsAndProps.determinePalindromic(twoProps));
                            System.out.print(NumsAndProps.determineBuzz(twoProps));
                            System.out.print(NumsAndProps.determineDuck(twoProps));
                            System.out.print(NumsAndProps.determineGapful(twoProps));
                            System.out.print(NumsAndProps.determineSpy(twoProps));
                            System.out.print(NumsAndProps.determineSunny(twoProps));
                            System.out.print(NumsAndProps.determineSquare(twoProps));
                            twoProps[0] = String.valueOf(Long.parseLong(twoProps[0]) + 1);
                            counter++;
                        }
                    } else if (Long.parseLong(twoProps[0]) % 2 == 0 && Long.parseLong(twoProps[0]) >= 1 && twoProps[3].equalsIgnoreCase("GAPFUL")) {
                        gapNum = new StringBuilder();
                        gapNum.append(twoProps[0].charAt(0)).append(twoProps[0].charAt(twoProps[0].length() - 1));

                        if (twoProps[0].length() > 2 && Long.parseLong(twoProps[0]) % Long.parseLong(String.valueOf(twoProps[0].charAt(0)) + twoProps[0].charAt(twoProps[0].length() - 1)) == 0) {
                            System.out.print("\n" + twoProps[0] + " is ");
                            System.out.print(NumsAndProps.determineEven(twoProps));
                            System.out.print(NumsAndProps.determineGapful(twoProps));
                            System.out.print(NumsAndProps.determineBuzz(twoProps));
                            System.out.print(NumsAndProps.determineDuck(twoProps));
                            System.out.print(NumsAndProps.determinePalindromic(twoProps));
                            System.out.print(NumsAndProps.determineSpy(twoProps));
                            System.out.print(NumsAndProps.determineSunny(twoProps));
                            System.out.print(NumsAndProps.determineSquare(twoProps));
                            twoProps[0] = String.valueOf(Long.parseLong(twoProps[0]) + 1);
                            counter++;
                        }
                    } else if (Long.parseLong(twoProps[0]) % 2 == 0 && Long.parseLong(twoProps[0]) >= 1 && twoProps[3].equalsIgnoreCase("SPY")) {
                        sumNum = 0;
                        productNum = 1;

                        for (int i = 0; i < num.length(); i++)
                            sumNum += Long.parseLong(String.valueOf(twoProps[0].charAt(i)));
                        for (int j = 0; j < num.length(); j++)
                            productNum *= Long.parseLong(String.valueOf(twoProps[0].charAt(j)));

                        if (sumNum == productNum) {
                            System.out.print("\n" + twoProps[0] + " is ");
                            System.out.print(NumsAndProps.determineEven(twoProps));
                            System.out.print(NumsAndProps.determineSpy(twoProps));
                            System.out.print(NumsAndProps.determineBuzz(twoProps));
                            System.out.print(NumsAndProps.determineDuck(twoProps));
                            System.out.print(NumsAndProps.determinePalindromic(twoProps));
                            System.out.print(NumsAndProps.determineGapful(twoProps));
                            System.out.print(NumsAndProps.determineSunny(twoProps));
                            System.out.print(NumsAndProps.determineSquare(twoProps));
                            twoProps[0] = String.valueOf(Long.parseLong(twoProps[0]) + 1);
                            counter++;
                        }
                    } else if (Long.parseLong(twoProps[0]) % 2 == 0 && Long.parseLong(twoProps[0]) >= 1 && twoProps[3].equalsIgnoreCase("SUNNY") || Long.parseLong(twoProps[0]) % 2 == 0 && Long.parseLong(twoProps[0]) >= 1 && twoProps[3].equalsIgnoreCase("SQUARE")) {
                        if (Math.sqrt(Long.parseLong(twoProps[0]) + 1) % 1 == 0 && twoProps[3].equalsIgnoreCase("SUNNY")) {
                            System.out.print("\n" + twoProps[0] + " is ");
                            System.out.print(NumsAndProps.determineEven(twoProps));
                            System.out.print(NumsAndProps.determineSunny(twoProps));
                            System.out.print(NumsAndProps.determineBuzz(twoProps));
                            System.out.print(NumsAndProps.determineDuck(twoProps));
                            System.out.print(NumsAndProps.determinePalindromic(twoProps));
                            System.out.print(NumsAndProps.determineGapful(twoProps));
                            System.out.print(NumsAndProps.determineSpy(twoProps));
                            System.out.print(NumsAndProps.determineSquare(twoProps));
                            twoProps[0] = String.valueOf(Long.parseLong(twoProps[0]) + 1);
                            counter++;
                        } else if (Math.sqrt(Long.parseLong(twoProps[0])) % 1 == 0 && twoProps[3].equalsIgnoreCase("SQUARE")) {
                            System.out.print("\n" + twoProps[0] + " is ");
                            System.out.print(NumsAndProps.determineEven(twoProps));
                            System.out.print(NumsAndProps.determineSquare(twoProps));
                            System.out.print(NumsAndProps.determineBuzz(twoProps));
                            System.out.print(NumsAndProps.determineDuck(twoProps));
                            System.out.print(NumsAndProps.determinePalindromic(twoProps));
                            System.out.print(NumsAndProps.determineGapful(twoProps));
                            System.out.print(NumsAndProps.determineSpy(twoProps));
                            System.out.print(NumsAndProps.determineSunny(twoProps));
                            twoProps[0] = String.valueOf(Long.parseLong(twoProps[0]) + 1);
                            counter++;
                        }
                    } else if (!twoProps[3].equalsIgnoreCase("BUZZ") && !twoProps[3].equalsIgnoreCase("DUCK") &&
                            !twoProps[3].equalsIgnoreCase("PALINDROMIC") && !twoProps[3].equalsIgnoreCase("GAPFUL") &&
                            !twoProps[3].equalsIgnoreCase("SPY") && !twoProps[3].equalsIgnoreCase("SQUARE") &&
                            !twoProps[3].equalsIgnoreCase("SUNNY")) {
                        NumsAndProps.stringCompare(num);
                        break;
                    }
                    twoProps[0] = String.valueOf(Long.parseLong(twoProps[0]) + 1);
                }
                System.out.println();
            }
            case "ODD" -> {
                while (counter < Long.parseLong(twoProps[1])) {
                    if (Long.parseLong(twoProps[0]) % 2 != 0 && Long.parseLong(twoProps[0]) >= 1 && twoProps[3].equalsIgnoreCase("BUZZ")) {
                        if (Long.parseLong(twoProps[0]) % 7 == 0 || Long.parseLong(twoProps[0]) % 10 == 7) {
                            System.out.print("\n" + twoProps[0] + " is ");
                            System.out.print(NumsAndProps.determineOdd(twoProps));
                            System.out.print(NumsAndProps.determineBuzz(twoProps));
                            System.out.print(NumsAndProps.determineDuck(twoProps));
                            System.out.print(NumsAndProps.determinePalindromic(twoProps));
                            System.out.print(NumsAndProps.determineGapful(twoProps));
                            System.out.print(NumsAndProps.determineSpy(twoProps));
                            System.out.print(NumsAndProps.determineSunny(twoProps));
                            System.out.print(NumsAndProps.determineSquare(twoProps));
                            twoProps[0] = String.valueOf(Long.parseLong(twoProps[0]) + 1);
                            counter++;
                        }
                    } else if (Long.parseLong(twoProps[0]) % 2 != 0 && Long.parseLong(twoProps[0]) >= 1 && twoProps[3].equalsIgnoreCase("DUCK")) {
                        if (twoProps[0].contains("0") && !twoProps[0].startsWith("0")) {
                            System.out.print("\n" + twoProps[0] + " is ");
                            System.out.print(NumsAndProps.determineOdd(twoProps));
                            System.out.print(NumsAndProps.determineDuck(twoProps));
                            System.out.print(NumsAndProps.determineBuzz(twoProps));
                            System.out.print(NumsAndProps.determinePalindromic(twoProps));
                            System.out.print(NumsAndProps.determineGapful(twoProps));
                            System.out.print(NumsAndProps.determineSpy(twoProps));
                            System.out.print(NumsAndProps.determineSunny(twoProps));
                            System.out.print(NumsAndProps.determineSquare(twoProps));
                            twoProps[0] = String.valueOf(Long.parseLong(twoProps[0]) + 1);
                            counter++;
                        }
                    } else if (Long.parseLong(twoProps[0]) % 2 != 0 && Long.parseLong(twoProps[0]) >= 1 && twoProps[3].equalsIgnoreCase("PALINDROMIC")) {
                        revString = new StringBuilder(twoProps[0]).reverse().toString();

                        if (revString.equals(twoProps[0])) {
                            System.out.print("\n" + twoProps[0] + " is ");
                            System.out.print(NumsAndProps.determineOdd(twoProps));
                            System.out.print(NumsAndProps.determinePalindromic(twoProps));
                            System.out.print(NumsAndProps.determineBuzz(twoProps));
                            System.out.print(NumsAndProps.determineDuck(twoProps));
                            System.out.print(NumsAndProps.determineGapful(twoProps));
                            System.out.print(NumsAndProps.determineSpy(twoProps));
                            System.out.print(NumsAndProps.determineSunny(twoProps));
                            System.out.print(NumsAndProps.determineSquare(twoProps));
                            twoProps[0] = String.valueOf(Long.parseLong(twoProps[0]) + 1);
                            counter++;
                        }
                    } else if (Long.parseLong(twoProps[0]) % 2 != 0 && Long.parseLong(twoProps[0]) >= 1 && twoProps[3].equalsIgnoreCase("GAPFUL")) {
                        gapNum = new StringBuilder();
                        gapNum.append(twoProps[0].charAt(0)).append(twoProps[0].charAt(twoProps[0].length() - 1));

                        if (twoProps[0].length() > 2 && Long.parseLong(twoProps[0]) % Long.parseLong(String.valueOf(twoProps[0].charAt(0)) + twoProps[0].charAt(twoProps[0].length() - 1)) == 0) {
                            System.out.print("\n" + twoProps[0] + " is ");
                            System.out.print(NumsAndProps.determineOdd(twoProps));
                            System.out.print(NumsAndProps.determineGapful(twoProps));
                            System.out.print(NumsAndProps.determineBuzz(twoProps));
                            System.out.print(NumsAndProps.determineDuck(twoProps));
                            System.out.print(NumsAndProps.determinePalindromic(twoProps));
                            System.out.print(NumsAndProps.determineSpy(twoProps));
                            System.out.print(NumsAndProps.determineSunny(twoProps));
                            System.out.print(NumsAndProps.determineSquare(twoProps));
                            twoProps[0] = String.valueOf(Long.parseLong(twoProps[0]) + 1);
                            counter++;
                        }
                    } else if (Long.parseLong(twoProps[0]) % 2 != 0 && Long.parseLong(twoProps[0]) >= 1 && twoProps[3].equalsIgnoreCase("SPY")) {
                        sumNum = 0;
                        productNum = 1;

                        for (int i = 0; i < num.length(); i++)
                            sumNum += Long.parseLong(String.valueOf(twoProps[0].charAt(i)));
                        for (int j = 0; j < num.length(); j++)
                            productNum *= Long.parseLong(String.valueOf(twoProps[0].charAt(j)));

                        if (sumNum == productNum) {
                            System.out.print("\n" + twoProps[0] + " is ");
                            System.out.print(NumsAndProps.determineOdd(twoProps));
                            System.out.print(NumsAndProps.determineSpy(twoProps));
                            System.out.print(NumsAndProps.determineBuzz(twoProps));
                            System.out.print(NumsAndProps.determineDuck(twoProps));
                            System.out.print(NumsAndProps.determinePalindromic(twoProps));
                            System.out.print(NumsAndProps.determineGapful(twoProps));
                            System.out.print(NumsAndProps.determineSunny(twoProps));
                            System.out.print(NumsAndProps.determineSquare(twoProps));
                            twoProps[0] = String.valueOf(Long.parseLong(twoProps[0]) + 1);
                            counter++;
                        }
                    } else if (Long.parseLong(twoProps[0]) % 2 != 0 && Long.parseLong(twoProps[0]) >= 1 && twoProps[3].equalsIgnoreCase("SUNNY") || Long.parseLong(twoProps[0]) % 2 != 0 && Long.parseLong(twoProps[0]) >= 1 && twoProps[3].equalsIgnoreCase("SQUARE")) {
                        if (Math.sqrt(Long.parseLong(twoProps[0]) + 1) % 1 == 0 && twoProps[3].equalsIgnoreCase("SUNNY") || Math.sqrt(Long.parseLong(twoProps[0])) % 1 == 0 && twoProps[3].equalsIgnoreCase("SQUARE")) {
                            System.out.print("\n" + twoProps[0] + " is ");
                            System.out.print(NumsAndProps.determineOdd(twoProps));
                            System.out.print(NumsAndProps.determineSunny(twoProps));
                            System.out.print(NumsAndProps.determineSquare(twoProps));
                            System.out.print(NumsAndProps.determineBuzz(twoProps));
                            System.out.print(NumsAndProps.determineDuck(twoProps));
                            System.out.print(NumsAndProps.determinePalindromic(twoProps));
                            System.out.print(NumsAndProps.determineGapful(twoProps));
                            System.out.print(NumsAndProps.determineSpy(twoProps));
                            twoProps[0] = String.valueOf(Long.parseLong(twoProps[0]) + 1);
                            counter++;
                        }
                    } else if (!twoProps[3].equalsIgnoreCase("BUZZ") && !twoProps[3].equalsIgnoreCase("DUCK") &&
                            !twoProps[3].equalsIgnoreCase("PALINDROMIC") && !twoProps[3].equalsIgnoreCase("GAPFUL") &&
                            !twoProps[3].equalsIgnoreCase("SPY") && !twoProps[3].equalsIgnoreCase("SQUARE") &&
                            !twoProps[3].equalsIgnoreCase("SUNNY")) {
                        NumsAndProps.stringCompare(num);
                        break;
                    }
                    twoProps[0] = String.valueOf(Long.parseLong(twoProps[0]) + 1);
                }
                System.out.println();
            }
            case "BUZZ" -> {
                while (counter < Long.parseLong(twoProps[1])) {
                    if (Long.parseLong(twoProps[0]) % 7 == 0 && twoProps[3].equalsIgnoreCase("EVEN") || Long.parseLong(twoProps[0]) % 10 == 7 && twoProps[3].equalsIgnoreCase("EVEN")) {
                        if (Long.parseLong(twoProps[0]) % 2 == 0) {
                            System.out.print("\n" + twoProps[0] + " is ");
                            System.out.print(NumsAndProps.determineBuzz(twoProps));
                            System.out.print(NumsAndProps.determineEven(twoProps));
                            System.out.print(NumsAndProps.determineOdd(twoProps));
                            System.out.print(NumsAndProps.determineDuck(twoProps));
                            System.out.print(NumsAndProps.determinePalindromic(twoProps));
                            System.out.print(NumsAndProps.determineGapful(twoProps));
                            System.out.print(NumsAndProps.determineSpy(twoProps));
                            System.out.print(NumsAndProps.determineSunny(twoProps));
                            System.out.print(NumsAndProps.determineSquare(twoProps));
                            twoProps[0] = String.valueOf(Long.parseLong(twoProps[0]) + 1);
                            counter++;
                        }
                    } else if (Long.parseLong(twoProps[0]) % 7 == 0 && twoProps[3].equalsIgnoreCase("ODD") || Long.parseLong(twoProps[0]) % 10 == 7 && twoProps[3].equalsIgnoreCase("ODD")) {
                        if (Long.parseLong(twoProps[0]) % 2 != 0) {
                            System.out.print("\n" + twoProps[0] + " is ");
                            System.out.print(NumsAndProps.determineBuzz(twoProps));
                            System.out.print(NumsAndProps.determineOdd(twoProps));
                            System.out.print(NumsAndProps.determineEven(twoProps));
                            System.out.print(NumsAndProps.determineDuck(twoProps));
                            System.out.print(NumsAndProps.determinePalindromic(twoProps));
                            System.out.print(NumsAndProps.determineGapful(twoProps));
                            System.out.print(NumsAndProps.determineSpy(twoProps));
                            System.out.print(NumsAndProps.determineSunny(twoProps));
                            System.out.print(NumsAndProps.determineSquare(twoProps));
                            twoProps[0] = String.valueOf(Long.parseLong(twoProps[0]) + 1);
                            counter++;
                        }
                    } else if (Long.parseLong(twoProps[0]) % 7 == 0 && twoProps[3].equalsIgnoreCase("DUCK") || Long.parseLong(twoProps[0]) % 10 == 7 && twoProps[3].equalsIgnoreCase("DUCK")) {
                        if (twoProps[0].contains("0") && !twoProps[0].startsWith("0")) {
                            System.out.print("\n" + twoProps[0] + " is ");
                            System.out.print(NumsAndProps.determineBuzz(twoProps));
                            System.out.print(NumsAndProps.determineDuck(twoProps));
                            System.out.print(NumsAndProps.determineEven(twoProps));
                            System.out.print(NumsAndProps.determineOdd(twoProps));
                            System.out.print(NumsAndProps.determinePalindromic(twoProps));
                            System.out.print(NumsAndProps.determineGapful(twoProps));
                            System.out.print(NumsAndProps.determineSpy(twoProps));
                            System.out.print(NumsAndProps.determineSunny(twoProps));
                            System.out.print(NumsAndProps.determineSquare(twoProps));
                            twoProps[0] = String.valueOf(Long.parseLong(twoProps[0]) + 1);
                            counter++;
                        }
                    } else if (Long.parseLong(twoProps[0]) % 7 == 0 && twoProps[3].equalsIgnoreCase("PALINDROMIC") || Long.parseLong(twoProps[0]) % 10 == 7 && twoProps[3].equalsIgnoreCase("PALINDROMIC")) {
                        revString = new StringBuilder(twoProps[0]).reverse().toString();

                        if (revString.equals(twoProps[0])) {
                            System.out.print("\n" + twoProps[0] + " is ");
                            System.out.print(NumsAndProps.determineBuzz(twoProps));
                            System.out.print(NumsAndProps.determinePalindromic(twoProps));
                            System.out.print(NumsAndProps.determineEven(twoProps));
                            System.out.print(NumsAndProps.determineOdd(twoProps));
                            System.out.print(NumsAndProps.determineDuck(twoProps));
                            System.out.print(NumsAndProps.determineGapful(twoProps));
                            System.out.print(NumsAndProps.determineSpy(twoProps));
                            System.out.print(NumsAndProps.determineSunny(twoProps));
                            System.out.print(NumsAndProps.determineSquare(twoProps));
                            twoProps[0] = String.valueOf(Long.parseLong(twoProps[0]) + 1);
                            counter++;
                        }
                    } else if (Long.parseLong(twoProps[0]) % 7 == 0 && twoProps[3].equalsIgnoreCase("GAPFUL") || Long.parseLong(twoProps[0]) % 10 == 7 && twoProps[3].equalsIgnoreCase("GAPFUL")) {
                        gapNum = new StringBuilder();
                        gapNum.append(twoProps[0].charAt(0)).append(twoProps[0].charAt(twoProps[0].length() - 1));

                        if (twoProps[0].length() > 2 && Long.parseLong(twoProps[0]) % Long.parseLong(String.valueOf(twoProps[0].charAt(0)) + twoProps[0].charAt(twoProps[0].length() - 1)) == 0) {
                            System.out.print("\n" + twoProps[0] + " is ");
                            System.out.print(NumsAndProps.determineBuzz(twoProps));
                            System.out.print(NumsAndProps.determineGapful(twoProps));
                            System.out.print(NumsAndProps.determinePalindromic(twoProps));
                            System.out.print(NumsAndProps.determineEven(twoProps));
                            System.out.print(NumsAndProps.determineOdd(twoProps));
                            System.out.print(NumsAndProps.determineDuck(twoProps));
                            System.out.print(NumsAndProps.determineSpy(twoProps));
                            System.out.print(NumsAndProps.determineSunny(twoProps));
                            System.out.print(NumsAndProps.determineSquare(twoProps));
                            twoProps[0] = String.valueOf(Long.parseLong(twoProps[0]) + 1);
                            counter++;
                        }
                    } else if (Long.parseLong(twoProps[0]) % 7 == 0 && twoProps[3].equalsIgnoreCase("SPY") || Long.parseLong(twoProps[0]) % 10 == 7 && twoProps[3].equalsIgnoreCase("SPY")) {
                        sumNum = 0;
                        productNum = 1;

                        for (int i = 0; i < num.length(); i++)
                            sumNum += Long.parseLong(String.valueOf(twoProps[0].charAt(i)));
                        for (int j = 0; j < num.length(); j++)
                            productNum *= Long.parseLong(String.valueOf(twoProps[0].charAt(j)));

                        if (sumNum == productNum) {
                            System.out.print("\n" + twoProps[0] + " is ");
                            System.out.print(NumsAndProps.determineBuzz(twoProps));
                            System.out.print(NumsAndProps.determineSpy(twoProps));
                            System.out.print(NumsAndProps.determinePalindromic(twoProps));
                            System.out.print(NumsAndProps.determineEven(twoProps));
                            System.out.print(NumsAndProps.determineOdd(twoProps));
                            System.out.print(NumsAndProps.determineDuck(twoProps));
                            System.out.print(NumsAndProps.determineGapful(twoProps));
                            System.out.print(NumsAndProps.determineSunny(twoProps));
                            System.out.print(NumsAndProps.determineSquare(twoProps));
                            twoProps[0] = String.valueOf(Long.parseLong(twoProps[0]) + 1);
                            counter++;
                        }
                    } else if ((Long.parseLong(twoProps[0]) % 7 == 0 && twoProps[3].equalsIgnoreCase("SUNNY") || Long.parseLong(twoProps[0]) % 10 == 7 && twoProps[3].equalsIgnoreCase("SUNNY")) || Long.parseLong(twoProps[0]) % 7 == 0 && twoProps[3].equalsIgnoreCase("SQUARE") || Long.parseLong(twoProps[0]) % 10 == 7 && twoProps[3].equalsIgnoreCase("SQUARE")) {
                        if (Math.sqrt(Long.parseLong(twoProps[0]) + 1) % 1 == 0 && twoProps[3].equalsIgnoreCase("SUNNY") || Math.sqrt(Long.parseLong(twoProps[0])) % 1 == 0 && twoProps[3].equalsIgnoreCase("SQUARE")) {
                            System.out.print("\n" + twoProps[0] + " is ");
                            System.out.print(NumsAndProps.determineBuzz(twoProps));
                            System.out.print(NumsAndProps.determineSunny(twoProps));
                            System.out.print(NumsAndProps.determineSquare(twoProps));
                            System.out.print(NumsAndProps.determinePalindromic(twoProps));
                            System.out.print(NumsAndProps.determineEven(twoProps));
                            System.out.print(NumsAndProps.determineOdd(twoProps));
                            System.out.print(NumsAndProps.determineDuck(twoProps));
                            System.out.print(NumsAndProps.determineGapful(twoProps));
                            System.out.print(NumsAndProps.determineSpy(twoProps));
                            twoProps[0] = String.valueOf(Long.parseLong(twoProps[0]) + 1);
                            counter++;
                        }
                    } else if (!twoProps[3].equalsIgnoreCase("EVEN") && !twoProps[3].equalsIgnoreCase("ODD") &&
                            !twoProps[3].equalsIgnoreCase("BUZZ") && !twoProps[3].equalsIgnoreCase("PALINDROMIC") && !twoProps[3].equalsIgnoreCase("GAPFUL") &&
                            !twoProps[3].equalsIgnoreCase("SPY") && !twoProps[3].equalsIgnoreCase("SQUARE") &&
                            !twoProps[3].equalsIgnoreCase("SUNNY")) {
                        NumsAndProps.stringCompare(num);
                        break;
                    }
                    twoProps[0] = String.valueOf(Long.parseLong(twoProps[0]) + 1);
                }
                System.out.println();
            }
            case "DUCK" -> {
                while (counter < Long.parseLong(twoProps[1])) {
                    if (twoProps[0].contains("0") && !twoProps[0].startsWith("0")) {
                        if (Long.parseLong(twoProps[0]) % 2 == 0 && Long.parseLong(twoProps[0]) >= 1 && twoProps[3].equalsIgnoreCase("EVEN")) {
                            System.out.print("\n" + twoProps[0] + " is ");
                            System.out.print(NumsAndProps.determineDuck(twoProps));
                            System.out.print(NumsAndProps.determineEven(twoProps));
                            System.out.print(NumsAndProps.determineBuzz(twoProps));
                            System.out.print(NumsAndProps.determinePalindromic(twoProps));
                            System.out.print(NumsAndProps.determineOdd(twoProps));
                            System.out.print(NumsAndProps.determineGapful(twoProps));
                            System.out.print(NumsAndProps.determineSunny(twoProps));
                            System.out.print(NumsAndProps.determineSquare(twoProps));
                            counter++;
                        } else if (Long.parseLong(twoProps[0]) % 2 != 0 && Long.parseLong(twoProps[0]) >= 1 && twoProps[3].equalsIgnoreCase("ODD")) {
                            System.out.print("\n" + twoProps[0] + " is ");
                            System.out.print(NumsAndProps.determineDuck(twoProps));
                            System.out.print(NumsAndProps.determineOdd(twoProps));
                            System.out.print(NumsAndProps.determineEven(twoProps));
                            System.out.print(NumsAndProps.determineBuzz(twoProps));
                            System.out.print(NumsAndProps.determinePalindromic(twoProps));
                            System.out.print(NumsAndProps.determineGapful(twoProps));
                            System.out.print(NumsAndProps.determineSunny(twoProps));
                            System.out.print(NumsAndProps.determineSquare(twoProps));
                            counter++;
                        } else if (twoProps[0].contains("0") && !twoProps[0].startsWith("0") && twoProps[3].equalsIgnoreCase("BUZZ")) {
                            if (Long.parseLong(twoProps[0]) % 7 == 0 || Long.parseLong(twoProps[0]) % 10 == 7) {
                                System.out.print("\n" + twoProps[0] + " is ");
                                System.out.print(NumsAndProps.determineDuck(twoProps));
                                System.out.print(NumsAndProps.determineBuzz(twoProps));
                                System.out.print(NumsAndProps.determineEven(twoProps));
                                System.out.print(NumsAndProps.determinePalindromic(twoProps));
                                System.out.print(NumsAndProps.determineOdd(twoProps));
                                System.out.print(NumsAndProps.determineGapful(twoProps));
                                System.out.print(NumsAndProps.determineSunny(twoProps));
                                System.out.print(NumsAndProps.determineSquare(twoProps));
                                counter++;
                            }
                        } else if (twoProps[0].contains("0") && !twoProps[0].startsWith("0") && twoProps[3].equalsIgnoreCase("PALINDROMIC")) {
                            revString = new StringBuilder(twoProps[0]).reverse().toString();

                            if (revString.equals(twoProps[0])) {
                                System.out.print("\n" + twoProps[0] + " is ");
                                System.out.print(NumsAndProps.determineDuck(twoProps));
                                System.out.print(NumsAndProps.determinePalindromic(twoProps));
                                System.out.print(NumsAndProps.determineEven(twoProps));
                                System.out.print(NumsAndProps.determineBuzz(twoProps));
                                System.out.print(NumsAndProps.determineOdd(twoProps));
                                System.out.print(NumsAndProps.determineGapful(twoProps));
                                System.out.print(NumsAndProps.determineSunny(twoProps));
                                System.out.print(NumsAndProps.determineSquare(twoProps));
                                counter++;
                            }
                        } else if (twoProps[0].contains("0") && !twoProps[0].startsWith("0") && twoProps[3].equalsIgnoreCase("GAPFUL")) {
                            gapNum = new StringBuilder();
                            gapNum.append(twoProps[0].charAt(0)).append(twoProps[0].charAt(twoProps[0].length() - 1));
                            if (twoProps[0].length() > 2 && Long.parseLong(twoProps[0]) % Long.parseLong(String.valueOf(twoProps[0].charAt(0)) + twoProps[0].charAt(twoProps[0].length() - 1)) == 0) {
                                System.out.print("\n" + twoProps[0] + " is ");
                                System.out.print(NumsAndProps.determineDuck(twoProps));
                                System.out.print(NumsAndProps.determineGapful(twoProps));
                                System.out.print(NumsAndProps.determineEven(twoProps));
                                System.out.print(NumsAndProps.determineBuzz(twoProps));
                                System.out.print(NumsAndProps.determinePalindromic(twoProps));
                                System.out.print(NumsAndProps.determineOdd(twoProps));
                                System.out.print(NumsAndProps.determineSunny(twoProps));
                                System.out.print(NumsAndProps.determineSquare(twoProps));
                                counter++;
                            }
                        } else if (twoProps[0].contains("0") && !twoProps[0].startsWith("0") && twoProps[3].equalsIgnoreCase("SUNNY") || twoProps[0].contains("0") && !twoProps[0].startsWith("0") && twoProps[3].equalsIgnoreCase("SQUARE")) {
                            if (Math.sqrt(Long.parseLong(twoProps[0]) + 1) % 1 == 0 && twoProps[3].equalsIgnoreCase("SUNNY") || Math.sqrt(Long.parseLong(twoProps[0])) % 1 == 0 && twoProps[3].equalsIgnoreCase("SQUARE")) {
                                System.out.print("\n" + twoProps[0] + " is ");
                                System.out.print(NumsAndProps.determineDuck(twoProps));
                                System.out.print(NumsAndProps.determineSunny(twoProps));
                                System.out.print(NumsAndProps.determineSquare(twoProps));
                                System.out.print(NumsAndProps.determineEven(twoProps));
                                System.out.print(NumsAndProps.determineBuzz(twoProps));
                                System.out.print(NumsAndProps.determinePalindromic(twoProps));
                                System.out.print(NumsAndProps.determineOdd(twoProps));
                                System.out.print(NumsAndProps.determineGapful(twoProps));
                                counter++;
                            }
                        }
                    } else if (!twoProps[3].equalsIgnoreCase("EVEN") && !twoProps[3].equalsIgnoreCase("ODD") &&
                            !twoProps[3].equalsIgnoreCase("BUZZ") && !twoProps[3].equalsIgnoreCase("PALINDROMIC") &&
                            !twoProps[3].equalsIgnoreCase("GAPFUL") && !twoProps[3].equalsIgnoreCase("SQUARE") &&
                            !twoProps[3].equalsIgnoreCase("SUNNY")) {
                        NumsAndProps.stringCompare(num);
                        break;
                    } else {
                        twoProps[0] = String.valueOf(Long.parseLong(twoProps[0]) + 1);
                    }
                }
                System.out.println();
            }
            case "PALINDROMIC" -> {
                while (counter < Long.parseLong(twoProps[1])) {
                    revString = new StringBuilder(twoProps[0]).reverse().toString();

                    if (revString.equals(twoProps[0])) {
                        if (Long.parseLong(twoProps[0]) % 2 == 0 && Long.parseLong(twoProps[0]) >= 1 && twoProps[3].equalsIgnoreCase("EVEN")) {
                            System.out.print("\n" + twoProps[0] + " is ");
                            System.out.print(NumsAndProps.determinePalindromic(twoProps));
                            System.out.print(NumsAndProps.determineEven(twoProps));
                            System.out.print(NumsAndProps.determineDuck(twoProps));
                            System.out.print(NumsAndProps.determineBuzz(twoProps));
                            System.out.print(NumsAndProps.determineOdd(twoProps));
                            System.out.print(NumsAndProps.determineGapful(twoProps));
                            System.out.print(NumsAndProps.determineSpy(twoProps));
                            System.out.print(NumsAndProps.determineSunny(twoProps));
                            System.out.print(NumsAndProps.determineSquare(twoProps));
                            twoProps[0] = String.valueOf(Long.parseLong(twoProps[0]) + 1);
                            counter++;
                        } else if (Long.parseLong(twoProps[0]) % 2 != 0 && Long.parseLong(twoProps[0]) >= 1 && twoProps[3].equalsIgnoreCase("ODD")) {
                            System.out.print("\n" + twoProps[0] + " is ");
                            System.out.print(NumsAndProps.determinePalindromic(twoProps));
                            System.out.print(NumsAndProps.determineOdd(twoProps));
                            System.out.print(NumsAndProps.determineDuck(twoProps));
                            System.out.print(NumsAndProps.determineEven(twoProps));
                            System.out.print(NumsAndProps.determineBuzz(twoProps));
                            System.out.print(NumsAndProps.determineGapful(twoProps));
                            System.out.print(NumsAndProps.determineSpy(twoProps));
                            System.out.print(NumsAndProps.determineSunny(twoProps));
                            System.out.print(NumsAndProps.determineSquare(twoProps));
                            twoProps[0] = String.valueOf(Long.parseLong(twoProps[0]) + 1);
                            counter++;
                        } else if (Long.parseLong(twoProps[0]) % 7 == 0 && twoProps[3].equalsIgnoreCase("BUZZ") || Long.parseLong(twoProps[0]) % 10 == 7 && twoProps[3].equalsIgnoreCase("BUZZ")) {
                            System.out.print("\n" + twoProps[0] + " is ");
                            System.out.print(NumsAndProps.determinePalindromic(twoProps));
                            System.out.print(NumsAndProps.determineBuzz(twoProps));
                            System.out.print(NumsAndProps.determineDuck(twoProps));
                            System.out.print(NumsAndProps.determineEven(twoProps));
                            System.out.print(NumsAndProps.determineOdd(twoProps));
                            System.out.print(NumsAndProps.determineGapful(twoProps));
                            System.out.print(NumsAndProps.determineSpy(twoProps));
                            System.out.print(NumsAndProps.determineSunny(twoProps));
                            System.out.print(NumsAndProps.determineSquare(twoProps));
                            twoProps[0] = String.valueOf(Long.parseLong(twoProps[0]) + 1);
                            counter++;
                        } else if (twoProps[0].contains("0") && !twoProps[0].startsWith("0") && twoProps[3].equalsIgnoreCase("DUCK")) {
                            System.out.print("\n" + twoProps[0] + " is ");
                            System.out.print(NumsAndProps.determinePalindromic(twoProps));
                            System.out.print(NumsAndProps.determineDuck(twoProps));
                            System.out.print(NumsAndProps.determineEven(twoProps));
                            System.out.print(NumsAndProps.determineBuzz(twoProps));
                            System.out.print(NumsAndProps.determineOdd(twoProps));
                            System.out.print(NumsAndProps.determineGapful(twoProps));
                            System.out.print(NumsAndProps.determineSpy(twoProps));
                            System.out.print(NumsAndProps.determineSunny(twoProps));
                            System.out.print(NumsAndProps.determineSquare(twoProps));
                            twoProps[0] = String.valueOf(Long.parseLong(twoProps[0]) + 1);
                            counter++;
                        } else if (revString.equals(twoProps[0]) && twoProps[3].equalsIgnoreCase("GAPFUL")) {
                            gapNum = new StringBuilder();
                            gapNum.append(twoProps[0].charAt(0)).append(twoProps[0].charAt(twoProps[0].length() - 1));
                            if (twoProps[0].length() > 2 && Long.parseLong(twoProps[0]) % Long.parseLong(String.valueOf(twoProps[0].charAt(0)) + twoProps[0].charAt(twoProps[0].length() - 1)) == 0) {
                                System.out.print("\n" + twoProps[0] + " is ");
                                System.out.print(NumsAndProps.determinePalindromic(twoProps));
                                System.out.print(NumsAndProps.determineGapful(twoProps));
                                System.out.print(NumsAndProps.determineDuck(twoProps));
                                System.out.print(NumsAndProps.determineEven(twoProps));
                                System.out.print(NumsAndProps.determineBuzz(twoProps));
                                System.out.print(NumsAndProps.determineOdd(twoProps));
                                System.out.print(NumsAndProps.determineSpy(twoProps));
                                System.out.print(NumsAndProps.determineSunny(twoProps));
                                System.out.print(NumsAndProps.determineSquare(twoProps));
                                twoProps[0] = String.valueOf(Long.parseLong(twoProps[0]) + 1);
                                counter++;
                            }
                        } else if (revString.equals(twoProps[0]) && twoProps[3].equalsIgnoreCase("SPY")) {
                            sumNum = 0;
                            productNum = 1;

                            for (int i = 0; i < num.length(); i++)
                                sumNum += Long.parseLong(String.valueOf(twoProps[0].charAt(i)));
                            for (int j = 0; j < num.length(); j++)
                                productNum *= Long.parseLong(String.valueOf(twoProps[0].charAt(j)));

                            if (sumNum == productNum) {
                                System.out.print("\n" + twoProps[0] + " is ");
                                System.out.print(NumsAndProps.determinePalindromic(twoProps));
                                System.out.print(NumsAndProps.determineSpy(twoProps));
                                System.out.print(NumsAndProps.determineDuck(twoProps));
                                System.out.print(NumsAndProps.determineEven(twoProps));
                                System.out.print(NumsAndProps.determineBuzz(twoProps));
                                System.out.print(NumsAndProps.determineOdd(twoProps));
                                System.out.print(NumsAndProps.determineGapful(twoProps));
                                System.out.print(NumsAndProps.determineSunny(twoProps));
                                System.out.print(NumsAndProps.determineSquare(twoProps));
                                twoProps[0] = String.valueOf(Long.parseLong(twoProps[0]) + 1);
                                counter++;
                            }
                        } else if (revString.equals(twoProps[0]) && twoProps[3].equalsIgnoreCase("SUNNY") || revString.equals(twoProps[0]) && twoProps[3].equalsIgnoreCase("SQUARE")) {
                            if (Math.sqrt(Long.parseLong(twoProps[0]) + 1) % 1 == 0 || Math.sqrt(Long.parseLong(twoProps[0])) % 1 == 0) {
                                System.out.print("\n" + twoProps[0] + " is ");
                                System.out.print(NumsAndProps.determinePalindromic(twoProps));
                                System.out.print(NumsAndProps.determineSunny(twoProps));
                                System.out.print(NumsAndProps.determineSquare(twoProps));
                                System.out.print(NumsAndProps.determineDuck(twoProps));
                                System.out.print(NumsAndProps.determineEven(twoProps));
                                System.out.print(NumsAndProps.determineBuzz(twoProps));
                                System.out.print(NumsAndProps.determineOdd(twoProps));
                                System.out.print(NumsAndProps.determineGapful(twoProps));
                                System.out.print(NumsAndProps.determineSpy(twoProps));
                                twoProps[0] = String.valueOf(Long.parseLong(twoProps[0]) + 1);
                                counter++;
                            }
                        }
                    } else if (!twoProps[3].equalsIgnoreCase("EVEN") && !twoProps[3].equalsIgnoreCase("ODD") &&
                            !twoProps[3].equalsIgnoreCase("BUZZ") && !twoProps[3].equalsIgnoreCase("DUCK") && !twoProps[3].equalsIgnoreCase("GAPFUL") &&
                            !twoProps[3].equalsIgnoreCase("SPY") && !twoProps[3].equalsIgnoreCase("SQUARE") &&
                            !twoProps[3].equalsIgnoreCase("SUNNY")) {
                        NumsAndProps.stringCompare(num);
                        break;
                    }
                    twoProps[0] = String.valueOf(Long.parseLong(twoProps[0]) + 1);
                }
                System.out.println();
            }
            case "GAPFUL" -> {
                while (counter < Long.parseLong(twoProps[1])) {
                    if (twoProps[0].length() > 2 && Long.parseLong(twoProps[0]) % Long.parseLong(String.valueOf(twoProps[0].charAt(0)) + twoProps[0].charAt(twoProps[0].length() - 1)) == 0) {
                        if (Long.parseLong(twoProps[0]) % 2 == 0 && Long.parseLong(twoProps[0]) >= 1 && twoProps[3].equalsIgnoreCase("EVEN")) {
                            System.out.print("\n" + twoProps[0] + " is ");
                            System.out.print(NumsAndProps.determineGapful(twoProps));
                            System.out.print(NumsAndProps.determineEven(twoProps));
                            System.out.print(NumsAndProps.determineDuck(twoProps));
                            System.out.print(NumsAndProps.determineBuzz(twoProps));
                            System.out.print(NumsAndProps.determinePalindromic(twoProps));
                            System.out.print(NumsAndProps.determineOdd(twoProps));
                            System.out.print(NumsAndProps.determineSpy(twoProps));
                            System.out.print(NumsAndProps.determineSunny(twoProps));
                            System.out.print(NumsAndProps.determineSquare(twoProps));
                            counter++;
                        } else if (Long.parseLong(twoProps[0]) % 2 != 0 && Long.parseLong(twoProps[0]) >= 1 && twoProps[3].equalsIgnoreCase("ODD")) {
                            System.out.print("\n" + twoProps[0] + " is ");
                            System.out.print(NumsAndProps.determineGapful(twoProps));
                            System.out.print(NumsAndProps.determineOdd(twoProps));
                            System.out.print(NumsAndProps.determineDuck(twoProps));
                            System.out.print(NumsAndProps.determineEven(twoProps));
                            System.out.print(NumsAndProps.determineBuzz(twoProps));
                            System.out.print(NumsAndProps.determinePalindromic(twoProps));
                            System.out.print(NumsAndProps.determineSpy(twoProps));
                            System.out.print(NumsAndProps.determineSunny(twoProps));
                            System.out.print(NumsAndProps.determineSquare(twoProps));
                            counter++;
                        } else if (Long.parseLong(twoProps[0]) % 7 == 0 && twoProps[3].equalsIgnoreCase("BUZZ") || Long.parseLong(twoProps[0]) % 10 == 7 && twoProps[3].equalsIgnoreCase("BUZZ")) {
                            System.out.print("\n" + twoProps[0] + " is ");
                            System.out.print(NumsAndProps.determineGapful(twoProps));
                            System.out.print(NumsAndProps.determineBuzz(twoProps));
                            System.out.print(NumsAndProps.determineDuck(twoProps));
                            System.out.print(NumsAndProps.determineEven(twoProps));
                            System.out.print(NumsAndProps.determinePalindromic(twoProps));
                            System.out.print(NumsAndProps.determineOdd(twoProps));
                            System.out.print(NumsAndProps.determineSpy(twoProps));
                            System.out.print(NumsAndProps.determineSunny(twoProps));
                            System.out.print(NumsAndProps.determineSquare(twoProps));
                            counter++;
                        } else if (twoProps[0].contains("0") && !twoProps[0].startsWith("0") && twoProps[3].equalsIgnoreCase("DUCK")) {
                            System.out.print("\n" + twoProps[0] + " is ");
                            System.out.print(NumsAndProps.determineGapful(twoProps));
                            System.out.print(NumsAndProps.determineDuck(twoProps));
                            System.out.print(NumsAndProps.determineEven(twoProps));
                            System.out.print(NumsAndProps.determineBuzz(twoProps));
                            System.out.print(NumsAndProps.determinePalindromic(twoProps));
                            System.out.print(NumsAndProps.determineOdd(twoProps));
                            System.out.print(NumsAndProps.determineSpy(twoProps));
                            System.out.print(NumsAndProps.determineSunny(twoProps));
                            System.out.print(NumsAndProps.determineSquare(twoProps));
                            counter++;
                        } else if (twoProps[0].length() > 2 && Long.parseLong(twoProps[0]) % Long.parseLong(String.valueOf(twoProps[0].charAt(0)) + twoProps[0].charAt(twoProps[0].length() - 1)) == 0 && twoProps[3].equalsIgnoreCase("SPY")) {
                            sumNum = 0;
                            productNum = 1;

                            for (int i = 0; i < num.length(); i++)
                                sumNum += Long.parseLong(String.valueOf(twoProps[0].charAt(i)));
                            for (int j = 0; j < num.length(); j++)
                                productNum *= Long.parseLong(String.valueOf(twoProps[0].charAt(j)));

                            if (sumNum == productNum) {
                                System.out.print("\n" + twoProps[0] + " is ");
                                System.out.print(NumsAndProps.determineGapful(twoProps));
                                System.out.print(NumsAndProps.determineSpy(twoProps));
                                System.out.print(NumsAndProps.determineDuck(twoProps));
                                System.out.print(NumsAndProps.determineEven(twoProps));
                                System.out.print(NumsAndProps.determineBuzz(twoProps));
                                System.out.print(NumsAndProps.determinePalindromic(twoProps));
                                System.out.print(NumsAndProps.determineOdd(twoProps));
                                System.out.print(NumsAndProps.determineSunny(twoProps));
                                System.out.print(NumsAndProps.determineSquare(twoProps));
                                counter++;
                            }
                        } else if (twoProps[0].length() > 2 && Long.parseLong(twoProps[0]) % Long.parseLong(String.valueOf(twoProps[0].charAt(0)) + twoProps[0].charAt(twoProps[0].length() - 1)) == 0 && twoProps[3].equalsIgnoreCase("SUNNY") ||
                                twoProps[0].length() > 2 && Long.parseLong(twoProps[0]) % Long.parseLong(String.valueOf(twoProps[0].charAt(0)) + twoProps[0].charAt(twoProps[0].length() - 1)) == 0 && twoProps[3].equalsIgnoreCase("SQUARE")) {
                            if (Math.sqrt(Long.parseLong(twoProps[0]) + 1) % 1 == 0 || Math.sqrt(Long.parseLong(twoProps[0])) % 1 == 0) {
                                System.out.print("\n" + twoProps[0] + " is ");
                                System.out.print(NumsAndProps.determineGapful(twoProps));
                                System.out.print(NumsAndProps.determineSunny(twoProps));
                                System.out.print(NumsAndProps.determineSquare(twoProps));
                                System.out.print(NumsAndProps.determineDuck(twoProps));
                                System.out.print(NumsAndProps.determineEven(twoProps));
                                System.out.print(NumsAndProps.determineBuzz(twoProps));
                                System.out.print(NumsAndProps.determinePalindromic(twoProps));
                                System.out.print(NumsAndProps.determineOdd(twoProps));
                                System.out.print(NumsAndProps.determineSpy(twoProps));
                                counter++;
                            }
                        } else if (twoProps[0].length() > 2 && Long.parseLong(twoProps[0]) % Long.parseLong(String.valueOf(twoProps[0].charAt(0)) + twoProps[0].charAt(twoProps[0].length() - 1)) == 0 && twoProps[3].equalsIgnoreCase("PALINDROMIC")) {
                            revString = new StringBuilder(twoProps[0]).reverse().toString();

                            if (revString.equals(twoProps[0])) {
                                System.out.print("\n" + twoProps[0] + " is ");
                                System.out.print(NumsAndProps.determineGapful(twoProps));
                                System.out.print(NumsAndProps.determinePalindromic(twoProps));
                                System.out.print(NumsAndProps.determineDuck(twoProps));
                                System.out.print(NumsAndProps.determineEven(twoProps));
                                System.out.print(NumsAndProps.determineBuzz(twoProps));
                                System.out.print(NumsAndProps.determineOdd(twoProps));
                                System.out.print(NumsAndProps.determineSpy(twoProps));
                                System.out.print(NumsAndProps.determineSunny(twoProps));
                                System.out.print(NumsAndProps.determineSquare(twoProps));
                                counter++;
                            }
                        }
                    } else if (!twoProps[3].equalsIgnoreCase("EVEN") && !twoProps[3].equalsIgnoreCase("ODD") &&
                            !twoProps[3].equalsIgnoreCase("BUZZ") && !twoProps[3].equalsIgnoreCase("DUCK") &&
                            !twoProps[3].equalsIgnoreCase("PALINDROMIC") && !twoProps[3].equalsIgnoreCase("SPY") && !twoProps[3].equalsIgnoreCase("SQUARE") &&
                            !twoProps[3].equalsIgnoreCase("SUNNY")) {
                        NumsAndProps.stringCompare(num);
                        break;
                    }
                    twoProps[0] = String.valueOf(Long.parseLong(twoProps[0]) + 1);
                }
                System.out.println();
            }
            case "SPY" -> {
                sumNum = 0;
                productNum = 1;
                while (counter < Long.parseLong(twoProps[1])) {
                    for (int i = 0; i < num.length(); i++)
                        sumNum += Long.parseLong(String.valueOf(twoProps[0].charAt(i)));
                    for (int j = 0; j < num.length(); j++)
                        productNum *= Long.parseLong(String.valueOf(twoProps[0].charAt(j)));

                    if (sumNum == productNum) {
                        if (Long.parseLong(twoProps[0]) % 2 == 0 && Long.parseLong(twoProps[0]) >= 1 && twoProps[3].equalsIgnoreCase("EVEN")) {
                            System.out.print("\n" + twoProps[0] + " is ");
                            System.out.print(NumsAndProps.determineSpy(twoProps));
                            System.out.print(NumsAndProps.determineEven(twoProps));
                            System.out.print(NumsAndProps.determineBuzz(twoProps));
                            System.out.print(NumsAndProps.determinePalindromic(twoProps));
                            System.out.print(NumsAndProps.determineOdd(twoProps));
                            System.out.print(NumsAndProps.determineGapful(twoProps));
                            System.out.print(NumsAndProps.determineSunny(twoProps));
                            System.out.print(NumsAndProps.determineSquare(twoProps));
                            counter++;
                        } else if (Long.parseLong(twoProps[0]) % 2 != 0 && Long.parseLong(twoProps[0]) >= 1 && twoProps[3].equalsIgnoreCase("ODD")) {
                            System.out.print("\n" + twoProps[0] + " is ");
                            System.out.print(NumsAndProps.determineSpy(twoProps));
                            System.out.print(NumsAndProps.determineOdd(twoProps));
                            System.out.print(NumsAndProps.determineEven(twoProps));
                            System.out.print(NumsAndProps.determineBuzz(twoProps));
                            System.out.print(NumsAndProps.determinePalindromic(twoProps));
                            System.out.print(NumsAndProps.determineGapful(twoProps));
                            System.out.print(NumsAndProps.determineSunny(twoProps));
                            System.out.print(NumsAndProps.determineSquare(twoProps));
                            counter++;
                        } else if (Long.parseLong(twoProps[0]) % 7 == 0 && twoProps[3].equalsIgnoreCase("BUZZ") || Long.parseLong(twoProps[0]) % 10 == 7 && twoProps[3].equalsIgnoreCase("BUZZ")) {
                            System.out.print("\n" + twoProps[0] + " is ");
                            System.out.print(NumsAndProps.determineSpy(twoProps));
                            System.out.print(NumsAndProps.determineBuzz(twoProps));
                            System.out.print(NumsAndProps.determineEven(twoProps));
                            System.out.print(NumsAndProps.determinePalindromic(twoProps));
                            System.out.print(NumsAndProps.determineOdd(twoProps));
                            System.out.print(NumsAndProps.determineGapful(twoProps));
                            System.out.print(NumsAndProps.determineSunny(twoProps));
                            System.out.print(NumsAndProps.determineSquare(twoProps));
                            counter++;
                        } else if (sumNum == productNum && twoProps[3].equalsIgnoreCase("SUNNY") || sumNum == productNum && twoProps[3].equalsIgnoreCase("SQUARE")) {
                            if (Math.sqrt(Long.parseLong(twoProps[0]) + 1) % 1 == 0 || Math.sqrt(Long.parseLong(twoProps[0])) % 1 == 0) {
                                System.out.print("\n" + twoProps[0] + " is ");
                                System.out.print(NumsAndProps.determineSpy(twoProps));
                                System.out.print(NumsAndProps.determineSunny(twoProps));
                                System.out.print(NumsAndProps.determineSquare(twoProps));
                                System.out.print(NumsAndProps.determineDuck(twoProps));
                                System.out.print(NumsAndProps.determineEven(twoProps));
                                System.out.print(NumsAndProps.determineBuzz(twoProps));
                                System.out.print(NumsAndProps.determinePalindromic(twoProps));
                                System.out.print(NumsAndProps.determineOdd(twoProps));
                                System.out.print(NumsAndProps.determineGapful(twoProps));
                                counter++;
                            }
                        } else if (sumNum == productNum && twoProps[3].equalsIgnoreCase("PALINDROMIC")) {
                            revString = new StringBuilder(twoProps[0]).reverse().toString();

                            if (revString.equals(twoProps[0])) {
                                System.out.print("\n" + twoProps[0] + " is ");
                                System.out.print(NumsAndProps.determineSpy(twoProps));
                                System.out.print(NumsAndProps.determinePalindromic(twoProps));
                                System.out.print(NumsAndProps.determineDuck(twoProps));
                                System.out.print(NumsAndProps.determineEven(twoProps));
                                System.out.print(NumsAndProps.determineBuzz(twoProps));
                                System.out.print(NumsAndProps.determineOdd(twoProps));
                                System.out.print(NumsAndProps.determineGapful(twoProps));
                                System.out.print(NumsAndProps.determineSunny(twoProps));
                                System.out.print(NumsAndProps.determineSquare(twoProps));
                                counter++;
                            }
                        } else if (sumNum == productNum && twoProps[3].equalsIgnoreCase("GAPFUL")) {
                            gapNum = new StringBuilder();
                            gapNum.append(twoProps[0].charAt(0)).append(twoProps[0].charAt(twoProps[0].length() - 1));
                            if (twoProps[0].length() > 2 && Long.parseLong(twoProps[0]) % Long.parseLong(String.valueOf(twoProps[0].charAt(0)) + twoProps[0].charAt(twoProps[0].length() - 1)) == 0) {
                                System.out.print("\n" + twoProps[0] + " is ");
                                System.out.print(NumsAndProps.determineSpy(twoProps));
                                System.out.print(NumsAndProps.determineGapful(twoProps));
                                System.out.print(NumsAndProps.determineDuck(twoProps));
                                System.out.print(NumsAndProps.determineEven(twoProps));
                                System.out.print(NumsAndProps.determineBuzz(twoProps));
                                System.out.print(NumsAndProps.determinePalindromic(twoProps));
                                System.out.print(NumsAndProps.determineOdd(twoProps));
                                System.out.print(NumsAndProps.determineSunny(twoProps));
                                System.out.print(NumsAndProps.determineSquare(twoProps));
                                counter++;
                            }
                        } else if (!twoProps[3].equalsIgnoreCase("EVEN") && !twoProps[3].equalsIgnoreCase("ODD") &&
                                !twoProps[3].equalsIgnoreCase("BUZZ") && !twoProps[3].equalsIgnoreCase("PALINDROMIC") && !twoProps[3].equalsIgnoreCase("GAPFUL") &&
                                !twoProps[3].equalsIgnoreCase("SQUARE") && !twoProps[3].equalsIgnoreCase("SUNNY")) {
                            NumsAndProps.stringCompare(num);
                            break;
                        }
                    }
                    sumNum = 0;
                    productNum = 1;
                    twoProps[0] = String.valueOf(Long.parseLong(twoProps[0]) + 1);
                }
                System.out.println();
            }
            case "SQUARE" -> {
                while (counter < Long.parseLong(twoProps[1])) {
                    if (Math.sqrt(Long.parseLong(twoProps[0])) % 1 == 0) {
                        if (Long.parseLong(twoProps[0]) % 2 == 0 && Long.parseLong(twoProps[0]) >= 1 && twoProps[3].equalsIgnoreCase("EVEN")) {
                            System.out.print("\n" + twoProps[0] + " is ");
                            System.out.print(NumsAndProps.determineSquare(twoProps));
                            System.out.print(NumsAndProps.determineEven(twoProps));
                            System.out.print(NumsAndProps.determineDuck(twoProps));
                            System.out.print(NumsAndProps.determineBuzz(twoProps));
                            System.out.print(NumsAndProps.determinePalindromic(twoProps));
                            System.out.print(NumsAndProps.determineOdd(twoProps));
                            System.out.print(NumsAndProps.determineGapful(twoProps));
                            System.out.print(NumsAndProps.determineSpy(twoProps));
                            counter++;
                        } else if (Long.parseLong(twoProps[0]) % 2 != 0 && Long.parseLong(twoProps[0]) >= 1 && twoProps[3].equalsIgnoreCase("ODD")) {
                            System.out.print("\n" + twoProps[0] + " is ");
                            System.out.print(NumsAndProps.determineSquare(twoProps));
                            System.out.print(NumsAndProps.determineOdd(twoProps));
                            System.out.print(NumsAndProps.determineDuck(twoProps));
                            System.out.print(NumsAndProps.determineEven(twoProps));
                            System.out.print(NumsAndProps.determineBuzz(twoProps));
                            System.out.print(NumsAndProps.determinePalindromic(twoProps));
                            System.out.print(NumsAndProps.determineGapful(twoProps));
                            System.out.print(NumsAndProps.determineSpy(twoProps));
                            counter++;
                        } else if (Math.sqrt(Long.parseLong(twoProps[0])) % 1 == 0 && twoProps[3].equalsIgnoreCase("SPY")) {
                            sumNum = 0;
                            productNum = 1;

                            for (int i = 0; i < num.length(); i++)
                                sumNum += Long.parseLong(String.valueOf(twoProps[0].charAt(i)));
                            for (int j = 0; j < num.length(); j++)
                                productNum *= Long.parseLong(String.valueOf(twoProps[0].charAt(j)));

                            if (sumNum == productNum) {
                                System.out.print("\n" + twoProps[0] + " is ");
                                System.out.print(NumsAndProps.determineSquare(twoProps));
                                System.out.print(NumsAndProps.determineSpy(twoProps));
                                System.out.print(NumsAndProps.determineEven(twoProps));
                                System.out.print(NumsAndProps.determineDuck(twoProps));
                                System.out.print(NumsAndProps.determineBuzz(twoProps));
                                System.out.print(NumsAndProps.determinePalindromic(twoProps));
                                System.out.print(NumsAndProps.determineOdd(twoProps));
                                System.out.print(NumsAndProps.determineGapful(twoProps));
                                counter++;
                            }
                        } else if (Math.sqrt(Long.parseLong(twoProps[0])) % 1 == 0 && twoProps[3].equalsIgnoreCase("PALINDROMIC")) {
                            revString = new StringBuilder(twoProps[0]).reverse().toString();

                            if (revString.equals(twoProps[0])) {
                                System.out.print("\n" + twoProps[0] + " is ");
                                System.out.print(NumsAndProps.determineSquare(twoProps));
                                System.out.print(NumsAndProps.determinePalindromic(twoProps));
                                System.out.print(NumsAndProps.determineEven(twoProps));
                                System.out.print(NumsAndProps.determineDuck(twoProps));
                                System.out.print(NumsAndProps.determineBuzz(twoProps));
                                System.out.print(NumsAndProps.determineOdd(twoProps));
                                System.out.print(NumsAndProps.determineGapful(twoProps));
                                System.out.print(NumsAndProps.determineSpy(twoProps));
                                counter++;
                            }
                        } else if (twoProps[0].contains("0") && !twoProps[0].startsWith("0") && twoProps[3].equalsIgnoreCase("DUCK")) {
                            System.out.print("\n" + twoProps[0] + " is ");
                            System.out.print(NumsAndProps.determineSquare(twoProps));
                            System.out.print(NumsAndProps.determineDuck(twoProps));
                            System.out.print(NumsAndProps.determineEven(twoProps));
                            System.out.print(NumsAndProps.determineBuzz(twoProps));
                            System.out.print(NumsAndProps.determinePalindromic(twoProps));
                            System.out.print(NumsAndProps.determineOdd(twoProps));
                            System.out.print(NumsAndProps.determineGapful(twoProps));
                            System.out.print(NumsAndProps.determineSpy(twoProps));
                            counter++;
                        } else if (Long.parseLong(twoProps[0]) % 7 == 0 && twoProps[3].equalsIgnoreCase("BUZZ") || Long.parseLong(twoProps[0]) % 10 == 7 && twoProps[3].equalsIgnoreCase("BUZZ")) {
                            System.out.print("\n" + twoProps[0] + " is ");
                            System.out.print(NumsAndProps.determineSquare(twoProps));
                            System.out.print(NumsAndProps.determineBuzz(twoProps));
                            System.out.print(NumsAndProps.determineEven(twoProps));
                            System.out.print(NumsAndProps.determineDuck(twoProps));
                            System.out.print(NumsAndProps.determinePalindromic(twoProps));
                            System.out.print(NumsAndProps.determineOdd(twoProps));
                            System.out.print(NumsAndProps.determineGapful(twoProps));
                            System.out.print(NumsAndProps.determineSpy(twoProps));
                            counter++;
                        } else if (Math.sqrt(Long.parseLong(twoProps[0])) % 1 == 0 && twoProps[3].equalsIgnoreCase("GAPFUL")) {
                            if (twoProps[0].length() > 2 && Long.parseLong(twoProps[0]) % Long.parseLong(String.valueOf(twoProps[0].charAt(0)) + twoProps[0].charAt(twoProps[0].length() - 1)) == 0) {
                                System.out.print("\n" + twoProps[0] + " is ");
                                System.out.print(NumsAndProps.determineSquare(twoProps));
                                System.out.print(NumsAndProps.determineGapful(twoProps));
                                System.out.print(NumsAndProps.determineEven(twoProps));
                                System.out.print(NumsAndProps.determineDuck(twoProps));
                                System.out.print(NumsAndProps.determineBuzz(twoProps));
                                System.out.print(NumsAndProps.determinePalindromic(twoProps));
                                System.out.print(NumsAndProps.determineOdd(twoProps));
                                System.out.print(NumsAndProps.determineSpy(twoProps));
                                counter++;
                            }
                        }
                    } else if (!twoProps[3].equalsIgnoreCase("EVEN") && !twoProps[3].equalsIgnoreCase("ODD") &&
                            !twoProps[3].equalsIgnoreCase("BUZZ") && !twoProps[3].equalsIgnoreCase("DUCK") &&
                            !twoProps[3].equalsIgnoreCase("PALINDROMIC") && !twoProps[3].equalsIgnoreCase("GAPFUL") &&
                            !twoProps[3].equalsIgnoreCase("SPY")) {
                        NumsAndProps.stringCompare(num);
                        break;
                    }
                    twoProps[0] = String.valueOf(Long.parseLong(twoProps[0]) + 1);
                }
                System.out.println();
            }
            case "SUNNY" -> {
                while (counter < Long.parseLong(twoProps[1])) {
                    if (Math.sqrt(Long.parseLong(twoProps[0]) + 1) % 1 == 0) {
                        if (Long.parseLong(twoProps[0]) % 2 == 0 && Long.parseLong(twoProps[0]) >= 1 && twoProps[3].equalsIgnoreCase("EVEN")) {
                            System.out.print("\n" + twoProps[0] + " is ");
                            System.out.print(NumsAndProps.determineSunny(twoProps));
                            System.out.print(NumsAndProps.determineEven(twoProps));
                            System.out.print(NumsAndProps.determineSquare(twoProps));
                            System.out.print(NumsAndProps.determineDuck(twoProps));
                            System.out.print(NumsAndProps.determineBuzz(twoProps));
                            System.out.print(NumsAndProps.determinePalindromic(twoProps));
                            System.out.print(NumsAndProps.determineOdd(twoProps));
                            System.out.print(NumsAndProps.determineGapful(twoProps));
                            System.out.print(NumsAndProps.determineSpy(twoProps));
                            counter++;
                        } else if (Long.parseLong(twoProps[0]) % 2 != 0 && Long.parseLong(twoProps[0]) >= 1 && twoProps[3].equalsIgnoreCase("ODD")) {
                            System.out.print("\n" + twoProps[0] + " is ");
                            System.out.print(NumsAndProps.determineSunny(twoProps));
                            System.out.print(NumsAndProps.determineOdd(twoProps));
                            System.out.print(NumsAndProps.determineEven(twoProps));
                            System.out.print(NumsAndProps.determineSquare(twoProps));
                            System.out.print(NumsAndProps.determineDuck(twoProps));
                            System.out.print(NumsAndProps.determineBuzz(twoProps));
                            System.out.print(NumsAndProps.determinePalindromic(twoProps));
                            System.out.print(NumsAndProps.determineGapful(twoProps));
                            System.out.print(NumsAndProps.determineSpy(twoProps));
                            counter++;
                        } else if (Math.sqrt(Long.parseLong(twoProps[0]) + 1) % 1 == 0 && twoProps[3].equalsIgnoreCase("SPY")) {
                            sumNum = 0;
                            productNum = 1;

                            for (int i = 0; i < num.length(); i++)
                                sumNum += Long.parseLong(String.valueOf(twoProps[0].charAt(i)));
                            for (int j = 0; j < num.length(); j++)
                                productNum *= Long.parseLong(String.valueOf(twoProps[0].charAt(j)));

                            if (sumNum == productNum) {
                                System.out.print("\n" + twoProps[0] + " is ");
                                System.out.print(NumsAndProps.determineSunny(twoProps));
                                System.out.print(NumsAndProps.determineSpy(twoProps));
                                System.out.print(NumsAndProps.determineEven(twoProps));
                                System.out.print(NumsAndProps.determineSquare(twoProps));
                                System.out.print(NumsAndProps.determineDuck(twoProps));
                                System.out.print(NumsAndProps.determineBuzz(twoProps));
                                System.out.print(NumsAndProps.determinePalindromic(twoProps));
                                System.out.print(NumsAndProps.determineOdd(twoProps));
                                System.out.print(NumsAndProps.determineGapful(twoProps));
                                counter++;
                            }
                        } else if (Math.sqrt(Long.parseLong(twoProps[0]) + 1) % 1 == 0 && twoProps[3].equalsIgnoreCase("PALINDROMIC")) {
                            revString = new StringBuilder(twoProps[0]).reverse().toString();

                            if (revString.equals(twoProps[0])) {
                                System.out.print("\n" + twoProps[0] + " is ");
                                System.out.print(NumsAndProps.determineSunny(twoProps));
                                System.out.print(NumsAndProps.determinePalindromic(twoProps));
                                System.out.print(NumsAndProps.determineEven(twoProps));
                                System.out.print(NumsAndProps.determineSquare(twoProps));
                                System.out.print(NumsAndProps.determineDuck(twoProps));
                                System.out.print(NumsAndProps.determineBuzz(twoProps));
                                System.out.print(NumsAndProps.determineOdd(twoProps));
                                System.out.print(NumsAndProps.determineGapful(twoProps));
                                System.out.print(NumsAndProps.determineSpy(twoProps));
                                counter++;
                            }
                        } else if (twoProps[0].contains("0") && !twoProps[0].startsWith("0") && twoProps[3].equalsIgnoreCase("DUCK")) {
                            System.out.print("\n" + twoProps[0] + " is ");
                            System.out.print(NumsAndProps.determineSunny(twoProps));
                            System.out.print(NumsAndProps.determineDuck(twoProps));
                            System.out.print(NumsAndProps.determineEven(twoProps));
                            System.out.print(NumsAndProps.determineSquare(twoProps));
                            System.out.print(NumsAndProps.determineBuzz(twoProps));
                            System.out.print(NumsAndProps.determinePalindromic(twoProps));
                            System.out.print(NumsAndProps.determineOdd(twoProps));
                            System.out.print(NumsAndProps.determineGapful(twoProps));
                            System.out.print(NumsAndProps.determineSpy(twoProps));
                            counter++;
                        } else if (Long.parseLong(twoProps[0]) % 7 == 0 && twoProps[3].equalsIgnoreCase("BUZZ") || Long.parseLong(twoProps[0]) % 10 == 7 && twoProps[3].equalsIgnoreCase("BUZZ")) {
                            System.out.print("\n" + twoProps[0] + " is ");
                            System.out.print(NumsAndProps.determineSunny(twoProps));
                            System.out.print(NumsAndProps.determineBuzz(twoProps));
                            System.out.print(NumsAndProps.determineEven(twoProps));
                            System.out.print(NumsAndProps.determineSquare(twoProps));
                            System.out.print(NumsAndProps.determineDuck(twoProps));
                            System.out.print(NumsAndProps.determinePalindromic(twoProps));
                            System.out.print(NumsAndProps.determineOdd(twoProps));
                            System.out.print(NumsAndProps.determineGapful(twoProps));
                            System.out.print(NumsAndProps.determineSpy(twoProps));
                            counter++;
                        } else if (Math.sqrt(Long.parseLong(twoProps[0]) + 1) % 1 == 0 && twoProps[3].equalsIgnoreCase("GAPFUL")) {
                            if (twoProps[0].length() > 2 && Long.parseLong(twoProps[0]) % Long.parseLong(String.valueOf(twoProps[0].charAt(0)) + twoProps[0].charAt(twoProps[0].length() - 1)) == 0) {
                                System.out.print("\n" + twoProps[0] + " is ");
                                System.out.print(NumsAndProps.determineSunny(twoProps));
                                System.out.print(NumsAndProps.determineGapful(twoProps));
                                System.out.print(NumsAndProps.determineEven(twoProps));
                                System.out.print(NumsAndProps.determineSquare(twoProps));
                                System.out.print(NumsAndProps.determineDuck(twoProps));
                                System.out.print(NumsAndProps.determineBuzz(twoProps));
                                System.out.print(NumsAndProps.determinePalindromic(twoProps));
                                System.out.print(NumsAndProps.determineOdd(twoProps));
                                System.out.print(NumsAndProps.determineSpy(twoProps));
                                counter++;
                            }
                        }
                    } else if (!twoProps[3].equalsIgnoreCase("EVEN") && !twoProps[3].equalsIgnoreCase("ODD") &&
                            !twoProps[3].equalsIgnoreCase("BUZZ") && !twoProps[3].equalsIgnoreCase("DUCK") &&
                            !twoProps[3].equalsIgnoreCase("PALINDROMIC") && !twoProps[3].equalsIgnoreCase("GAPFUL") &&
                            !twoProps[3].equalsIgnoreCase("SPY")) {
                        NumsAndProps.stringCompare(num);
                        break;
                    }
                    twoProps[0] = String.valueOf(Long.parseLong(twoProps[0]) + 1);
                }
                System.out.println();
            }
            default -> NumsAndProps.stringCompare(num);
        }
    }
}
