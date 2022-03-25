package AnnonymousClass;
class Bank1{
	static int amount=10000;
	synchronized void deposit(int damt) {
		System.out.println("Deposit method");
		amount=amount+damt;
		System.out.println("Amount after deposit "+amount);
		System.out.println("Deposit is completed");
		notify();
	}
	
	synchronized void withdraw(int wamt) throws InterruptedException {
		System.out.println("Withdraw method");
		if(wamt>amount) {
			wait();
		}
		
			amount=amount-wamt;
			System.out.println("Amount after withdraw "+amount);
		
	}
}


		

public class MainBank2 {

	public static void main(String[] args) {
Bank1 ob=new Bank1();
		
		new Thread() {
			public void run() {
				try {
					ob.withdraw(30000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			
		}.start();
		new Thread() {
			public void run() {
				ob.deposit(20000);
			}
			
		}.start();
	}
	
	}


