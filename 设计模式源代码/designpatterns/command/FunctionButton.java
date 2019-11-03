package designpatterns.command;

//Invoker
public class FunctionButton {
	private Command command; 
	
	public void setCommand(Command command) {
		this.command = command;
	}

	public void onClick() {
		System.out.print("Click the Function Button: ");
		command.execute();
	}
}
