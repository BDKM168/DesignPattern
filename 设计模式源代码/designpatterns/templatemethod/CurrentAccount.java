package designpatterns.templatemethod;

//ConcreteClass
public class CurrentAccount extends Account {
	public void calculateInterest() {
		System.out.println("Calculate interest by the current interest rate!");
	}
}
