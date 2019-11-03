package designpatterns.prototype.deepclone;

import java.io.*;

//Concrete Prototype
public class Attachment implements Serializable {
    public void download() {
    	System.out.println("Download Attachment!");	
    }
}

