package Classs30;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class AsListDemo {

    public static void main(String[] args) {
        List<Integer> list= Arrays.asList(13,20,30);
        System.out.println(list);
        list.add(40);//not supported if we create list using arrays.asList

        List<Integer> list2=new ArrayList<>(Arrays.asList(13,20,30));//at least you will be wasting twice the memory
        list2.add(40);
        System.out.println(list2);
    }
}
