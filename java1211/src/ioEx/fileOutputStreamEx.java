package ioEx;

import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;

public class fileOutputStreamEx {

	public static void main(String[] args) throws IOException {
		/*FileOutputStream fos=new FileOutputStream("c:/ABC/ex2.txt");
		//fos.write(65);
       OutputStreamWriter osw=new OutputStreamWriter(fos);
       BufferedWriter bw=new BufferedWriter(osw);*/
		BufferedWriter bw=
				   new BufferedWriter(
		                new OutputStreamWriter(
		                  new FileOutputStream("c:/ABC/ex2.txt")));
       bw.write("巨匠 123456bbbb");
       //osw.write("abcd 巨匠");
       bw.close();
	}

}