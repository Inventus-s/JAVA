import java.util.Stack;

public class Question7 {
    public static String decodeString(String s) {
        Stack<Integer> countStack = new Stack<>();
        Stack<StringBuilder> stringStack = new Stack<>();
        StringBuilder currentString = new StringBuilder();
        int currentCount = 0;

        for (char ch : s.toCharArray()) {
            if (Character.isDigit(ch)) {
                currentCount = currentCount * 10 + (ch - '0');
            } else if (ch == '[') {
                countStack.push(currentCount);
                stringStack.push(currentString);
                currentCount = 0;
                currentString = new StringBuilder();
            } else if (ch == ']') {
                StringBuilder decodedString = stringStack.pop();
                int repeatCount = countStack.pop();

                for (int i = 0; i < repeatCount; i++) {
                    decodedString.append(currentString);
                }

                currentString = decodedString;
            } else {
                currentString.append(ch);
            }
        }

        return currentString.toString();
    }

    public static void main(String[] args) {
        String s = "3[a]2[bc]";
        String decodedString = decodeString(s);

        System.out.println("Decoded String: " + decodedString);
    }
}
