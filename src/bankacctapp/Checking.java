package bankacctapp;

public class Checking extends Account {
	//List properties specific to a Checking account
	int debitCardNumber;
	int debitCardPIN;
	
	
	//Constructor to initialize settings for the checking account properties
	public Checking(String name, String sSN, double initDeposit) {
		super(name, sSN, initDeposit);
		accountNumber = "2" + accountNumber;
		setDebitCard();
	}
	
	@Override
	public void setRate() {
		rate = getBaseRate()*0.15;
	}
	
	//List any methods specific to a Checking account
	private void setDebitCard() {
		debitCardNumber = (int)(Math.random()*Math.pow(10, 12));
		debitCardPIN = (int)(Math.random()*Math.pow(10, 4));
	}
	
	public void showInfo() {
		System.out.println("ACCOUNT TYPE: Checking");
		super.showInfo();
		System.out.println(
				"Your checking account features: " + 
				"\n Debit Card Number: " + debitCardNumber +
				"\n Debit Card PIN: "+ debitCardPIN
				);
	}
}
