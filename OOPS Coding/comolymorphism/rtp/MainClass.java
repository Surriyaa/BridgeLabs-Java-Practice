package rtp;

public class MainClass {

	static void display(Employee obj) {
		obj.work();
	}

	public static void main(String[] args) {

		Employee e1 = new Developer();//1st way of achieving Upcasting
		e1.work();

		Employee e2 = new Tester();
		e2.work();

		System.out.println("---------------");

		Employee emp;//2nd way of achieving Upcasting

		emp = new Developer();
		emp.work();
		emp = new Tester();
		emp.work();

		System.out.println("---------------");

		display(new Developer());//3rd way of achieving Upcasting
		display(new Tester()); 
	}

}
