package ctp;

public class AmazonMainClass {

	public static void main(String[] args) {

		Amazon a = new Amazon();

		a.buy("Mobile",40000);
		a.buy("Laptop");
		a.buy(60000);
		a.buy(20000,"Watch");
	}

}
