package Class27;

public class Task1 {
}
interface Shape{
    void calculateArea(double input);
    void calculatePerimeter(double input);
}
class Circle implements Shape{

    @Override
    public void calculateArea(double input) {
        double area=Math.PI*Math.pow(input,2);
        System.out.println(area);
    }

    @Override
    public void calculatePerimeter(double input) {
        System.out.println(2*Math.PI*input);
    }
}
class Square implements Shape{

    @Override
    public void calculateArea(double input) {

    }

    @Override
    public void calculatePerimeter(double input) {

    }
    public static void main(String[] args){
        Shape shape=new Circle();
        shape.calculatePerimeter(56);
        //((Square)shape).test();
    }
}