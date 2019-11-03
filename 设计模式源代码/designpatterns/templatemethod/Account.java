package designpatterns.templatemethod;

//AbstractClass
public abstract class Account {
    //primitive method: concrete method
	public boolean validate(String account, String password) {
		System.out.println("Account: " + account);
		System.out.println("Password: " + password);
		if (account.equalsIgnoreCase("sunny") && password.equalsIgnoreCase("123456")) {
			return true;
		}
		else {
			return false;
		}
	}

    //primitive method: abstract method
	public abstract void calculateInterest();
	
    //primitive method: concrete method
	public void display() {
		System.out.println("Display interest!");
	}

    //template method
	public void handle(String account, String password) {
		if (!validate(account,password)) {
			System.out.println("ID or password is invalid!");
			return;
		}
		calculateInterest();
		display();
	}	
}
