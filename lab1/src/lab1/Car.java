package lab1;

public class Car implements Valuable{
	String name;
	double price;
	private double value;
	
	public Car(String name, double price){
		this.name = name;
		this.price = price;
	}
	
	public double estimateValue(int month){
		value = price * 0.8 * Math.pow(0.99, month);
		
		return value;
	}
	
	public double estimateValue(){
		value = price * 0.8 * Math.pow(0.99, 1);
		
		return value;
	}
	
	public String toString(){
		return String.format("car name : %s\ninitial price : %.2f", name, price);
	}
}
