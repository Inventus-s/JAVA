public class Question3 {
    public static void nextPermutation(int[] nums) {
        // Find the first index i from the right such that nums[i] < nums[i+1]
        int i = nums.length - 2;
        while (i >= 0 && nums[i] >= nums[i + 1]) {
            i--;
        }

        // If i is negative, the array is in descending order, so reverse it
        if (i < 0) {
            reverse(nums, 0, nums.length - 1);
            return;
        }

        // Find the first index j from the right such that nums[j] > nums[i]
        int j = nums.length - 1;
        while (nums[j] <= nums[i]) {
            j--;
        }

        // Swap nums[i] and nums[j]
        swap(nums, i, j);

        // Reverse the subarray after index i
        reverse(nums, i + 1, nums.length - 1);
    }

    private static void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }

    private static void reverse(int[] nums, int start, int end) {
        while (start < end) {
            swap(nums, start, end);
            start++;
            end--;
        }
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 3};
        nextPermutation(nums);
        System.out.println("Next permutation: ");
        for (int num : nums) {
            System.out.print(num + " ");
        }
    }
}
