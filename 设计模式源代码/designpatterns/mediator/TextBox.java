package designpatterns.mediator;

//ConcreteColleague
public class TextBox extends Component {
	public void update() {
		System.out.println("Clear the TextBox!");
	}
	
	public void setText() {
		System.out.println("Display the customer name in the TextBox!");
	}
}
