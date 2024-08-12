package Java;

public class a07_java_vararg {
    //here vararg means we can use infinite numbers of var in method and int a is for one necessary var
     static int sum(int a,int ...arr){
        int result = a;
        for (int x :arr){
           result += x;
        }
        return result;
     }
    public static void main(String[] args) {
        System.out.println("sum of 1,2 and 3 is :"+sum(1,2,3));
    }
}
