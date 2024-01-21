package Java;

import org.w3c.dom.ls.LSOutput;

class Mythr extends Thread{
    public Mythr(String name){
        super(name);
    }
    public void run(){
        System.out.println("thread is running");
    }
}

class Mythread implements Runnable{
    @Override
    public void run() {
        System.out.println("Thread two is running");
    }
}
public class a28_java_ThreadLifeCycle {
    /*
    NEW -> Instance of thread create which is not yet started by invoking start.
    RUNNABLE -> After invocation of start and before it is selected to be run by the scheduler.
    RUNNING -> After thread scheduler has selected it.
    NON-RUNNABLE -> Thread alive but not eligible to run.(If thread is waiting for server
                                                         (response or taking time for something)
    TERMINATED -> Run Method is exited.

                                            NEW
                                             |
                                          RUNNABLE <--\
                                             |       NON-RUNNABLE
                                          RUNNING  >--/
                                             |
                                         TERMINATED
     */



    //CONSTRUCTOR FROM THREAD CLASS

    public static void main(String[] args) {
        Mythr obj1 = new Mythr("Dhruv");
        System.out.println("Id of this Thread is : "+obj1.getId());//USING METHOD OF THREAD
        System.out.println("Name of given thread is : "+obj1.getName());
        obj1.start();

        Mythread obj2 = new Mythread();
        Thread gun = new Thread(obj2,"Doshi");
        gun.start();
        System.out.println("Id of this Thread is : "+gun.getId());//USING METHOD OF THREAD
        System.out.println("Name of given thread is : "+gun.getName());

    }


}
