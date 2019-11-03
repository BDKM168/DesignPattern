package designpatterns.composite;
import java.util.*;

//Composite
public class Folder extends AbstractFile {
	//define a fileList to save members
	private ArrayList<AbstractFile> fileList=new ArrayList<AbstractFile>();
	private String name;
		
	public Folder(String name) {
		this.name = name;
	}
	
	public void add(AbstractFile file) {
	   fileList.add(file);	
	}
	
	public void remove(AbstractFile file) {
		fileList.remove(file);
	}
	
	public AbstractFile getChild(int i) {
		return (AbstractFile)fileList.get(i);
	}
	
	public void killVirus() {
		System.out.println("Kill virus for the folder:" + name);  //simulate to kill virus
		
		//call the members' killVirus() recursively
		for(Object obj : fileList) {
			((AbstractFile)obj).killVirus();
		}
	}
}
