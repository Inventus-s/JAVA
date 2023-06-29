import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Question6 {

    public static List<Integer> squaresOfSortedArray(int[] nums) {
        List<Integer> squares = new ArrayList<>();

        for (int num : nums) {
            squares.add(num * num);
        }

        // Sort the squares array in non-decreasing order.
        Arrays.sort(squares.toArray());

        return squares;
    }

    public static void main(String[] args) {
        int[] nums = {-4, -1, 0, 3, 10};

        List<Integer> squares = squaresOfSortedArray(nums);

        System.out.println(squares);
    }
}
