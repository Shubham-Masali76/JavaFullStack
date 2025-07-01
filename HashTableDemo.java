import java.util.Hashtable;

public class HashTableDemo {
    public static void main(String[] args) {
        Hashtable<Integer, String> table = new Hashtable<>();
        table.put(1, "Hello");
        table.put(2, "Hii");
        table.put(3, "Hello");
        System.out.println("Hash Map: "+table);
        table.replace(2, "Hii");
        System.out.println(table.get(3));
        System.out.println(table.containsKey(2));
        System.out.println(table.containsValue("Hii"));

        table.remove(3, "Hi");

        System.out.println(table.keySet());
        System.out.println(table.values());

        table.forEach((key, value) -> System.out.println(key+ " : "+ value));

        table.entrySet().stream().forEach(entry -> System.out.println(entry.getKey()+" : "+ entry.getValue()));
    }
}
