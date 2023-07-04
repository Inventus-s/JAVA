public class Question4 {

    public static int maxLenSubarrayWithEqual0And1(int[] nums) {
        int count0 = 0;
        int count1 = 0;
        int maxLen = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0) {
                count0++;
            } else {
                count1++;
            }

            if (count0 == count1) {
                maxLen = Math.max(maxLen, i + 1);
            }
        }

        return maxLen;
    }

    public static void main(String[] args) {
        int[] nums = {0, 1};

        System.out.println(maxLenSubarrayWithEqual0And1(nums)); // 2
    }
}
