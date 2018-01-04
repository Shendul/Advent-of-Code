import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Scanner;

public class Day12 {

	public static final int MAX_VALUE = 100000;
	
	public static void main(String[] args) {
		LinkedList<Integer> adjList[] = new LinkedList[MAX_VALUE];  
		
		Scanner in = new Scanner(System.in);
		int index = 0;
		boolean scanning = true;
		
		while(scanning) {
			
			adjList[index] = new LinkedList<>();
			String line = in.nextLine();
			if (line.equals("exit")) {
				scanning = false;
				break;
			}
			String[] split = line.split(" <-> ");
			String[] connections = split[1].split(", ");
			for (int i = 0; i < connections.length; i++) {
				adjList[index].add(Integer.parseInt(connections[i]));
			}
			//System.out.println(Arrays.toString(adjList));
			index++;
			
		}
		System.out.println(BFS(adjList));
		

	}
	
	public static int BFS(LinkedList<Integer> adjList[]) {
		int programs = 0;
		int start = 0;
		
		boolean visited[] = new boolean[MAX_VALUE];
		
		// Create a queue for BFS
        LinkedList<Integer> queue = new LinkedList<Integer>();
        
        visited[start]= true;
        queue.add(start);
        
        while (queue.size() != 0)
        {
            // Dequeue a vertex from queue and increase programs by one
            start = queue.poll();
            programs++;
 
            Iterator<Integer> i = adjList[start].listIterator();
            while (i.hasNext())
            {
                int num = i.next();
                if (!visited[num])
                {
                    visited[num] = true;
                    queue.add(num);
                }
            }
        }
		
		return programs;
	}

}