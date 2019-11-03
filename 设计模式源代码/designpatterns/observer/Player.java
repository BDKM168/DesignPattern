package designpatterns.observer;

//ConcreteObserver
public class Player implements Observer {
	private String name;

	public Player(String name) {
		this.name = name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getName() {
		return this.name;
	}
	
    //support teammates
	public void help() {
		System.out.println("Hold on, " + this.name + " will help you!");
	}
	
	public void beAttacked(AllyControlCenter acc) {
        System.out.println(this.name + " is attacked!");
        acc.notifyObserver(name);		
	}
}
