package designpatterns.cor;

public class Client {
	public static void main(String[] args) {
		Approver bob,rose,tim,meeting;
		bob = new Director("Bob");
		rose = new VicePresident("Rose");
		tim = new President("Tim");
		meeting = new Congress("Meeting");
		Approver sunny;
		sunny = new Manager("Sunny");
		
		//create the chain of responsibility 
		//bob.setSuccessor(rose);
		bob.setSuccessor(sunny);
		sunny.setSuccessor(rose);
		rose.setSuccessor(tim);
		tim.setSuccessor(meeting);
		
		//create some purchase forms
		PurchaseRequest pr1 = new PurchaseRequest(15000,10001,"Buy a workstation");
		bob.processRequest(pr1);
		
		PurchaseRequest pr2 = new PurchaseRequest(60000,10002,"Buy a server");
		bob.processRequest(pr2);
	
		PurchaseRequest pr3 = new PurchaseRequest(180000,10003,"Buy a car");
		bob.processRequest(pr3);

		PurchaseRequest pr4 = new PurchaseRequest(8000000,10004,"Buy a company");
		bob.processRequest(pr4);
	}
}
