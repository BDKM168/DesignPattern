package designpatterns.simplefactory;

public class ChartFactory {
    //static factory method
	public static Chart getChart(String type) {
		Chart chart = null;
		if (type.equalsIgnoreCase("histogram")) {
			chart = new HistogramChart();
			System.out.println("Initialize histogram chart!");
		}
		else if (type.equalsIgnoreCase("pie")) {
			chart = new PieChart();
			System.out.println("Initialize pie chart!");
		}
		else if (type.equalsIgnoreCase("line")) {
			chart = new LineChart();
			System.out.println("Initialize line chart!");			
		}
		return chart;
	}
}
