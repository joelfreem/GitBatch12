package Classs30;

import java.util.HashMap;
import java.util.Map;

public class MapDemo5 {

    public static void main(String[] args) {
        HashMap<String,Double> fruitMap=new HashMap<>();
        fruitMap.put("Banana",20.0);
        fruitMap.put("Apple",10.2);
        fruitMap.put("Kiwi",105.2);
        fruitMap.put("Orange",16.5);
        fruitMap.put("Mango",20.0);
        //entry set is a box inside we have boxes with keys and values
        System.out.println(fruitMap.entrySet());
        //getting the entries aka small boxes that contains the keys and values together
        for (Map.Entry<String,Double> entry: fruitMap.entrySet()
             ) {
            System.out.println(entry);
            System.out.println(entry.getKey());
            System.out.println(entry.getValue());
        }
    }
}
