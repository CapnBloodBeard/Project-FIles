import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class mergingArrays2{
    public static void main(String[] args) {
        // Example arrays
        int[] array1 = {1, 2, 3, 4, 5};
        int[] array2 = {4, 5, 6, 7, 8};
        
        // Merging the arrays without duplicates
        int[] mergedArray = mergeArrays(array1, array2);
        
        // Print the result
        System.out.println(Arrays.toString(mergedArray));
    }
    
    public static int[] mergeArrays(int[] array1, int[] array2) {
        // Create a HashSet to store unique elements
        Set<Integer> set = new HashSet<>();
        
        // Add elements from the first array
        for (int num : array1) {
            set.add(num);
        }
        
        // Add elements from the second array
        for (int num : array2) {
            set.add(num);
        }
        
        // Convert the set back to an array
        int[] result = new int[set.size()];
        int index = 0;
        for (int num : set) {
            result[index++] = num;
        }
        
        return result;
    }
}
