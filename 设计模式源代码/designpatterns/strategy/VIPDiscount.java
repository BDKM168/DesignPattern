package designpatterns.strategy;

//ConcreteStrategy
public class VIPDiscount implements Discount {
	public double calculate(double price) {
		System.out.println("VIP ticket!");
		System.out.println("Add points!");
		return price * 0.5;
	}
}
