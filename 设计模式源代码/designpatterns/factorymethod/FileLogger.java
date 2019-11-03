package designpatterns.factorymethod;

//Concrete Product
public class FileLogger implements Logger {
	public void writeLog() {
		System.out.println("Save log by file log recorder!");
	}
}
