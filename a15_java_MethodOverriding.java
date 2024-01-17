package Java;
class A{
    public void meth1(){
        System.out.println("I AM METHOD 1 OF CLASS A");
    }
    public void meth2(){
        System.out.println("I AM METHOD 2 OF CLASS A");
    }
}
class B extends A{
    // methodOverriding is defining predefined method
    @Override // This will throw Error if Method is not override
    // Same Method with different functions in different classes
    // Changing function of Method of Supper class not its arg or name or access-level(private,public)
    // can not override static or final method
    public void meth2(){
        System.out.println("I AM METHOD 2 OF CLASS B");
    }
    public void meth3(){
        System.out.println("I AM METHOD 3 OF CLASS B");
    }
}
public class a15_java_MethodOverriding {
    public static void main(String[] args) {
         A elm2 = new A();
         elm2.meth2();
         B elm1 = new B();
         elm1.meth2();
    }
}
