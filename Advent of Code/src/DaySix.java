import java.util.ArrayList;
import java.util.Scanner;

public class DaySix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner in = new Scanner(System.in);
		ArrayList<Integer> banks = new ArrayList<Integer>();
		
		String line = in.nextLine();
		String [] sNumbers = line.split("\t");
		
		for (int i = 0; i < sNumbers.length; i++) {
			banks.add(Integer.parseInt(sNumbers[i]));
		}
	
		ArrayList<ArrayList<Integer>> previous = new ArrayList<ArrayList<Integer>>();
		boolean looping = true;
		int count = 1;
		int times = 1;
		while(looping) {
			int max = banks.get(0);
			int index = 0;
			for(int m = 0; m < banks.size(); m++) {
				
				if (max < banks.get(m)) {
					max = banks.get(m);
					index = m;
				}
				
			}
			//System.out.println("max: " + max);
			
			banks.set(index, 0);
			while(max > 0) {
				index = (index + 1)%banks.size();
				banks.set(index, banks.get(index) + 1);
				max--;
			}
			
			//System.out.println("banks: " + banks);
			//System.out.println("previous: " + previous);
			
			
			if (previous.contains(banks)) {
				System.out.println("count: " + count);
				count = 0; // part two
				previous.clear();
				
				if (times == 2) {
					looping = false;
				}
				times++;
				
			} else {
				count++;
				ArrayList<Integer> store = new ArrayList<Integer>(banks);
				previous.add(store);
			}
		}
		
		

	}

}
