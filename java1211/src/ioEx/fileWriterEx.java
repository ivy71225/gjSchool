package ioEx;

import java.io.FileWriter;
import java.io.IOException;

     public class fileWriterEx {

	/*public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
        FileWriter fw=new FileWriter("c:/ABC/ex1.txt");
        fw.write("巨匠電腦abcdefg");
        fw.close();*/
    	 //第一種方法
       public static void main(String[] args)  {
		
		try(FileWriter fw = new FileWriter("c:/ABC/ex1.txt")) {
			
			fw.write("巨匠電腦abcdefg");
			//fw.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        
	}

}
