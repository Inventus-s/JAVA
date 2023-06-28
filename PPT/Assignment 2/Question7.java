class Question7 {

    public static boolean isMonotonic(int[] nums) {
        // Initialize two flags
        boolean increasing = true;
        boolean decreasing = true;

        // Iterate through the array
        for (int i = 1; i < nums.length; i++) {
            // If the current element is less than the previous element, set increasing to false
            if (nums[i] < nums[i - 1]) {
                increasing = false;
            }

            // If the current element is greater than the previous element, set decreasing to false
            if (nums[i] > nums[i - 1]) {
                decreasing = false;
            }
        }

        // Return true if the array is monotonic
        return increasing || decreasing;
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 2, 3};

        boolean result = isMonotonic(nums);

        System.out.println("The array is monotonic: " + result);
    }
}
