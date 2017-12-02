import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class DayTwo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		String line;
		long checkSum = 0;
		boolean scanning = true;
		
		
		while (scanning) {
		    line = in.nextLine();
		    if (line.equals("exit")) {
		    	scanning = false;
		    	break;
		    }
		    String[] s = line.split("\t");
		    //stupid but fun way to do this without actually sorting
		    long rowMin = Long.parseLong(s[0]); 
			long rowMax = Long.parseLong(s[0]);
			long rowCheckSum = 0;
		    for( int i = 0; i < s.length; i++) {
		    	if(Long.parseLong(s[i]) < rowMin) {
		    		rowMin = Long.parseLong(s[i]);
		    	} else if (Long.parseLong(s[i]) > rowMax) {
		    		rowMax = Long.parseLong(s[i]);
		    	}
		    	
		    }
		    rowCheckSum += rowMax - rowMin;
	    	System.out.println(rowCheckSum);
			checkSum += rowCheckSum; // pointless to do this on two lines i know.
		}
		System.out.println(checkSum);
	}

}
