package Java;
//implementing interface( defining similar type of methods without their body )
/*
An Interface in Java programming language is defined as an abstract type used to specify the behavior
of a class. An interface in Java is a blueprint of a behavior. A Java interface contains static
constants and abstract methods
 */

//It is used to achieve abstraction and multiple inheritances in java.
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
public class xa19_java_interface {
    public static void main(String[] args) {
         Nokia n21 = new Nokia();
         n21.switchOff();
         n21.call();
         n21.takeSnape();
    }
}
