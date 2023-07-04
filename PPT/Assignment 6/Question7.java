import java.util.Arrays;

public class Question7 {
    public static int[][] generateMatrix(int n) {
        int[][] matrix = new int[n][n];
        int num = 1; // Starting number to fill the matrix
        int left = 0, right = n - 1, top = 0, bottom = n - 1;

        while (num <= n * n) {
            // Fill the top row
            for (int i = left; i <= right; i++) {
                matrix[top][i] = num;
                num++;
            }
            top++;

            // Fill the right column
            for (int i = top; i <= bottom; i++) {
                matrix[i][right] = num;
                num++;
            }
            right--;

            // Fill the bottom row
            for (int i = right; i >= left; i--) {
                matrix[bottom][i] = num;
                num++;
            }
            bottom--;

            // Fill the left column
            for (int i = bottom; i >= top; i--) {
                matrix[i][left] = num;
                num++;
            }
            left++;
        }

        return matrix;
    }

    public static void main(String[] args) {
        int n = 3;
        int[][] matrix = generateMatrix(n);

        // Print the matrix
        for (int[] row : matrix) {
            System.out.println(Arrays.toString(row));
        }
    }
}
