package Class25;

public interface Human {
    //public static final int legs=2;
    int legs=2;
    //public abstract void walk();
    void walk();
    static void printLegs(){
        System.out.println(legs);
    }
    public default void noNeddToWorry(){
        System.out.println("default methods are there to funtional programming");
    }
}
    interface LivingBeing{
    static void printLegs(){
        System.out.println("Not sure");
    }
    }
class Maha implements Human,LivingBeing{

    @Override
    public void walk() {
        System.out.println("I can use walk");
    }
    public static void main(String[] args){
        Maha maha=new Maha();
        maha.walk();
       // Maha.printLegs();
        Human.printLegs();
        LivingBeing.printLegs();

    }
}