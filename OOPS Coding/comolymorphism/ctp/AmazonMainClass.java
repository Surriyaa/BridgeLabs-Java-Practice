package compiletimepolymorphism;

public class Main {

	public static void main(String[] args) {

		Flipkart f = new Flipkart();

		f.buy("Mobile",40000);
		f.buy("Laptop");
		f.buy(60000);
		f.buy(2000,"Watch");
	}

}
