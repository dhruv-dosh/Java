package Java;

import java.util.Scanner;

public class pattern {
    public static void printPattern1(int a){
        for(int i=0;i<a;i++){
            for(int j=0;j<a;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void printPattern2(int a){
        for(int i=1;i<=a;i++){
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void printPattern3(int a){
        for(int i=1;i<=a;i++){
            for(int j=1;j<=i;j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }
    public static void printPattern4(int a){
        for(int i=1;i<=a;i++){
            for(int j=1;j<=i;j++){
                System.out.print(i);
            }
            System.out.println();
        }
    }
    public static void printPattern5(int a){
        for(int i=a;i>0;i--){
            for(int j=i;j>0;j--){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void printPattern6(int a){
        for(int i=1;i<=a;i++){
            for(int j=1;j<=(a-i+1);j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }
    public static void printPattern7(int a){
        for(int i=1;i<=a;i++){
            for(int j=1;j<=(a-i);j++){
                System.out.print(" ");
            }
            for(int j=1;j<=(2*i-1);j++){
                System.out.print("*");
            }
            for(int j=1;j<=(a-i);j++){
                System.out.print(" ");
            }
            System.out.println();
        }
    }
    public static void printPattern8(int a){
        for(int i=a;i>0;i--){
            for(int j=1;j<=(a-i);j++){
                System.out.print(" ");
            }
            for(int j=1;j<=(2*i-1);j++){
                System.out.print("*");
            }
            for(int j=1;j<=(a-i);j++){
                System.out.print(" ");
            }
            System.out.println();
        }
    }
    public static void printPattern9(int a){
        printPattern7(a);
        printPattern8(a);
    }

    public static void printPattern10(int a){
        for(int i=1;i<=2*a-1;i++){
            int js = i;
            if(js>a){
                js = 2*a-i;
            }
            for(int j=1;j<=js;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void printPattern11(int a){
        for(int i=1;i<=a;i++){
            int start =1;
            if(i%2==0){
                start =0;
            }
            for(int j=1;j<=i;j++){
                System.out.print(start);
                start = 1- start;
            }
            System.out.println();
        }
    }
    public static void printPattern12(int a){
        for(int i=1;i<=a;i++){
            for(int j=1;j<=i;j++){
                System.out.print(j);
            }
            for(int j=1;j<=(2*(a-i));j++){
                System.out.print(" ");
            }
            for(int j=i;j>0;j--){
                System.out.print(j);
            }

            System.out.println();
        }
    }
    public static void printPattern13(int a){
        int count=1;
        for(int i=1;i<=a;i++){
            for(int j=1;j<=i;j++){
                System.out.print(count++ + " ");
            }
            System.out.println();
        }
    }

    public static void printPattern14(int a){

        for(int i=1;i<=a;i++){
            for(char j='A';j<'A'+i;j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }

    public static void printPattern15(int a){

        for(int i=a;i>0;i--){
            char c = 'A';
            for(int j=1;j<=i;j++){
                System.out.print(c++);
            }
            System.out.println();
        }
    }

    public static void printPattern16(int a){
        for(int i=0;i<a;i++){
            for(int j=0;j<=i;j++){
                System.out.print((char)('A'+i));
            }
            System.out.println();
        }
    }

    public static void printPattern17(int a){
        for(int i=1;i<=a;i++){
            for(int j=1;j<=(a-i);j++){
                System.out.print(" ");
            }
            char ch = 'A';
            for(int j=1;j<=i-1;j++){
                System.out.print(ch++);

            }
            for(int j=1;j<=i;j++){
                System.out.print(ch--);
            }
            for(int j=1;j<=(a-i);j++){
                System.out.print(" ");
            }
            System.out.println();
        }
    }

    public static void printPattern18(int a){
        for(int i=1;i<=a;i++){
            for(int j=0;j<i;j++){
                System.out.print((char)('A'+a-i+j));
            }
            System.out.println();
        }
    }
    public static void printPattern19(int a){
        for(int i=0;i<2*a;i++){
            if(i>=a){
                for(int j=0;j<i-a+1;j++){
                    System.out.print("*");
                }
                for(int j=0;j<2*(2*a-i-1);j++){
                    System.out.print(" ");
                }
                for(int j=0;j<i-a+1;j++){
                    System.out.print("*");
                }
            }else{
                for(int j=0;j<a-i;j++){
                    System.out.print("*");
                }
                for(int j=0;j<i*2;j++){
                    System.out.print(" ");
                }
                for(int j=0;j<a-i;j++){
                    System.out.print("*");
                }
            }

            System.out.println();
        }
    }
    public static void printPattern20(int a){
        for(int i=1;i<=a;i++){
                for(int j=1;j<=i;j++){
                    System.out.print("*");
                }
                for(int j=1;j<=2*(a-i);j++){
                    System.out.print(" ");
                }
                for(int j=1;j<=i;j++){
                    System.out.print("*");
                }
            System.out.println();
        }
        for(int i=1;i<a;i++){
            for(int j=1;j<=a-i;j++){
                System.out.print("*");
            }
            for(int j=1;j<=2*i;j++){
                System.out.print(" ");
            }
            for(int j=1;j<=a-i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void printPattern21(int a){
        for(int i=0;i<a;i++){
            System.out.print("*");
        }
        System.out.println();
        for(int i=1;i<=a-2;i++){
            for(int j=1;j<=a;j++){
               if(j==1 || j==a){
                   System.out.print("*");
               }else{
                   System.out.print(" ");
               }
            }
            System.out.println();
        }
        for(int i=0;i<a;i++){
            System.out.print("*");
        }
    }
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of rows :");
        int a = sc.nextInt();
        // printPattern21(a);
    }
}
