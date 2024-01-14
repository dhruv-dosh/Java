import java.util.Scanner;

public class practicestring {
    public static void main(String[] args) {
       Scanner sc= new Scanner(System.in);
//        System.out.println("Enter the string :");
//        String str = sc.nextLine();
        //question 1
//        System.out.println("Lower case string is : "+str.toLowerCase());
        //question 2
//        System.out.println("After removing space : "+str.replace(' ','_'));
        //Question 3
//        System.out.println("Double space is present at Index : "+str.indexOf("  "));
        //Question 4
        System.out.println("Enter the name :");
        String name = sc.nextLine();
        String latter = "Hey! <Name> ,Welcome to the real world";
        latter = latter.replace("<Name>",name);
        System.out.println(latter);
    }
}
