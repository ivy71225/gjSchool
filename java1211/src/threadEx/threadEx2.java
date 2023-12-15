package threadEx;

public class threadEx2 {

	public static void main(String[] args) throws InterruptedException {
		
		student s1=new student("s1");
		student s2=new student("s2");
		student s3=new student("s3");
		student s4=new student("s4");
		
		s1.start();
		s2.start();
		s2.join();
		s3.start();
		s4.start();
	}

}
