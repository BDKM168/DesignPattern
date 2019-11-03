package designpatterns.cor;

//ConcreteHandler
public class VicePresident extends Approver {
	public VicePresident(String name) {
		super(name);
	}
	
	public void processRequest(PurchaseRequest request) {
		if (request.getAmount() < 100000) {
			System.out.println("Vice-president " + this.name + " approves a purchase form, No.: " + request.getNumber() + ", Amount: " + request.getAmount() + ", Purpose: " + request.getPurpose() + ".");  //handle the request
		}
		else {
			this.successor.processRequest(request);  //pass the request
		}	
	}
}
