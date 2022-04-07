package Classs30;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Task3 {

    public static void main(String[] args) {
        HashMap<Integer,String> bestbuy=new HashMap<>();
        bestbuy.put(7664847,"Printer");
        bestbuy.put(7879885,"Camera");
        bestbuy.put(7664848,"TV");

        Iterator<Map.Entry<Integer,String>> iterator=bestbuy.entrySet().iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}
