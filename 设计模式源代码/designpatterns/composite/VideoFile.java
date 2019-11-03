package designpatterns.composite;

//Leaf
public class VideoFile extends AbstractFile {
	private String name;
	
	public VideoFile(String name) {
		this.name = name;
	}
	
	public void add(AbstractFile file) {
	   System.out.println("Don't support this method!");
	}
	
	public void remove(AbstractFile file) {
		System.out.println("Don't support this method!");
	}
	
	public AbstractFile getChild(int i) {
		System.out.println("Don't support this method!");
		return null;
	}
	
	public void killVirus() {
		//simulate to kill virus
		System.out.println("Kill virus for the video file:" + name);
	}
}

