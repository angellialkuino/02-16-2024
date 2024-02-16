public class ToCSV {
    public static void main(String[] args) {
        System.out.println(toCsv("Row", "row", "row", "your boat"));
    }

    static String toCsv(String... strings) {
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < strings.length; i++) {
            sb.append(strings[i]);
            sb.append(",");
        }

        return sb.toString();

    }
}
