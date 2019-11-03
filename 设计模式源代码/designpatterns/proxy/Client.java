package designpatterns.proxy;

public class Client {
	public static void main(String args[]) {
		Searcher searcher;  
		searcher = (Searcher)XMLUtil.getBean();
		String result = searcher.doSearch("Sunny","Singleton");
	}
}
