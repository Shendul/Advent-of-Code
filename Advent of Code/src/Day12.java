import java.util.ArrayList;
import java.util.Scanner;

public class Day12 {

	public static void main(String[] args) {
		
		// init an arraylist to hold all of the numbers
		ArrayList<Integer> group = new ArrayList<Integer>();
		group.add(0);
		System.out.println(group);
		
		Scanner in = new Scanner(System.in);
		
		while(in.hasNextLine()) {
			String line = in.nextLine();
			String[] split = line.split(" <-> ");
			
			if (group.contains(Integer.parseInt(split[0]))) {
				//System.out.println("group: " + group);
				//System.out.println("group contains: " + split[0]);
				
				String[] newConnections = split[1].split(", ");
				for (int c = 0; c < newConnections.length; c++) {
					Integer newConnection = Integer.parseInt(newConnections[c]);
					if (!group.contains(newConnection))
						group.add(newConnection);
				}
			} else {
				//System.out.println("group does not contain this number");
				// check reverse side
				String[] newConnections = split[1].split(", ");
				for (int c = 0; c < newConnections.length; c++) {
					Integer newConnection = Integer.parseInt(newConnections[c]);
					if (group.contains(newConnection))
						group.add(Integer.parseInt(split[0]));
				}
			}
			System.out.println("group: " + group);
			System.out.println("num programs: " + group.size());
			
		}
		

	}

}
