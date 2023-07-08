public class Question7 {
    public static boolean backspaceCompare(String s, String t) {
        String processedS = processString(s);
        String processedT = processString(t);

        return processedS.equals(processedT);
    }

    private static String processString(String str) {
        StringBuilder result = new StringBuilder();

        for (char c : str.toCharArray()) {
            if (c == '#') {
                if (result.length() > 0) {
                    result.deleteCharAt(result.length() - 1);
                }
            } else {
                result.append(c);
            }
        }

        return result.toString();
    }

    public static void main(String[] args) {
        String s = "ab#c";
        String t = "ad#c";
        boolean isEqual = backspaceCompare(s, t);
        System.out.println(isEqual);
    }
}
