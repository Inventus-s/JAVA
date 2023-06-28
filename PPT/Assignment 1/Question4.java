import java.util.Arrays;
public class Question4 {

    public static int[] plusOne(int[] digits) {
        // Initialize the carry to 1
        int carry = 1;

        // Iterate through the array from the rightmost digit
        for (int i = digits.length - 1; i >= 0; i--) {
            // If the current digit is not 9,
            if (digits[i] != 9) {
                // Add the carry to the current digit
                digits[i] += carry;
                carry = 0;
            } else {
                // If the current digit is 9,
                // Set it to 0 and set the carry to 1
                digits[i] = 0;
            }
        }

        // If the carry is still 1,
        // Append a 1 to the beginning of the array
        if (carry == 1) {
            int[] result = new int[digits.length + 1];
            result[0] = 1;
            for (int i = 1; i < result.length; i++) {
                result[i] = digits[i - 1];
            }
            return result;
        } else {
            return digits;
        }
    }

    public static void main(String[] args) {
        int[] digits = {1, 2, 3};

        int[] result = plusOne(digits);

        System.out.println("The resulting array of digits is: " + Arrays.toString(result));
    }
}
