//To create thread based application
//1. Extend your class with Thread class and override public void run()
//to call run method jvm uses ob.start()
//start can be used only once on particular object

package ThreadConcept;

class MyThread extends Thread
{
	public void run()
	{
		System.out.println("Inside run"+Thread.currentThread());
	}

	
}
public class Hello {

	public static void main(String[] args) {
		System.out.println(Thread.currentThread());
		MyThread mt=new MyThread();
		MyThread mt1=new MyThread();
		mt.setName("First");//change the predefined name
        mt1.setName("Second");
		mt.start();//Excecution of Thread is controlled by JVM
        //You cannot predict the output

		mt1.start();//thread can be started only once on particular object
		//if you start more than once, It will throw IlligalThreadState Exception

	}

}
