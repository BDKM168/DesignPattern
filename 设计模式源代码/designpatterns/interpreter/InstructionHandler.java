package designpatterns.interpreter;
import java.util.*;

//A utility class
public class InstructionHandler {
	private String instruction;
	private AbstractNode node;
    
    public void handle(String instruction) {
    	AbstractNode left = null, right = null;
    	AbstractNode direction = null, action = null, distance = null;
    	Stack stack = new Stack(); //declare a stack to save the AST
    	String[] words = instruction.split(" "); //split the instruction by space
    	for (int i = 0; i < words.length; i++) {
    		//use the stack to handle the instruction, 
    		if (words[i].equalsIgnoreCase("and")) {
    		    left = (AbstractNode)stack.pop(); //pop the top of stack as the left expression
    		    String word1= words[++i];
    		    direction = new DirectionNode(word1);
    		    String word2 = words[++i];
    		    action = new ActionNode(word2);
    		    String word3 = words[++i];
    		    distance = new DistanceNode(word3);
    		    right = new SentenceNode(direction,action,distance); //right expression
    		    stack.push(new AndNode(left,right)); //push the new expression to the stack
    	    }
    		else {
    		    String word1 = words[i];
    		    direction = new DirectionNode(word1);
    		    String word2 = words[++i];
    		    action = new ActionNode(word2);
    		    String word3 = words[++i];
    		    distance = new DistanceNode(word3);
    		    left = new SentenceNode(direction,action,distance);
    		    stack.push(left); //push the new expression to the stack
    		}
    	}
    	this.node = (AbstractNode)stack.pop(); //pop all expressions from the stack
    }
	
	public String output() {
		String result = node.interpret(); //interpret the expression
		return result;
	}
}