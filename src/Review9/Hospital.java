package Review9;

public interface Hospital {
    void parentMethod();
}
 interface ChildInterface{
    void childMethod();
}
class Main implements Hospital,ChildInterface{
    public void parentMethod(){
        System.out.println("Parent Method-welcome to Syntax");
    }
    public void childMethod(){
        System.out.println("Child Method-hello Syntax");
    }
    public static void main(String[] args){
        Hospital parentInterface=new Main();
        parentInterface.parentMethod();
        ((Main) parentInterface).childMethod();
    }
}
