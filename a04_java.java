//practice set loop
import java.util.Scanner;
public class a04_java {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();

        /*
        for (int i= n ; i > 0 ; i--){
            for (int j = 0 ; j < i ; j++){
                System.out.print("*");
            }
            System.out.print("\n");
        }
        */

        //////////////////////////practice 2
        /*
        int i = 1;
        int sum = 0;
        while(i <= n){
            sum += 2*i;
            i++;
        }
        System.out.println("Sum of first "+n+" even number is :"+sum);
        */

        ////////////////////////practice 3/////////////////////
        /*
        int i = 1;
        while(i <= 10){
            System.out.println(n*i);
            i++;
        }
        */

        ////////////////////////practice 4/////////////////////
        /*
        int i = 10;
        while(i > 0){
            System.out.println(10*i);
            i--;
        }
        */

        ////////////////////////practice 3/////////////////////
        int fact = 1;
        while(n > 0){
            fact *= n;
            n--;
        }
        System.out.println("Factorial of above number is : "+ fact);
    }
}
