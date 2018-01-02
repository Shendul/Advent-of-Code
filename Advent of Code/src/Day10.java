import java.util.Arrays;
import java.util.Scanner;

public class Day10 {

	public static void main(String[] args) {
		
		// actual
		
		int[] startingArray = new int[256];
		for (int fill = 0; fill < 256; fill++) {
			startingArray[fill] = fill;
		}
		
		
		// test case
		/*
		int[] startingArray = new int[5];
		for (int fill = 0; fill < 5; fill++) {
			startingArray[fill] = fill;
		} */
		System.out.println(Arrays.toString(startingArray));
		
		// bring in the lengths
		Scanner in = new Scanner(System.in);
		
		String line = in.nextLine();
		String[] lengths = line.split(",");
		int skipStep = 0;
		int currentPos = 0;
		
		for (int l = 0; l < lengths.length; l++) {
			//System.out.println("currentpos : " + currentPos);
			int length = Integer.parseInt(lengths[l]);
			//System.out.println(length);
			
			if (length > 1) {
			
				// grab sublist.
				int[] subArray = new int[length];
				for (int s = 0; s < length; s++) {
					subArray[s] = startingArray[(s + currentPos) % startingArray.length];
				}
				//System.out.println(Arrays.toString(subArray));
				
				// reverse it
				for (int r = 0; r < (length/2); r++) {
					int temp = subArray[r];
					subArray[r] = subArray[length - r - 1];
					subArray[length - r - 1] = temp;
				}
				//System.out.println(Arrays.toString(subArray));
				
				//edit original array.
				for (int e = 0; e < length; e++) {
					startingArray[(e + currentPos) % startingArray.length] = subArray[e];
				}
			}
			
			currentPos += skipStep + length;
			currentPos %= 256;
			skipStep++;
		}
		System.out.println(startingArray[0] * startingArray[1]);
		
	}

}
