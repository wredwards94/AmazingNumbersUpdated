public class TwoNumsTwoProps {
    static void twoNumsTwoProps(String[] twoProps) {
        NumMenu.COUNTER = 0;

        switch (twoProps[2].toUpperCase()){
            case "EVEN" -> {
                while (NumMenu.COUNTER < Long.parseLong(twoProps[1])) {
                    if (SingleNum.isEven(twoProps[0]) && SingleNum.isBuzz(twoProps[0]) && twoProps[3].equalsIgnoreCase(Properties.BUZZ.properties)) {
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
                        NumMenu.COUNTER++;
                    } else if (SingleNum.isEven(twoProps[0]) && SingleNum.isDuck(twoProps[0]) && twoProps[3].equalsIgnoreCase(Properties.DUCK.properties)) {
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
                        NumMenu.COUNTER++;
                    } else if (SingleNum.isEven(twoProps[0]) && SingleNum.isPalindromic(twoProps[0]) && twoProps[3].equalsIgnoreCase(Properties.PALINDROMIC.properties)) {
                        System.out.print("\n" + twoProps[0] + " is ");
                        System.out.print(NumsAndProps.determineEven(twoProps));
                        System.out.print(NumsAndProps.determinePalindromic(twoProps));
                        System.out.print(NumsAndProps.determineDuck(twoProps));
                        System.out.print(NumsAndProps.determineBuzz(twoProps));
                        System.out.print(NumsAndProps.determineGapful(twoProps));
                        System.out.print(NumsAndProps.determineSpy(twoProps));
                        System.out.print(NumsAndProps.determineSunny(twoProps));
                        System.out.print(NumsAndProps.determineSquare(twoProps));
                        twoProps[0] = String.valueOf(Long.parseLong(twoProps[0]) + 1);
                        NumMenu.COUNTER++;
                    } else if (SingleNum.isEven(twoProps[0]) && SingleNum.isGapful(twoProps[0]) && twoProps[3].equalsIgnoreCase(Properties.GAPFUL.properties)) {
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
                        NumMenu.COUNTER++;
                    } else if (SingleNum.isEven(twoProps[0]) && SingleNum.isSpy(twoProps[0]) && twoProps[3].equalsIgnoreCase(Properties.SPY.properties)) {
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
                        NumMenu.COUNTER++;
                    } else if (SingleNum.isEven(twoProps[0]) && SingleNum.isSunny(twoProps[0]) && twoProps[3].equalsIgnoreCase(Properties.SUNNY.properties)) {
                        System.out.print("\n" + twoProps[0] + " is ");
                        System.out.print(NumsAndProps.determineEven(twoProps));
                        System.out.print(NumsAndProps.determineSunny(twoProps));
                        System.out.print(NumsAndProps.determineGapful(twoProps));
                        System.out.print(NumsAndProps.determineDuck(twoProps));
                        System.out.print(NumsAndProps.determineBuzz(twoProps));
                        System.out.print(NumsAndProps.determinePalindromic(twoProps));
                        System.out.print(NumsAndProps.determineSpy(twoProps));
                        System.out.print(NumsAndProps.determineSquare(twoProps));
                        twoProps[0] = String.valueOf(Long.parseLong(twoProps[0]) + 1);
                        NumMenu.COUNTER++;
                    } else if (SingleNum.isEven(twoProps[0]) && SingleNum.isSquare(twoProps[0]) && twoProps[3].equalsIgnoreCase(Properties.SQUARE.properties)) {
                        System.out.print("\n" + twoProps[0] + " is ");
                        System.out.print(NumsAndProps.determineEven(twoProps));
                        System.out.print(NumsAndProps.determineSquare(twoProps));
                        System.out.print(NumsAndProps.determineGapful(twoProps));
                        System.out.print(NumsAndProps.determineDuck(twoProps));
                        System.out.print(NumsAndProps.determineBuzz(twoProps));
                        System.out.print(NumsAndProps.determinePalindromic(twoProps));
                        System.out.print(NumsAndProps.determineSpy(twoProps));
                        System.out.print(NumsAndProps.determineSunny(twoProps));
                        twoProps[0] = String.valueOf(Long.parseLong(twoProps[0]) + 1);
                        NumMenu.COUNTER++;
                    }  else if (!twoProps[3].equalsIgnoreCase(Properties.BUZZ.properties) && !twoProps[3].equalsIgnoreCase(Properties.DUCK.properties) &&
                            !twoProps[3].equalsIgnoreCase(Properties.PALINDROMIC.properties) && !twoProps[3].equalsIgnoreCase(Properties.GAPFUL.properties) &&
                            !twoProps[3].equalsIgnoreCase(Properties.SPY.properties) && !twoProps[3].equalsIgnoreCase(Properties.SQUARE.properties) &&
                            !twoProps[3].equalsIgnoreCase(Properties.SUNNY.properties)) {
                        NumsAndProps.stringCompare(twoProps);
                        break;
                    }
                    twoProps[0] = String.valueOf(Long.parseLong(twoProps[0]) + 1);
                }
                System.out.println();
            }
            case "ODD" -> {
                while (NumMenu.COUNTER < Long.parseLong(twoProps[1])){
                    if (SingleNum.isOdd(twoProps[0]) && SingleNum.isBuzz(twoProps[0]) && twoProps[3].equalsIgnoreCase(Properties.BUZZ.properties)){
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
                        NumMenu.COUNTER++;
                    } else if (SingleNum.isOdd(twoProps[0]) && SingleNum.isDuck(twoProps[0]) && twoProps[3].equalsIgnoreCase(Properties.DUCK.properties)){
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
                        NumMenu.COUNTER++;
                    } else if (SingleNum.isOdd(twoProps[0]) && SingleNum.isPalindromic(twoProps[0]) && twoProps[3].equalsIgnoreCase(Properties.PALINDROMIC.properties)){
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
                        NumMenu.COUNTER++;
                    } else if (SingleNum.isOdd(twoProps[0]) && SingleNum.isGapful(twoProps[0]) && twoProps[3].equalsIgnoreCase(Properties.GAPFUL.properties)){
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
                        NumMenu.COUNTER++;
                    } else if (SingleNum.isOdd(twoProps[0]) && SingleNum.isSpy(twoProps[0]) && twoProps[3].equalsIgnoreCase(Properties.SPY.properties)){
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
                        NumMenu.COUNTER++;
                    } else if (SingleNum.isOdd(twoProps[0]) && SingleNum.isSunny(twoProps[0]) && twoProps[3].equalsIgnoreCase(Properties.SUNNY.properties)){
                        System.out.print("\n" + twoProps[0] + " is ");
                        System.out.print(NumsAndProps.determineOdd(twoProps));
                        System.out.print(NumsAndProps.determineSunny(twoProps));
                        System.out.print(NumsAndProps.determineBuzz(twoProps));
                        System.out.print(NumsAndProps.determineDuck(twoProps));
                        System.out.print(NumsAndProps.determinePalindromic(twoProps));
                        System.out.print(NumsAndProps.determineGapful(twoProps));
                        System.out.print(NumsAndProps.determineSpy(twoProps));
                        System.out.print(NumsAndProps.determineSquare(twoProps));
                        twoProps[0] = String.valueOf(Long.parseLong(twoProps[0]) + 1);
                        NumMenu.COUNTER++;
                    } else if (SingleNum.isOdd(twoProps[0]) && SingleNum.isSquare(twoProps[0]) && twoProps[3].equalsIgnoreCase(Properties.SQUARE.properties)){
                        System.out.print("\n" + twoProps[0] + " is ");
                        System.out.print(NumsAndProps.determineOdd(twoProps));
                        System.out.print(NumsAndProps.determineSquare(twoProps));
                        System.out.print(NumsAndProps.determineBuzz(twoProps));
                        System.out.print(NumsAndProps.determineDuck(twoProps));
                        System.out.print(NumsAndProps.determinePalindromic(twoProps));
                        System.out.print(NumsAndProps.determineGapful(twoProps));
                        System.out.print(NumsAndProps.determineSpy(twoProps));
                        System.out.print(NumsAndProps.determineSunny(twoProps));
                        twoProps[0] = String.valueOf(Long.parseLong(twoProps[0]) + 1);
                        NumMenu.COUNTER++;
                    } else if (!twoProps[3].equalsIgnoreCase(Properties.BUZZ.properties) && !twoProps[3].equalsIgnoreCase(Properties.DUCK.properties) &&
                            !twoProps[3].equalsIgnoreCase(Properties.PALINDROMIC.properties) && !twoProps[3].equalsIgnoreCase(Properties.GAPFUL.properties) &&
                            !twoProps[3].equalsIgnoreCase(Properties.SPY.properties) && !twoProps[3].equalsIgnoreCase(Properties.SQUARE.properties) &&
                            !twoProps[3].equalsIgnoreCase(Properties.SUNNY.properties)){
                        NumsAndProps.stringCompare(twoProps);
                        break;
                    }
                    twoProps[0] = String.valueOf(Long.parseLong(twoProps[0]) + 1);
                }
                System.out.println();
            }
            case "BUZZ" -> {
                while(NumMenu.COUNTER < Long.parseLong(twoProps[1])) {
                    if (SingleNum.isBuzz(twoProps[0]) && SingleNum.isEven(twoProps[0]) && twoProps[3].equalsIgnoreCase(Properties.EVEN.properties)) {
                        System.out.print("\n" + twoProps[0] + " is ");
                        System.out.print(NumsAndProps.determineBuzz(twoProps));
                        System.out.print(NumsAndProps.determineEven(twoProps));
                        System.out.print(NumsAndProps.determineDuck(twoProps));
                        System.out.print(NumsAndProps.determinePalindromic(twoProps));
                        System.out.print(NumsAndProps.determineGapful(twoProps));
                        System.out.print(NumsAndProps.determineSpy(twoProps));
                        System.out.print(NumsAndProps.determineSunny(twoProps));
                        System.out.print(NumsAndProps.determineSquare(twoProps));
                        twoProps[0] = String.valueOf(Long.parseLong(twoProps[0]) + 1);
                        NumMenu.COUNTER++;
                    } else if (SingleNum.isBuzz(twoProps[0]) && SingleNum.isOdd(twoProps[0]) && twoProps[3].equalsIgnoreCase(Properties.ODD.properties)) {
                        System.out.print("\n" + twoProps[0] + " is ");
                        System.out.print(NumsAndProps.determineBuzz(twoProps));
                        System.out.print(NumsAndProps.determineOdd(twoProps));
                        System.out.print(NumsAndProps.determineDuck(twoProps));
                        System.out.print(NumsAndProps.determinePalindromic(twoProps));
                        System.out.print(NumsAndProps.determineGapful(twoProps));
                        System.out.print(NumsAndProps.determineSpy(twoProps));
                        System.out.print(NumsAndProps.determineSunny(twoProps));
                        System.out.print(NumsAndProps.determineSquare(twoProps));
                        twoProps[0] = String.valueOf(Long.parseLong(twoProps[0]) + 1);
                        NumMenu.COUNTER++;
                    } else if (SingleNum.isBuzz(twoProps[0]) && SingleNum.isDuck(twoProps[0]) && twoProps[3].equalsIgnoreCase(Properties.DUCK.properties)) {
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
                        NumMenu.COUNTER++;
                    } else if (SingleNum.isBuzz(twoProps[0]) && SingleNum.isPalindromic(twoProps[0]) && twoProps[3].equalsIgnoreCase(Properties.PALINDROMIC.properties)) {
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
                        NumMenu.COUNTER++;
                    } else if (SingleNum.isBuzz(twoProps[0]) && SingleNum.isGapful(twoProps[0]) && twoProps[3].equalsIgnoreCase(Properties.GAPFUL.properties)) {
                        System.out.print("\n" + twoProps[0] + " is ");
                        System.out.print(NumsAndProps.determineBuzz(twoProps));
                        System.out.print(NumsAndProps.determineGapful(twoProps));
                        System.out.print(NumsAndProps.determineEven(twoProps));
                        System.out.print(NumsAndProps.determineOdd(twoProps));
                        System.out.print(NumsAndProps.determineDuck(twoProps));
                        System.out.print(NumsAndProps.determinePalindromic(twoProps));
                        System.out.print(NumsAndProps.determineSpy(twoProps));
                        System.out.print(NumsAndProps.determineSunny(twoProps));
                        System.out.print(NumsAndProps.determineSquare(twoProps));
                        twoProps[0] = String.valueOf(Long.parseLong(twoProps[0]) + 1);
                        NumMenu.COUNTER++;
                    } else if (SingleNum.isBuzz(twoProps[0]) && SingleNum.isSpy(twoProps[0]) && twoProps[3].equalsIgnoreCase(Properties.SPY.properties)) {
                        System.out.print("\n" + twoProps[0] + " is ");
                        System.out.print(NumsAndProps.determineBuzz(twoProps));
                        System.out.print(NumsAndProps.determineSpy(twoProps));
                        System.out.print(NumsAndProps.determineEven(twoProps));
                        System.out.print(NumsAndProps.determineOdd(twoProps));
                        System.out.print(NumsAndProps.determineDuck(twoProps));
                        System.out.print(NumsAndProps.determinePalindromic(twoProps));
                        System.out.print(NumsAndProps.determineGapful(twoProps));
                        System.out.print(NumsAndProps.determineSunny(twoProps));
                        System.out.print(NumsAndProps.determineSquare(twoProps));
                        twoProps[0] = String.valueOf(Long.parseLong(twoProps[0]) + 1);
                        NumMenu.COUNTER++;
                    } else if (SingleNum.isBuzz(twoProps[0]) && SingleNum.isSunny(twoProps[0]) && twoProps[3].equalsIgnoreCase(Properties.SUNNY.properties)) {
                        System.out.print("\n" + twoProps[0] + " is ");
                        System.out.print(NumsAndProps.determineBuzz(twoProps));
                        System.out.print(NumsAndProps.determineSunny(twoProps));
                        System.out.print(NumsAndProps.determineEven(twoProps));
                        System.out.print(NumsAndProps.determineOdd(twoProps));
                        System.out.print(NumsAndProps.determineDuck(twoProps));
                        System.out.print(NumsAndProps.determinePalindromic(twoProps));
                        System.out.print(NumsAndProps.determineGapful(twoProps));
                        System.out.print(NumsAndProps.determineSpy(twoProps));
                        System.out.print(NumsAndProps.determineSquare(twoProps));
                        twoProps[0] = String.valueOf(Long.parseLong(twoProps[0]) + 1);
                        NumMenu.COUNTER++;
                    } else if (SingleNum.isBuzz(twoProps[0]) && SingleNum.isSquare(twoProps[0]) && twoProps[3].equalsIgnoreCase(Properties.SQUARE.properties)) {
                        System.out.print("\n" + twoProps[0] + " is ");
                        System.out.print(NumsAndProps.determineBuzz(twoProps));
                        System.out.print(NumsAndProps.determineSquare(twoProps));
                        System.out.print(NumsAndProps.determineEven(twoProps));
                        System.out.print(NumsAndProps.determineOdd(twoProps));
                        System.out.print(NumsAndProps.determineDuck(twoProps));
                        System.out.print(NumsAndProps.determinePalindromic(twoProps));
                        System.out.print(NumsAndProps.determineGapful(twoProps));
                        System.out.print(NumsAndProps.determineSpy(twoProps));
                        System.out.print(NumsAndProps.determineSunny(twoProps));
                        twoProps[0] = String.valueOf(Long.parseLong(twoProps[0]) + 1);
                        NumMenu.COUNTER++;
                    } else if (!twoProps[3].equalsIgnoreCase(Properties.EVEN.properties) && !twoProps[3].equalsIgnoreCase(Properties.ODD.properties) &&
                            !twoProps[3].equalsIgnoreCase(Properties.BUZZ.properties) && !twoProps[3].equalsIgnoreCase(Properties.DUCK.properties) &&
                            !twoProps[3].equalsIgnoreCase(Properties.PALINDROMIC.properties) && !twoProps[3].equalsIgnoreCase(Properties.GAPFUL.properties) &&
                            !twoProps[3].equalsIgnoreCase(Properties.SPY.properties) && !twoProps[3].equalsIgnoreCase(Properties.SQUARE.properties) &&
                            !twoProps[3].equalsIgnoreCase(Properties.SUNNY.properties)){
                        NumsAndProps.stringCompare(twoProps);
                        break;
                    }
                    twoProps[0] = String.valueOf(Long.parseLong(twoProps[0]) + 1);
                }
                System.out.println();
            }
            case "DUCK" -> {
                while (NumMenu.COUNTER < Long.parseLong(twoProps[1])){
                    if (SingleNum.isDuck(twoProps[0]) && SingleNum.isEven(twoProps[0]) && twoProps[3].equalsIgnoreCase(Properties.EVEN.properties)) {
                        System.out.print("\n" + twoProps[0] + " is ");
                        System.out.print(NumsAndProps.determineDuck(twoProps));
                        System.out.print(NumsAndProps.determineEven(twoProps));
                        System.out.print(NumsAndProps.determineBuzz(twoProps));
                        System.out.print(NumsAndProps.determinePalindromic(twoProps));
                        System.out.print(NumsAndProps.determineGapful(twoProps));
                        System.out.print(NumsAndProps.determineSunny(twoProps));
                        System.out.print(NumsAndProps.determineSquare(twoProps));
                        twoProps[0] = String.valueOf(Long.parseLong(twoProps[0]) + 1);
                        NumMenu.COUNTER++;
                    } else if (SingleNum.isDuck(twoProps[0]) && SingleNum.isOdd(twoProps[0]) && twoProps[3].equalsIgnoreCase(Properties.ODD.properties)) {
                        System.out.print("\n" + twoProps[0] + " is ");
                        System.out.print(NumsAndProps.determineDuck(twoProps));
                        System.out.print(NumsAndProps.determineOdd(twoProps));
                        System.out.print(NumsAndProps.determineBuzz(twoProps));
                        System.out.print(NumsAndProps.determinePalindromic(twoProps));
                        System.out.print(NumsAndProps.determineGapful(twoProps));
                        System.out.print(NumsAndProps.determineSunny(twoProps));
                        System.out.print(NumsAndProps.determineSquare(twoProps));

                        twoProps[0] = String.valueOf(Long.parseLong(twoProps[0]) + 1);
                        NumMenu.COUNTER++;
                    } else if (SingleNum.isDuck(twoProps[0]) && SingleNum.isBuzz(twoProps[0]) && twoProps[3].equalsIgnoreCase(Properties.BUZZ.properties)) {
                        System.out.print("\n" + twoProps[0] + " is ");
                        System.out.print(NumsAndProps.determineDuck(twoProps));
                        System.out.print(NumsAndProps.determineBuzz(twoProps));
                        System.out.print(NumsAndProps.determineEven(twoProps));
                        System.out.print(NumsAndProps.determineOdd(twoProps));
                        System.out.print(NumsAndProps.determinePalindromic(twoProps));
                        System.out.print(NumsAndProps.determineGapful(twoProps));
                        System.out.print(NumsAndProps.determineSunny(twoProps));
                        System.out.print(NumsAndProps.determineSquare(twoProps));
                        twoProps[0] = String.valueOf(Long.parseLong(twoProps[0]) + 1);
                        NumMenu.COUNTER++;
                    } else if (SingleNum.isDuck(twoProps[0]) && SingleNum.isPalindromic(twoProps[0]) && twoProps[3].equalsIgnoreCase(Properties.PALINDROMIC.properties)) {
                        System.out.print("\n" + twoProps[0] + " is ");
                        System.out.print(NumsAndProps.determineDuck(twoProps));
                        System.out.print(NumsAndProps.determinePalindromic(twoProps));
                        System.out.print(NumsAndProps.determineEven(twoProps));
                        System.out.print(NumsAndProps.determineOdd(twoProps));
                        System.out.print(NumsAndProps.determineBuzz(twoProps));
                        System.out.print(NumsAndProps.determineGapful(twoProps));
                        System.out.print(NumsAndProps.determineSunny(twoProps));
                        System.out.print(NumsAndProps.determineSquare(twoProps));
                        twoProps[0] = String.valueOf(Long.parseLong(twoProps[0]) + 1);
                        NumMenu.COUNTER++;
                    } else if (SingleNum.isDuck(twoProps[0]) && SingleNum.isGapful(twoProps[0]) && twoProps[3].equalsIgnoreCase(Properties.GAPFUL.properties)) {
                        System.out.print("\n" + twoProps[0] + " is ");
                        System.out.print(NumsAndProps.determineDuck(twoProps));
                        System.out.print(NumsAndProps.determineGapful(twoProps));
                        System.out.print(NumsAndProps.determineEven(twoProps));
                        System.out.print(NumsAndProps.determineOdd(twoProps));
                        System.out.print(NumsAndProps.determineBuzz(twoProps));
                        System.out.print(NumsAndProps.determinePalindromic(twoProps));
                        System.out.print(NumsAndProps.determineSunny(twoProps));
                        System.out.print(NumsAndProps.determineSquare(twoProps));
                        twoProps[0] = String.valueOf(Long.parseLong(twoProps[0]) + 1);
                        NumMenu.COUNTER++;
                    } else if (SingleNum.isDuck(twoProps[0]) && SingleNum.isSunny(twoProps[0]) && twoProps[3].equalsIgnoreCase(Properties.SUNNY.properties)) {
                        System.out.print("\n" + twoProps[0] + " is ");
                        System.out.print(NumsAndProps.determineDuck(twoProps));
                        System.out.print(NumsAndProps.determineSunny(twoProps));
                        System.out.print(NumsAndProps.determineEven(twoProps));
                        System.out.print(NumsAndProps.determineOdd(twoProps));
                        System.out.print(NumsAndProps.determineBuzz(twoProps));
                        System.out.print(NumsAndProps.determinePalindromic(twoProps));
                        System.out.print(NumsAndProps.determineGapful(twoProps));
                        System.out.print(NumsAndProps.determineSquare(twoProps));
                        twoProps[0] = String.valueOf(Long.parseLong(twoProps[0]) + 1);
                        NumMenu.COUNTER++;
                    } else if (SingleNum.isDuck(twoProps[0]) && SingleNum.isSquare(twoProps[0]) && twoProps[3].equalsIgnoreCase(Properties.SQUARE.properties)) {
                        System.out.print("\n" + twoProps[0] + " is ");
                        System.out.print(NumsAndProps.determineDuck(twoProps));
                        System.out.print(NumsAndProps.determineSquare(twoProps));
                        System.out.print(NumsAndProps.determineEven(twoProps));
                        System.out.print(NumsAndProps.determineOdd(twoProps));
                        System.out.print(NumsAndProps.determineBuzz(twoProps));
                        System.out.print(NumsAndProps.determinePalindromic(twoProps));
                        System.out.print(NumsAndProps.determineGapful(twoProps));
                        System.out.print(NumsAndProps.determineSunny(twoProps));
                        twoProps[0] = String.valueOf(Long.parseLong(twoProps[0]) + 1);
                        NumMenu.COUNTER++;
                    } else if (!twoProps[3].equalsIgnoreCase(Properties.EVEN.properties) && !twoProps[3].equalsIgnoreCase(Properties.ODD.properties) &&
                            !twoProps[3].equalsIgnoreCase(Properties.PALINDROMIC.properties) && !twoProps[3].equalsIgnoreCase(Properties.GAPFUL.properties) &&
                            !twoProps[3].equalsIgnoreCase(Properties.BUZZ.properties) && !twoProps[3].equalsIgnoreCase(Properties.SQUARE.properties) &&
                            !twoProps[3].equalsIgnoreCase(Properties.SUNNY.properties)){
                        NumsAndProps.stringCompare(twoProps);
                        break;
                    }
                    twoProps[0] = String.valueOf(Long.parseLong(twoProps[0]) + 1);
                }
                System.out.println();
            }
            case "PALINDROMIC" -> {
                while(NumMenu.COUNTER < Long.parseLong(twoProps[1])) {
                    if (SingleNum.isPalindromic(twoProps[0]) && SingleNum.isEven(twoProps[0]) && twoProps[3].equalsIgnoreCase(Properties.EVEN.properties)) {
                        System.out.print("\n" + twoProps[0] + " is ");
                        System.out.print(NumsAndProps.determinePalindromic(twoProps));
                        System.out.print(NumsAndProps.determineEven(twoProps));
                        System.out.print(NumsAndProps.determineBuzz(twoProps));
                        System.out.print(NumsAndProps.determineDuck(twoProps));
                        System.out.print(NumsAndProps.determineGapful(twoProps));
                        System.out.print(NumsAndProps.determineSpy(twoProps));
                        System.out.print(NumsAndProps.determineSunny(twoProps));
                        System.out.print(NumsAndProps.determineSquare(twoProps));
                        twoProps[0] = String.valueOf(Long.parseLong(twoProps[0]) + 1);
                        NumMenu.COUNTER++;
                    } else if (SingleNum.isPalindromic(twoProps[0]) && SingleNum.isOdd(twoProps[0]) && twoProps[3].equalsIgnoreCase(Properties.ODD.properties)) {
                        System.out.print("\n" + twoProps[0] + " is ");
                        System.out.print(NumsAndProps.determinePalindromic(twoProps));
                        System.out.print(NumsAndProps.determineOdd(twoProps));
                        System.out.print(NumsAndProps.determineBuzz(twoProps));
                        System.out.print(NumsAndProps.determineDuck(twoProps));
                        System.out.print(NumsAndProps.determineGapful(twoProps));
                        System.out.print(NumsAndProps.determineSpy(twoProps));
                        System.out.print(NumsAndProps.determineSunny(twoProps));
                        System.out.print(NumsAndProps.determineSquare(twoProps));
                        twoProps[0] = String.valueOf(Long.parseLong(twoProps[0]) + 1);
                        NumMenu.COUNTER++;
                    } else if (SingleNum.isPalindromic(twoProps[0]) && SingleNum.isDuck(twoProps[0]) && twoProps[3].equalsIgnoreCase(Properties.DUCK.properties)) {
                        System.out.print("\n" + twoProps[0] + " is ");
                        System.out.print(NumsAndProps.determinePalindromic(twoProps));
                        System.out.print(NumsAndProps.determineDuck(twoProps));
                        System.out.print(NumsAndProps.determineEven(twoProps));
                        System.out.print(NumsAndProps.determineOdd(twoProps));
                        System.out.print(NumsAndProps.determineBuzz(twoProps));
                        System.out.print(NumsAndProps.determineGapful(twoProps));
                        System.out.print(NumsAndProps.determineSpy(twoProps));
                        System.out.print(NumsAndProps.determineSunny(twoProps));
                        System.out.print(NumsAndProps.determineSquare(twoProps));
                        twoProps[0] = String.valueOf(Long.parseLong(twoProps[0]) + 1);
                        NumMenu.COUNTER++;
                    } else if (SingleNum.isPalindromic(twoProps[0]) && SingleNum.isBuzz(twoProps[0]) && twoProps[3].equalsIgnoreCase(Properties.BUZZ.properties)) {
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
                        NumMenu.COUNTER++;
                    } else if (SingleNum.isPalindromic(twoProps[0]) && SingleNum.isGapful(twoProps[0]) && twoProps[3].equalsIgnoreCase(Properties.GAPFUL.properties)) {
                        System.out.print("\n" + twoProps[0] + " is ");
                        System.out.print(NumsAndProps.determinePalindromic(twoProps));
                        System.out.print(NumsAndProps.determineGapful(twoProps));
                        System.out.print(NumsAndProps.determineEven(twoProps));
                        System.out.print(NumsAndProps.determineOdd(twoProps));
                        System.out.print(NumsAndProps.determineBuzz(twoProps));
                        System.out.print(NumsAndProps.determineDuck(twoProps));
                        System.out.print(NumsAndProps.determineSpy(twoProps));
                        System.out.print(NumsAndProps.determineSunny(twoProps));
                        System.out.print(NumsAndProps.determineSquare(twoProps));
                        twoProps[0] = String.valueOf(Long.parseLong(twoProps[0]) + 1);
                        NumMenu.COUNTER++;
                    } else if (SingleNum.isPalindromic(twoProps[0]) && SingleNum.isSunny(twoProps[0]) && twoProps[3].equalsIgnoreCase(Properties.SUNNY.properties)) {
                        System.out.print("\n" + twoProps[0] + " is ");
                        System.out.print(NumsAndProps.determinePalindromic(twoProps));
                        System.out.print(NumsAndProps.determineSunny(twoProps));
                        System.out.print(NumsAndProps.determineEven(twoProps));
                        System.out.print(NumsAndProps.determineOdd(twoProps));
                        System.out.print(NumsAndProps.determineBuzz(twoProps));
                        System.out.print(NumsAndProps.determineDuck(twoProps));
                        System.out.print(NumsAndProps.determineGapful(twoProps));
                        System.out.print(NumsAndProps.determineSpy(twoProps));
                        System.out.print(NumsAndProps.determineSquare(twoProps));
                        twoProps[0] = String.valueOf(Long.parseLong(twoProps[0]) + 1);
                        NumMenu.COUNTER++;
                    }
                    else if (SingleNum.isPalindromic(twoProps[0]) && SingleNum.isSquare(twoProps[0]) && twoProps[3].equalsIgnoreCase(Properties.SQUARE.properties)) {
                        System.out.print("\n" + twoProps[0] + " is ");
                        System.out.print(NumsAndProps.determinePalindromic(twoProps));
                        System.out.print(NumsAndProps.determineSquare(twoProps));
                        System.out.print(NumsAndProps.determineEven(twoProps));
                        System.out.print(NumsAndProps.determineOdd(twoProps));
                        System.out.print(NumsAndProps.determineBuzz(twoProps));
                        System.out.print(NumsAndProps.determineDuck(twoProps));
                        System.out.print(NumsAndProps.determineGapful(twoProps));
                        System.out.print(NumsAndProps.determineSpy(twoProps));
                        System.out.print(NumsAndProps.determineSunny(twoProps));

                        twoProps[0] = String.valueOf(Long.parseLong(twoProps[0]) + 1);
                        NumMenu.COUNTER++;
                    } else if (!twoProps[3].equalsIgnoreCase(Properties.EVEN.properties) && !twoProps[3].equalsIgnoreCase(Properties.ODD.properties) &&
                            !twoProps[3].equalsIgnoreCase(Properties.DUCK.properties) && !twoProps[3].equalsIgnoreCase(Properties.PALINDROMIC.properties) &&
                            !twoProps[3].equalsIgnoreCase(Properties.GAPFUL.properties) && !twoProps[3].equalsIgnoreCase(Properties.BUZZ.properties) &&
                            !twoProps[3].equalsIgnoreCase(Properties.SQUARE.properties) && !twoProps[3].equalsIgnoreCase(Properties.SUNNY.properties)){
                        NumsAndProps.stringCompare(twoProps);
                        break;
                    }
                    twoProps[0] = String.valueOf(Long.parseLong(twoProps[0]) + 1);
                }
                System.out.println();
            }
            case "GAPFUL" -> {
                while(NumMenu.COUNTER < Long.parseLong(twoProps[1])) {
                    if (SingleNum.isGapful(twoProps[0]) && SingleNum.isEven(twoProps[0]) && twoProps[3].equalsIgnoreCase(Properties.EVEN.properties)) {
                        System.out.print("\n" + twoProps[0] + " is ");
                        System.out.print(NumsAndProps.determineGapful(twoProps));
                        System.out.print(NumsAndProps.determineEven(twoProps));
                        System.out.print(NumsAndProps.determineBuzz(twoProps));
                        System.out.print(NumsAndProps.determineDuck(twoProps));
                        System.out.print(NumsAndProps.determinePalindromic(twoProps));
                        System.out.print(NumsAndProps.determineSpy(twoProps));
                        System.out.print(NumsAndProps.determineSunny(twoProps));
                        System.out.print(NumsAndProps.determineSquare(twoProps));
                        twoProps[0] = String.valueOf(Long.parseLong(twoProps[0]) + 1);
                        NumMenu.COUNTER++;
                    } else if (SingleNum.isGapful(twoProps[0]) && SingleNum.isOdd(twoProps[0]) && twoProps[3].equalsIgnoreCase(Properties.ODD.properties)) {
                        System.out.print("\n" + twoProps[0] + " is ");
                        System.out.print(NumsAndProps.determineGapful(twoProps));
                        System.out.print(NumsAndProps.determineOdd(twoProps));
                        System.out.print(NumsAndProps.determineBuzz(twoProps));
                        System.out.print(NumsAndProps.determineDuck(twoProps));
                        System.out.print(NumsAndProps.determinePalindromic(twoProps));
                        System.out.print(NumsAndProps.determineSpy(twoProps));
                        System.out.print(NumsAndProps.determineSunny(twoProps));
                        System.out.print(NumsAndProps.determineSquare(twoProps));
                        twoProps[0] = String.valueOf(Long.parseLong(twoProps[0]) + 1);
                        NumMenu.COUNTER++;
                    } else if (SingleNum.isGapful(twoProps[0]) && SingleNum.isBuzz(twoProps[0]) && twoProps[3].equalsIgnoreCase(Properties.BUZZ.properties)) {
                        System.out.print("\n" + twoProps[0] + " is ");
                        System.out.print(NumsAndProps.determineGapful(twoProps));
                        System.out.print(NumsAndProps.determineBuzz(twoProps));
                        System.out.print(NumsAndProps.determineEven(twoProps));
                        System.out.print(NumsAndProps.determineOdd(twoProps));
                        System.out.print(NumsAndProps.determineDuck(twoProps));
                        System.out.print(NumsAndProps.determinePalindromic(twoProps));
                        System.out.print(NumsAndProps.determineSpy(twoProps));
                        System.out.print(NumsAndProps.determineSunny(twoProps));
                        System.out.print(NumsAndProps.determineSquare(twoProps));
                        twoProps[0] = String.valueOf(Long.parseLong(twoProps[0]) + 1);
                        NumMenu.COUNTER++;
                    } else if (SingleNum.isGapful(twoProps[0]) && SingleNum.isDuck(twoProps[0]) && twoProps[3].equalsIgnoreCase(Properties.DUCK.properties)) {
                        System.out.print("\n" + twoProps[0] + " is ");
                        System.out.print(NumsAndProps.determineGapful(twoProps));
                        System.out.print(NumsAndProps.determineDuck(twoProps));
                        System.out.print(NumsAndProps.determineBuzz(twoProps));
                        System.out.print(NumsAndProps.determineEven(twoProps));
                        System.out.print(NumsAndProps.determineOdd(twoProps));
                        System.out.print(NumsAndProps.determinePalindromic(twoProps));
                        System.out.print(NumsAndProps.determineSpy(twoProps));
                        System.out.print(NumsAndProps.determineSunny(twoProps));
                        System.out.print(NumsAndProps.determineSquare(twoProps));
                        twoProps[0] = String.valueOf(Long.parseLong(twoProps[0]) + 1);
                        NumMenu.COUNTER++;
                    } else if (SingleNum.isGapful(twoProps[0]) && SingleNum.isPalindromic(twoProps[0]) && twoProps[3].equalsIgnoreCase(Properties.PALINDROMIC.properties)) {
                        System.out.print("\n" + twoProps[0] + " is ");
                        System.out.print(NumsAndProps.determineGapful(twoProps));
                        System.out.print(NumsAndProps.determinePalindromic(twoProps));
                        System.out.print(NumsAndProps.determineEven(twoProps));
                        System.out.print(NumsAndProps.determineOdd(twoProps));
                        System.out.print(NumsAndProps.determineBuzz(twoProps));
                        System.out.print(NumsAndProps.determineDuck(twoProps));
                        System.out.print(NumsAndProps.determineSpy(twoProps));
                        System.out.print(NumsAndProps.determineSunny(twoProps));
                        System.out.print(NumsAndProps.determineSquare(twoProps));
                        twoProps[0] = String.valueOf(Long.parseLong(twoProps[0]) + 1);
                        NumMenu.COUNTER++;
                    } else if (SingleNum.isGapful(twoProps[0]) && SingleNum.isSpy(twoProps[0]) && twoProps[3].equalsIgnoreCase(Properties.SPY.properties)) {
                        System.out.print("\n" + twoProps[0] + " is ");
                        System.out.print(NumsAndProps.determineGapful(twoProps));
                        System.out.print(NumsAndProps.determineSpy(twoProps));
                        System.out.print(NumsAndProps.determineEven(twoProps));
                        System.out.print(NumsAndProps.determineOdd(twoProps));
                        System.out.print(NumsAndProps.determineBuzz(twoProps));
                        System.out.print(NumsAndProps.determineDuck(twoProps));
                        System.out.print(NumsAndProps.determinePalindromic(twoProps));
                        System.out.print(NumsAndProps.determineSunny(twoProps));
                        System.out.print(NumsAndProps.determineSquare(twoProps));
                        twoProps[0] = String.valueOf(Long.parseLong(twoProps[0]) + 1);
                        NumMenu.COUNTER++;
                    } else if (SingleNum.isGapful(twoProps[0]) && SingleNum.isSunny(twoProps[0]) && twoProps[3].equalsIgnoreCase(Properties.SUNNY.properties)) {
                        System.out.print("\n" + twoProps[0] + " is ");
                        System.out.print(NumsAndProps.determineGapful(twoProps));
                        System.out.print(NumsAndProps.determineBuzz(twoProps));
                        System.out.print(NumsAndProps.determineEven(twoProps));
                        System.out.print(NumsAndProps.determineOdd(twoProps));
                        System.out.print(NumsAndProps.determineDuck(twoProps));
                        System.out.print(NumsAndProps.determinePalindromic(twoProps));
                        System.out.print(NumsAndProps.determineSpy(twoProps));
                        System.out.print(NumsAndProps.determineSunny(twoProps));
                        System.out.print(NumsAndProps.determineSquare(twoProps));
                        twoProps[0] = String.valueOf(Long.parseLong(twoProps[0]) + 1);
                        NumMenu.COUNTER++;
                    }  else if (SingleNum.isGapful(twoProps[0]) && SingleNum.isSquare(twoProps[0]) && twoProps[3].equalsIgnoreCase(Properties.SQUARE.properties)) {
                        System.out.print("\n" + twoProps[0] + " is ");
                        System.out.print(NumsAndProps.determineGapful(twoProps));
                        System.out.print(NumsAndProps.determineSquare(twoProps));
                        System.out.print(NumsAndProps.determineEven(twoProps));
                        System.out.print(NumsAndProps.determineOdd(twoProps));
                        System.out.print(NumsAndProps.determineBuzz(twoProps));
                        System.out.print(NumsAndProps.determineDuck(twoProps));
                        System.out.print(NumsAndProps.determinePalindromic(twoProps));
                        System.out.print(NumsAndProps.determineSpy(twoProps));
                        System.out.print(NumsAndProps.determineSunny(twoProps));
                        twoProps[0] = String.valueOf(Long.parseLong(twoProps[0]) + 1);
                        NumMenu.COUNTER++;
                    } else if (!twoProps[3].equalsIgnoreCase(Properties.EVEN.properties) && !twoProps[3].equalsIgnoreCase(Properties.ODD.properties) &&
                            !twoProps[3].equalsIgnoreCase(Properties.DUCK.properties) && !twoProps[3].equalsIgnoreCase(Properties.PALINDROMIC.properties) &&
                            !twoProps[3].equalsIgnoreCase(Properties.SPY.properties) && !twoProps[3].equalsIgnoreCase(Properties.BUZZ.properties) &&
                            !twoProps[3].equalsIgnoreCase(Properties.SQUARE.properties) && !twoProps[3].equalsIgnoreCase(Properties.SUNNY.properties)){
                        NumsAndProps.stringCompare(twoProps);
                        break;
                    }
                    twoProps[0] = String.valueOf(Long.parseLong(twoProps[0]) + 1);
                }
                System.out.println();
            }
            case "SPY" -> {
                while (NumMenu.COUNTER < Long.parseLong(twoProps[1])) {
                    if (SingleNum.isSpy(twoProps[0]) && SingleNum.isEven(twoProps[0]) && twoProps[3].equalsIgnoreCase(Properties.EVEN.properties)) {
                        System.out.print("\n" + twoProps[0] + " is ");
                        System.out.print(NumsAndProps.determineSpy(twoProps));
                        System.out.print(NumsAndProps.determineEven(twoProps));
                        System.out.print(NumsAndProps.determineBuzz(twoProps));
                        System.out.print(NumsAndProps.determinePalindromic(twoProps));
                        System.out.print(NumsAndProps.determineGapful(twoProps));
                        System.out.print(NumsAndProps.determineSunny(twoProps));
                        System.out.print(NumsAndProps.determineSquare(twoProps));
                        twoProps[0] = String.valueOf(Long.parseLong(twoProps[0]) + 1);
                        NumMenu.COUNTER++;
                    } else if (SingleNum.isSpy(twoProps[0]) && SingleNum.isOdd(twoProps[0]) && twoProps[3].equalsIgnoreCase(Properties.ODD.properties)) {
                        System.out.print("\n" + twoProps[0] + " is ");
                        System.out.print(NumsAndProps.determineSpy(twoProps));
                        System.out.print(NumsAndProps.determineOdd(twoProps));
                        System.out.print(NumsAndProps.determineBuzz(twoProps));
                        System.out.print(NumsAndProps.determinePalindromic(twoProps));
                        System.out.print(NumsAndProps.determineGapful(twoProps));
                        System.out.print(NumsAndProps.determineSunny(twoProps));
                        System.out.print(NumsAndProps.determineSquare(twoProps));
                        twoProps[0] = String.valueOf(Long.parseLong(twoProps[0]) + 1);
                        NumMenu.COUNTER++;
                    } else if (SingleNum.isSpy(twoProps[0]) && SingleNum.isBuzz(twoProps[0]) && twoProps[3].equalsIgnoreCase(Properties.BUZZ.properties)) {
                        System.out.print("\n" + twoProps[0] + " is ");
                        System.out.print(NumsAndProps.determineSpy(twoProps));
                        System.out.print(NumsAndProps.determineBuzz(twoProps));
                        System.out.print(NumsAndProps.determineEven(twoProps));
                        System.out.print(NumsAndProps.determineOdd(twoProps));
                        System.out.print(NumsAndProps.determinePalindromic(twoProps));
                        System.out.print(NumsAndProps.determineGapful(twoProps));
                        System.out.print(NumsAndProps.determineSunny(twoProps));
                        System.out.print(NumsAndProps.determineSquare(twoProps));
                        twoProps[0] = String.valueOf(Long.parseLong(twoProps[0]) + 1);
                        NumMenu.COUNTER++;
                    } else if (SingleNum.isSpy(twoProps[0]) && SingleNum.isPalindromic(twoProps[0]) && twoProps[3].equalsIgnoreCase(Properties.PALINDROMIC.properties)) {
                        System.out.print("\n" + twoProps[0] + " is ");
                        System.out.print(NumsAndProps.determineSpy(twoProps));
                        System.out.print(NumsAndProps.determinePalindromic(twoProps));
                        System.out.print(NumsAndProps.determineEven(twoProps));
                        System.out.print(NumsAndProps.determineOdd(twoProps));
                        System.out.print(NumsAndProps.determineBuzz(twoProps));
                        System.out.print(NumsAndProps.determineGapful(twoProps));
                        System.out.print(NumsAndProps.determineSunny(twoProps));
                        System.out.print(NumsAndProps.determineSquare(twoProps));
                        NumMenu.COUNTER++;
                    } else if (SingleNum.isSpy(twoProps[0]) && SingleNum.isGapful(twoProps[0]) && twoProps[3].equalsIgnoreCase(Properties.GAPFUL.properties)) {
                        System.out.print("\n" + twoProps[0] + " is ");
                        System.out.print(NumsAndProps.determineSpy(twoProps));
                        System.out.print(NumsAndProps.determineGapful(twoProps));
                        System.out.print(NumsAndProps.determineEven(twoProps));
                        System.out.print(NumsAndProps.determineOdd(twoProps));
                        System.out.print(NumsAndProps.determineBuzz(twoProps));
                        System.out.print(NumsAndProps.determinePalindromic(twoProps));
                        System.out.print(NumsAndProps.determineSunny(twoProps));
                        System.out.print(NumsAndProps.determineSquare(twoProps));
                        twoProps[0] = String.valueOf(Long.parseLong(twoProps[0]) + 1);
                        NumMenu.COUNTER++;
                    } else if (SingleNum.isSpy(twoProps[0]) && SingleNum.isSunny(twoProps[0]) && twoProps[3].equalsIgnoreCase(Properties.SUNNY.properties)) {
                        System.out.print("\n" + twoProps[0] + " is ");
                        System.out.print(NumsAndProps.determineSpy(twoProps));
                        System.out.print(NumsAndProps.determineSunny(twoProps));
                        System.out.print(NumsAndProps.determineEven(twoProps));
                        System.out.print(NumsAndProps.determineOdd(twoProps));
                        System.out.print(NumsAndProps.determineBuzz(twoProps));
                        System.out.print(NumsAndProps.determinePalindromic(twoProps));
                        System.out.print(NumsAndProps.determineGapful(twoProps));
                        System.out.print(NumsAndProps.determineSquare(twoProps));
                        twoProps[0] = String.valueOf(Long.parseLong(twoProps[0]) + 1);
                        NumMenu.COUNTER++;
                    } else if (SingleNum.isSpy(twoProps[0]) && SingleNum.isSquare(twoProps[0]) && twoProps[3].equalsIgnoreCase(Properties.SQUARE.properties)) {
                        System.out.print("\n" + twoProps[0] + " is ");
                        System.out.print(NumsAndProps.determineSpy(twoProps));
                        System.out.print(NumsAndProps.determineSquare(twoProps));
                        System.out.print(NumsAndProps.determineEven(twoProps));
                        System.out.print(NumsAndProps.determineOdd(twoProps));
                        System.out.print(NumsAndProps.determineBuzz(twoProps));
                        System.out.print(NumsAndProps.determinePalindromic(twoProps));
                        System.out.print(NumsAndProps.determineGapful(twoProps));
                        System.out.print(NumsAndProps.determineSunny(twoProps));
                        twoProps[0] = String.valueOf(Long.parseLong(twoProps[0]) + 1);
                        NumMenu.COUNTER++;
                    } else if (!twoProps[3].equalsIgnoreCase(Properties.EVEN.properties) && !twoProps[3].equalsIgnoreCase(Properties.ODD.properties) &&
                            !twoProps[3].equalsIgnoreCase(Properties.PALINDROMIC.properties) && !twoProps[3].equalsIgnoreCase(Properties.GAPFUL.properties) &&
                            !twoProps[3].equalsIgnoreCase(Properties.BUZZ.properties) && !twoProps[3].equalsIgnoreCase(Properties.SQUARE.properties) &&
                            !twoProps[3].equalsIgnoreCase(Properties.SUNNY.properties)){
                        NumsAndProps.stringCompare(twoProps);
                        break;
                    }
                    twoProps[0] = String.valueOf(Long.parseLong(twoProps[0]) + 1);
                }
                System.out.println();
            }
            case "SUNNY" -> {
                while (NumMenu.COUNTER < Long.parseLong(twoProps[1])) {
                    if (SingleNum.isSunny(twoProps[0]) && SingleNum.isEven(twoProps[0]) && twoProps[3].equalsIgnoreCase(Properties.EVEN.properties)) {
                        System.out.print("\n" + twoProps[0] + " is ");
                        System.out.print(NumsAndProps.determineSunny(twoProps));
                        System.out.print(NumsAndProps.determineEven(twoProps));
                        System.out.print(NumsAndProps.determineBuzz(twoProps));
                        System.out.print(NumsAndProps.determineDuck(twoProps));
                        System.out.print(NumsAndProps.determinePalindromic(twoProps));
                        System.out.print(NumsAndProps.determineGapful(twoProps));
                        System.out.print(NumsAndProps.determineSpy(twoProps));
                        twoProps[0] = String.valueOf(Long.parseLong(twoProps[0]) + 1);
                        NumMenu.COUNTER++;
                    } else if (SingleNum.isSunny(twoProps[0]) && SingleNum.isOdd(twoProps[0]) && twoProps[3].equalsIgnoreCase(Properties.ODD.properties)) {
                        System.out.print("\n" + twoProps[0] + " is ");
                        System.out.print(NumsAndProps.determineSunny(twoProps));
                        System.out.print(NumsAndProps.determineOdd(twoProps));
                        System.out.print(NumsAndProps.determineBuzz(twoProps));
                        System.out.print(NumsAndProps.determineDuck(twoProps));
                        System.out.print(NumsAndProps.determinePalindromic(twoProps));
                        System.out.print(NumsAndProps.determineGapful(twoProps));
                        System.out.print(NumsAndProps.determineSpy(twoProps));
                        twoProps[0] = String.valueOf(Long.parseLong(twoProps[0]) + 1);
                        NumMenu.COUNTER++;
                    } else if (SingleNum.isSunny(twoProps[0]) && SingleNum.isBuzz(twoProps[0]) && twoProps[3].equalsIgnoreCase(Properties.BUZZ.properties)) {
                        System.out.print("\n" + twoProps[0] + " is ");
                        System.out.print(NumsAndProps.determineSunny(twoProps));
                        System.out.print(NumsAndProps.determineBuzz(twoProps));
                        System.out.print(NumsAndProps.determineEven(twoProps));
                        System.out.print(NumsAndProps.determineOdd(twoProps));
                        System.out.print(NumsAndProps.determineDuck(twoProps));
                        System.out.print(NumsAndProps.determinePalindromic(twoProps));
                        System.out.print(NumsAndProps.determineGapful(twoProps));
                        System.out.print(NumsAndProps.determineSpy(twoProps));
                        twoProps[0] = String.valueOf(Long.parseLong(twoProps[0]) + 1);
                        NumMenu.COUNTER++;
                    } else if (SingleNum.isSunny(twoProps[0]) && SingleNum.isDuck(twoProps[0]) && twoProps[3].equalsIgnoreCase(Properties.DUCK.properties)) {
                        System.out.print("\n" + twoProps[0] + " is ");
                        System.out.print(NumsAndProps.determineSunny(twoProps));
                        System.out.print(NumsAndProps.determineDuck(twoProps));
                        System.out.print(NumsAndProps.determineEven(twoProps));
                        System.out.print(NumsAndProps.determineOdd(twoProps));
                        System.out.print(NumsAndProps.determineBuzz(twoProps));
                        System.out.print(NumsAndProps.determinePalindromic(twoProps));
                        System.out.print(NumsAndProps.determineGapful(twoProps));
                        System.out.print(NumsAndProps.determineSpy(twoProps));
                        twoProps[0] = String.valueOf(Long.parseLong(twoProps[0]) + 1);
                        NumMenu.COUNTER++;
                    } else if (SingleNum.isSunny(twoProps[0]) && SingleNum.isPalindromic(twoProps[0]) && twoProps[3].equalsIgnoreCase(Properties.PALINDROMIC.properties)) {
                        System.out.print("\n" + twoProps[0] + " is ");
                        System.out.print(NumsAndProps.determineSunny(twoProps));
                        System.out.print(NumsAndProps.determinePalindromic(twoProps));
                        System.out.print(NumsAndProps.determineEven(twoProps));
                        System.out.print(NumsAndProps.determineOdd(twoProps));
                        System.out.print(NumsAndProps.determineBuzz(twoProps));
                        System.out.print(NumsAndProps.determineDuck(twoProps));
                        System.out.print(NumsAndProps.determineGapful(twoProps));
                        System.out.print(NumsAndProps.determineSpy(twoProps));
                        twoProps[0] = String.valueOf(Long.parseLong(twoProps[0]) + 1);
                        NumMenu.COUNTER++;
                    } else if (SingleNum.isSunny(twoProps[0]) && SingleNum.isGapful(twoProps[0]) && twoProps[3].equalsIgnoreCase(Properties.GAPFUL.properties)) {
                        System.out.print("\n" + twoProps[0] + " is ");
                        System.out.print(NumsAndProps.determineSunny(twoProps));
                        System.out.print(NumsAndProps.determineGapful(twoProps));
                        System.out.print(NumsAndProps.determineEven(twoProps));
                        System.out.print(NumsAndProps.determineOdd(twoProps));
                        System.out.print(NumsAndProps.determineDuck(twoProps));
                        System.out.print(NumsAndProps.determineBuzz(twoProps));
                        System.out.print(NumsAndProps.determinePalindromic(twoProps));
                        System.out.print(NumsAndProps.determineSpy(twoProps));
                        twoProps[0] = String.valueOf(Long.parseLong(twoProps[0]) + 1);
                        NumMenu.COUNTER++;
                    }
                    else if (SingleNum.isSunny(twoProps[0]) && SingleNum.isSpy(twoProps[0]) && twoProps[3].equalsIgnoreCase(Properties.SPY.properties)) {
                        System.out.print("\n" + twoProps[0] + " is ");
                        System.out.print(NumsAndProps.determineSunny(twoProps));
                        System.out.print(NumsAndProps.determineSpy(twoProps));
                        System.out.print(NumsAndProps.determineEven(twoProps));
                        System.out.print(NumsAndProps.determineOdd(twoProps));
                        System.out.print(NumsAndProps.determineBuzz(twoProps));
                        System.out.print(NumsAndProps.determineDuck(twoProps));
                        System.out.print(NumsAndProps.determinePalindromic(twoProps));
                        System.out.print(NumsAndProps.determineGapful(twoProps));
                        twoProps[0] = String.valueOf(Long.parseLong(twoProps[0]) + 1);
                        NumMenu.COUNTER++;
                    } else if (!twoProps[3].equalsIgnoreCase(Properties.EVEN.properties) && !twoProps[3].equalsIgnoreCase(Properties.ODD.properties) &&
                            !twoProps[3].equalsIgnoreCase(Properties.PALINDROMIC.properties) && !twoProps[3].equalsIgnoreCase(Properties.GAPFUL.properties) &&
                            !twoProps[3].equalsIgnoreCase(Properties.BUZZ.properties) && !twoProps[3].equalsIgnoreCase(Properties.SPY.properties) &&
                            !twoProps[3].equalsIgnoreCase(Properties.DUCK.properties)){
                        NumsAndProps.stringCompare(twoProps);
                        break;
                    }
                    twoProps[0] = String.valueOf(Long.parseLong(twoProps[0]) + 1);
                }
                System.out.println();
            }
            case "SQUARE" -> {
                while (NumMenu.COUNTER < Long.parseLong(twoProps[1])) {
                    if (SingleNum.isSquare(twoProps[0]) && SingleNum.isEven(twoProps[0]) && twoProps[3].equalsIgnoreCase(Properties.EVEN.properties)) {
                        System.out.print("\n" + twoProps[0] + " is ");
                        System.out.print(NumsAndProps.determineSquare(twoProps));
                        System.out.print(NumsAndProps.determineEven(twoProps));
                        System.out.print(NumsAndProps.determineBuzz(twoProps));
                        System.out.print(NumsAndProps.determineDuck(twoProps));
                        System.out.print(NumsAndProps.determinePalindromic(twoProps));
                        System.out.print(NumsAndProps.determineGapful(twoProps));
                        System.out.print(NumsAndProps.determineSpy(twoProps));
                        twoProps[0] = String.valueOf(Long.parseLong(twoProps[0]) + 1);
                        NumMenu.COUNTER++;
                    } else if (SingleNum.isSquare(twoProps[0]) && SingleNum.isOdd(twoProps[0]) && twoProps[3].equalsIgnoreCase(Properties.ODD.properties)) {
                        System.out.print("\n" + twoProps[0] + " is ");
                        System.out.print(NumsAndProps.determineSquare(twoProps));
                        System.out.print(NumsAndProps.determineOdd(twoProps));
                        System.out.print(NumsAndProps.determineBuzz(twoProps));
                        System.out.print(NumsAndProps.determineDuck(twoProps));
                        System.out.print(NumsAndProps.determinePalindromic(twoProps));
                        System.out.print(NumsAndProps.determineGapful(twoProps));
                        System.out.print(NumsAndProps.determineSpy(twoProps));
                        twoProps[0] = String.valueOf(Long.parseLong(twoProps[0]) + 1);
                        NumMenu.COUNTER++;
                    } else if (SingleNum.isSquare(twoProps[0]) && SingleNum.isBuzz(twoProps[0]) && twoProps[3].equalsIgnoreCase(Properties.BUZZ.properties)) {
                        System.out.print("\n" + twoProps[0] + " is ");
                        System.out.print(NumsAndProps.determineSquare(twoProps));
                        System.out.print(NumsAndProps.determineBuzz(twoProps));
                        System.out.print(NumsAndProps.determineEven(twoProps));
                        System.out.print(NumsAndProps.determineOdd(twoProps));
                        System.out.print(NumsAndProps.determineDuck(twoProps));
                        System.out.print(NumsAndProps.determinePalindromic(twoProps));
                        System.out.print(NumsAndProps.determineGapful(twoProps));
                        System.out.print(NumsAndProps.determineSpy(twoProps));
                        twoProps[0] = String.valueOf(Long.parseLong(twoProps[0]) + 1);
                        NumMenu.COUNTER++;
                    } else if (SingleNum.isSquare(twoProps[0]) && SingleNum.isDuck(twoProps[0]) && twoProps[3].equalsIgnoreCase(Properties.DUCK.properties)) {
                        System.out.print("\n" + twoProps[0] + " is ");
                        System.out.print(NumsAndProps.determineSquare(twoProps));
                        System.out.print(NumsAndProps.determineDuck(twoProps));
                        System.out.print(NumsAndProps.determineBuzz(twoProps));
                        System.out.print(NumsAndProps.determineEven(twoProps));
                        System.out.print(NumsAndProps.determineOdd(twoProps));
                        System.out.print(NumsAndProps.determineSpy(twoProps));
                        System.out.print(NumsAndProps.determinePalindromic(twoProps));
                        System.out.print(NumsAndProps.determineGapful(twoProps));
                        twoProps[0] = String.valueOf(Long.parseLong(twoProps[0]) + 1);
                        NumMenu.COUNTER++;
                    } else if (SingleNum.isSquare(twoProps[0]) && SingleNum.isPalindromic(twoProps[0]) && twoProps[3].equalsIgnoreCase(Properties.PALINDROMIC.properties)) {
                        System.out.print("\n" + twoProps[0] + " is ");
                        System.out.print(NumsAndProps.determineSquare(twoProps));
                        System.out.print(NumsAndProps.determinePalindromic(twoProps));
                        System.out.print(NumsAndProps.determineEven(twoProps));
                        System.out.print(NumsAndProps.determineOdd(twoProps));
                        System.out.print(NumsAndProps.determineBuzz(twoProps));
                        System.out.print(NumsAndProps.determineDuck(twoProps));
                        System.out.print(NumsAndProps.determineGapful(twoProps));
                        System.out.print(NumsAndProps.determineSpy(twoProps));
                        twoProps[0] = String.valueOf(Long.parseLong(twoProps[0]) + 1);
                        NumMenu.COUNTER++;
                    } else if (SingleNum.isSquare(twoProps[0]) && SingleNum.isGapful(twoProps[0]) && twoProps[3].equalsIgnoreCase(Properties.GAPFUL.properties)) {
                        System.out.print("\n" + twoProps[0] + " is ");
                        System.out.print(NumsAndProps.determineSquare(twoProps));
                        System.out.print(NumsAndProps.determineGapful(twoProps));
                        System.out.print(NumsAndProps.determineEven(twoProps));
                        System.out.print(NumsAndProps.determineOdd(twoProps));
                        System.out.print(NumsAndProps.determineBuzz(twoProps));
                        System.out.print(NumsAndProps.determineDuck(twoProps));
                        System.out.print(NumsAndProps.determinePalindromic(twoProps));
                        System.out.print(NumsAndProps.determineSpy(twoProps));
                        twoProps[0] = String.valueOf(Long.parseLong(twoProps[0]) + 1);
                        NumMenu.COUNTER++;
                    } else if (SingleNum.isSquare(twoProps[0]) && SingleNum.isSpy(twoProps[0]) && twoProps[3].equalsIgnoreCase(Properties.SPY.properties)) {
                        System.out.print("\n" + twoProps[0] + " is ");
                        System.out.print(NumsAndProps.determineSquare(twoProps));
                        System.out.print(NumsAndProps.determineSpy(twoProps));
                        System.out.print(NumsAndProps.determineEven(twoProps));
                        System.out.print(NumsAndProps.determineOdd(twoProps));
                        System.out.print(NumsAndProps.determineBuzz(twoProps));
                        System.out.print(NumsAndProps.determineDuck(twoProps));
                        System.out.print(NumsAndProps.determinePalindromic(twoProps));
                        System.out.print(NumsAndProps.determineGapful(twoProps));
                        twoProps[0] = String.valueOf(Long.parseLong(twoProps[0]) + 1);
                        NumMenu.COUNTER++;
                    } else if (!twoProps[3].equalsIgnoreCase(Properties.EVEN.properties) && !twoProps[3].equalsIgnoreCase(Properties.ODD.properties) &&
                            !twoProps[3].equalsIgnoreCase(Properties.PALINDROMIC.properties) && !twoProps[3].equalsIgnoreCase(Properties.GAPFUL.properties) &&
                            !twoProps[3].equalsIgnoreCase(Properties.BUZZ.properties) && !twoProps[3].equalsIgnoreCase(Properties.SPY.properties) &&
                            !twoProps[3].equalsIgnoreCase(Properties.DUCK.properties)){
                        NumsAndProps.stringCompare(twoProps);
                        break;
                    }
                    twoProps[0] = String.valueOf(Long.parseLong(twoProps[0]) + 1);
                }
                System.out.println();
            }
            default -> NumsAndProps.stringCompare(twoProps);
        }
    }
}