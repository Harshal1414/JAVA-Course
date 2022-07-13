class Employee{
    int id;
    String name;
    int salary;
    public void printdetails(){
        System.out.println("My id is "+id);
        System.out.println("My name is "+name);
    }
    public int getSalary(){
        return salary;
    }
}
public class OOPS {
    public static void main(String[] args) {
        System.out.println("This is our custom class :");
        Employee Harshal = new Employee();   // Instantiating a new Employee object.
        Employee Harry = new Employee();

        // Setting Attributes.
        Harshal.id = 7865896;
        Harshal.name = "Harshal Patel";
        Harshal.salary = 765547;

        Harry.id = 732642;
        Harry.name = "CWH";
        Harry.salary = 876865;

        // Printing Details
        Harry.printdetails();
        Harshal.printdetails();
        int salary = Harry.getSalary();
        System.out.println(salary);
    }
}
