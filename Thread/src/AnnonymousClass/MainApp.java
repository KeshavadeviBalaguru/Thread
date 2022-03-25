package AnnonymousClass;
//annonymous class
public class MainApp {

	public static void main(String[] args) {
		/*Thread t=new Thread() {
			public void run()
			{
				System.out.println("Run method");
			}
		};
		t.start();
		*/
		
		//or
		/*new Thread() {
			public void run()
			{
				System.out.println("Run method");
			}
		}.start();
		*/
		//or
		
		//Using Runnable interface
		Runnable r=new Runnable() {
			public void run()
			{
				System.out.println("run method");
			}
		};
		Thread t=new Thread(r);
		t.start();
			
		
		
	}

}
