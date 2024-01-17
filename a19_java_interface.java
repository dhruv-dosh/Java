package Java;
interface Phone19{
    void switchOff();
    void switchOn();
}
interface SmartPhone19{
    void takeSnape();
}
class Nokia extends PhoneModel implements Phone19,SmartPhone19{
    @Override
    public void switchOff() {
        System.out.println("switchOff.........");
    }

    @Override
    public void switchOn() {
        System.out.println("switchOn.........");
    }

    @Override
    public void call(){
        System.out.println("calling...");
    }

    @Override
    public void takeSnape() {
        System.out.println("Taking Snape......");
    }
}
public class a19_java_interface {
    public static void main(String[] args) {
         Nokia n21 = new Nokia();
         n21.switchOff();
         n21.call();
         n21.takeSnape();
    }
}
