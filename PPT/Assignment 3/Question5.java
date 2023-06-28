public class Question5 {

    public static int[] incrementInteger(int[] digits) {
        int n = digits.length;
        int carry = 1;

        for (int i = n - 1; i >= 0; i--) {
            digits[i] += carry;
            carry = digits[i] / 10;
            digits[i] %= 10;
        }

        if (carry > 0) {
            int[] newDigits = new int[n + 1];
            newDigits[0] = carry;
            System.arraycopy(digits, 0, newDigits, 1, n);
            return newDigits;
        } else {
            return digits;
        }
    }

    public static void main(String[] args) {
        int[] digits = {1, 2, 3};

        int[] incrementedDigits = incrementInteger(digits);

        for (int i = 0; i < incrementedDigits.length; i++) {
            System.out.print(incrementedDigits[i] + " ");
        }
    }
}
