package designpatterns.facade;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

//Subsystem
public class FileReader {
	public String read(String fileNameSrc) {
		System.out.println("Read file, get the plain text!");
		StringBuffer sb = new StringBuffer();
		try{
			FileInputStream inFS = new FileInputStream(fileNameSrc);		
			int data;
    		while((data = inFS.read())!=-1) {
    			sb = sb.append((char)data);
    		}
     		inFS.close();
     		System.out.println("Plain text:" + sb.toString());
		}
		catch(FileNotFoundException e) {
			System.out.println("File is not existing!");
		}
		catch(IOException e) {
			System.out.println("File operation is failing!");
		}
		return sb.toString();
	}
}
