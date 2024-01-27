package Java;
//practice set loop
import java.util.Scanner;
public class a04_java_LoopsConditionals {
    public static void main(String[] args) {
        // conditionals if
        int a = 3;
        int b= 3;
        if (a==1){
            System.out.println("val of a is 1");
        } else if (a==2) {
            System.out.println("value of a is 2");
        }
        else {
            System.out.println("value of a is not 1 or 2");
        }

        //Nested if
        if(a==3 && b>=0){
            if (b==3){
                System.out.println("Val of a and b is equal");
            }
            else{
                System.out.println("A ans B is not equal");
            }
        }

        //Conditional Switch case
        switch (a){
            case 1:
                System.out.println("Val of a is 1");
                break;
            case 2:
                System.out.println("Val of a is 2");
                break;
            case 3:
                System.out.println("Val of a is 3");
                break;
            default:
                System.out.println("val of A is not 1,2 or 3");

        }


        // FOR LOOP IN JAVA
        for (int i=0;i<10;i++){
            System.out.println("Hi I am a for loop");
        }

        //FOR EACH LOOP
        int [] arr ={1,2,3,4,5};
        for (int item : arr){
            System.out.println(item);
        }

        // WHILE LOOP IN JAVA
        int c = 5;
        while (a!=0){
            System.out.println("HI I AM A WHILE LOOP ");
            c--;
        }

        //do while loop in java run once at any condition
        int i= 5;
        do {
            System.out.println("HI I AM A DO WHILE LOOP");
        }while (i != 0);

        //BREAK -> BREAK THE LOOP AND START RUNNING FOLLOWING PROGRAM
        //CONTINUE -> DO NOT PERFORM PRESENT CODE AND RUN LOOP FOR FOLLOWING CONDITION
    }
}
