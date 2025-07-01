// Find Minimum and Maximum from array Explanation -> from array return Min and Max value

import java.util.Arrays;

public class MinMaxFinder {

    public void findMinMax(int[] arr) {
        int min = Arrays.stream(arr).min().getAsInt();
        int max = Arrays.stream(arr).max().getAsInt();
        System.out.println("Min: " + min + ", Max: " + max);
    }

    public static void main(String[] args) {
        new MinMaxFinder().findMinMax(new int[]{4, 1, 9, 3, 6});
    }
}
