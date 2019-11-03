package designpatterns.prototype.shallowclone;

public class Client {
	public static void main(String args[]){
		Email email,copyEmail;
		email=new Email();
		copyEmail=(Email)email.clone();
		
		System.out.print("Is the same E-mail?");
		System.out.println(email==copyEmail);
		
		System.out.print("Is the same Attachment?"); 
		System.out.println(email.getAttachment()==copyEmail.getAttachment());			
	}
}
