import java.util.Scanner;

public class Percentage {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter Number in Maths");
        int m= sc.nextInt();
        System.out.println("Enter Number in Science");
        int s= sc.nextInt();
        System.out.println("Enter Number in English");
        int e= sc.nextInt();
        System.out.println("Enter Number in Hindi");
        int h= sc.nextInt();
        System.out.println("Enter Number in Business");
        int b= sc.nextInt();
        System.out.println("your result is");
        float per = (m+b+h+e+s)/5.0f;
        System.out.println(per);
    }
}


//////////////////////practice question
//public class Percentage {
//    public static void main(String[] args) {
//        Scanner sc =new Scanner(System.in);
//        System.out.println("Enter your Name");
//        String str = sc.nextLine();
//        System.out.println("Hellow"+str+" have a good day");
// }
//}

/////////////////////kilometers to miles
//public class Percentage {
//    public static void main(String[] args) {
//        Scanner sc =new Scanner(System.in);
//        System.out.println("Enter Kilometers");
//        float km = sc.nextFloat();
//        double mil = km*(0.62137);
//        System.out.println("Given kilometers to miles is :"+mil);
//    }
//}