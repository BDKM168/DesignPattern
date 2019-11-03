package designpatterns.bridge;

//RefinedAbstraction
public class GIFImage extends Image {
	public void parseFile(String fileName) {
        //simulate to parse a GIF file and get a pixel matrix object m
        Matrix m = new Matrix(); 
        imp.doPaint(m);
        System.out.println(fileName + ", format is GIF.");
    }
}