package Java;

public class a09_java_pqmethod {
    /////////////////practice question 1///////////////////////
    static void table(int n){
        for (int i=1;i<=10;i++){
            System.out.println(n+" * "+i+" = "+n*i);
        }
    }

    ////////////////practice question 2///////////////////////

    static void star(int n){
        for (int i =1;i<=n;i++){
            for (int j=1;j<=i;j++) {
                System.out.print("*");
            }
            System.out.print("\n");
        }
    }

    ////////////////practice question 3///////////////////////
    static int sum(int n){
        int result=0;
        if(n==1){
            return 1;
        }
        else if (n==0) {
            return 0;
        }
        result = n + sum(n-1);
        return  result;

    }

    /////////////////practice question 4///////////////////////
    static void star2(int n){
        for (int i =n;i>0;i--){
            for (int j=1;j<=i;j++) {
                System.out.print("*");
            }
            System.out.print("\n");
        }
    }
    /////////////////practice question 5///////////////////////
    static int fib(int n){
        if (n==1){
            return 0;
        }
        else if (n==2){
            return 1;
        }
        else{
            return fib(n-1)+fib(n-2);
        }
    }
    /////////////////practice question 6///////////////////////
    static float average(float ...arr){
        float sum =0;
        for(float a:arr){
            sum += a;
        }
        return sum/ arr.length;
    }

    /////////////////practice question 7///////////////////////
    static void pattern1(int n){
        if (n>0){
            pattern1(n-1);
        }
        for (int i =1;i<=n;i++){
            System.out.print("*");
        }
        System.out.print("\n");
    }
    /////////////////practice question 8///////////////////////
    static void pattern(int n){
          for (int i=1;i<=n;i++){
              System.out.print("*");
          }
        System.out.print("\n");
         if (n>0) {
             pattern(n - 1);
         }
    }

    public static void main(String[] args) {
      pattern1(5);
      
    }
}
