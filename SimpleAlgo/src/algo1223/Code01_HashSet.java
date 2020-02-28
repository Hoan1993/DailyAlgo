package algo1223;

import java.util.HashSet;

public class Code01_HashSet {

	public static void main(String[] args) {
		int [] arr = new int[] {1,3,3,2,3,3,3};
		HashSet<Integer> hs = new HashSet<>();
		
		for(int i=0; i<arr.length; i++) {
			hs.add(arr[i]);
		}
		
		System.out.println(hs.size());
		
		System.out.println(hs.toString());

	}

}
