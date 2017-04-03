package lab1;

public class Car implements Valuable{
	String name;
	double price;
	
	public Car(String name, double price){
		this.name = name;
		this.price = price;
	}
	
	public double EstimateValue(int month){
		price = price * 0.8;
		
		price = price * Math.pow(0.99, month);
		
		return price;
	}
	
	public String toString(){
		return String.format("car name : %s\ninitial price : %.2f", name, price);
	}
}
