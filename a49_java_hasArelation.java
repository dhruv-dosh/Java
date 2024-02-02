package Java;
//composition
class Employee{
    String name;
    a50_java_hasA2 emp;

    public Employee(String name, a50_java_hasA2 emp) {
        this.name = name;
        this.emp = emp;
    }

    public void getName() {
        System.out.println(name);;
    }

    public a50_java_hasA2 getEmp() {
        return emp;
    }
}
public class a49_java_hasArelation {
    public static void main(String[] args) {
        Employee e = new Employee("Dhruv",new a50_java_hasA2(2324,"pune"));
        e.getName();
        e.emp.getAddress();
        System.out.println(e.getEmp());

    }
}
