package algo0220;

public class Code02_SpecialSort {
	public static void main(String[] args) {
		int [] array = {-1, 1, 3, -2, 2};
		specialSort(array);
		
		for(int i=0; i<array.length; i++) {
			System.out.print(array[i]+", ");
		}
		System.out.println();
		bubbleSort(array);
		
		for(int i=0; i<array.length; i++) {
			System.out.print(array[i]+", ");
		}
		
		
	}

	private static void specialSort(int[] array) {
		int temp = 0;
		for(int i=0; i<array.length; i++) {
			for(int j=0; j<array.length-1-i; j++) {
				if(array[j] > 0 && array[j+1] < 0) {
					temp = array[j];
					array[j] = array[j+1];
					array[j+1] = temp;
				}
			}
		}
			
	}

	
	private static void bubbleSort(int[] array) {
		int temp = 0;
		for(int i=0; i<array.length; i++) {
			for(int j=0; j<array.length-1-i; j++) {
				if(array[j] > array[j+1]) {
					temp = array[j];
					array[j] = array[j+1];
					array[j+1] = temp;
				}
			}
		}
		
		
	}
	

	
}
