public class a06_java_method {
    static int sum(int x ,int y){
        return x+y;
    }

    static void dhruv(){
        System.out.println("hellow");
    }
    static void dhruv(int a){
        System.out.println("hellow"+ a);
    }
    static int dhruv(int a, int b){
        return a+b;
    }

    public static void main(String[] args) {
        int a =3;
        int b= 5;
        int c;
//      or if we dont want to use static method we can create abject of class and call function
//        remove static keyword from method
//        a06_java_method object = new a06_java_method();
//        c= object.sum(a,b);
        c= sum(a,b);
        System.out.println(c);



        ///////////////////// METHOD OVERLODING /////////////////////
        dhruv();
        int val = 100;
        dhruv(val);
        int cal = 200;
        System.out.println(dhruv(val,cal));

    }
}
