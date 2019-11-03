package designpatterns.proxy;

//RealSubject
public class RealSearcher implements Searcher {
	//simulate 
	public String doSearch(String userId, String keyword) {
		System.out.println("User '" + userId + "' uses the keyword: '" + keyword + "' to retrieve charging information!");
		return "return results";
	}
}
