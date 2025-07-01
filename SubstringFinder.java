// Find substring and its number of occurrence , if found return range of index where it found

public class SubstringFinder {

    public void findSubstringRanges(String text, String subStr) {
        int index = text.indexOf(subStr);
        int count = 0;

        while (index >= 0) {
            count++;
            System.out.println("Found at index range: " + index + " to " + (index + subStr.length() - 1));
            index = text.indexOf(subStr, index + 1);
        }

        System.out.println("Total occurrences: " + count);
    }

    public static void main(String[] args) {
        String text = "Rust’s rich type system and ownership model guarantee memory-safety and thread-safety.";
        new SubstringFinder().findSubstringRanges(text, "safety");
    }
}
