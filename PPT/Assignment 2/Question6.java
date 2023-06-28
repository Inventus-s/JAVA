class Question6 {

    public static int binarySearch(int[] nums, int target) {
        // Initialize the left and right pointers
        int left = 0;
        int right = nums.length - 1;

        // Loop while the left pointer is less than or equal to the right pointer
        while (left <= right) {
            // Calculate the middle index
            int mid = (left + right) / 2;

            // If the target is equal to the middle element, return the middle index
            if (nums[mid] == target) {
                return mid;
            } else if (nums[mid] < target) {
                // The target is greater than the middle element, so update the left pointer to the next element
                left = mid + 1;
            } else {
                // The target is less than the middle element, so update the right pointer to the previous element
                right = mid - 1;
            }
        }

        // Return -1 if the target is not found
        return -1;
    }

    public static void main(String[] args) {
        int[] nums = {-1, 0, 3, 5, 9, 12};
        int target = 9;

        int result = binarySearch(nums, target);

        System.out.println("The index of target is: " + result);
    }
}
