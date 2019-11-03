package designpatterns.prototype.deepclone;

public class Client {
	public static void main(String args[]) {
		Email email,copyEmail=null;
		email=new Email();
		try{
		    copyEmail=(Email)email.deepClone();	
		}
		catch(Exception e) {
	   		e.printStackTrace();
	    }	
 
		System.out.print("Is the same E-mail?");
		System.out.println(email==copyEmail);
		
		System.out.print("Is the same Attachment?"); 
		System.out.println(email.getAttachment()==copyEmail.getAttachment());			
	}
}
