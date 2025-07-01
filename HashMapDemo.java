import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class HashMapDemo {
    public static void main(String[] args) {
        HashMap<Integer, String> map = new HashMap<>();
        map.put(null, null);
        map.put(null, null);
        map.put(2, null);
        map.put(3, "Hello");
        System.out.println("Hash Map: "+map);
        map.replace(2, "Hii");
        System.out.println(map.get(3));
        System.out.println(map.containsKey(2));
        System.out.println(map.containsValue("Hii"));

        map.remove(null);
        map.remove(3, "Hi");

        System.out.println(map.keySet());
        System.out.println(map.values());

        map.forEach((key, value) -> System.out.println(key+ " : "+ value));

        Iterator<Map.Entry<Integer, String>> itr = map.entrySet().iterator();
        while (itr.hasNext()) {
            Map.Entry<Integer, String> entry = itr.next();
            System.out.println(entry.getKey()+" : "+ entry.getValue());
        }

        map.entrySet().stream().forEach(entry -> System.out.println(entry.getKey()+" : "+ entry.getValue()));
    }
}
