package designpatterns.bridge;

//ConcreteImplementor
public class UnixImp implements ImageImp {
    public void doPaint(Matrix m) {
    	//call Unix system function to parse the pixel matrix 
    	System.out.print("Display image in Unix:");
    }
}
