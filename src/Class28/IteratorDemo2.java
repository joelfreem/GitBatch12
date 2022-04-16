package Class28;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class IteratorDemo2 {
    public static void main(String[] args) {
        List<String> courses =new LinkedList<>();
        courses.add("SDLC");
        courses.add("Manuel Testing");
        courses.add("Java");
        courses.add("Java");
        courses.add("Selenium");

        Iterator<String> iterator=courses.stream().iterator();
        System.out.println(iterator.hasNext());
        System.out.println(iterator.hasNext());
    }
}
