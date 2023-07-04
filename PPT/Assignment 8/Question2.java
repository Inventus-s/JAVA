import java.util.Stack;

public class Question2 {
    public static boolean checkValidString(String s) {
        Stack<Integer> leftStack = new Stack<>();
        Stack<Integer> starStack = new Stack<>();

        int n = s.length();
        for (int i = 0; i < n; i++) {
            char c = s.charAt(i);
            if (c == '(') {
                leftStack.push(i);
            } else if (c == '*') {
                starStack.push(i);
            } else {
                if (!leftStack.isEmpty()) {
                    leftStack.pop();
                } else if (!starStack.isEmpty()) {
                    starStack.pop();
                } else {
                    return false;
                }
            }
        }

        while (!leftStack.isEmpty() && !starStack.isEmpty()) {
            int leftIndex = leftStack.pop();
            int starIndex = starStack.pop();
            if (leftIndex > starIndex) {
                return false;
            }
        }

        return leftStack.isEmpty();
    }

    public static void main(String[] args) {
        String s = "()";
        boolean isValid = checkValidString(s);
        System.out.println("Is Valid: " + isValid);
    }
}
