package designpatterns.state.screen;

//ConcreteState
public class NormalState extends State{
	public void display() {
		System.out.println("Normal size!");
	}
}