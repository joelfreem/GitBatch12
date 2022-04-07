package Classs30;

import java.util.HashSet;
import java.util.Set;

public class Batch12Entry {
    String key;
    Double value;

    public Batch12Entry(String key, Double value) {
        this.key = key;
        this.value = value;
    }
    String getKey(){
        return key;
    }
    Double getValue(){
        return value;
    }

    @Override
    public String toString() {
        return "B12Entry{" +
                "key='" + key + '\'' +
                ", value=" + value +
                '}';
    }
}
class Test{



    public static void main(String[] args) {
        Set<Batch12Entry> entries=new HashSet<>();
        entries.add(new Batch12Entry("Apple",12.0));
        entries.add(new Batch12Entry("Mango",15.0));
        entries.add(new Batch12Entry("Banana",18.0));
        entries.add(new Batch12Entry("Kiwi",12.0));
        System.out.println(entries);
        for (Batch12Entry b:entries
             ) {
            System.out.println(b);
            System.out.println(b.getKey());
            System.out.println(b.getValue());

        }

    }
}
