import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class saalim {
    public static void main(String[] args) {
        int[] array = {1, 2, 2, 3, 4, 4, 5};

        int[] result = removeDuplicates(array);

        System.out.println(Arrays.toString(result));  // Output: [1, 2, 3, 4, 5]
    }

    public static int[] removeDuplicates(int[] array) {
        Set<Integer> set = new HashSet<>();

        // Add all elements to the set (duplicates will be automatically handled)
        for (int num : array) {
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