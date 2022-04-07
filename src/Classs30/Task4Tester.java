package Classs30;

import java.util.Map;
import java.util.TreeMap;

public class Task4Tester {

    public static void main(String[] args) {
        TreeMap<String,Person> personTreeMap=new TreeMap<>();
        personTreeMap.put("a",new Person("Someone","Lastone",20,2500000));
        personTreeMap.put("b",new Person("Name1","Lastone1",50,20000));
        personTreeMap.put("c",new Person("Name2","Lastone2",25,25000));
        personTreeMap.put("d",new Person("Name3","Lastone3",65,1000000));
        for (Map.Entry<String,Person> p:personTreeMap.entrySet()){
            System.out.println(p);
        }




    }
}
