import java.util.*;

public class ArrayListDemo {
    public static void main(String[] args) {
        ArrayList<Integer> a = new ArrayList<>();

        for(int i = 0 ; i <= 10 ; i++){
            a.add(i+2);
        }

        System.out.println("Array List: "+ a);
        System.out.println("First Element: "+a.get(0));
        System.out.println("First Element: "+a.get(a.size()-1));
        System.out.println("Removed Element: "+a.remove(3));
        System.out.println("Array List: "+ a);
    }
}
