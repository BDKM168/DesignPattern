package designpatterns.strategy;

public class Client {
	public static void main(String args[]) {
		MovieTicket mt = new MovieTicket();
		double originalPrice = 60.0;
		double currentPrice;
		
		mt.setPrice(originalPrice);
		System.out.println("The original price is: " + originalPrice);
		System.out.println("---------------------------------");
			
		Discount discount;
		discount = (Discount)XMLUtil.getBean(); 
		mt.setDiscount(discount);
		
		currentPrice = mt.getPrice();
		System.out.println("The discounted price is: " + currentPrice);
	}
}
