package CLass28;

import java.util.ArrayList;
import java.util.Iterator;

public class Task1 {
    public static void main(String[] args) {
        ArrayList<String> cars=new ArrayList<>();
        cars.add("BMW");
        cars.add("Porsche");
        cars.add("Ferrari");
        System.out.println(cars);
        for (String car: cars
             ) {
            System.out.println(car);
        }
        for (int i=0;i<cars.size();i++){
            System.out.println(i);
        }
        int i=0;
        while(i< cars.size()){
            System.out.println(cars.get(i));
            i++;
        }
        Iterator<String> iterator= cars.iterator();
        System.out.println(iterator.next());
    }
}
