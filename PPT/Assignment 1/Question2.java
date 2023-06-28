import java.util.*;

public class Question2 {

    public static int removeElement(int[] nums, int val) {
        // Initialize the counter
        int count = 0;

        // Iterate through the array
        for (int i = 0; i < nums.length; i++) {
            // If the current element is not val,
            if (nums[i] != val) {
                // Copy the current element to the front of the array
                nums[count] = nums[i];
                count++;
            }
        }

        // Return the number of elements that are not val
        return count;
    }

    public static void main(String[] args) {
        int[] nums = {3, 2, 2, 3};
        int val = 3;

        int result = removeElement(nums, val);

        System.out.println("The number of elements in nums which are not equal to val is: " + result);
        System.out.println("nums: " + Arrays.toString(nums));
    }
}
