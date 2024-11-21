package compiletimepolymorphism;

public class Flipkart {

	void buy(String product) {
		System.out.println("Product Name:"+product);
	}

	void buy(int cost) {
		System.out.println("Cost of Product:"+cost);
	}

	void buy(String product,int cost) {
		System.out.println("Product Name:"+product+" Product Cost:"+cost);
	}
	
	void buy(int cost,String product) {
		System.out.println("Product Cost:"+cost+" Product Name:"+product);
	}

}
