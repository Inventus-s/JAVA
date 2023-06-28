import java.util.Arrays;

public class Question1 {

    public static int arrayPairSum(int[] nums) {
        // Sort the array in ascending order
        Arrays.sort(nums);

        // Initialize the sum
        int sum = 0;

        // Iterate through the array and add the minimum of each pair
        for (int i = 0; i < nums.length / 2; i++) {
            sum += Math.min(nums[i], nums[nums.length - 1 - i]);
        }

        // Return the sum
        return sum;
    }

    public static void main(String[] args) {
        int[] nums = {1, 4, 3, 2};

        int result = arrayPairSum(nums);

        System.out.println("The maximum possible sum is: " + result);
    }
}
