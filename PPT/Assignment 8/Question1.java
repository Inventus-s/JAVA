public class Question1 {
    public static int minimumDeleteSum(String s1, String s2) {
        int m = s1.length();
        int n = s2.length();

        // Create a 2D array to store the minimum ASCII sum for subproblems
        int[][] dp = new int[m + 1][n + 1];

        // Calculate the minimum ASCII sum for the base cases
        for (int i = 1; i <= m; i++) {
            dp[i][0] = dp[i - 1][0] + s1.charAt(i - 1);
        }

        for (int j = 1; j <= n; j++) {
            dp[0][j] = dp[0][j - 1] + s2.charAt(j - 1);
        }

        // Fill in the remaining cells of the dp array
        for (int i = 1; i <= m; i++) {
            for (int j = 1; j <= n; j++) {
                if (s1.charAt(i - 1) == s2.charAt(j - 1)) {
                    // Characters match, no deletion needed
                    dp[i][j] = dp[i - 1][j - 1];
                } else {
                    // Choose the minimum ASCII sum by either deleting s1[i-1] or s2[j-1]
                    dp[i][j] = Math.min(dp[i - 1][j] + s1.charAt(i - 1), dp[i][j - 1] + s2.charAt(j - 1));
                }
            }
        }

        return dp[m][n];
    }

    public static void main(String[] args) {
        String s1 = "sea";
        String s2 = "eat";

        int minDeleteSum = minimumDeleteSum(s1, s2);
        System.out.println("Lowest ASCII Sum of Deleted Characters: " + minDeleteSum);
    }
}
