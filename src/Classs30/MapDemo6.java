package Classs30;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class MapDemo6 {
    public static void main(String[] args) {
        HashMap<String,Double> fruitMap=new HashMap<>();
        fruitMap.put("Banana",20.0);
        fruitMap.put("Apple",10.2);
        fruitMap.put("Kiwi",105.2);
        fruitMap.put("Orange",16.5);
        fruitMap.put("Mango",20.0);
        System.out.println(fruitMap.keySet());
        System.out.println(fruitMap.values());
        System.out.println(fruitMap.entrySet());
        //getting keys and values in the form of an entry(Map.Entry)
        Iterator<Map.Entry<String,Double>> iterator=fruitMap.entrySet().iterator();
        while(iterator.hasNext()){
           // System.out.println(iterator.next());
            System.out.println(iterator.next().getValue());
            System.out.println(iterator.next().getKey());
        }
    }
}
