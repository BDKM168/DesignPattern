package designpatterns.observer;

//ConcreteSubject
public class ConcreteAllyControlCenter extends AllyControlCenter {
	public ConcreteAllyControlCenter(String allyName) {
		System.out.println(allyName + " is created!");
		System.out.println("----------------------------");
		this.allyName = allyName;
	}
	
    //realize the notify method
	public void notifyObserver(String name) {
		System.out.println(this.allyName + "'s emergency notice, teammate " + name + " is attacked!");
        //traverser the set of Observers, call other teammates' help() method
        for(Object obs : players) {
            if (!((Observer)obs).getName().equalsIgnoreCase(name)) {
                ((Observer)obs).help();
            }
        }		
	}
}
