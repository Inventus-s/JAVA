public class Question3 {

    public static int searchInsert(int[] nums, int target) {
        // Initialize the left and right pointers
        int left = 0;
        int right = nums.length - 1;

        // While the left pointer is less than or equal to the right pointer,
        while (left <= right) {
            // Calculate the middle pointer
            int mid = (left + right) / 2;

            // If the target is equal to the middle element,
            if (nums[mid] == target) {
                return mid;
            }

            // If the target is less than the middle element,
            else if (nums[mid] > target) {
                // Set the right pointer to the middle pointer minus 1
                right = mid - 1;
            }

            // Otherwise,
            else {
                // Set the left pointer to the middle pointer plus 1
                left = mid + 1;
            }
        }

        // If the target is not found,
        return left;
    }

    public static void main(String[] args) {
        int[] nums = {1, 3, 5, 6};
        int target = 5;

        int result = searchInsert(nums, target);

        System.out.println("The index where the target would be inserted is: " + result);
    }
}
