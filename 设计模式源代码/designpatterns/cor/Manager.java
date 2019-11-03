package designpatterns.cor;

//ConcreteHandler
public class Manager extends Approver {
	public Manager(String name) {
		super(name);
	}
	
 	public void processRequest(PurchaseRequest request) {
 		if (request.getAmount() < 80000) {
 			System.out.println("Manager " + this.name + " approves a purchase form, No.: " + request.getNumber() + ", Amount: " + request.getAmount() + ", Purpose: " + request.getPurpose() + ".");  //handle the request
 		}
 		else {
 			this.successor.processRequest(request);  //pass the request
 		}	
 	}
}