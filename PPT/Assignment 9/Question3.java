public class Question3 {
    public int findPeakElement(int[] nums) {
        int left = 0;
        int right = nums.length - 1;
        
        while (left < right) {
            int mid = left + (right - left) / 2;
            
            if (nums[mid] < nums[mid + 1]) {
                left = mid + 1;
            } else {
                right = mid;
            }
        }
        
        return left;
    }
    
    public static void main(String[] args) {
        Question3 solution = new Question3();
        
        int[] nums = {1, 2, 3, 1};
        
        int peakIndex = solution.findPeakElement(nums);
        
        System.out.println("Output: " + peakIndex);
    }
}
