package p1;
import java.util.*;
public class Demo {
	
	
		public static void count(String friends[]){
			HashMap<String, Integer> map = new HashMap<>();
			for(int i = 0; i < friends.length; i++) {
			    map.put(friends[i], map.getOrDefault(friends[i], 0) + 1);
			}
			System.out.println(map);
		}
		
		public static void main(String[] args) {
			String friends[] = {"Rahul","Priya","Amit","Rahul","Sneha","Priya","Vikram","Amit","Neha","Rahul"};
			
			count(friends);
		
	}

}
