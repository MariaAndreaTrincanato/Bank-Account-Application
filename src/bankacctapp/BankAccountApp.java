package bankacctapp;

public class BankAccountApp {

	public static void main(String[] args) {
		
		Checking chkacc1 = new Checking("Tom Wilson", "332454789", 1500);
		
		Savings savacc1 = new Savings("Rich Lowe", "123456789", 25400);
		
		chkacc1.showInfo();
		System.out.println("********************");
		savacc1.showInfo();
		
		//Read a CSV file then create new accounts based on that data
		

	}

}
