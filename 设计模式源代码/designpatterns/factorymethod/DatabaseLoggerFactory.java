package designpatterns.factorymethod;

//Concrete Factory
public class DatabaseLoggerFactory implements LoggerFactory{
	public Logger createLogger() {
		//Connect database, code is omitted 
		//Create a database logger recorder
		Logger logger = new DatabaseLogger(); 
		//Initialize the database logger recorder, code is omitted
		return logger;
	}	
}
