package designpatterns.cor;

//ConcreteHandler
public class Congress extends Approver {
	public Congress(String name) {
		super(name);
	}
	
 	public void processRequest(PurchaseRequest request) {
 	    System.out.println("Hold a meeting to discuss a purchase form, No.: " + request.getNumber() + ", Amount: " + request.getAmount() + ", Purpose: " + request.getPurpose() + ".");  //handle the request	
 	}
}