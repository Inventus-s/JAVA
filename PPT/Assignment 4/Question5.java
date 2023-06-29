public class Question5 {

    public static int staircase(int n) {
        int completeRows = 0;
        int currentRow = 1;

        while (n >= currentRow) {
            completeRows++;
            n -= currentRow;
            currentRow++;
        }

        return completeRows;
    }

    public static void main(String[] args) {
        int n = 5;

        int completeRows = staircase(n);

        System.out.println(completeRows);
    }
}
