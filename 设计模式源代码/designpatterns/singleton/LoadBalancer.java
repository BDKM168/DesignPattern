package designpatterns.singleton;
import java.util.*;

//Singleton
public class LoadBalancer {
    //private static attribute
	private static LoadBalancer instance = null;
	//server list
	private List serverList = null;
		
    //private constructor
	private LoadBalancer() {
		serverList = new ArrayList();
	}
		
	//public static accessor
	public static LoadBalancer getLoadBalancer() {
		if (instance == null) {
			instance = new LoadBalancer();
		}
		return instance;
	}
		
	//add server
	public void addServer(String server) {
		serverList.add(server);
	}
		
	//remove server
	public void removeServer(String server) {
		serverList.remove(server);
	}
		
	//get a server by random
	public String getServer() {
		Random random = new Random();
		int i = random.nextInt(serverList.size());
		return (String)serverList.get(i);
	}
}
