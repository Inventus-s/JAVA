public class Question5 {
    public int majorityElement(int[] nums) {
        int candidate = 0;
        int count = 0;
        
        for (int num : nums) {
            if (count == 0) {
                candidate = num;
                count = 1;
            } else if (candidate == num) {
                count++;
            } else {
                count--;
            }
        }
        
        return candidate;
    }
    
    public static void main(String[] args) {
        Question5 solution = new Question5();
        
        int[] nums = {3, 3, 4, 2, 4, 4, 2, 4, 4};
        
        int majorityElement = solution.majorityElement(nums);
        
        System.out.println("Output: " + majorityElement);
    }
}
