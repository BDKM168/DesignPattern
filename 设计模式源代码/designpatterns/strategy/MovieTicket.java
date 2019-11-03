package designpatterns.strategy;

//Context
public class MovieTicket {
	private double price;
	private Discount discount;

	public void setPrice(double price) {
		this.price = price;
	}
	
	//inject a Discount object
	public void setDiscount(Discount discount) {
		this.discount = discount;
	}

	public double getPrice() {
        //call the method to calculate the price
		return discount.calculate(this.price);
	}
}
