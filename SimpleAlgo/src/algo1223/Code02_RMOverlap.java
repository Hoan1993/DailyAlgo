package algo1223;

import java.util.ArrayList;
import java.util.List;

public class Code02_RMOverlap {

	public static void main(String[] args) {
		int[] arr = new int[] { 1, 1, 2, 3, 3, 4, 4, 3, 3 };
		// 결과값은 ==> 1, 2, 3, 4, 3
		int w = 0;

		List<Integer> list = new ArrayList<Integer>(1);

		
		for (int i = 0; i < arr.length; i++) {
			if (i == 0 || arr[i] != arr[i - 1]) {
				list.add(arr[i]);
				w++;
			}
		}

		for (int i = 0; i < list.size(); i++) {
			System.out.print(list.get(i) + " ");
		}
		System.out.println();
		System.out.println(w);
		
		
		
		

	}

}
