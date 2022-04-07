package Class29;

import java.util.ArrayList;
import java.util.Iterator;

public class Task1Tester {

    public static void main(String[] args) {
        ArrayList<Insurance> obj= new ArrayList<>();
        obj.add(new Car("Mr.B","BMW"));
        obj.add(new Pet("Petco Insurance","Parakeet"));
        obj.add(new Health("Blue Cross"));


        for (Insurance In:obj){
            In.getQuote();
            In.cancelInsurance();
        }
        Iterator<Insurance> iterator = obj.iterator();
        while (iterator.hasNext()){
            iterator.next().getQuote();
            iterator.next().cancelInsurance();
        }
    }
}
