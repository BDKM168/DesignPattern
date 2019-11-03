package designpatterns.decorator;

public class Client {
	public static void main(String args[]) {
		Component component,componentSB; 
		component = new Window(); 
		componentSB = new ScrollBarDecorator(component); 
		Component componentBB;
		componentBB = new BlackBorderDecorator(componentSB);
		componentBB.display();
		
	}
}
