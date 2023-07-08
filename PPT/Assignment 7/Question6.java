public class Question6 {
    public static boolean rotateString(String s, String goal) {
        if (s.length() != goal.length()) {
            return false;
        }

        String rotated = s + s;
        return rotated.contains(goal);
    }

    public static void main(String[] args) {
        String s = "abcde";
        String goal = "cdeab";
        boolean canRotate = rotateString(s, goal);
        System.out.println(canRotate);
    }
}
