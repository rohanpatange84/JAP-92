package p3;

import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class App {

	public static int largestEle(Queue<Integer> q, int k) {
		int p = q.size() - k;

		int larg = 0;
		while (!q.isEmpty() && p >= 0) {
			larg = q.poll();
//			 System.out.println(q.poll()+"  Done ...");
			p--;

		}

		return larg;

	}

	public static void main(String[] args) {

		int arr[] = { 110, 22, 105, 75, 65 };
		int k = 2;

		Queue<Integer> q1 = new PriorityQueue<>();

		for (int i = 0; i < arr.length; i++) {
			q1.add(arr[i]);
		}

		System.out.println(largestEle(q1, k));

	}

}