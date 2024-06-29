import java.util.HashSet;
import java.util.Set;

public class salman{
    public static void main(String[] args) {
        int[] array1 = {1, 2, 3};
        int[] array2 = {2, 3, 4};

        Set<Integer> commonElements = findCommonElements(array1, array2);

        System.out.println(commonElements);  // Output: [2, 3]
    }

    public static Set<Integer> findCommonElements(int[] array1, int[] array2) {
        Set<Integer> set1 = new HashSet<>();
        Set<Integer> commonElements = new HashSet<>();

        // Add all elements from array1 to set1
        for (int num : array1) {
            set1.add(num);
        }

        // Check each element in array2 if it is in set1
        for (int num : array2) {
            if (set1.contains(num)) {
                commonElements.add(num);
            }
        }

        return commonElements;
    }
}
