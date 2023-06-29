import java.util.Arrays;

public class Question4 {

    public static int maxSumOfMinPairs(int[] nums) {
        int n = nums.length / 2;
        int[] sortedNums = Arrays.copyOf(nums, nums.length);
        Arrays.sort(sortedNums);

        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += Math.min(sortedNums[2 * i], sortedNums[2 * i + 1]);
        }

        return sum;
    }

    public static void main(String[] args) {
        int[] nums = {1, 4, 3, 2};

        int maxSum = maxSumOfMinPairs(nums);

        System.out.println(maxSum);
    }
}
