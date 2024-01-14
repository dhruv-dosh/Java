public class a08_java_recursion {
    static int factorial(int a){
        //function calling itself is called recursion
        int fact = 1;
        if (a==0){
            return 1;
        }
        else if (a>0){
            fact = a * factorial(a-1);
        }

        return fact;
    }
    public static void main(String[] args) {
        System.out.println(factorial(1));
    }
}
