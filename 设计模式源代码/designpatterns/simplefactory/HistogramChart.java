package designpatterns.simplefactory;

//Concrete Product
public class HistogramChart implements Chart {
	public HistogramChart() {
		System.out.println("Create histogram chart!");
	}
	
	public void display() {
		System.out.println("Display histogram chart!");
	}
}
