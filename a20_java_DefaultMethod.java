package Java;
// Implementing interface (defining similar type of methods without their body)
interface Phone20 {
    void switchOff();
    void switchOn();
}

// Implementing another interface
interface SmartPhone20 {
    void takeSnap();
    // IF YOUR DEFAULT CODE IS TOO LONG YOU USE PRIVATE ACCESS MODIFIERS
    private void greet(){
        System.out.println("Good Morning");
    }
    default void takePhoto() {
        greet();
        System.out.println("Taking Photo kichik");
    }
}

// Class inherited from Phone20 and implements both interfaces
class Nokia2 implements Phone20, SmartPhone20 {
    @Override
    public void switchOff() {
        System.out.println("switchOff.........");
    }

    @Override
    public void switchOn() {
        System.out.println("switchOn.........");
    }

    @Override
    public void takeSnap() {
        System.out.println("Taking Snap......");
    }

    // Since you are implementing Phone20, you need to provide the implementations for switchOn as well
}

public class a20_java_DefaultMethod {
    public static void main(String[] args) {
        Nokia2 n21 = new Nokia2();
        n21.switchOff();
        n21.switchOn();  // You need to call switchOn since you're implementing Phone20
        n21.takeSnap();
        n21.takePhoto();
    }
}
