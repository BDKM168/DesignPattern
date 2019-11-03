package designpatterns.interpreter;

//NonterminalExpression
public class AndNode extends AbstractNode {
	private AbstractNode left; //the left expression
	private AbstractNode right; //the right expression

	public AndNode(AbstractNode left, AbstractNode right) {
		this.left = left;
		this.right = right;
	}
    
	//interpret And
	public String interpret() {
		return left.interpret() + "ты" + right.interpret();
	}
}
