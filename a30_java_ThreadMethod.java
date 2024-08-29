package Java;
class Mythr30 extends Thread{
    public void run(){
        int i =0;
        while (i<100){
            System.out.println("thread is running");
//            try {
//                Thread.sleep(1);//Delay in implementing thread
//            }
//            catch (Exception e){
//                System.out.println("Error");
//            }
            i++;
        }

    }
}
class Mythr31 extends Thread{
    public void run(){
        int i =0;
        while (i<100){
        System.out.println("thread 2 is running -------------------");
        i++;
        }
    }
}
public class a30_java_ThreadMethod {
    public static void main(String[] args) {
        Mythr30 t1 = new Mythr30();
        Mythr31 t2 = new Mythr31();
//        try {
//           t1.join();// obj t1 will run first and then t2 will join
//        }
//        catch (Exception e){
//            System.out.println("Error");
//        }
        t1.start();
        t2.start();
    }
}
