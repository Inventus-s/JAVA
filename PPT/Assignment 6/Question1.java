import java.util.*;

public class Question1 {
    public static int[] findPermutation(String s) {
        int n = s.length();
        int[] perm = new int[n + 1];

        // Initialize the permutation array with the numbers 0 to n
        for (int i = 0; i <= n; i++) {
            perm[i] = i;
        }

        List<Integer> indices = new ArrayList<>();

        // Find the indices where the direction changes from 'I' to 'D' or vice versa
        for (int i = 0; i < n; i++) {
            if (s.charAt(i) == 'D') {
                indices.add(i);
            }
        }

        // Reverse the subarrays between the indices found
        reverseSubarrays(perm, indices);

        return perm;
    }

    private static void reverseSubarrays(int[] perm, List<Integer> indices) {
        int n = perm.length;

        // Add the last index as the end point of the last subarray
        indices.add(n - 1);

        // Reverse each subarray
        for (int i = 0; i < indices.size(); i++) {
            int start = i == 0 ? 0 : indices.get(i - 1) + 1;
            int end = indices.get(i);

            while (start < end) {
                int temp = perm[start];
                perm[start] = perm[end];
                perm[end] = temp;
                start++;
                end--;
            }
        }
    }

    public static void main(String[] args) {
        String s = "IDID";
        int[] perm = findPermutation(s);

        System.out.println(Arrays.toString(perm));
    }
}
