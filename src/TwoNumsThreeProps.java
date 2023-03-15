public class TwoNumsThreeProps {
    static void twoNumsThreeProps(String num) {
        String[] threeProps = num.split(" ");

        switch (threeProps[2].toUpperCase()){
            case "EVEN" -> {
                if (SingleNum.isEven(threeProps[0])) {
                    System.out.println("IT WORKS!!");
                }
            }
        }
    }
}
