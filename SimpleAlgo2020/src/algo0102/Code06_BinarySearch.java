package algo0102;

import java.util.Arrays;

public class Code06_BinarySearch {
	public static void main(String[] args) {
		String [] arr = new String[] {"lion", "cat", "dog"};
		String target = "lion";
	
		Arrays.sort(arr);
	
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i]+", ");
		}
		int a = findString(arr, target, 0, arr.length-1);
		System.out.println(a);
	}

	private static int findString(String[] arr, String target, int begin, int end) {
		if(begin > end) {
			return -1;
		} else {
			int middle = (begin+end)/2;
			int compareNum = target.compareTo(arr[middle]);
			if(compareNum == 0) {
				return middle;
			} else if(compareNum < 0) {
				return findString(arr, target, begin,middle-1);
			} else {
				return findString(arr, target, middle+1, end);
			}
			
			
		}
	
	}
}
