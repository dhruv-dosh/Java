package Java;
import java.util.Scanner;

public class a31_java_ErrorAndException {
    public static void main(String[] args) {
        /*
        There are three types of error
        1.Syntax Error. > when compiler see any problem in our code it shows syntax error
        2.logical Error. > Also known as bug occurs when program compiles and runs but does the wrong
                           thing EG :- message delivered wrongly,
        3.Runtime Error. -> Also called Exception
         */

        //int a=10 //This type of error is syntax error

        //print first five prime number
//        System.out.println(2);
//        for (int i=1;i<5;i++){
//            System.out.println(2*i+1); //This is logical error
//        }

        //Given below is Runtime error
//        Scanner s= new Scanner(System.in);
//        System.out.println("Enter Number :");
//        int k = s.nextInt();
//        System.out.println("The result of 100/k is "+100/k ); //if we type any char it will be run time error

         /*
            Exception in Java
            1.Checked Exception. (compile time exception.)
            2.Unchecked Exception. (run time exception.)

            Commonly Occurring Exception
            1.Null point Exception.
            2.Arithmetic.
            3.array index out of bound.
            4.illegal argument.
            5.Number format.
         */

        // Exception Handling
        Scanner s= new Scanner(System.in);
        System.out.println("Enter Number :");
        try {
           int k = s.nextInt();
           System.out.println("The result of 100/k is "+100/k );
        }
        catch (Exception e){
            System.out.println("NO RESULT BECAUSE OF : "+e ); //If User Input char by default
        }
    }
}
