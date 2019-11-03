package designpatterns.proxy;

//Proxy
public class ProxySearcher implements Searcher {
	private RealSearcher searcher = new RealSearcher(); //declare a RealSubject
	private AccessValidator validator;
	private Logger logger;
	
	public String doSearch(String userId,String keyword) {
		//if login success, retrieve information 
		if (validate(userId)) {
			String result = searcher.doSearch(userId,keyword); //调用真实主题对象的查询方法
			this.log(userId); //write log
			return result; 
		}
		else {
			return null;
		}
	} 
	
	public boolean validate(String userId) {
		validator = new AccessValidator();
		return validator.validate(userId);
	}
	
    public void log(String userId) {
		logger = new Logger();
		logger.log(userId);
	}
}
