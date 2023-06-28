import java.util.HashSet;
import java.util.Set;
public class Question6 {

    public static boolean containsDuplicate(int[] nums) {
        // Create a set to store the numbers
        Set<Integer> set = new HashSet<>();

        // Iterate through the array
        for (int num : nums) {
            // If the number is already in the set,
            if (set.contains(num)) {
                // Return true
                return true;
            }

            // Otherwise,
            // Add the number to the set
            set.add(num);
        }

        // If the loop has finished and no duplicates have been found,
        // Return false
        return false;
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 1};

        boolean result = containsDuplicate(nums);

        System.out.println("The array contains duplicate: " + result);
    }
}
