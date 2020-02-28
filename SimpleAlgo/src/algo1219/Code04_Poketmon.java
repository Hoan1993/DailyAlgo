package algo1219;

import java.util.Arrays;

public class Code04_Poketmon {
	
	static int capacity = 1;
	static int [] word = new int[capacity];
	static int [] count = new int[capacity]; 
	static int n=0;
	
	public static void main(String[] args) {
		int [] nums = new int[]{3,1,2,3};

		Arrays.sort(nums);
		
		for(int i=0; i<nums.length; i++) {
			System.out.print(nums[i]+" ");
		}
		System.out.println();
		
		for(int i=0; i<nums.length; i++) {
			addWord(nums[i]);
		}
		
		
		System.out.println(n);
		
	
		}
	
	private static int findWord(int num) {
		for(int i=0; i<n; i++) {
			if(word[i] == num) {
				return i;
			}
		}	
		return -1;
	}
	
	private static void addWord(int next) {
		int index = findWord(next);
		if(n >= capacity ) {
			reallocate();
		}
		
		
		if(index != -1) {
			count[index] += 1;
			return;
			
		}
		word[n] = next;
		count[n] += 1;
		n++;			
	}



	private static void reallocate() {
		capacity = capacity*2;
		int [] temp = new int[capacity];
		int [] temp2 = new int[capacity];
		
		for(int i=0; i<word.length; i++) {
			temp[i] = word[i];
			temp2[i] = count[i];
		}
		
		word = temp;
		count = temp2;
 		
	}

	
}
