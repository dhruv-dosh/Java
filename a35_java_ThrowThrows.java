package Java;
// Custom Exception
class NegativeRediousException extends Exception{
    @Override
    public String toString() {
        return "Given Radius Is Negative";
    }

    @Override
    public String getMessage() {
        return "Given Radius Is Negative";
    }
}
public class a35_java_ThrowThrows {
    public static double area(int r) throws NegativeRediousException{
        if (r<0){
            throw new NegativeRediousException();
        }
        return Math.PI*r*r;
    }
    //Throws keyword is used to say that this function may trow exception
    public static int divide(int a,int b) throws ArithmeticException{
        return a/b;
    }
    public static void main(String[] args) {
        try {
            int c = divide(6,2);
            System.out.println(c);
        }
        catch (Exception e){
            System.out.println("Exception "+e);

        }
        try {
            System.out.println(area(-2));
        }
        catch (Exception e){
            System.out.println(e);
        }
    }
}
