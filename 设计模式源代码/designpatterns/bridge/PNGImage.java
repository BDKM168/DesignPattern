package designpatterns.bridge;

//RefinedAbstraction
public class PNGImage extends Image {
	public void parseFile(String fileName) {
        //simulate to parse a PNG file and get a pixel matrix object m
        Matrix m = new Matrix(); 
        imp.doPaint(m);
        System.out.println(fileName + ", format is PNG.");
    }
}