// Find middle element ->Given generic array, return the middle element

public class MiddleElementFinder {

    public <T> T findMiddle(T[] arr) {
        int mid = arr.length / 2;
        return arr[mid];
    }

    public static void main(String[] args) {
        MiddleElementFinder finder = new MiddleElementFinder();
        System.out.println("Middle: " + finder.findMiddle(new String[]{"A", "B", "C", "D", "E"}));
    }
}
