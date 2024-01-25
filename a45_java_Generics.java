package Java;

import java.util.ArrayList;
//THIS IS HOW YOU MADE YOUR COUSTOME GENERIC CLASS
//HERE Mygener IS A GENERIC CLASS WHICH TAKE OTHER CLASS AS PARAMETER AND PERFORM METHODS ON THEM
class Mygener<T1,T2>{
    private T1 t1;
    private T2 t2;

    public Mygener(T1 t1,T2 t2){
        this.t1=t1;
        this.t2=t2;
    }

    public T1 getT1() {
        return t1;
    }

    public void setT1(T1 t1) {
        this.t1 = t1;
    }

    public T2 getT2() {
        return t2;
    }

    public void setT2(T2 t2) {
        this.t2 = t2;
    }
}
public class a45_java_Generics {
    public static void main(String[] args) {
        //ArrayList<GENERICS> arr = new ArrayList<>();
        // in this Integer is generic which says that this arraylist contain integer only
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(23);

        //CREATING OBJECT OF MY GENER CLASS
        Mygener<Integer,String> mg = new Mygener<>(43,"Dhruv");
        Integer in1 = mg.getT1();
        String str = mg.getT2();
        System.out.println(in1 + str);
    }
}
