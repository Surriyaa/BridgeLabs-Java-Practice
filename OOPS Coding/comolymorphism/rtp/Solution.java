package rtp;

public class Solution {
	
	static void display(FoodDeliveryApp obj) {
		obj.orderFood();
	}
	
	public static void main(String[] args) {
		
		FoodDeliveryApp f;
		f=new Swiggy();
		f.orderFood();
		f=new Zomato();
		f.orderFood();
		
		System.out.println("-----");
		
		FoodDeliveryApp f1=new Swiggy();
		f1.orderFood();
		FoodDeliveryApp f2=new Zomato();
		f2.orderFood();
		
		System.out.println("-----");
		
		display(new Swiggy());
		display(new Zomato());
	}

}
