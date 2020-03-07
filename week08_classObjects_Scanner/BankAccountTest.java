package reviewSessions.week08_classObjects_Scanner;

public class BankAccountTest {

	public static void main(String[] args) {
		// createan account
		
		CheckingAccount clientOne = new CheckingAccount();
		
		//set data
		
		clientOne.accountNumber = 3426656565L;
		clientOne.accountHolder = "Amazon";
		clientOne.balance = 1000;
		
		clientOne.getAccounInfo();
		
		// create another account and set data using method
		CheckingAccount clientTwo = new CheckingAccount();
		
		clientTwo.setInfo(300.0, 34287734L, "Mike Smit");
		clientTwo.getAccounInfo();
		
		// test deposit method
		
		clientOne.deposit(300);
		clientTwo.deposit(1000);
		
		//test withdraw method
		
		clientOne.withdraw(200);
		clientOne.getAccounInfo();
		
		//call purchase method
		CheckingAccount myAccount = new CheckingAccount();
		myAccount.setInfo(200, 22222548L, "Ozzy");
		myAccount.purchase("Book", 95);
		System.out.println("Current balance : " + myAccount.balance);
		
		myAccount.purchase("Shoes", 120);
		myAccount.purchase("Computer", 500);
		myAccount.getAccounInfo();

	}

}
