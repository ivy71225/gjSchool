package threadEx;

public class student extends Thread{
   private String name;
   
   public student (String name) {
	   super();
	   this.name=name;
   }
   
   @Override
   public void run() 
   {
	show();   
   }
   public void show()
   {
	   for(int i=0;i<=10;i++)
	   {
		   try {
			   Thread.sleep(300);
			   System.out.println("I="+i+"\t名"+name);
		   }catch(InterruptedException e) {
			   e.printStackTrace();
		   }
		   
	   }
   }
   
   
   
}
