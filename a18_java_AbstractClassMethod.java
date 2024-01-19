package Java;

// Defining abstract class and abstract method onside it
// Abstract Class
abstract class PhoneModel{
    public void vibrate(){
        System.out.println("VIBRATING....");
    }

    // Abstract Method
    abstract void call();
}


// class inherited from Abstract class
class Samsung extends PhoneModel{
    @Override
    public void call(){
        System.out.println("calling...");
    }
    public void start(){
        System.out.println("Starting...");
    }
}
public class a18_java_AbstractClassMethod {
    public static void main(String[] args) {
        Samsung s21 = new Samsung();
        s21.call();
        s21.vibrate();
    }
}