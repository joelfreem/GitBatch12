package Class28;

import java.util.TreeSet;

public class SetDemo2 {
    public static void main(String[] args) {

        TreeSet<String> fruit=new TreeSet<>();
        fruit.add("Apple");
        fruit.add("Mango");
        fruit.add("Kiwi");
        fruit.add("Orange");
        fruit.add("Banana");
        fruit.add("Apple");
        System.out.println(fruit);
    }
}
