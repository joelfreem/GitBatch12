package Classs30;

import java.util.*;

public class Task2 {

    public static void main(String[] args) {
        TreeMap<String,String> places=new TreeMap<>();
        places.put("USA","Washington DC");
        places.put("Canada","Ottawa");
        places.put("Russia","Moscow");
        places.put("China","Beijing");
        places.put("South Korea","Seoul");
        places.put("El Salvador","San Salvador");
        for (Map.Entry<String,String> entry: places.entrySet()
        ) {
            System.out.print(entry.getKey()+" ");
            System.out.println(entry.getValue());
        }

        Iterator<Map.Entry<String,String>> iterator=places.entrySet().iterator();
        while(iterator.hasNext()){
            Map.Entry<String,String> entry=iterator.next();
            System.out.println(places.entrySet());
            System.out.println(iterator.next().getValue());
        }
        for(String value: places.values()){
            System.out.println(value);
        }
        Iterator<String> iterator1=places.values().iterator();
        while(iterator1.hasNext()){
            System.out.println(iterator1.next());
        }
    }
}
