public class Question7 {
    public static int findMin(int[] nums) {
        int left = 0;
        int right = nums.length - 1;

        while (left < right) {
            int mid = left + (right - left) / 2;

            if (nums[mid] > nums[right]) {
                // The minimum element is in the right half
                left = mid + 1;
            } else {
                // The minimum element is in the left half or at mid
                right = mid;
            }
        }

        return nums[left];
    }

    public static void main(String[] args) {
        int[] nums = {3, 4, 5, 1, 2};
        int minElement = findMin(nums);
        System.out.println(minElement);
    }
}
