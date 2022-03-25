package AnnonymousClass;
class a extends Thread
{
	public void run()
	{
		for(int i=1;i<=5;i++)
		{
			System.out.println(+i+" " +Thread.currentThread());
		}
	}
}
public class MainApp2 {

	public static void main(String[] args) throws InterruptedException {
		 a t=new a();
		a t1=new a();
		System.out.println(t.isAlive());
		System.out.println(t1.isAlive());
         t.start();
         System.out.println("State of thread ob"+t.isAlive());//true
       
         t.join();
         System.out.println(t.isAlive()) ; 
         t1.start();
         System.out.println(t1.isAlive());
 		
		
		/* MyClass ob=new MyClass();
		  MyClass ob1=new MyClass();
		  System.out.println("State of thread ob "+ob.isAlive());//false
		  System.out.println("State of thread ob1 "+ob1.isAlive());//false
		  ob.start();
		  System.out.println("State of thread ob"+ob.isAlive());//true
		  ob.join();
		  System.out.println("State of thread ob "+ob.isAlive());//false
		  ob1.start();
		  System.out.println("State of thread ob1 "+ob1.isAlive());
*/
       
	}

}
