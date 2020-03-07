package reviewSessions.week10_Arrays;

public class ArrayIntro {

	public static void main(String[] args) {
		// declare array with size 4
		
		int [] nums = new int [4];
		
		// assign values to each index
		
		nums [0] = 100;
		nums [1] = 200;
		nums [3] = 70;
		nums [3] = -5;
		//nums[4] = 300  exception error
		
		System.out.println(" number at index 0 : " + nums[0]);
		System.out.println(" number at index 0 : " + nums[1]);
		System.out.println(" number at index 0 : " + nums[2]);
		System.out.println(" number at index 0 : " + nums[3]);
		
		int x = nums[3];
		
		System.out.println(x);
		
		int i =0;
		i++; //1
		System.out.println(nums[i]);
		
		for (int j = 0; j < nums.length;   j++) {
			System.out.print(nums[j] + " ");
		}
		
		//modify index  to 500
		
		nums [0] = 500;
		
		// read value fromindex1 and store into index 2
		
		
		
		
		
		
		
	}

}
