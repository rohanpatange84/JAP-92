package p1;

import java.util.Collection;
import java.util.HashMap;
public class Example02 {
		public static void main(String[] args) {
			
			String friends[] = {"Rahul","Priya","Amit","Rahul","Sneha","Priya","Vikram","Amit","Neha","Rahul"};
			
			HashMap<Integer, String> hs = new HashMap<Integer, String>();
			hs.put(31, "Janhvi");
			hs.put(23, "Akanksha");
			hs.put(34, "Gaurii");
			hs.put(45, "Pratiksha");
			
			
			for(int i=0;i<friends.length;i++) {
				hs.put(i*1, friends[i]);
			}
			
			System.out.println(hs);
			
			Collection<String> names = hs.values();
			for (String n : names) {
				int cnt=0;
				for (String n1 : names) {
					if(n==n1) {
						cnt++;
					}	
				}
				System.out.println(n+ " "+ cnt);
					

			}
				
	
					
			
			
		}
}
