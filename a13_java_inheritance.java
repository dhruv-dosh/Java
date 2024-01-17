// INHERITANCE AND CONSTRUCTOR-IN-INHERITANCE
package Java;

class Base{
    int age;
    int salary;
    String name;
    public Base(){
        System.out.println("I AM A BASE CLASS CONSTRUCTOR");
        name = "Employee";
        age = 20;
        salary= 150000;
    }
    public Base(int a){
        System.out.println("I AM OVERLOADED CONSTRUCTOR OF BASE CLASS OF VAL "+a);
    }
}

//Extend keyword is used to inherit class
class Derived extends Base{
    String post;

    public Derived(){
        //super is for runing overloded constructor of base class
//        super(10);
        System.out.println("I AM A DERIVED CLASS CONSTRUCTOR");
        post = "Manager";
    }
    public Derived(int x,int y){
        //super is for runing overloded constructor of base class
        super(x);
        System.out.println("I AM A OVERLODED DERIVED CLASS CONSTRUCTOR with val "+ y);
        post = "Manager";
    }

}

class Derived2 extends Derived{
    public Derived2(int x,int y,int z){
        super(x,y);
        System.out.println("I AM OVERLOADED CHILD OF DERIVED CLASS CONSTRUCTOR WITH VAL "+z );
    }
}
public class a13_java_inheritance {
    public static void main(String[] args) {
//        Base e1 = new Base();
//        System.out.println(e1.name+" "+e1.age+" "+e1.salary);
//        Derived e2 = new Derived(10,32);
//        System.out.println(e2.name+" "+e2.post+" "+e2.age+" "+e2.salary);
        Derived2 e3 = new Derived2(1,2,3);

    }
}