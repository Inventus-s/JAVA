import java.util.*;

public class Question6 {
    public static int[] findOriginalArray(int[] changed) {
        if (changed.length % 2 != 0) {
            return new int[0]; // If the length of changed is odd, it cannot be a doubled array
        }

        Map<Integer, Integer> countMap = new HashMap<>();
        for (int num : changed) {
            countMap.put(num, countMap.getOrDefault(num, 0) + 1);
        }

        Arrays.sort(changed); // Sort the changed array in ascending order

        int[] original = new int[changed.length / 2];
        int index = 0;

        for (int num : changed) {
            if (countMap.getOrDefault(num, 0) > 0) {
                if (countMap.getOrDefault(num * 2, 0) > 0) {
                    original[index] = num;
                    index++;
                    countMap.put(num, countMap.get(num) - 1);
                    countMap.put(num * 2, countMap.get(num * 2) - 1);
                } else {
                    return new int[0]; // If the required double value doesn't exist, return an empty array
                }
            }
        }

        return original;
    }

    public static void main(String[] args) {
        int[] changed = {1, 3, 4, 2, 6, 8};
        int[] original = findOriginalArray(changed);

        if (original.length == 0) {
            System.out.println("No original array exists.");
        } else {
            System.out.println("Original Array: " + Arrays.toString(original));
        }
    }
}
