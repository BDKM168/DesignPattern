package designpatterns.proxy;

public class Logger {
	//simulate writing log
	public void log(String userId) {
		System.out.println("Update database, add one retrieve time for user '" + userId + "'!");
	}

}
