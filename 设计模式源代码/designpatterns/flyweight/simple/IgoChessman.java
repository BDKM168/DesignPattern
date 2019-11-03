package designpatterns.flyweight.simple;

//Flyweight
public abstract class IgoChessman {
	public abstract String getColor();

	public void display() {
		System.out.println("Chessman color: " + this.getColor());	
	}
}

