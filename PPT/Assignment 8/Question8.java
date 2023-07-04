public class Question8 {
    public static boolean areAlmostEqual(String s, String goal) {
        int n = s.length();
        int diffCount = 0;
        int[] count = new int[26];

        for (int i = 0; i < n; i++) {
            count[s.charAt(i) - 'a']++;
            count[goal.charAt(i) - 'a']--;
            if (s.charAt(i) != goal.charAt(i)) {
                diffCount++;
            }
        }

        if (diffCount == 0) {
            return true; // Strings are already equal
        }

        if (diffCount != 2) {
            return false; // More than 2 characters are different
        }

        for (int i = 0; i < 26; i++) {
            if (count[i] != 0) {
                return false; // Characters don't match in count
            }
        }

        return true;
    }

    public static void main(String[] args) {
        String s = "ab";
        String goal = "ba";
        boolean result = areAlmostEqual(s, goal);

        System.out.println("Result: " + result);
    }
}
