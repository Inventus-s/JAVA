import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Question8 {
    public static int[] findOriginalArray(int[] changed) {
        int n = changed.length;
        if (n % 2 != 0) {
            // If the length is odd, it's not a doubled array
            return new int[0];
        }

        Map<Integer, Integer> countMap = new HashMap<>();
        for (int num : changed) {
            countMap.put(num, countMap.getOrDefault(num, 0) + 1);
        }

        List<Integer> originalList = new ArrayList<>();
        for (int num : changed) {
            if (countMap.getOrDefault(num, 0) == 0) {
                // Skip if the element is already used
                continue;
            }
            int half = num / 2;
            if (num % 2 != 0 || countMap.getOrDefault(half, 0) == 0) {
                // If the element is odd or its halved value is not present, it's not a doubled array
                return new int[0];
            }
            originalList.add(half);
            countMap.put(num, countMap.get(num) - 1);
            countMap.put(half, countMap.get(half) - 1);
        }

        int[] original = new int[originalList.size()];
        for (int i = 0; i < originalList.size(); i++) {
            original[i] = originalList.get(i);
        }
        return original;
    }

    public static void main(String[] args) {
        int[] changed = {1, 3, 4, 2, 6, 8};
        int[] original = findOriginalArray(changed);
        for (int num : original) {
            System.out.print(num + " ");
        }
    }
}
