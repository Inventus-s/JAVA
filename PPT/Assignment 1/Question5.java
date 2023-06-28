import java.util.Arrays;
public class Question5 {

    public static void mergeSortedArrays(int[] nums1, int m, int[] nums2, int n) {
        // Initialize the pointers
        int i = 0;
        int j = 0;
        int k = 0;

        // Iterate while both pointers are less than the length of their respective arrays,
        while (i < m && j < n) {
            // If the current element in nums1 is less than the current element in nums2,
            if (nums1[i] < nums2[j]) {
                // Copy the current element in nums1 to nums1[k]
                nums1[k] = nums1[i];
                // Increment the pointers
                i++;
                k++;
            } else {
                // Otherwise,
                // Copy the current element in nums2 to nums1[k]
                nums1[k] = nums2[j];
                // Increment the pointers
                j++;
                k++;
            }
        }

        // If there are any remaining elements in nums1,
        while (i < m) {
            // Copy the current element in nums1 to nums1[k]
            nums1[k] = nums1[i];
            // Increment the pointers
            i++;
            k++;
        }

        // If there are any remaining elements in nums2,
        while (j < n) {
            // Copy the current element in nums2 to nums1[k]
            nums1[k] = nums2[j];
            // Increment the pointers
            j++;
            k++;
        }
    }

    public static void main(String[] args) {
        int[] nums1 = {1, 2, 4, 0, 0, 0};
        int m = 3;
        int[] nums2 = {2, 5, 6};
        int n = 3;

        mergeSortedArrays(nums1, m, nums2, n);

        System.out.println("The merged array is: " + Arrays.toString(nums1));
    }
}
