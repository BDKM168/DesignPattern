package designpatterns.simplefactory;

//Concrete Product
public class LineChart implements Chart {
	public LineChart() {
		System.out.println("Create line chart!");
	}
	
	public void display() {
		System.out.println("Display line chart!");
	}
}
