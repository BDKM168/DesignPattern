package designpatterns.bridge;

//ConcreteImplementor
public class LinuxImp implements ImageImp {
    public void doPaint(Matrix m) {
    	//call Linux system function to parse the pixel matrix 
    	System.out.print("Display image in Linux:");
    }
}
