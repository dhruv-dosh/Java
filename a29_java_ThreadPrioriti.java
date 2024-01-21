package Java;

import java.sql.SQLOutput;

class MultiThr29 extends Thread{
    public MultiThr29(String name){
        super(name);
    }
    @Override
    public void run(){
        System.out.println("Thread is running");
    }
}
public class a29_java_ThreadPrioriti {
    public static void main(String[] args) {
        // if we set thread priority max it does not mean that it will run first
        // but opreating system give that thread more time
        MultiThr29 t3 = new MultiThr29("DHRUV");
        MultiThr29 t2 = new MultiThr29("DOSHI");
        MultiThr29 t1 = new MultiThr29("JAIN");
        t1.setPriority(Thread.MAX_PRIORITY);
        System.out.println(t1.getName());
        System.out.println(t2.getName());
        System.out.println(t3.getName());

    }
}
