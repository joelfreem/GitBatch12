package Class29;

import java.util.ArrayList;
import java.util.HashMap;

public class MapsDemo1 {

    public static void main(String[] args) {

        ArrayList<String> names=new ArrayList<>();
        names.add("Someone");
        names.add("Muhamad");
        System.out.println(names.get(0));

        HashMap<Integer,String> map=new HashMap<>();
        map.put(123456789,"Asghar Nazir");
        map.put(123456,"Muhammad");
        System.out.println(map.get(123456789));

        HashMap<String,String> groceries=new HashMap<>();
        groceries.put("Lilly","Eggs,Milk,Bread ect");
        groceries.put("Jo'el","MacBook, Iphone 13, Apple Monitor");
        System.out.println(groceries.get("Jo'el"));
    }
}
