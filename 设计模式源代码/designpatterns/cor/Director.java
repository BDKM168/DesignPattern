package designpatterns.cor;

//ConcreteHandler
public class Director extends Approver {
	public Director(String name) {
		super(name);
	}
	
 	public void processRequest(PurchaseRequest request) {
 		if (request.getAmount() < 50000) {
 			System.out.println("Director " + this.name + " approves a purchase form, No.: " + request.getNumber() + ", Amount: " + request.getAmount() + ", Purpose: " + request.getPurpose() + ".");  //handle the request
 		}
 		else {
 			this.successor.processRequest(request);  //pass the request
 		}	
 	}
}
