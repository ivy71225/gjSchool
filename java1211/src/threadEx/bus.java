package threadEx;

public class bus extends Thread{
	private static int sum;
	
	@Override
	public void run()
	{
		for(int i=0;i<=20;i++)
		{
			try {
				Thread.sleep(100);
				add(50);}catch(InterruptedException e) {
					e.printStackTrace();
				}
		}
	}
	
	
	
	
	public synchronized static void add(int pay)
	{
		int temp=sum;
		System.out.println("目前總金額="+temp);
		System.out.println("新進一筆金額:"+pay);
		temp=temp+pay;
		System.out.println("目前最新總金額="+temp);
		sum=temp;
		System.out.println("");
	}




	
	}

