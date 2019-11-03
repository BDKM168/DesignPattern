package designpatterns.command;

//ConcreteCommand
public class HelpCommand extends Command{
	private DisplayHelpClass hcObj;
	
	public HelpCommand() {
		hcObj = new DisplayHelpClass();
	}
	
	public void execute() {
		hcObj.display();
	}
}
