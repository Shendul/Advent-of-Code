import java.util.Scanner;

public class DayOne {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		
		long sum = 0;
		
		
		String input = in.nextLine();
		int stepper = input.length()/2;
				
		for(int i = 0; i < input.length(); i++) {
			if(i < (input.length() - stepper)) {
				if(Character.getNumericValue(input.charAt(i)) == Character.getNumericValue(input.charAt(i+stepper))){
					//System.out.println("found a match");
					sum += Character.getNumericValue(input.charAt(i));
				}
			} else {
				if(Character.getNumericValue(input.charAt(i)) == Character.getNumericValue(input.charAt(i - stepper))){
					//System.out.println("found a match");
					sum += Character.getNumericValue(input.charAt(i));
				}
			}
			
		}
		System.out.print(sum);
	}

}
