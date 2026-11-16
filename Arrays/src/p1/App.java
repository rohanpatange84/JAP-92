package p1;
import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;
public class App {
		public static void main(String[] args) {
			int arr[]= {10,50,20,40,30};
			
			 int[] a = {10, 20, 30};
		        int[] b = {10, 20, 30};
		        int[] c = {10, 30, 20};

			
			  System.out.println("Array: " + Arrays.toString(arr));
			  
			   Arrays.sort(arr);
			  
			  System.out.println("Array: " + Arrays.toString(arr));
			  
			  System.out.println(Arrays.equals(a, b));
			  System.out.println(Arrays.equals(a, c));
			  
			  
			  int brr[]= new int[5];
			  
			   Arrays.fill(brr, 100);
			   
			   System.out.println(Arrays.toString(brr));
			   
			   int[] crr = {10, 20, 30, 40, 50};


		        Arrays.fill(crr, 1, 3, 99);
		        
		        System.out.println(Arrays.toString(crr));
		        
		        


		        int result = Arrays.binarySearch(arr, 30);


		        System.out.println("Element found at index: " + result);
		        
		        System.out.println("--------------------------------------");
		        int[] x = {10, 20, 30};


		        int[] newx = Arrays.copyOf(x, 5);


		        System.out.println("Original: " + Arrays.toString(x));
		        System.out.println("Copied: " + Arrays.toString(newx));
		        
		        
		        int[] y = {10, 20, 30, 40, 50, 60};


		        int[] newy = Arrays.copyOfRange(y, 1, 4);

		        System.out.println("--------------------------------------");


		        System.out.println(Arrays.toString(newy));
		        
		        System.out.println("--------------------------------------");

		        
		        
		        int[][] w = {
		                {10, 20, 30},
		                {40, 50, 60}
		            };


		            System.out.println(Arrays.deepToString(w));
		            
		          
		            int[][] aa = {
		                    {10, 20},
		                    {30, 40}
		                };


		                int[][] bb = {
		                    {10, 20},
		                    {30, 40}
		                };


		                
		                System.out.println(Arrays.deepEquals(aa, bb));
		                
		                
		                String[] zrr = {"Java", "Python", "C++"};


		                List<String> list = Arrays.asList(zrr);

		                System.out.println("--------------------------------------");

		                System.out.println(list);







		}
}
