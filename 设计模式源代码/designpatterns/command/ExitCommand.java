package designpatterns.command;

//ConcreteCommand
public class ExitCommand extends Command{
	private SystemExitClass seObj;
	
	public ExitCommand() {
		seObj = new SystemExitClass();
	}
	
	public void execute() {
		seObj.exit();
	}
}