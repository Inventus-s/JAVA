public class Question5 {

    public static int distanceBetweenArrays(int[] arr1, int[] arr2, int d) {
        // Initialize the distance value
        int distance = 0;

        // Iterate over arr1
        for (int i = 0; i < arr1.length; i++) {
            // Check if there is no element in arr2 within distance d of arr1[i]
            boolean found = false;
            for (int j = 0; j < arr2.length; j++) {
                if (Math.abs(arr1[i] - arr2[j]) <= d) {
                    found = true;
                    break;
                }
            }

            // If no element was found, increment the distance value
            if (!found) {
                distance++;
            }
        }

        // Return the distance value
        return distance;
    }

    public static void main(String[] args) {
        int[] arr1 = {4, 5, 8};
        int[] arr2 = {10, 9, 1, 8};
        int d = 2;

        int distance = distanceBetweenArrays(arr1, arr2, d);

        System.out.println("The distance between the two arrays is: " + distance);
    }
}
