import java.util.Scanner;

public class Day11 {

	public static void main(String[] args) {
		
		// init endpoint x, y, and z scores.
		int endX = 0, endY = 0, endZ = 0;
		int maxD = 0;
		
		// scan in the moves
		Scanner in = new Scanner(System.in);
		String line = in.nextLine();
		String[] moves = line.split(",");
		
		for (int m = 0; m < moves.length; m++) {
			
			if (moves[m].equals("n")) {
				endZ--;
				endY++;
			} else if (moves[m].equals("nw")) {
				endY++;
				endX--;
			} else if (moves[m].equals("sw")) {
				endX--;
				endZ++;
			} else if (moves[m].equals("s")) {
				endY--;
				endZ++;
			} else if (moves[m].equals("se")) {
				endY--;
				endX++;
			} else if (moves[m].equals("ne")) {
				endX++;
				endZ--;
			} else {
				System.out.println("Error: invalid move was made?");
			}
			
			if (Math.max(Math.max(Math.abs(endX),Math.abs(endY)),Math.abs(endZ)) > maxD) {
				maxD = Math.max(Math.max(Math.abs(endX),Math.abs(endY)),Math.abs(endZ));
			}
			
		}
		
		// Take the maximum of the three scores absolute values and that is your distance
		System.out.println(Math.max(Math.max(Math.abs(endX),Math.abs(endY)),Math.abs(endZ)));
		
		System.out.println(maxD);

	}

}
