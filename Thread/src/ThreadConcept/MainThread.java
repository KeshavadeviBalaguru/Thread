package ThreadConcept;
//Creating Thread by implementing Runnable interface

class MyThreads implements Runnable
{

	@Override
	public void run() {
		System.out.println("Inside run"+Thread.currentThread());
		
	}
	
}

public class MainThread {

	public static void main(String[] args) throws InterruptedException {
		
		MyThreads mt=new MyThreads();
		//start method is defined in Thread
        Thread tmt=new Thread(mt);
		MyThreads mt1=new MyThreads();
		Thread tmt1=new Thread(mt1);
		MyThreads mt2=new MyThreads();
		Thread tmt2=new Thread(mt2);
		tmt.setName("First Thread");
		tmt1.setName("Second Thread");
		tmt2.setName("Third Thread");
		tmt.start();
		tmt.join();
		tmt1.start();
		tmt1.join();
		tmt2.start();
		
	}

}
