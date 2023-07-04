public class Question3 {

    public static boolean validMountainArray(int[] arr) {
        if (arr.length < 3) {
            return false;
        }

        int i = 1;
        while (i < arr.length && arr[i] >= arr[i - 1]) {
            i++;
        }

        if (i == 1 || i == arr.length - 1) {
            return false;
        }

        while (i < arr.length - 1) {
            if (arr[i] <= arr[i + 1]) {
                return false;
            }
            i++;
        }

        return true;
    }

    public static void main(String[] args) {
        int[] arr = {2, 1};

        System.out.println(validMountainArray(arr)); // false
    }
}
