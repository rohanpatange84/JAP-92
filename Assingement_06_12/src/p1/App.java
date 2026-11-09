package p1;

import java.util.Set;
import java.util.HashSet;
import java.util.HashMap;
public class App {
	
	
	public static void getDepartmentDetails(HashSet department,HashSet<HashMap<String, String>> depart) {
		HashSet<HashMap<String, String>>res= new HashSet<>();
		
		for(HashSet s :department) {
			
		
				
				
				
			}
		}
	}
	
		public static void main(String[] args) {
			HashSet<HashMap<String, String>>Acting= new HashSet<>();
			HashSet<HashMap<String, String>>Dance= new HashSet<>();
			HashSet<HashMap<String, String>>Fitness= new HashSet<>();
			
			HashMap<String,String> hm1 = new HashMap<>();
			hm1.put("Deepika Padukone", "Lead Actress");
			hm1.put("Alia Bhatt", "Supporting  Actress");
			
			HashMap<String,String> hm2 = new HashMap<>();
			hm2.put("Nora Fatehi", "Choreographer");
			hm2.put("Madhuri Dixit", "Classical Dance Lead");
			
			HashMap<String,String> hm3 = new HashMap<>();
			hm3.put("Shilpa Shetty", "Yoga Trainer");
			hm3.put("Katrina Kaif", "Fitness Ambassador");
			
			Acting.add(hm1);
			Dance.add(hm2);
			Fitness.add(hm3);
			
			System.out.println(Acting);
			
			HashSet department= new HashSet<>();
			department.addAll(Acting);
			department.addAll(Dance);
			department.addAll(Fitness);
			
			
			
			
			
		}
}
