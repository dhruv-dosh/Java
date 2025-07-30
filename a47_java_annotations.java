package Java;
@FunctionalInterface //interface that contain only one method
interface  myinterface{
    void funcinter();
    //void kdlafn();// can not do this in functional interface
}
// 
// import java.lang.annotation.*;

// @Retention(RetentionPolicy.RUNTIME)   // Available at runtime
// @Target(ElementType.METHOD)           // Can be applied on methods
// public @interface MyAnnotation {
//     String value() default "default"; // Optional element with default
//     int count() default 1;            // Another optional element
// }

// 
class Myphone extends Phone{
    @Override
    public void On() {
        System.out.println("ON....");;
    }
    @Deprecated //USED TO WARN THAT THIS METHOD IS NO LONGER IN USE
    public int sum(int a,int b){
        return a+b;
    }
}
public class a47_java_annotations {
    @SuppressWarnings("deprecation") // COMPILER DOES NOT GIVE WARNING
    public static void main(String[] args) {
//        @Override -> annotation
        Myphone lala = new Myphone();
        lala.On();
        lala.sum(2,4);
    }
}
