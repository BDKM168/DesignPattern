package designpatterns.interpreter;

//TerminalExpression 
public class DistanceNode extends AbstractNode {
	private String distance;
	
	public DistanceNode(String distance) {
		this.distance = distance;
	}
	
	//interpret distance
	public String interpret() {
		return this.distance;
	}	
}