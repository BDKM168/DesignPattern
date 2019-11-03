package designpatterns.abstractfactory;

//Concrete Product
public class SpringTextField implements TextField {
	public void display() {
		System.out.println("Display a green border TextField!");
	}
}
