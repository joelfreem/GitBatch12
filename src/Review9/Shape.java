package Review9;

public interface Shape {
    void calculateArea();
    void calculePerimeter();
}
class Something implements Shape {
    @Override
    public void calculateArea() {
        System.out.println("implementation 1");
    }

    @Override
    public void calculePerimeter() {
        System.out.println("implementation 2");
    }

    public static void main(String[] args) {
        Shape shape=new Something();
        shape.calculateArea();
        shape.calculePerimeter();
    }
}
