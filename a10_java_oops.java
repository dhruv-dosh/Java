package Java;
class parent{
    int a;
    int b;
    public void par(){
        System.out.println("I AM A PARENT CLASS");
    }
}

class Child extends parent{
    public void chill(){
        System.out.println("I AM CHILD CLASS");
    }
}
public class a10_java_oops {
    public static void main(String[] args) {
         Child h1 = new Child();
         h1.par();
         h1.chill();
    }
}
