package ioEx;

import java.io.File;
import java.io.IOException;

public class FileEx {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		//File f=new File("c:/ABC/b.txt");
		//f.createNewFile();
		// File f=new File("c:/DEF");
		//f.mkdir();
		File f=new File("c:/DEF/A/B/C");
		f.mkdirs();

	}

}
