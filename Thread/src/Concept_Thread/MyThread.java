package Concept_Thread;
class MainThread extends Thread
{

	public MainThread(String string) {
		super(string);
	}

	@Override
	public void run() {
		for(int i=1;i<=5;i++)
		{
			System.out.println("i= "+i+"thread name"+Thread.currentThread());
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}
	
}
public class MyThread {

	public static void main(String[] args) throws InterruptedException {
		 MainThread ob=new  MainThread("First");
		 ob.start();
		 ob.join();
		 MainThread ob1=new  MainThread("Second");
		 ob1.start();

	}

}
