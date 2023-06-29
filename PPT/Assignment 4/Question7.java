import java.util.Arrays;

public class Question7 {

    public static int maxIntegersInMatrix(int m, int n, int[][] ops) {
        int[][] matrix = new int[m][n];
        int max = 0;

        for (int[] op : ops) {
            for (int i = 0; i < op[0]; i++) {
                for (int j = 0; j < op[1]; j++) {
                    matrix[i][j]++;
                }
            }
        }

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                max = Math.max(max, matrix[i][j]);
            }
        }

        return max;
    }

    public static void main(String[] args) {
        int m = 3;
        int n = 3;
        int[][] ops = {{2, 2}, {3, 3}};

        int maxIntegers = maxIntegersInMatrix(m, n, ops);

        System.out.println(maxIntegers);
    }
}
