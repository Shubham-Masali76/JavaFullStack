import java.util.*;

public class LinkedListDemo {
    public static void main(String[] args) {
        LinkedList<String> ll = new LinkedList<>();
        ll.add("Shubham");
        ll.push("Krishna");
        ll.addFirst("Yash");
        ll.addLast("Vinayak");
        ll.offer("Shrushti");
        System.out.println("Peek Element: "+ ll.peek());
        System.out.println("Peek First Element: "+ll.peekFirst());
        System.out.println("Peek Last Element: "+ll.peekLast());
        ll.set(0, "Amina");
        ll.removeFirst();
        ll.removeLast();
        Collections.sort(ll);
        Collections.reverse(ll);

        
    }
}
