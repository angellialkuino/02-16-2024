public class StrToInt {
    public static void main(String[] args) {
        System.out.println(sumIntegersAsString("10", "20"));
        System.out.println(sumIntegersAsString("10", "20", "30"));
        System.out.println(sumIntegersAsString("10", "20", "30", "40"));

    }

    static int sumIntegersAsString(String... stringIntegers) {
        int sum = 0;

        for (int i = 0; i < stringIntegers.length; i++) {
            sum += Integer.parseInt(stringIntegers[i]);
        }

        return sum;
    }
}
