package Classs30;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;

public class Task1 {

    public static void main(String[] args) {
        HashMap<Integer,String> floors=new HashMap<>();
        floors.put(1,"Google");
        floors.put(2,"Apple");
        floors.put(3,"Walmart");
        floors.put(4,"Syntax");
        floors.put(5,"Corsair");
        floors.put(6,"Sony");
        floors.put(7,"Microsoft");
        System.out.println(floors.size());
        System.out.println(floors.replace(4,"HP"));
        floors.remove(7);
        System.out.println(floors);

    }
}
