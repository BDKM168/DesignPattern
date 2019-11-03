package designpatterns.flyweight.extend;

//Flyweight
public abstract class IgoChessman {
	public abstract String getColor();
	
	public void display(Coordinates coord){
		System.out.println("Chessman color: " + this.getColor() + ", chessman position: " + coord.getX() + "£¬" + coord.getY() );	
	}
}

