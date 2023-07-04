import java.util.Arrays;

public class Question5 {
    public static int minProductSum(int[] nums1, int[] nums2) {
        Arrays.sort(nums1); // Sort nums1 in ascending order
        Arrays.sort(nums2); // Sort nums2 in ascending order

        int n = nums1.length;
        int sum = 0;

        for (int i = 0; i < n; i++) {
            sum += nums1[i] * nums2[n - 1 - i];
        }

        return sum;
    }

    public static void main(String[] args) {
        int[] nums1 = {5, 3, 4, 2};
        int[] nums2 = {4, 2, 2, 5};

        int minProductSum = minProductSum(nums1, nums2);
        System.out.println("Minimum Product Sum: " + minProductSum);
    }
}
