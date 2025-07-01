// Check if two elements exist in array. Print message if available or not

public class ArrayElementChecker {

    public void checkElements(int[] arr, int a, int b) {
        boolean foundA = false, foundB = false;
        for (int i : arr) {
            if (i == a) foundA = true;
            if (i == b) foundB = true;
        }

        if (foundA && foundB)
            System.out.println("Both elements found.");
        else if (foundA)
            System.out.println("Only " + a + " found.");
        else if (foundB)
            System.out.println("Only " + b + " found.");
        else
            System.out.println("Neither found.");
    }

    public static void main(String[] args) {
        new ArrayElementChecker().checkElements(new int[]{3, 5, 7, 9}, 5, 3);
    }
}
