package designpatterns.state.screen;

//Context
public class Screen {
    //declare all states
	private State currentState, normalState, largerState, largestState;

	public Screen() {
    	this.normalState = new NormalState(); //create a normal state
    	this.largerState = new LargerState(); //create a double size state
    	this.largestState = new LargestState(); //create a quadruple size state
    	this.currentState = normalState; //create initial state
    	this.currentState.display();
	}
	
	public void setState(State state) {
		this.currentState = state;
	}
	
    //call the business method and encapsulate state conversion
	public void onClick() {
    	if (this.currentState == normalState) {
    		this.setState(largerState);
    		this.currentState.display();
    	}
    	else if (this.currentState == largerState) {
    		this.setState(largestState);
    		this.currentState.display();
    	}
    	else if (this.currentState == largestState) {
    		this.setState(normalState);
    		this.currentState.display();
    	}
	}
}
