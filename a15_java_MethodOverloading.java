package Java;

class MethodLoad{
    int add(int a ,int b){
        return a+b;
    }
    int add(int a,int b,int c){
        return a+b+c;
    }
}
public class a15_java_MethodOverloading {

    public static void main(String[] args) {
        MethodLoad mol = new MethodLoad();
        System.out.println(mol.add(2,4));
        System.out.println(mol.add(3,5,7));
    }
}
