package Class25;

public interface MoveAble{
    void move();



}
interface DriveAble{
    void drive();
}
interface car extends DriveAble,MoveAble{

}
class BMW implements car{
    public void move(){
        System.out.printf("we can move the BMW");
    }

    @Override
    public void drive() {
        System.out.println("We can drive the BMW");
    }
}
