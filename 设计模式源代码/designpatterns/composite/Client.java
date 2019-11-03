package designpatterns.composite;

public class Client {
	public static void main(String args[]) {
		AbstractFile file1,file2,file3,file4,file5,folder1,folder2,folder3,folder4;
		
		folder1 = new Folder("Sunny files");
		folder2 = new Folder("Images");
		folder3 = new Folder("Documents");
		folder4 = new Folder("Videos");
		
		file1 = new ImageFile("Audi.jpg");
		file2 = new ImageFile("BMW.gif");
		file3 = new TextFile("UML.txt");
		file4 = new TextFile("Refactoring.doc");
		file5 = new VideoFile("Composite.rmvb");

		folder2.add(file1);
		folder2.add(file2);
		folder3.add(file3);
		folder3.add(file4);
		folder4.add(file5);
		folder1.add(folder2);
		folder1.add(folder3);
		folder1.add(folder4);
		
        //specify the node
		//folder1.killVirus();
		//folder3.killVirus();
		file1.killVirus();
	}
}
