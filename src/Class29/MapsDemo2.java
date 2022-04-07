package Class29;

import java.net.Inet4Address;
import java.util.HashMap;
import java.util.Map;

public class MapsDemo2 {

    public static void main(String[] args) {
        Map<String,Integer> fruit=new HashMap<>();
        fruit.put("Orange",10);
        fruit.put("Apple",1000);
        fruit.put("Banana",15);
        Map<String, Integer> vegetables = new HashMap<>();
        vegetables.put("Potato",4);
        vegetables.put("Tomato",10);

        Map<String,Integer> groceries=new HashMap<>();
        groceries.putAll(fruit);
    }
}
