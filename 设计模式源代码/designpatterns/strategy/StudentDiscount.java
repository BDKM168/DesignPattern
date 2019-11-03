package designpatterns.strategy;

//ConcreteStrategy
public class StudentDiscount implements Discount {
	public double calculate(double price) {
		System.out.println("Student ticket!");
		return price * 0.8;
	}
} 
