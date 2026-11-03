package p2;

import java.util.ArrayList;
public class Demo {
	
	public static int digonalSum(ArrayList<ArrayList<Integer>>list) {

		int sum=0;
		
		for(int i=0;i<list.size();i++) {
			for(int j=0;j<list.get(i).size();j++) {
				if(i==j) {
					sum+=list.get(i).get(j);
				}
			}
		}
		
		return sum;
	}
	
		public static void main(String[] args) {
			
			
			
			
			ArrayList<ArrayList<Integer>> list = new ArrayList<ArrayList<Integer>>();
			
			ArrayList<Integer> mat1= new ArrayList<Integer>();
			mat1.add(11);
			mat1.add(12);
			mat1.add(13);
			
			ArrayList<Integer> mat2= new ArrayList<Integer>();
			mat2.add(10);
			mat2.add(20);
			mat2.add(30);
			
			ArrayList<Integer> mat3= new ArrayList<Integer>();
			
			mat3.add(99);
			mat3.add(88);
			mat3.add(77);
			
			list.add(mat1);
			list.add(mat2);
			list.add(mat3);
			
			
			System.out.println(digonalSum(list));
			
			
		}
}
