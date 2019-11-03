package designpatterns.command.calculator;

public class Client {
	public static void main(String args[]) {
		CalculatorForm form = new CalculatorForm();
		AbstractCommand command;
		command = new AddCommand();
		form.setCommand(command); //inject the command object
		
		form.compute(10);
		form.compute(5);
		form.compute(10);
		form.undo();
	}
}
