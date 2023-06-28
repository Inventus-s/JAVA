class Question5 {

    public static int Question5(int[] nums) {
        // Initialize the maximum product
        int maxProduct = Integer.MIN_VALUE;

        // Initialize the three largest numbers
        int first = Integer.MIN_VALUE;
        int second = Integer.MIN_VALUE;
        int third = Integer.MIN_VALUE;

        // Iterate through the array
        for (int num : nums) {
            // Update the three largest numbers if necessary
            if (num > first) {
                third = second;
                second = first;
                first = num;
            } else if (num > second) {
                third = second;
                second = num;
            } else if (num > third) {
                third = num;
            }
        }

        // Return the maximum product of the three largest numbers
        return first * second * third;
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 3};

        int result = Question5(nums);

        System.out.println("The maximum product of three numbers is: " + result);
    }
}
