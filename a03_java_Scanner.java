package Java;
import java.util.Scanner;

public class a03_java_Scanner {
    public static void main(String[] args) {
        //taking input
        Scanner s= new Scanner(System.in);
        System.out.println("enter first number :");
        int a = s.nextInt();
        System.out.println("enter second number :");
        int b = s.nextInt();
        float d = s.nextFloat();
        boolean tf = s.hasNextInt(); // input is intiger or not
        String str = s.next(); // to get one word
        String str2 = s.nextLine(); //to get full string
        System.out.println(tf);
        int sum = a +b;
        System.out.println("the sum of this two numbers is :"+ sum);
//        System.out.println(sum);
    }
}
