import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Question4 {

    public static List<List<Integer>> twoDistinctArrays(int[] nums1, int[] nums2) {
        // Create a set to store the elements of nums1
        Set<Integer> set1 = new HashSet<>();
        for (int i : nums1) {
            set1.add(i);
        }

        // Create a set to store the elements of nums2
        Set<Integer> set2 = new HashSet<>();
        for (int i : nums2) {
            set2.add(i);
        }

        // Create a list to store the distinct elements of nums1 that are not present in nums2
        List<Integer> result1 = new ArrayList<>();
        for (int i : nums1) {
            if (!set2.contains(i)) {
                result1.add(i);
            }
        }

        // Create a list to store the distinct elements of nums2 that are not present in nums1
        List<Integer> result2 = new ArrayList<>();
        for (int i : nums2) {
            if (!set1.contains(i)) {
                result2.add(i);
            }
        }

        // Create a list to store the two lists
        List<List<Integer>> result = new ArrayList<>();
        result.add(result1);
        result.add(result2);

        return result;
    }

    public static void main(String[] args) {
        int[] nums1 = {1, 2, 3};
        int[] nums2 = {2, 4, 6};

        List<List<Integer>> result = twoDistinctArrays(nums1, nums2);

        System.out.println("Input: nums1 = " + Arrays.toString(nums1));
        System.out.println("Input: nums2 = " + Arrays.toString(nums2));
        System.out.println("Output: " + result);
    }
}
