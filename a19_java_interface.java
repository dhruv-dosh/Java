package Java;
//implementing interface( defining similar type of methods without their body )
interface Phone19{
    void switchOff();
    void switchOn();
}

// implementing another interface
interface SmartPhone19{
    void takeSnape();
}

// class inherited from PhoneModel from a18 and implements both interface
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
