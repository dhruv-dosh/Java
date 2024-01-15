package Java;

class Employee{
    int age;
    int salary;
    String name;
    public Employee(){
        name = "Employee";
        age = 20;
        salary= 150000;
    }
    public Employee(String nam){
        name = nam;
        age = 20;
        salary =150000;
    }
    public Employee(int ag,String nam){
        age = ag;
        name = nam;
        salary=200000;
    }
}
public class a12_java_constructors {
    public static void main(String[] args) {
        Employee e1 = new Employee();
        Employee e2 = new Employee("chayan");
        Employee e3 = new Employee(19,"dhruv");
        System.out.println(e1.name+" "+e1.age+" "+e1.salary);
        System.out.println(e2.name+" "+e2.age+" "+e2.salary);
        System.out.println(e3.name+" "+e3.age+" "+e3.salary);

    }
}
