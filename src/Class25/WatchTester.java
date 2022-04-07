package Class25;

class AppleWatch extends SmartWatch{

    public AppleWatch(int RAM, int ROM, double displaySize, String make) {
        super(RAM, ROM, displaySize, make);
    }

    @Override
    public void showHealthTips() {
        System.out.println("use the Health App to check the details");
    }
}
public class WatchTester{
    public static void main(String[] args) {
        AppleWatch appleWatch=new AppleWatch(2,16,1.5,"Apple");
        appleWatch.showHealthTips();
        AppleWatch.displayTime();
    }
}


