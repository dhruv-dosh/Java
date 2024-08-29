package Java;

import java.util.InputMismatchException;
import java.util.Scanner;

class CoustExcep extends Exception{
    @Override
    public String toString() {
        return "I AM A TO STRING METHOD";
    }

    @Override
    public String getMessage() {
        return "I AM A GET MESSAGE METHOD";
    }
}
public class a34_java_ExceptionClass {
    public static void main(String[] args) {
//        We Can Write Our Custom Exception In Java
        Scanner S = new Scanner(System.in);
        System.out.print("Enter a Number :");
        int a = S.nextInt();
        if (a<5){
            try {
                throw new CoustExcep();
            }
            catch (Exception e){
                //System.out.println(e.getMessage());
                //System.out.println(e);
                e.printStackTrace();
            }
        }
        System.out.println("Program is finished");


        /*
        THROW
        keyword is used to throw exception explicitly by a programmer.
        Example :
         */
        int []arr = {24,36,84};
        Scanner s = new Scanner(System.in);

            System.out.println("Enter index Of Number You want To Divide :");
            int ind = s.nextInt();
            System.out.println("Enter Number You Want to divide that index from :");
            int num = s.nextInt();
            if (num == 0){
                try {
                    throw new ArithmeticException("This is Exception Because of zero");
                }
                catch (Exception e){
                    e.printStackTrace();
                }
            }
            else{
                System.out.println(arr[ind]/num);
            }
    }
}
