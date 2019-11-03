package designpatterns.command.calculator;

//Command
public abstract class AbstractCommand {
	public abstract int execute(int value);
	public abstract int undo(); 
}
