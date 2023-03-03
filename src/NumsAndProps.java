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
}