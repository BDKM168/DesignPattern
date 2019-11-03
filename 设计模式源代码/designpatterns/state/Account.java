package designpatterns.state;

//Context
public class Account{
	private AccountState state; 
	private String owner; 
	private double balance = 0; 
	
	public Account(String owner,double init) {
		this.owner = owner;
		this.balance = balance;
		this.state = new NormalState(this); //set the initial state
		System.out.println(this.owner + " opens an account, balance is " + init);	
		System.out.println("---------------------------------------------");	
	}
	
	public double getBalance() {
		return this.balance;
	}
	
	public void setBalance(double balance) {
		this.balance = balance;
	}
	
	public void setState(AccountState state) {
		this.state = state;
	}
	
	public void deposit(double amount) {
		System.out.println(this.owner + " deposits " + amount);
		state.deposit(amount); //call the state's deposit()
		System.out.println("The balance is "+ this.balance);
		System.out.println("Account state is "+ this.state.getClass().getName());
		System.out.println("---------------------------------------------");			
	}
	
	public void withdraw(double amount) {
		System.out.println(this.owner + " withdraws " + amount);
        state.withdraw(amount); //call the states' withdraw()
		System.out.println("The balance is "+ this.balance);
		System.out.println("Account state is "+ this.state.getClass().getName());		
		System.out.println("---------------------------------------------");
	}
	
	public void computeInterest()
	{
		state.computeInterest(); //call the state's computeInterest()
	}
}
