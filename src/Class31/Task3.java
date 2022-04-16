package Class31;

import java.util.ArrayList;

public class Task3 {
    public static void main(String[] args) {

        ArrayList<Integer> numbers=new ArrayList<>();
        numbers.add(10);
        numbers.add(10);
        numbers.add(10);
        numbers.add(10);
        numbers.add(10);
        int sum=0;
        for (int i=0;i<numbers.size();i++){
            sum+=numbers.get(i);
        }
        System.out.println(sum);

    }
}
