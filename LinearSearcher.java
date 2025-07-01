// Liner Search Explanation -> Given a generic array and target element ,return its index , if not found return -1

public class LinearSearcher<T> {

    public int linearSearch(T[] arr, T target) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].equals(target)) return i;
        }
        return -1;
    }

    public static void main(String[] args) {
        LinearSearcher<Integer> searcher = new LinearSearcher<>();
        System.out.println("Index: " + searcher.linearSearch(new Integer[]{1, 3, 5, 7}, 5));
    }
}
