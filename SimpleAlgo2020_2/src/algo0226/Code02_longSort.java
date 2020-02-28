package algo0226;

import java.util.Arrays;

public class Code02_longSort {
	public static void main(String[] args) {
		long lg = 118372;
		String strLg = Long.toString(lg);
		
		System.out.println(strLg);
		
		//int [] i = new int[strLg.length()];
		String [] j = new String[strLg.length()];
		j = strLg.split("");
		
		
		for(int z=0; z< j.length; z++) {
			System.out.print(j[z]+", ");
		}
		System.out.println();
		longSort(j);
		
		for(int z=0; z< j.length; z++) {
			System.out.print(j[z]+", ");
		}
		System.out.println();
		
		
		String result = Arrays.toString(j);
		System.out.println(result);
		
		String join = String.join("", j);
		
		System.out.println(join);
		
		
		int realResult = Integer.parseInt(join);
		System.out.println(realResult);
	}

	private static void longSort(String[] arr) {
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr.length-1-i; j++) {
				if(arr[j].compareTo(arr[j+1]) < 0) {
					String temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}
		}
		
		
	}
}
