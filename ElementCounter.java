// Count Occurrence of Element Explanation -> Given a generic array and target element ,count how many times the element appears

public class ElementCounter<T> {

    public int countOccurrences(T[] arr, T target) {
        int count = 0;
        for (T item : arr) {
            if (item.equals(target)) count++;
        }
        return count;
    }

    public static void main(String[] args) {
        ElementCounter<String> counter = new ElementCounter<>();
        System.out.println("Occurrences: " + counter.countOccurrences(
            new String[]{"apple", "banana", "apple", "orange"}, "apple"
        ));
    }
}
