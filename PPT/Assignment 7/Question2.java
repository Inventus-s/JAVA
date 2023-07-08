class Question2 {

  public static boolean isStrobogrammatic(String num) {
    int n = num.length();
    for (int i = 0; i < n / 2; i++) {
      char c1 = num.charAt(i);
      char c2 = num.charAt(n - 1 - i);
      if (c1 != '0' && c1 != '1' && c1 != '6' && c1 != '8') {
        return false;
      }
      if (c1 == '6' && c2 != '9') {
        return false;
      }
      if (c1 == '9' && c2 != '6') {
        return false;
      }
    }
    return true;
  }

  public static void main(String[] args) {
    String num = "69";
    System.out.println(isStrobogrammatic(num)); // true
  }
}
