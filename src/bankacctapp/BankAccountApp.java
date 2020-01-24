package bankacctapp;

public class BankAccountApp {

	public static void main(String[] args) {
		
		Checking chkacc1 = new Checking("Tom Wilson", "332454789", 1500);
		
		Savings savacc1 = new Savings("Rich Lowe", "123456789", 25400);
		
		savacc1.compound();
		
		chkacc1.showInfo();
		System.out.println("********************");
		savacc1.showInfo();
		
		savacc1.deposit(5000);
		savacc1.withdraw(200);
		savacc1.transfer("Brockerage", 3000);
		
		
		//Read a CSV file then create new accounts based on that data
		

	}

}
