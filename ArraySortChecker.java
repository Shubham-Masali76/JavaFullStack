// Check if an array is sorted -> Given generic array, check if it is sorted in non-descending order

public class ArraySortChecker {

    public boolean isSorted(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < arr[i - 1]) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println("Sorted: " + new ArraySortChecker().isSorted(new int[]{1, 2, 3, 4}));
    }
}
