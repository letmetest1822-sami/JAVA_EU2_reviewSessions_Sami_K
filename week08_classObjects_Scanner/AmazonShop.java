package reviewSessions.week08_classObjects_Scanner;

public class AmazonShop {

	public static void main(String[] args) {
		// declare two variables
		
		Product prodObj1 = new Product();
		Product prodObj2 = new Product();

		
		
		// assign some values to prodObj1
		prodObj1.title = "Spoon";
		prodObj1.price = 5;
		prodObj1.rating = 4;
		prodObj1.seller = "SpoonSeller";
		
		System.out.println(prodObj1.title);
		System.out.println(prodObj2.title);
		
		// assign some values to prodObj2
				prodObj2.title = "Gloves";
				prodObj2.price = 10;
				prodObj2.rating = 5;
				prodObj2.seller = "AmazonSeller";
				
				
				prodObj1.displayInfo();
				prodObj2.displayInfo();
	}

}
