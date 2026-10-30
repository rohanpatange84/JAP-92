package p1;
import java.util.ArrayList;
public class Example001 {
	public static void main(String[] args) {
		
		ArrayList<String> list = new ArrayList<>();
		
		list.add("Rohan");
		list.add("Dinesh");
		list.add("Suraj");
		list.add("Tushar");
		list.add("Vivek");
		
		
		System.out.println(list);
		
		for(int i =0;i<list.size();i++) {
			for(int j=i+1;j<list.size();j++) {
				if(list.get(i).charAt(0)>list.get(j).charAt(0)) {
					String str = list.get(i);
					list.set(i, list.get(j));
					list.set(j, str);
				}
			}
		}
		
		System.out.println(list);
		
		
	}

}
