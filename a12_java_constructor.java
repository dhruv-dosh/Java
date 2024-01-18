package Java;

class Constructor{
    int c1;
    int c2;

    //Default Constructor ( If we not assign any constructor )
    //non-args Constructor ( If we not assign any arguments to constructor)
    //Parameterised Constructor ( constructor with Arguments )
    //Copy Constructor ( Copying var of obj1 in obj2 )
    // does not have any return type

    // non-args Constructor
    public Constructor(){
        this.c1 = 200;
        this.c2 = 600;
    }

    // Parameterised Constructor
    // parameter with different arguments is constructor overloading
    public Constructor(int c1){
        this.c1 = c1;
    }
    public Constructor(int c1,int c2){
        this.c1 = c1;
        this.c2 = c2;
    }

    // Copy Constructor

    public Constructor(Constructor c){
        this.c1 = c.c1;
        this.c2 = c.c2;
    }

}
public class a12_java_constructor {
    public static void main(String[] args) {
        Constructor obj1 = new Constructor();
        //Parameterised Constructor
        Constructor obj3 = new Constructor(4,5);
        //Copy Constructor
        Constructor obj2 = new Constructor(obj1);

        //Constructor
        System.out.println("Constructor set value of C1 and C2");
        System.out.println(obj1.c1);
        System.out.println(obj1.c2);
    }
}

