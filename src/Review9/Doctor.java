package Review9;

public class Doctor {
    //instance variables- declared outside of any method, constructor or blcok
    String firstName, lastName,speciality;

    //static variable- declared inside the class but outside method
    static String hospital="George Washington";

    //static methods can be accessed only static variables
    static void work(){
        System.out.println("All doctors work at "+hospital);
    }
   Doctor(String firstName, String lastName){
        this.firstName=firstName;
        this.lastName=lastName;
   }
   Doctor(String firstName,String lastName,String speciality){
        this(firstName, lastName);
        this.speciality=speciality;
   }
}
