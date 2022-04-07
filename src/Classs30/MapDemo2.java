package Classs30;

import java.util.HashMap;
import java.util.Set;

public class MapDemo2 {
    public static void main(String[] args) {
        HashMap<String,Double> fruitMap=new HashMap<>();
        fruitMap.put("Banana",10.2);
        fruitMap.put("Apple",20.0);
        fruitMap.put("Kiwi",105.2);
        fruitMap.put("Orange",16.5);
        fruitMap.put("Mango",10.2);

        Set<String> keys=fruitMap.keySet();
        System.out.println(keys);
        keys.removeIf(s -> s.contains("e"));

        System.out.println(fruitMap);

    }
}
