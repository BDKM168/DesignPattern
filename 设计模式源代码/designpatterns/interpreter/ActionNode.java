package designpatterns.interpreter;

//TerminalExpression 
public class ActionNode extends AbstractNode {
	private String action;
	
	public ActionNode(String action) {
		this.action = action;
	}
	
	//interpret action
	public String interpret() {
		if (action.equalsIgnoreCase("move")) {
			return "�ƶ�";
		}
		else if (action.equalsIgnoreCase("run")) {
			return "�����ƶ�";
		}
		else {
			return "��Чָ��";
		}
	}
}
