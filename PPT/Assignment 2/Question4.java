class Question4 {

    public static boolean Question4(int[] flowerbed, int n) {
        // Initialize the number of empty plots
        int emptyPlots = 0;

        // Iterate through the flowerbed
        for (int i = 0; i < flowerbed.length; i++) {
            // If the current plot is empty and the previous and next plots are also empty,
            if (flowerbed[i] == 0 && (i == 0 || flowerbed[i - 1] == 0) && (i == flowerbed.length - 1 || flowerbed[i + 1] == 0)) {
                // Increment the number of empty plots
                emptyPlots++;
            }
        }

        // Return true if the number of empty plots is at least n
        return emptyPlots >= n;
    }

    public static void main(String[] args) {
        int[] flowerbed = {1, 0, 0, 0, 1};
        int n = 1;

        boolean result = Question4(flowerbed, n);

        System.out.println("Can n new flowers be planted: " + result);
    }
}
