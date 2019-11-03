package designpatterns.state.screen;

//ConcreteState
public class LargerState extends State{
	public void display() {
		System.out.println("Double size!");
	}
}
