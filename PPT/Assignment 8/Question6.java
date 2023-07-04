import java.util.ArrayList;
import java.util.List;

public class Question6 {
    public static List<Integer> findAnagrams(String s, String p) {
        List<Integer> indices = new ArrayList<>();

        if (s.length() < p.length()) {
            return indices;
        }

        int[] targetCount = new int[26];
        int[] windowCount = new int[26];

        // Count the frequencies of characters in the pattern string
        for (char c : p.toCharArray()) {
            targetCount[c - 'a']++;
        }

        int left = 0;
        int right = 0;
        int count = 0;

        while (right < s.length()) {
            // Expand the window by adding the current character
            char c = s.charAt(right);
            windowCount[c - 'a']++;
            count++;

            // Shrink the window if its size is greater than the pattern's length
            if (count > p.length()) {
                char leftChar = s.charAt(left);
                windowCount[leftChar - 'a']--;
                count--;
                left++;
            }

            // Check if the window contains an anagram of the pattern
            if (count == p.length() && matches(targetCount, windowCount)) {
                indices.add(left);
            }

            right++;
        }

        return indices;
    }

    private static boolean matches(int[] targetCount, int[] windowCount) {
        for (int i = 0; i < 26; i++) {
            if (targetCount[i] != windowCount[i]) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        String s = "cbaebabacd";
        String p = "abc";
        List<Integer> indices = findAnagrams(s, p);

        System.out.println("Anagram Start Indices: " + indices);
    }
}
