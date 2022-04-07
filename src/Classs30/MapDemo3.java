package Classs30;

import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;

public class MapDemo3 {

    public static void main(String[] args) {
        HashMap<String,Double> fruitMap=new HashMap<>();
        fruitMap.put("Banana",20.0);
        fruitMap.put("Apple",10.2);
        fruitMap.put("Kiwi",105.2);
        fruitMap.put("Orange",16.5);
        fruitMap.put("Mango",20.0);
        Collection<Double> values=fruitMap.values();//print only the values not the keys
        System.out.println(values);
        Iterator<Double> iterator= values.iterator();
        /*while(iterator.hasNext()){
            if(iterator.next()>=20){
               iterator.remove();
            }
        }*/
        values.removeIf(aDouble -> aDouble >= 20);
    }
}
