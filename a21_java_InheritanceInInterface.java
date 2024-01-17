package Java;
interface inter1{
    void meth1();
}

// Inheritance In Interfaces
interface  inter2 extends inter1{
    void meth2();
}

// We Have To Define All Method
class Cls1 implements inter2 {
    @Override
    public void meth1() {
        System.out.println("I AM METHOD OF INTERFACE 1");
    }

    @Override
    public void meth2() {
        System.out.println("I AM METHOD OF INTERFACE 2");
    }
}
public class a21_java_InheritanceInInterface {
    public static void main(String[] args) {
       Cls1 c = new Cls1();
       c.meth1();
       c.meth2();
    }
}
