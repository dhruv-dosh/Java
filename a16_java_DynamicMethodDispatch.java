package Java;
class Phone{
    public void Off1(){
        System.out.println("TURNING OFF PHONE....");
    }
    public void On(){
        System.out.println("TURNING ON PHONE....");
    }
}
class SmartPhone extends Phone{
    public void On(){
        System.out.println("TURNING ON SMARTPHONE....");
    }
    public void Off2(){
        System.out.println("TURNING OFF SMARTPHONE....");
    }
}
public class a16_java_DynamicMethodDispatch {
    public static void main(String[] args) {
        Phone p1 = new Phone();
        SmartPhone p2 = new SmartPhone();
        // TAKING REFERENCE OF PARENT CLASS MAKING OBJ OF BASE CLASS
        Phone p3 = new SmartPhone();
        // SmartPhone p4 = new Phone(); // NOT ALLOWED
        // p3.Off2(); NOT ALLOWED
    }
}
