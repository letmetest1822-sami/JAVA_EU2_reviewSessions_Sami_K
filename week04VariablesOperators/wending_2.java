package reviewSessions.week04VariablesOperators;
public static void main(String[] args) {
		/* 1 Quarters= 25 cents
		   1 Dimes=10 cents
		   1 Nickel=5 cents
		   1 Penny=1 cent
		   1 Dollar) 100 cents
		 */
		int quarters, dimes, nickels,penny, cents, cent, dollar, price;
		
		price = 45;
		int change = 100-price;
		quarters = change/25;
		change= change%25;
		
		dimes = change/10;
		change=change%10;
		
		nickels = change/5;
		change = change%5;
		
		
		double amount1 = 2.15;
		double amount2 = 1.10;
		System.out.println("Difference is " + amount1-amount2);
		
		
		System.out.println("Your change is " + quarters + "quarters" +","+ dimes + "dimes"+","+ nickels + "nickels");
			
		}





