package Java;
import java.util.Scanner;

class Employ{
    Scanner s = new Scanner(System.in);
    int id;
    String name;
    int salary = 6000000;
    public void getId(){
        System.out.println("Enter id :");
        id = s.nextInt();

    }
    public void getName(){
        System.out.println("Enter name :");
        name = s.next();
    }
    public void printName(){
        System.out.println("Name of an employee is "+name);
    }
    public void printId(){
        System.out.println("ID of an employee is "+id);
    }
    public int giveSalary(){
        return salary;
    }
}



class CellPhone{
    public void makeCall(){
        System.out.println("Ringing.... tillili.... tillili");
    }
    public void vibrate(){
        System.out.println("Vibrating....zzzzzzz.....zzzzz");
    }
}

class Square{
    Scanner s = new Scanner(System.in);
   int side;
   public void getSide(){
       side = s.nextInt();
   }
   public int area(){
       return side*side;
   }
}



public class a11_java_class {
    public static void main(String[] args) {
        System.out.println("this is a coustom class");

        Employ dhruv = new Employ();
//        dhruv.getId();
//        dhruv.getName();
//        dhruv.giveSalary();
//        dhruv.printName();
//        dhruv.printId();

        CellPhone samsung = new CellPhone();
        samsung.makeCall();
        samsung.vibrate();

    }
}
