package designpatterns.prototype.deepclone;
import java.io.*;

//Concrete Prototype
public class Email implements Serializable {
	private Attachment attachment=null;
	
	public Email() {
		this.attachment=new Attachment();
	}
	
	public Object deepClone() throws IOException, ClassNotFoundException, OptionalDataException {
		//write the object to stream
		ByteArrayOutputStream bao=new ByteArrayOutputStream();
		ObjectOutputStream oos=new ObjectOutputStream(bao);
		oos.writeObject(this);
		
		//read the object from stream
		ByteArrayInputStream bis=new ByteArrayInputStream(bao.toByteArray());
		ObjectInputStream ois=new ObjectInputStream(bis);
		return(ois.readObject());
	}
	
	public Attachment getAttachment() {
		return this.attachment;
	}
	
	public void display() {
		System.out.println("Display E-mail!");	
	}
}