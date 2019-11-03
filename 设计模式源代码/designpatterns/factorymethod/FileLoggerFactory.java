package designpatterns.factorymethod;

//Concrete Factory
public class FileLoggerFactory implements LoggerFactory {
	public Logger createLogger() {
        //Create a file logger recorder
		Logger logger = new FileLogger(); 
		//Create a file, code is omitted
		return logger;
	}	
}
