package designpatterns.proxy;

//Proxy
public class ProxySearcher implements Searcher {
	private RealSearcher searcher = new RealSearcher(); //declare a RealSubject
	private AccessValidator validator;
	private Logger logger;
	
	public String doSearch(String userId,String keyword) {
		//if login success, retrieve information 
		if (validate(userId)) {
			String result = searcher.doSearch(userId,keyword); //������ʵ�������Ĳ�ѯ����
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
