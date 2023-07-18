public class Question7 {
    public int countInversions(int[] arr) {
        int[] temp = new int[arr.length];
        return mergeSort(arr, temp, 0, arr.length - 1);
    }
    
    private int mergeSort(int[] arr, int[] temp, int left, int right) {
        int inversions = 0;
        
        if (left < right) {
            int mid = left + (right - left) / 2;
            
            inversions += mergeSort(arr, temp, left, mid);
            inversions += mergeSort(arr, temp, mid + 1, right);
            
            inversions += merge(arr, temp, left, mid, right);
        }
        
        return inversions;
    }
    
    private int merge(int[] arr, int[] temp, int left, int mid, int right) {
        int inversions = 0;
        
        int i = left;
        int j = mid + 1;
        int k = left;
        
        while (i <= mid && j <= right) {
            if (arr[i] <= arr[j]) {
                temp[k++] = arr[i++];
            } else {
                temp[k++] = arr[j++];
                inversions += mid - i + 1; // Count the inversions
            }
        }
        
        while (i <= mid) {
            temp[k++] = arr[i++];
        }
        
        while (j <= right) {
            temp[k++] = arr[j++];
        }
        
        System.arraycopy(temp, left, arr, left, right - left + 1);
        
        return inversions;
    }
    
    public static void main(String[] args) {
        Question7 solution = new Question7();
        
        int[] arr = {2, 4, 1, 3, 5};
        
        int inversionCount = solution.countInversions(arr);
        
        System.out.println("Output: " + inversionCount);
    }
}
