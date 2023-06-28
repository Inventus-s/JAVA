import java.util.ArrayList;
import java.util.List;

public class Question7 {
    public static List<List<Integer>> findMissingRanges(int[] nums, int lower, int upper) {
        List<List<Integer>> result = new ArrayList<>();

        // Check for missing range before the first element
        if (lower < nums[0]) {
            result.add(createRange(lower, nums[0] - 1));
        }

        // Check for missing ranges between elements
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] - nums[i - 1] > 1) {
                result.add(createRange(nums[i - 1] + 1, nums[i] - 1));
            }
        }

        // Check for missing range after the last element
        if (upper > nums[nums.length - 1]) {
            result.add(createRange(nums[nums.length - 1] + 1, upper));
        }

        return result;
    }

    private static List<Integer> createRange(int start, int end) {
        List<Integer> range = new ArrayList<>();
        range.add(start);
        range.add(end);
        return range;
    }

    public static void main(String[] args) {
        int[] nums = {0, 1, 3, 50, 75};
        int lower = 0;
        int upper = 99;

        List<List<Integer>> missingRanges = findMissingRanges(nums, lower, upper);

        System.out.println("Missing Ranges:");
        for (List<Integer> range : missingRanges) {
            System.out.println(range);
        }
    }
}
