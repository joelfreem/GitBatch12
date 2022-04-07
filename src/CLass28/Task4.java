package CLass28;

import java.util.ArrayList;
import java.util.Iterator;

public class Task4 {
    public static void main(String[] args) {
        ArrayList<Integer> number=new ArrayList<>();
        for(int i=2; i<=500;i+=2){
            number.add(i);
        }
        number.removeIf(integer -> integer %5==0);
        /*Iterator<Integer> iterator=number.iterator();
        while(iterator.hasNext()){
            if(iterator.next()%5==0);
            iterator.remove();
        }
        */
        System.out.println( number);
    }
}
