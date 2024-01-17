package Java;

class ThisSup{
    public ThisSup(int x){
        // This is a reference to current object we can pass obj using " This"
        System.out.println("I AM A BASE CLASS CONSTRUCTOR " + x);
    }
}

class Sup extends ThisSup{
    public Sup(int y){
        // super keyword used to access parent class or constructor of parent class
        super(y);
        System.out.println("I AM A DERIVED CLASS CONSTRUCTOR");
    }
}
public class a14_java_ThisSuper
{
    public static void main(String[] args) {
        Sup e1 = new Sup(34);


    }
}
