package lab1;

public class Car implements Valuable{
	private final String name;
	private double price;
	private double value;
	
	public Car(String name, double price){
		this.name = name;
		this.price = price;
	}
	
	@Override
	public double estimateValue(int m){
		value = price * 0.8 * Math.pow(0.99, m);
		return value;
	}
	
	@Override
	public double estimateValue(){
		value = price * 0.8 * Math.pow(0.99, 1);
		return value;
	}

	
	public String toString(){
		return String.format("Car name : %s\ninitial price : %.2f", name, price);
	}
}
