package CLass28;

import java.util.LinkedList;

public class ListDemo4 {
    public static void main(String[] args) {
        Student student=new Student("Jo'el",20,"Games");
        Student Someone=new Student("Person",50,"Study");
        Student Someoneelse=new Student("Someone",29,"Sports");
        LinkedList<String> studentLinkedList=new LinkedList<>();
        studentLinkedList.add("teyfur");
        studentLinkedList.add("gulden");
        studentLinkedList.add("Dante");
    }
}
class Student {

    public Student(String name, int age, String hobbies) {
    this.name=name;
    this.age=age;
    this.hobbies=hobbies;
    }
    String name;
    int age;
    String hobbies;

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", hobbies='" + hobbies + '\'' +
                '}';
    }
}