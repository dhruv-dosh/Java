package Java;
@FunctionalInterface //interface that contain only one method
interface  myinterface{
    void funcinter();
    //void kdlafn();// can not do this in functional interface
}
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
