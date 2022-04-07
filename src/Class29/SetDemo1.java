package Class29;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class SetDemo1 {

    public static void main(String[] args) {
        ArrayList<String> arrayList=new ArrayList<>();
        arrayList.add("A");
        arrayList.add("C");
        arrayList.add("B");
        arrayList.add("B");

        LinkedHashSet<String> linkedHashSet=new LinkedHashSet<>(arrayList);//maintains order of original
        System.out.println(linkedHashSet);

        TreeSet<String> treeSet=new TreeSet<>(arrayList);//prints out in order of predetermined java index
        System.out.println(treeSet);
        arrayList.clear();//removing all the original elements
        arrayList.addAll(linkedHashSet);//adds all unique elements with the same inserion order

        System.out.println("Array");
        System.out.println(arrayList);

    }
}
