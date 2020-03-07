package reviewSessions.week08_classObjects_Scanner;

public class CheckingAccount {
	
	double balance;
	long accountNumber;
	String accountHolder;
	String type = "checking"; // set  checking asdefault value
	
	public void setInfo ( double pBalance, long pAccNumber, String pAccHolder) {
		
		System.out.println("Setting account info ... \n");
		balance = pBalance;
		accountNumber = pAccNumber;
		accountHolder = pAccHolder;
		
		
	}
 public void getAccounInfo() {
	 System.out.println("Checking Account : $ " + balance + " , " + accountNumber + " , "+ accountHolder + "\n");
 }
 
 public void deposit (double amount) {
	 System.out.println(" Depositing $ " + amount + " to account number : " + accountNumber + "\n");
	 balance += amount;
 }
 
 public void withdraw(double amount) {
	 System.out.println("Withdrawing $ " + amount + " from account number : " + accountNumber + "\n");
	 
	 if (amount<=balance) {
		 balance -= amount;
	 }else {
		 System.out.println("Error : Insufficient Funds...\n");}
	 }
	 
	 public void purchase(String item,double price) {
			
			System.out.println("purchasing " + item + " for $" + price + "\n");
			if(price<=balance) {
				balance -= price;
			}else {
				System.out.println("Insufficient Fund - overdraft fee is applied\n");
				balance -= (price + 35);
			}
			
			System.out.println("transaction completed for " + item + " ,currenct balance: " + balance + "\n");

}
 }
