package reviewSessions.week11_ArrayLists;

public class CastingWithPrimitives {

	public static void main(String[] args) {

		int intValue = 123;
		double doubleValue = intValue; // implicit automatic casting

		Integer wrapperInt = Integer.valueOf(100);
		Double wrapperDouble = (double)wrapperInt;

	}

}
