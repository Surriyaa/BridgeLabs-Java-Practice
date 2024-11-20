import java.util.Scanner;

public class calculatorMainClass {

	public static void main(String[] args) {

		Scanner sc= new Scanner(System.in);
		System.out.println("Enter 2 numbers");
		int x=sc.nextInt();
		int y=sc.nextInt();
		sc.close();

		calculator cl=new calculatorImpl();
		cl.add(x,y);
		cl.mul(x, y);
	}
}
