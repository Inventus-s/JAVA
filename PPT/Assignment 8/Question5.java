public class Question5 {
    public static int compress(char[] chars) {
        int index = 0; // Index to track the position in the modified array
        int count = 1; // Count of consecutive repeating characters

        for (int i = 1; i <= chars.length; i++) {
            // If the current character is the same as the previous character, increment the count
            if (i < chars.length && chars[i] == chars[i - 1]) {
                count++;
            } else {
                // Append the character and count to the modified array
                chars[index++] = chars[i - 1];

                // If the count is greater than 1, append the count as well
                if (count > 1) {
                    String countStr = String.valueOf(count);

                    for (char c : countStr.toCharArray()) {
                        chars[index++] = c;
                    }
                }

                count = 1; // Reset the count for the next group
            }
        }

        return index; // Return the new length of the array
    }

    public static void main(String[] args) {
        char[] chars = {'a', 'a', 'b', 'b', 'c', 'c', 'c'};
        int newLength = compress(chars);

        System.out.print("Compressed Array: [");
        for (int i = 0; i < newLength; i++) {
            System.out.print("'" + chars[i] + "'");
            if (i < newLength - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");
        System.out.println("New Length: " + newLength);
    }
}
