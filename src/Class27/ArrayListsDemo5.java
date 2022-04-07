package Class27;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayListsDemo5 {
    public static void main(String[] args) {
        List<String> groceries= Arrays.asList("Apple","Orange","Banana");
        /*groceries.add("Banana");
        groceries.add("Apple");
        groceries.add("Grapes");
        groceries.add("Potato");*/

        System.out.println(groceries);

        ArrayList<String> list2=new ArrayList<>();
        list2.add("Banana");
        list2.add("Apple");
        list2.add("Grapes");
        //list2.add("Pillow") makes it false

        System.out.println(groceries.containsAll(list2));
    }
}
