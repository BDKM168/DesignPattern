package designpatterns.bridge;

//ConcreteImplementor
public class WindowsImp implements ImageImp {
    public void doPaint(Matrix m) {
    	//call Windows system function to parse the pixel matrix 
    	System.out.print("Display image in Windows:");
    }
}
