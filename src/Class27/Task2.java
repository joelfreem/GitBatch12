package Class27;

public class Task2 {
    public static void main(String[] args) {
        A a=new A(10,20,30);
        System.out.println(a.getPercentage());
    }
}

abstract class Marks{
abstract double getPercentage();
}
class A extends Marks{
    private double sub1;
    private double sub2;
    private double sub3;
    A(double sub1,double sub2, double sub3){
        this.sub1=sub1;
        this.sub2=sub2;
        this.sub3=sub3;
    }

    @Override
    double getPercentage() {
        return (sub1+sub2+sub3)/3;
    }
}
class B extends Marks {
    private double sub1;
    private double sub2;
    private double sub3;
    private double sub4;

    B(double sub1, double sub2, double sub3) {
        this.sub1 = sub1;
        this.sub2 = sub2;
        this.sub3 = sub3;
        this.sub4=sub4;
    }

    @Override
    double getPercentage() {
        return (sub1 + sub2 + sub3+sub4) / 4;
    }
}
