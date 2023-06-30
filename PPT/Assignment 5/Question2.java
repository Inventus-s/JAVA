public class Question2 {

    public static int staircaseWithCoins(int n) {
        // Initialize the number of complete rows to 0
        int completeRows = 0;

        // Iterate over the possible values of the last row
        for (int i = 1; i <= n; i++) {
            // If the number of coins in the last row is a multiple of i, then it is a complete row
            if (n % i == 0) {
                completeRows++;
            }
        }

        return completeRows;
    }

    public static void main(String[] args) {
        int n = 5;

        int completeRows = staircaseWithCoins(n);

        System.out.println("The number of complete rows is " + completeRows);
    }
}
