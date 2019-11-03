package designpatterns.simplefactory;

//Concrete Product
public class PieChart implements Chart {
	public PieChart() {
		System.out.println("Create pie chart!");
	}
	
	public void display() {
		System.out.println("Display pie chart!");
	}
}
