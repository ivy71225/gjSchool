package ioEx;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class ObjectOutputStreamEx {

	public static void main(String[] args) throws IOException {
		FileOutputStream fos=new FileOutputStream("c:/ABC/order.txt");
		ObjectOutputStream oos=new ObjectOutputStream(fos);
		
		oos.writeObject(new Order("a",1,1));
		oos.writeObject(new Order("b",1,2));
		oos.writeObject(new Order("c",3,1));
		oos.writeObject(new Order("d",1,2));
		oos.writeObject(new Order("e",3,1));

	}

}