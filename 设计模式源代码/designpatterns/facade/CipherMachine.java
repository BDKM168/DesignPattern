package designpatterns.facade;

//Subsystem
public class CipherMachine {
	public String encrypt(String plainText) {
		System.out.println("Encrypt data, transform plain text to encryption text!");
		String es = "";
		for(int i = 0; i < plainText.length(); i++) {
			String c = String.valueOf(plainText.charAt(i) % 7);
			es += c;
		}
		System.out.println("Encryption text:" + es);
		return es;
	}
}
