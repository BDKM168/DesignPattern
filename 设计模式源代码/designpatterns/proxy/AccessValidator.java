package designpatterns.proxy;

public class AccessValidator {
	//simulate the process of validation
	public boolean validate(String userId) {
		System.out.println("Validate user: '" + userId + "'.");
		if (userId.equalsIgnoreCase("Sunny")) {
			System.out.println("'" + userId + "' login success!");
			return true;
		}
		else {
			System.out.println("'" + userId + "'login failure!");
			return false;
		}
	}
}
