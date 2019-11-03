package designpatterns.templatemethod;

class Client {
	public static void main(String args[]) {
		Account account;
		account = (Account) XMLUtil.getBean();
		account.handle("sunny","123456");
	}
}
