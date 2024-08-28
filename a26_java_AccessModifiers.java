package Java;
class Parent26{
    private void meth1(){
        System.out.println("I can be used only inside class");
    }
    void meth2(){
        System.out.println("I can be used inside class and in this packages(this code)");
    }

    protected void meth4(){
        System.out.println("I can be used by class , packages and subclass(of this and another package) ");
    }
    public void meth3(){
        System.out.println("I CAN BE USED ANYWHERE");
    }
}
public class a26_java_AccessModifiers {
    public static void main(String[] args) {
        /*
        Access modifiers determine whethere other class can use a perticular field or.
         invoke a method or not.
         This is of four type.
         1.public.(can be used everywhere)
         2.private.( can be used by class only)
         3.default.(no modifier)(can be used by class and packages)
         4.protected.( can be used by class,package,subclass)
         */
    }
}
