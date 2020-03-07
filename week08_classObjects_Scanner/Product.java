package reviewSessions.week08_classObjects_Scanner;

public class Product {
	
	String title;
	double price;
	int rating;
	String seller;
	
	// custom method to act as behaviour for Product class
	
	public void displayInfo() {   //method
		System.out.println("----------- Product Info ----------");
		System.out.println(" Title  = "+ title);
		System.out.println(" Price  = " + price);
		System.out.println(" Rating  = " + rating);
		System.out.println("seller = " + seller);

	}

}
