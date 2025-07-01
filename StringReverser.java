// Reverse String using Generic for Characters * String str="Hello"; O/p- olleh

public class StringReverser<T> {

    public String reverseCharacters(String input) {
        StringBuilder sb = new StringBuilder(input);
        return sb.reverse().toString();
    }

    public static void main(String[] args) {
        StringReverser<Character> reverser = new StringReverser<>();
        System.out.println("Reversed: " + reverser.reverseCharacters("Hello"));
    }
}
