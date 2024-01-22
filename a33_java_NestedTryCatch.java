package Java;

import java.util.InputMismatchException;
import java.util.Scanner;

public class a33_java_NestedTryCatch {
    public static void main(String[] args) {
                int []arr = {24,36,84};
                Scanner s = new Scanner(System.in);
                try{
                    System.out.println("Enter index Of Number You want To Divide :");
                    int ind = s.nextInt();
                    System.out.println("Enter Number You Want to divide that index from :");
                    int num = s.nextInt();
                    try{
                        System.out.println("The val of arr index entered is :"+arr[ind]);
                        System.out.println("The value of "+arr[ind]+"/"+num+" is : "+arr[ind]/num);
                    }
                    catch (ArrayIndexOutOfBoundsException e){
                        System.out.println("Index Number Is Wrong :"+e);
                    }
                    catch (ArithmeticException e){
                        System.out.println("Number Can Not Be Divided By Zero :"+e);
                    }
                    catch (Exception e){
                        System.out.println("Exception occurs :"+e);
                    }
                }
                catch (InputMismatchException e){
                    System.out.println("Input Is Wrong :"+e);
                }
                catch (Exception e){
                    System.out.println("Exception occurs :"+e);
                }

    }
}
