package designpatterns.facade;
import java.io.FileOutputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

//Subsystem
public class FileWriter {
	public void write(String encryptStr,String fileNameDes) {
		System.out.println("Save the encryption text, write to file!");
		try{
     		FileOutputStream outFS = new FileOutputStream(fileNameDes);
      		outFS.write(encryptStr.getBytes());
      		outFS.close();
		}	
		catch(FileNotFoundException e) {
			System.out.println("File is not existing!");
		}
		catch(IOException e) {
			System.out.println("File operation is failing!");
		}		
	}
}
