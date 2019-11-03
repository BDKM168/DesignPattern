package designpatterns.templatemethod;

//ConcreteClass
public class SavingAccount extends Account {
	public void calculateInterest() {
		System.out.println("Calculate interest by the saving interest rate!");
	}
}