package AnnonymousClass;
class Bank
{
	static int amount=10000;
	 synchronized void deposit(int Damount)
	{
		amount=amount+Damount;
		System.out.println("Deposited Amount is"+Damount);
		notify();
	}
	 synchronized void withdraw(int Wamount) throws InterruptedException
	{
		
		if(Wamount>amount)
		{
			wait();
		}
		amount=amount-Wamount;
		System.out.println("Withdraw Amount is"+Wamount);
		System.out.println("Balance is"+amount);
	}
}

public class MainBank {

	public static void main(String[] args) {
		Bank b=new Bank();
		new Thread() {
			public void run()
			{
				try {
					b.withdraw(35000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}.start();
		new Thread() {
			public void run()
			{
				b.deposit(25000);
			}
		}.start();;


	}

}
