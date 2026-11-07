package p1;


import java.util.LinkedHashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.HashSet;
import java.util.Collection;
import java.util.HashMap;
public class App {
	
	public static LinkedHashSet<String> getTagsForProduct(HashMap<String,Set<String>> list,String product) {
		
		LinkedHashSet<String> tags = new LinkedHashSet<>();
		
		Set<Map.Entry<String, Set<String>>> entries = list.entrySet();
		
		Iterator<Map.Entry<String, Set<String>>> itr = entries.iterator();
		
		while(itr.hasNext()) {
			Map.Entry<String, Set<String>> entryObj = itr.next();
			if(entryObj.getKey().equals(product)) {
				tags.addAll(entryObj.getValue());
				break;
			}
			
		}
		
		if(tags.isEmpty()) {
			return null;
		}
		
		return tags;

	}
	
	public static void main(String[] args) {
		
		
		HashSet<String> hs1 = new HashSet<>();
		hs1.add("Electronics");
		hs1.add("Gadgets");
		hs1.add("Tech");
		
		HashSet<String> hs2 = new HashSet<>();
		hs2.add("Electronics");
		hs2.add("Photography");
		hs2.add("Tech");
		
		
		HashSet<String> hs3 = new HashSet<>();
		hs3.add("Fashion");
		hs3.add("Footwear");
		hs3.add("Sports");
		
		HashMap<String,Set<String>> list = new HashMap<>();
	
		list.put("Laptop",hs1);
		list.put("Camera",hs2);
		list.put("Shoes", hs3);
		
		
//		System.out.println(list);
		
		System.out.println(getTagsForProduct(list,"Camera"));
		
		
		
		
		
	}
}
