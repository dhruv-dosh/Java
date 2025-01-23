package Java;

import java.sql.Statement;
import java.util.Stack;

public class a38_java_stack {
    public static void main(String [] args){
        Stack<String> animals = new Stack<>();

        animals.push("qdkn");
        animals.push("dhruv");
        animals.push("doshi");
        animals.push("ayush");
        System.out.println(animals.peek());
        System.out.println(animals.search("dhruv"));
        animals.pop();
        System.out.println(animals.peek());
        animals.set(1,"payas");
        System.out.println(animals.get(2));
    }
}
