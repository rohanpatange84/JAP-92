package p2;

import java.util.ArrayList;
import java.util.HashSet;

public class Example02 {

	public static ArrayList<HashSet<Integer>> getUnic(int nums1[], int nums2[]) {

		HashSet<Integer> list1 = new HashSet<>();
		HashSet<Integer> list2 = new HashSet<>();
		ArrayList<HashSet<Integer>> res = new ArrayList<>();

		for (int i = 0; i < nums1.length; i++) {
			boolean light = true;
			for (int j = 0; j < nums2.length; j++) {
				if (nums1[i] == nums2[j]) {
					light = false;
					break;
				}
			}

			if (light) {
				list1.add(nums1[i]);
			}

		}

		for (int i = 0; i < nums2.length; i++) {
			boolean light = true;
			for (int j = 0; j < nums1.length; j++) {
				if (nums2[i] == nums1[j]) {
					light = false;
					break;
				}
			}

			if (light) {
				list2.add(nums2[i]);
			}

		}

		res.add(list1);
		res.add(list2);

		return res;

	}

	public static void main(String[] args) {
		int nums1[] = { 1, 2, 3 };
		int nums2[] = { 2, 4, 6 };

		System.out.println(getUnic(nums1, nums2));

		   int arr[] = {1, 1, 2, 3, 3};
	        int brr[] = {2, 4, 4, 6};

	        System.out.println(getUnic(arr, brr));
	}
}
