package designpatterns.observer;
import java.util.*;

//Subject
public abstract class AllyControlCenter {
	protected String allyName;
	protected ArrayList<Observer> players = new ArrayList<Observer>(); //declare a set to save all players
	
	public void setAllyName(String allyName) {
		this.allyName = allyName;
	}
	
	public String getAllyName() {
		return this.allyName;
	}
	
    //register method
	public void join(Observer obs) {
		System.out.println(obs.getName() + " joins " + this.allyName + "!");
		players.add(obs);
	}
	
    //logout method
	public void quit(Observer obs) {
		System.out.println(obs.getName() + " exits " + this.allyName + "!");
		players.remove(obs);
	}
	
	public abstract void notifyObserver(String name);
}
