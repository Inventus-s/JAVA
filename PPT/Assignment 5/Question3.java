import java.util.Arrays;

public class Question3 {

    public static int[] squaresOfSortedArray(int[] nums) {
        // Create a new array to store the squares of the numbers
        int[] squares = new int[nums.length];

        // Iterate over the original array and square each number
        for (int i = 0; i < nums.length; i++) {
            squares[i] = nums[i] * nums[i];
        }

        // Sort the squares array
        Arrays.sort(squares);

        return squares;
    }

    public static void main(String[] args) {
        int[] nums = {-4, -1, 0, 3, 10};

        int[] squares = squaresOfSortedArray(nums);

        for (int i : squares) {
            System.out.println(i);
        }
    }
}
