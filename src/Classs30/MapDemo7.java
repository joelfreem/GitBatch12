package Classs30;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class MapDemo7 {

    public static void main(String[] args) {
        HashMap<String,Double> fruitMap=new HashMap<>();
        fruitMap.put("Banana",10.2);
        fruitMap.put("Apple",10.2);
        fruitMap.put("Kiwi",105.2);
        fruitMap.put("Orange",16.5);
        fruitMap.put("Mango",20.0);

        Iterator<Map.Entry<String,Double>>iterator=fruitMap.entrySet().iterator();
        while(iterator.hasNext()){
            //getting the entries from Iterator
            Map.Entry<String,Double> entry=iterator.next();
            //getting the keys nad values from the Entry object
            if(entry.getKey().endsWith("e") ||entry.getValue()>=20){
                iterator.remove();
            }
        }
        System.out.println(fruitMap);
    }
}
