import java.util.Scanner;

class BankMainClass {
	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Depositing amount");
		int d=sc.nextInt();
		System.out.println("Enter the Withdrawing amount");
		int w=sc.nextInt();
		sc.close();

		Bank b=new BankImpl();
		b.deposit(d);
		b.withdraw(w);
		b.checkBalance();
	}
}
