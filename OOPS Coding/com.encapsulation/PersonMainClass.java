import java.util.Scanner;

public class PersonMainClass {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Age:");
        int a=sc.nextInt();
        sc.close();

        Person p=new Person();
        p.setAge(a);

        System.out.println("------------");
        System.out.println("Age: "+p.getAge());
    }
    
}