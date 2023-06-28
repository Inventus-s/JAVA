import java.util.Arrays;

public class Question8 {

    public static int[] findErrorNums(int[] nums) {
        // Initialize the sum of all numbers from 1 to n
        int n = nums.length + 1;
        int sum = (n * (n + 1)) / 2;

        // Initialize the count of each number in the array
        int[] count = new int[n + 1];
        for (int num : nums) {
            count[num]++;
        }

        // Initialize the two numbers that occur twice and are missing
        int twice = -1;
        int missing = -1;

        // Iterate through the count array
        for (int i = 1; i <= n; i++) {
            // If the count of the current number is 2,
            if (count[i] == 2) {
                // Set twice to the current number
                twice = i;
            } else if (count[i] == 0) {
                // Set missing to the current number
                missing = i;
            }
        }

        // Return the two numbers
        return new int[]{twice, missing};
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 2, 4};

        int[] result = findErrorNums(nums);

        System.out.println("The number that occurs twice and is missing are: " + Arrays.toString(result));
    }
}
