import java.util.Scanner;

public class DayOne {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		
		long sum = 0;
		
		String input = in.nextLine();
		for(int i = 0; i < input.length(); i++) {
			if(i < (input.length() - 1)) {
				if(Character.getNumericValue(input.charAt(i)) == Character.getNumericValue(input.charAt(i+1))){
					//System.out.println("found a match");
					sum += Character.getNumericValue(input.charAt(i));
				}
			} else {
				if(Character.getNumericValue(input.charAt(i)) == Character.getNumericValue(input.charAt(0))){
					//System.out.println("found a match");
					sum += Character.getNumericValue(input.charAt(i));
				}
			}
			
		}
		System.out.print(sum);
	}

}
