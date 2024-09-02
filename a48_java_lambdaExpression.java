package Java;
interface DemoAno{
    public void meth1();
    public void meth2();
}

@FunctionalInterface
interface DemoAno2{
    public void meth3();
}
class Dhruv implements DemoAno2{
    @Override
    public void meth3() {
        System.out.println("hellow");
    }
}
public class a48_java_lambdaExpression {
    public static void main(String[] args) {
        // IF WE WANT TO USE METHOD OF ANY INTERFACE ONLY ONE WE USE FOLLOWING ANONYMOUS CLASS
        /*
        WITH THE HELP OF ANONYMOUS CLASSES WE DON'T HAVE TO CREATE CLASS WHICH IMPLEMENTS INTERFACE FOR USE METHOD ONLY ONCE
         */
        DemoAno obj = new DemoAno() {
            @Override
            public void meth1() {
                System.out.println("I AM METHOD 1");
            }

            @Override
            public void meth2() {
                System.out.println("I AM METHOD 2");
            }
        };
        obj.meth1();


        // NOW LAMBDA EXPRESSIONS ARE USED TO OVERRIDE METHOD OF FUNCTIONAL INTERFACE
        // lambda expression
        DemoAno2 obj1 = ()->{
            System.out.println("I AM METHOD 3 OF DEMOANO2");
        };
        obj1.meth3();
    }
}
