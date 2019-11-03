package designpatterns.flyweight.extend;
import java.util.*;

//FlyweightFactory
public class IgoChessmanFactory {
	private static IgoChessmanFactory instance = new IgoChessmanFactory();
	private static Hashtable<String,IgoChessman> ht; //use Hashtable as a Flyweight Pool
	
	private IgoChessmanFactory() {
		ht = new Hashtable<String,IgoChessman>();
		IgoChessman black,white;
		black = new BlackIgoChessman();
		ht.put("b",black);
		white = new WhiteIgoChessman();
		ht.put("w",white);
	}
	
    //use the Singleton
	public static IgoChessmanFactory getInstance() {
		return instance;
	}
	
    //get the Flyweight object saving in the Hashtable by Key
	public IgoChessman getIgoChessman(String color) {
		return (IgoChessman)ht.get(color);	
	}
}