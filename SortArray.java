import java.util.Arrays;

public class SortArray {
    public static void main(String[] args) {

        final char[] chars = { 'E', 'B', 'C', 'A', 'D' };
        // its final but it was still sorted. what does final word do???

        Arrays.sort(chars);

        System.out.println(Arrays.toString(chars));
    }
}
