import java.util.HashMap;
import java.util.Map;

class Question1 {

  public static boolean isIsomorphic(String s, String t) {
    int n = s.length();
    boolean[] used = new boolean[256];
    Map<Character, Character> map = new HashMap<>();
    for (int i = 0; i < n; i++) {
      char c1 = s.charAt(i);
      char c2 = t.charAt(i);
      if (map.containsKey(c1)) {
        if (map.get(c1) != c2) {
          return false;
        }
      } else {
        if (used[c2]) {
          return false;
        }
        map.put(c1, c2);
        used[c2] = true;
      }
    }
    return true;
  }

  public static void main(String[] args) {
    String s = "egg";
    String t = "add";
    System.out.println(isIsomorphic(s, t)); // true
  }
}
