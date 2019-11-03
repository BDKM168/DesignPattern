package designpatterns.mediator;

//ConcreteColleague
public class ComboBox extends Component {
	public void update() {
		System.out.println("Add a new item to the ComboBox!");
	}
	
	public void select() {
		System.out.println("Select an item from the ComboBox!");
	}
}
