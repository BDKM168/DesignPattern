package designpatterns.observer;

public class Client {
	public static void main(String args[]) {
		AllyControlCenter acc;
		acc = new ConcreteAllyControlCenter("The Avengers");
		
		Observer player1,player2,player3,player4;
		
		player1 = new Player("Iron Man");
		acc.join(player1);
		
		player2 = new Player("Captain America");
		acc.join(player2);
		
		player3 = new Player("The Hulk");
		acc.join(player3);
		
		player4 = new Player("Thor");
		acc.join(player4);
		
		player1.beAttacked(acc);
	}
}
