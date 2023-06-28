import java.util.HashSet;

public class Question2 {

    public static int maxCandies(int[] candyType) {
        int maxAllowedCandies = candyType.length / 2;

        HashSet<Integer> uniqueCandies = new HashSet<>();
        for (int candy : candyType) {
            uniqueCandies.add(candy);
        }

        return Math.min(maxAllowedCandies, uniqueCandies.size());
    }

    public static void main(String[] args) {
        int[] candyType = {1, 1, 2, 2, 3, 3};
        int maxDifferentCandies = maxCandies(candyType);
        System.out.println("Maximum different types of candies Alice can eat: " + maxDifferentCandies);
    }
}
