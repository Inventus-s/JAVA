class Question4 {

  public static String reverseWords(String s) {
    String[] words = s.split(" ");
    String reversedString = "";
    for (String word : words) {
      StringBuilder reversedWord = new StringBuilder();
      for (int i = word.length() - 1; i >= 0; i--) {
        reversedWord.append(word.charAt(i));
      }
      reversedString += reversedWord.toString() + " ";
    }
    return reversedString.substring(0, reversedString.length() - 1);
  }

  public static void main(String[] args) {
    String s = "Let's take LeetCode contest";
    System.out.println(reverseWords(s)); // "s'teL ekat edoCteeL tsetnoc"
  }
}
