import java.util.Arrays;

public class MoveZeros {
    public static void findZero(int[] nums){
        int size = nums.length;
        if (size == 0 || size == 1){
            return;
        }

        int i=0,j=0;
        while(i < nums.length){
            if(nums[i] != 0){
                int temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;
                

                i++;
                j++;
         
            }else{
                i++;
            }
        }
    }
    public static void main(String[] args) {
        int[] nums = {0,1,0,3,12};
        // int[] nums = {0};
        findZero(nums);
        System.out.println(Arrays.toString(nums));

    }


}
