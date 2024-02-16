import java.util.Arrays;
import java.lang.Math;

public class RoundOffDoubles {
    public static void main(String[] args) {
        long[] rounded = round(4.7, 3.1, 2.8, 3.3, 5.6);
        System.out.println(Arrays.toString(rounded));
    }

    static long[] round(double... doubles) {
        long[] rounded = new long[doubles.length];

        for (int i = 0; i < doubles.length; i++) {
            rounded[i] = Math.round(doubles[i]);
        }

        return rounded;
    }
}
