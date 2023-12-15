package threadEx;

public class addBus {

	public static void main(String[] args) {
		bus b1=new bus();
		bus b2=new bus();
		bus b3=new bus();
		
		//b1.add(50);
		//b2.add(50);
		//b3.add(50);
		//b1.run();
		//b2.run();
		//b3.run();
		b1.start();
		b2.start();
		b3.start();

	}

}