/*
 3 :Remove Duplicate Characters from a String

Input:  programming

Expected output: progamin

 */

package p2;

import java.util.LinkedHashMap;

public class Example03 {

	public static String removeDuplicate(String str) {

		LinkedHashMap<Character,Integer> list = new LinkedHashMap<>();
		String newStr = "";

		for (int i = 0; i < str.length(); i++) {
			if (list.put(str.charAt(i),i)==null) {
				newStr += str.charAt(i);
			}

		}

		return newStr;
	}

	public static void main(String[] args) {
		String str = "programming";

		System.out.println(removeDuplicate(str));

	}
}

