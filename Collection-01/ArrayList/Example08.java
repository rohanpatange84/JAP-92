import java.util.ArrayList;

public class Example08{
	public static void main(String[] args) {
		
		ArrayList<Integer> list1 = new ArrayList<>();

		for(int i=1;i<=10;i++){
			list1.add(i);
		}


		ArrayList<Integer> list2 = new ArrayList<>();

		for(int i=11;i<=20;i++){
			list2.add(i);
		}

		System.out.println(list1);
		System.out.println(list2);

		ArrayList<Integer> list3 = new ArrayList<>(list1);

		list3.add(0,99);

		System.out.println(list3);

		list3.addAll(2,list2);

		System.out.println(list3);
	}
}