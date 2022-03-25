package Concept_Thread;
class Table
{
	synchronized void printTable(int n)
	{
		for(int i=1;i<=10;i++)
		{
			System.out.println(i+"X"+n+"="+n*i);
		}
	}
}
	class FirstThread extends Thread
	{
		Table t;
		FirstThread(Table t)
		{
			this.t=t;
		} 
		public void run()
		{
			t.printTable(5);
		}
	}
	class SecondThread extends Thread
	{
		Table t;
		SecondThread(Table t)
				
		{
			this.t=t;
		}
		public void run()
		{
			t.printTable(2);
		}
	}


public class MainThread1 {

	public static void main(String[] args) {
		Table t=new Table();
		FirstThread ft=new FirstThread(t);
		SecondThread st=new SecondThread(t);
		ft.start();
		st.start();

	}

}
