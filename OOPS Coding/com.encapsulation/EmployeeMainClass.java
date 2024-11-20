import java.util.Scanner;

public class EmployeeMainClass {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Id:");
        int i = sc.nextInt();
        System.out.println("Enter the Name:");
        String n=sc.next();
        System.out.println("Enter the Salary:");
        int s=sc.nextInt();
        System.out.println("----------");
        sc.close();

        Employee e=new Employee();

        e.setId(i);
        e.setName(n);
        e.setSalary(s);

        System.out.println("Id: "+e.getId());
        System.out.println("Name: "+e.getName());
        System.out.println("Salary: "+e.getSalary());
    }
    
}