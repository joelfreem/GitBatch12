package Class29;

import java.util.HashSet;

public class Task4 {

    public static void main(String[] args) {
        /*
        Create a Set collection that will hold Objects of Student Type.
        In this set we do not care about the insertion order. Each
        student object should have name and studentID. Display name of each student
         */
        HashSet<Student> students=new HashSet<>();
        students.add(new Student("Jo'el", "40046961"));
        students.add(new Student("Dante", "40046902"));
        students.add(new Student("Alex", "40046964"));
        for(Student s:students ){
            s.printName();
        }

    }
}
class Student{
    String name;
    String studentID;
    Student(String name, String studentID){
        this.name= name;
        this.studentID=studentID;
    }
    void printName(){
        System.out.println(name);
    }
}