package designpatterns.factorymethod;

//Concrete Product
public class DatabaseLogger implements Logger {
	public void writeLog() {
		System.out.println("Save log by database log recorder!");
	}
}
