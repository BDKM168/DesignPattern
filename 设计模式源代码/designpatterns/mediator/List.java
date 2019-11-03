package designpatterns.mediator;

//ConcreteColleague
public class List extends Component {
	public void update() {
		System.out.println("Add a new item to the ListBox!");
	}
	
	public void select() {
		System.out.println("Select an item from the ListBox!");
	}
}
