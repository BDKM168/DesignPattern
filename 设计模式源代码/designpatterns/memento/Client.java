package designpatterns.memento;

public class Client {
	public static void main(String args[]) {
		MementoCaretaker mc = new MementoCaretaker();
		Chessman chess = new Chessman("Chariot",1,1);
		display(chess);
		mc.setMemento(chess.save()); //save state		
		chess.setY(4);
		display(chess);
		mc.setMemento(chess.save()); //save state
		chess.setX(5);
		display(chess);
		System.out.println("******Take back******");	
		chess.restore(mc.getMemento()); //restore state
		display(chess);
	}
	
	public static void display(Chessman chess) {
		System.out.println("Chessman " + chess.getLabel() + "'s position is " + chess.getX() + " row and " + chess.getY() + " column.");
	}
}
