package Java;
//Using Threads By Extending Thread class
//class MultiThr1 extends Thread{
//    @Override
//    public void run(){
//        int i=0;
//        while (i<100){
//           System.out.println("i am cooking right now :");
//           i++;
//        }
//    }
//}
//class MultiThr2 extends Thread{
//    @Override
//    public void run(){
//        int i=0;
//        while (i<100){
//            System.out.println("I AM DANCING RIGHT NOW :");
//            i++;
//        }
//    }
//}

//Creating Java Thread Using Runnable interface
class Multithre3 implements Runnable{
    public void run(){
        int i = 0;
        while (i<100) {
            System.out.println("I am a thread 3");
            i++;
        }
    }
}
class Multithre4 implements Runnable{
    public void run(){
        int i = 0;
        while (i<100) {
            System.out.println("I am a thread 44444444444");
            i++;
        }
    }
}
public class a27_java_Multithreding {
    public static void main(String[] args) {
        /*
        Multiprocessing and Multithreading both are used to acheive Multitasking
        threads are the small parts of process which increase the speed of process
        For Example :- A word processor can have one thread running in
                       foregroung as an editor and another in background autosaving the dock
        Threads -> Faster content switching.
        Threads is lightweight whereas processor is heavyweight

        threads :- waiter.
        process :- hotel. // Multiprocessing is heavier then Multithreading

        there are two ways to create thread in java
        1.By extending thread class.
        2.By implementing runnable interface.

        Without threading
        main() -> Func1() -> func2() -> END

        With Threading
        main()  --\
        func1() ----> END
        func2() --/
         */


        /*
        Concurrency and parallelism
        1.Doing multiple work but doing one task at a time.
        2.Multitasking and all the work is done at same time
         */

        //USING MULTITHREADING CONCEPT EXTENDING THREAD
//        MultiThr1 t1 = new MultiThr1();
//        MultiThr2 t2 = new MultiThr2();
//        t1.start();
//        t2.start();

        //USING MULTITHREADING CONCEPT BY IMPLIMENTING RUNNABLE INTERFACE
        Multithre3 bull1 = new Multithre3();
        Thread gun1 = new Thread(bull1);
        Multithre4 bull2 = new Multithre4();
        Thread gun2 = new Thread(bull2);
        gun1.start();
        gun2.start();
    }
}
