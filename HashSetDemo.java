import java.util.HashSet;
import java.util.Iterator;

public class HashSetDemo {
    public static void main(String[] args) {
        HashSet<String> set = new HashSet<>();
        
        set.add("Mango");
        set.add("Banana");
        set.add("Orange");
        set.add(null);

        boolean containsApple = set.contains("Apple");
        System.out.println("Set has apple? "+containsApple);

        boolean removeBanana = set.remove("Banana");
        System.out.println("remove banana: "+removeBanana);
        System.out.println("Size: "+set.size());
        System.out.println("is Empty: "+set.isEmpty());
        
        Iterator<String> itr = set.iterator();
        while (itr.hasNext()) {
            String str = itr.next();
            System.out.println(str);
        }
    }
}
