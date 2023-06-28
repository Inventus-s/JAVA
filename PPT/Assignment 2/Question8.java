class Question8 {

    public static int minScore(int[] nums, int k) {
        // Initialize the maximum and minimum values
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        // Iterate through the array
        for (int num : nums) {
            // Update the maximum and minimum values
            max = Math.max(max, num);
            min = Math.min(min, num);
        }

        // The minimum score is the difference between the maximum and minimum values
        int score = max - min;

        // Iterate through the array and update the minimum score if possible
        for (int i = 0; i < nums.length; i++) {
            for (int x = -k; x <= k; x++) {
                // If the current operation is possible, update the minimum score
                if (0 <= nums[i] + x && nums[i] + x <= 100) {
                    score = Math.min(score, max - (nums[i] + x));
                }
            }
        }

        // Return the minimum score
        return score;
    }

    public static void main(String[] args) {
        int[] nums = {1};
        int k = 0;

        int result = minScore(nums, k);

        System.out.println("The minimum score is: " + result);
    }
}
