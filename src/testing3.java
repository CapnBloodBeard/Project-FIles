import java.util.Arrays;
import java.util.stream.IntStream;

public class testing3 {
    public static void main(String[] args) {
        int[] array = {1, 2, 2, 3, 4, 4, 5};

        // Remove duplicates using streams
        int[] uniqueArray = IntStream.of(array).distinct().toArray();

        // Print the result
        System.out.println(Arrays.toString(uniqueArray));
    }
}