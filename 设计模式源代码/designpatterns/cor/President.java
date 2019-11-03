package designpatterns.cor;

//ConcreteHandler
public class President extends Approver {
	public President(String name) {
		super(name);
	}
	
	public void processRequest(PurchaseRequest request) {
		if (request.getAmount() < 500000) {
			System.out.println("President " + this.name + " approves a purchase form, No.: " + request.getNumber() + ", Amount: " + request.getAmount() + ", Purpose: " + request.getPurpose() + ".");  //handle the request
		}
		else {
			this.successor.processRequest(request);  //pass the request
		}	
	}
}