import java.util.Scanner;

public class Input {
    public static void main(String[] args) {
        System.out.println("this is user input file");
        Scanner sca = new Scanner(System.in);
        System.out.println("lets take input from user");
        int a = sca.nextInt();
        System.out.println("lets take second input from user");
        int b = sca.nextInt();
        float c = sca.nextFloat(); //for taking float as an input
        String s = sca.nextLine(); //for taking string as an input
        boolean d = sca.hasNextInt(); //to check the given input is valid or not
        System.out.println(d);
        int sum = a+b;
        System.out.println("sum of two num is");
        System.out.println(sum);
    }
}
