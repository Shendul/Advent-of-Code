import java.util.ArrayList;
import java.util.Scanner;

public class DayFive {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		ArrayList<Integer> nums = new ArrayList<Integer>();
		
		while(in.hasNextInt() == true) {
			nums.add(in.nextInt());
		}
		
		
		boolean jumping = true;
		int index = 0;
		int size = nums.size();
		
		long steps = 0;
		while(jumping) {
			if (index >= size) {
				jumping = false;
				break;
			} else {
				int number = nums.get(index);
				int newNumber;
				if(number >= 3) {
					newNumber = number - 1;
				} else {
					newNumber = number + 1;
				}
				nums.set(index, newNumber);
				index += number;
				steps++;
				
			}
		}
		System.out.println(steps);
	}

}
