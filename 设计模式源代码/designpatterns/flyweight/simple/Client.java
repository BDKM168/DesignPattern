package designpatterns.flyweight.simple;

public class Client {
	public static void main(String args[]) {
		IgoChessman black1,black2,black3,white1,white2;
		IgoChessmanFactory factory;
        
        //get Flyweight Factory
		factory = IgoChessmanFactory.getInstance();

        //get three black chessmen by factory
		black1 = factory.getIgoChessman("b");
		black2 = factory.getIgoChessman("b");
		black3 = factory.getIgoChessman("b");
		System.out.println("The two black chessmen are the same?" + (black1==black2));

        //get three white chessmen by factory
		white1 = factory.getIgoChessman("w");
		white2 = factory.getIgoChessman("w");
		System.out.println("The two white chessmen are the same?" + (white1==white2));

        //display chessmen
		black1.display();
		black2.display();
		black3.display();
		white1.display();
		white2.display();
	}
}
