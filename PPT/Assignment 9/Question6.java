public class Question6 {
    public int firstBadVersion(int n) {
        int left = 1;
        int right = n;

        while (left < right) {
            int mid = left + (right - left) / 2;

            if (isBadVersion(mid)) {
                right = mid;
            } else {
                left = mid + 1;
            }
        }

        return left;
    }

    // Placeholder for the API method
    private boolean isBadVersion(int version) {
        // Implementation of the isBadVersion API method
        // Returns true if the version is bad, false otherwise
        return version >= 4;
    }

    public static void main(String[] args) {
        Question6 solution = new Question6();

        int n = 5;

        int firstBadVersion = solution.firstBadVersion(n);

        System.out.println("Output: " + firstBadVersion);
    }
}
