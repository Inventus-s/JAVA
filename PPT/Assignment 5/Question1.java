public class Question1 {

    public static int[][] convert1DArrayTo2DArray(int[] original, int m, int n) {
        // Check if the number of elements in the 1D array is enough to fill the 2D array
        if (original.length < m * n) {
            return new int[0][0];
        }

        // Create the 2D array
        int[][] result = new int[m][n];

        // Iterate over the elements in the 1D array and populate the 2D array
        for (int i = 0; i < original.length; i++) {
            int row = i / n;
            int col = i % n;
            result[row][col] = original[i];
        }

        return result;
    }

    public static void main(String[] args) {
        int[] original = {1, 2, 3, 4};
        int m = 2;
        int n = 2;

        int[][] result = convert1DArrayTo2DArray(original, m, n);

        for (int[] row : result) {
            for (int i : row) {
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }
}
