package AnnonymousClass;
class Table{
	void printtable(int n)
	{
		for(int i=1;i<=10;i++)
		{
			System.out.println(i+"X"+n+"="+n*i);
		}
	}
}
public class MainApp1 {

	public static void main(String[] args) {
		Table ta=new Table();
		Thread t=new Thread()
				{
			 public void run() {
				
				 ta.printtable(3);
			 }
				};
				t.start();
		new Thread()
				{
			 public void run() {
				 System.out.println("-------------");
				 ta.printtable(6);
			 }
				}.start();
			

	}

}
