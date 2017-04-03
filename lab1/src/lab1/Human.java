package lab1;

public class Human implements Valuable{
	String name;
	int age;
	
	public Human(String name, int age){
		this.name = name;
		this.age = age;
	}
	
	public double EstimateValue(int month){
		return Double.POSITIVE_INFINITY;
	}
	
	public String toString(){
		return String.format("Human name : %s\nregitered age : %d", name, age);
	}
}
