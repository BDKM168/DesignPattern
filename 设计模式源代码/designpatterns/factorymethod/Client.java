package designpatterns.factorymethod;

public class Client {
	public static void main(String args[]) {
		LoggerFactory factory;
		Logger logger;
		//factory = new FileLoggerFactory(); //can be implemented introducing a configuration file
		factory = (LoggerFactory)XMLUtil.getBean(); //the return type is Object, which is required an explicit cast
		logger = factory.createLogger();
		logger.writeLog();
	}
}
