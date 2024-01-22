package Java;

public class a36_java_FinallyBlock {
    public static int greet(){
        try {
            int a=4;
            int b=0;
            int c=a/b;
            return c;
        }
        catch (Exception e){
            System.out.println(e);
        }
        finally {
             System.out.println("program ends here"); //this will always run if try will return int or not
        }
        return -1;
    }
    public static void main(String[] args) {
        System.out.println(greet());
        int a=4;
        int b=3;
        while (true){
            try {
                System.out.println(a/b);
                b--;
            }
            catch (Exception e){
                System.out.println(e);
                break;
            }
            finally {
                System.out.println("End of the code");
            }
        }
        /*
        finally statement will always work if there is any break statement or loop break
        we can also use try and finally only
         */
    }
}
