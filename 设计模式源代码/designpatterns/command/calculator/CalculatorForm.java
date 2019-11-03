package designpatterns.command.calculator;

//Invoker
public class CalculatorForm {
	private AbstractCommand command;
	
	public void setCommand(AbstractCommand command) {
		this.command = command;
	}
	
	public void compute(int value) {
		int i = command.execute(value);
		System.out.println("Compute, the result is " + i);
	}
	
	public void undo() {
		int i = command.undo();
		System.out.println("Undo, the result is " + i);
	}
}
