import java.util.Arrays;

public class Question8 {

    public static int[] rearrangeArray(int[] nums, int n) {
        int[] result = new int[2 * n];

        for (int i = 0; i < n; i++) {
            result[2 * i] = nums[i];
            result[2 * i + 1] = nums[n + i];
        }

        return result;
    }

    public static void main(String[] args) {
        int[] nums = {2, 5, 1, 3, 4, 7};
        int n = 3;

        int[] result = rearrangeArray(nums, n);

        System.out.println(Arrays.toString(result));
    }
}
