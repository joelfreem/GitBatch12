package Class26;

import java.util.ArrayList;
import java.util.Arrays;

public class CollectionsDemo {
    public static void main(String[] args) {
       // String name="Someone";
        //String name1="Something";
        //Not scalable if we have to store large amount of data
        //Arrays can be good option to tackle this problem

       // String[] names={"Someone","Something"};
       // names[2]="Somewhere";
        String[] names1=new String[1000];
        names1[0]="Somehow";
        names1[2]="Somewhen";
        System.out.println(Arrays.toString(names1));
        ArrayList<String> syntaxStudents=new ArrayList<>();
        //ArrayList=> Name of the class
        //<> diamond opertaor
        //String datatype
        syntaxStudents.add("Jo'el");
        syntaxStudents.add("Mike");
        syntaxStudents.add("Andrew");
        System.out.println(syntaxStudents);
    }
}
