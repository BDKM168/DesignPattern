package designpatterns.strategy;

//ConcreteStrategy
public class ChildrenDiscount implements Discount {
	public double calculate(double price) {
		if(price>=20) {
			System.out.println("Children ticket!");
			return price - 10;
		}
		else
			return price;
	}
}
