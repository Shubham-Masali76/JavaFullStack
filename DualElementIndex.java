// Check if Two elements exists in array ->Given Generic array and two elements ,check if both exist in array and return index where it present

public class DualElementIndex {

    public void findIndexes(int[] arr, int a, int b) {
        int indexA = -1, indexB = -1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == a) indexA = i;
            if (arr[i] == b) indexB = i;
        }

        if (indexA != -1 && indexB != -1)
            System.out.println("Indexes: " + a + " at " + indexA + ", " + b + " at " + indexB);
        else
            System.out.println("One or both elements not found.");
    }

    public static void main(String[] args) {
        new DualElementIndex().findIndexes(new int[]{4, 5, 6, 7}, 5, 7);
    }
}
