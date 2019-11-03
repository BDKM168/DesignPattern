package designpatterns.simplefactory;

public class Client {
	public static void main(String args[]) {
		Chart chart;
		//chart = ChartFactory.getChart("pie"); //create product by static factory method
		String type = XMLUtil.getChartType(); //obtain the parameter from XML file
		chart = ChartFactory.getChart(type); //create product instance
		chart.display();
	}
}
