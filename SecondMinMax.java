// Create anonymous class to find second largest and second smallest number from array.

import java.util.*;

public class SecondMinMax {

    public void findSecondElements(int[] arr) {
        Arrays.sort(arr);
        Runnable task = new Runnable() {
            @Override
            public void run() {
                int secondSmallest = arr[1];
                int secondLargest = arr[arr.length - 2];
                System.out.println("Second Smallest: " + secondSmallest);
                System.out.println("Second Largest: " + secondLargest);
            }
        };
        task.run();
    }

    public static void main(String[] args) {
        new SecondMinMax().findSecondElements(new int[]{4, 1, 9, 3, 7});
    }
}
