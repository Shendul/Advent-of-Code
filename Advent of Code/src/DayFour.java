import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class DayFour {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		
		boolean scanning = true;
		boolean invalid = false;
		int numValid = 0;
		while(scanning) {
			String passPhrase = in.nextLine();
			String[] spassPhrase = passPhrase.split("\\s");
			Map<String,String> phraseMap = new HashMap<String,String>();
			for(int i = 0; i < spassPhrase.length; i++) {
				String value = phraseMap.get(spassPhrase[i]);
				//System.out.println(value);
				if (value != null) {
				    invalid = true;
				    break;
				} else {
				    // No such key
					phraseMap.put(spassPhrase[i], spassPhrase[i]);
					invalid = false;
				}
				
			}
			if(!invalid) {
				numValid++;
			}
			System.out.println(numValid);
			
			
		}
	}

}
