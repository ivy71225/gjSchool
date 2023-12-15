package threadEx;

public class threadEx1 {

	public static void main(String[] args) {
		student s=new student("a");
		s.show();
		
		for(int i=1;i<=10;i++)
		{
			try {
				Thread.sleep(250);
				System.out.println("i="+i+"\thello thread");
			}catch(InterruptedException e) {
				e.printStackTrace();
			}
			
		}

	}

}