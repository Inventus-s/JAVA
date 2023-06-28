import java.util.Arrays;

public class Question7 {

    public static void moveZeroes(int[] nums) {
        // Initialize the non-zero count
        int nonZeroCount = 0;

        // Iterate through the array
        for (int i = 0; i < nums.length; i++) {
            // If the current element is not 0,
            if (nums[i] != 0) {
                // Swap the current element with the element at the non-zero count index
                int temp = nums[i];
                nums[i] = nums[nonZeroCount];
                nums[nonZeroCount] = temp;

                // Increment the non-zero count
                nonZeroCount++;
            }
        }
    }

    public static void main(String[] args) {
        int[] nums = {0, 1, 0, 3, 12};

        moveZeroes(nums);

        System.out.println("The modified array is: " + Arrays.toString(nums));
    }
}
