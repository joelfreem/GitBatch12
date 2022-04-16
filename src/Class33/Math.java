package Class33;

public class Math {
    void add(int a, int b) {
        System.out.println(a + b);
    }

    void divide(int a, int b) {
      /*  if(b!=0){
            System.out.println(a/b);
        }else{
            System.out.println("You cannot divide by zero fool");
        }

       */

        try {
            System.out.println(a/b);
        } catch (ArithmeticException are) {
            System.out.println("You cannot divide by zero fool");

        }catch (NullPointerException name){
            System.out.println("Initialize the object to avoid this exception");
        }

    }
}