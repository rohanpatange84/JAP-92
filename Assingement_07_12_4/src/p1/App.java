package p1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class App {

	public static HashMap<String, Integer> getRatingsForActress(ArrayList<HashMap> list, String actress) {
		HashMap<String, Integer> res = null;

		HashMap<String, HashMap<String, Integer>> res2;

		for (HashMap ls : list) {

			Set<Map.Entry<String, HashMap<String, Integer>>> entries = ls.entrySet();
			Iterator<Map.Entry<String, HashMap<String, Integer>>> itr = entries.iterator();

			while (itr.hasNext()) {
				Map.Entry<String, HashMap<String, Integer>> entryObj = itr.next();
				if (entryObj.getKey().equals(actress)) {
					res = entryObj.getValue();
					return res;

				}

			}

		}
		
		return res;

	}

	

	

	public static void main(String[] args) {

		ArrayList<HashMap> list = new ArrayList<>();

		HashMap<String, Integer> h1 = new HashMap<>();
		HashMap<String, Integer> h2 = new HashMap<>();
		HashMap<String, Integer> h3 = new HashMap<>();

		h1.put("Acting", 95);
		h1.put("Dance", 88);
		h1.put("Fitness", 92);

		h2.put("Acting", 92);
		h2.put("Dance", 85);
		h2.put("Fitness", 87);

		h3.put("Acting", 85);
		h3.put("Dance", 90);
		h3.put("Fitness", 94);

		HashMap<String, HashMap<String, Integer>> actor1 = new HashMap<>();
		HashMap<String, HashMap<String, Integer>> actor2 = new HashMap<>();
		HashMap<String, HashMap<String, Integer>> actor3 = new HashMap<>();

		actor1.put("Deepika Padukone", h1);
		actor2.put("Alia Bhatt", h2);
		actor3.put("Katrina Kaif", h3);

//		System.out.println(actor1);

		list.add(actor1);
		list.add(actor2);
		list.add(actor3);

//		System.out.println(list);

		System.out.println(getRatingsForActress(list,"Alia Bhatt"));

	}
}
