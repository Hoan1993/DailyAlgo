package algo0220;

public class Review {
	public static void main(String[] args) {
		int [] array = {-1, 2, -2, 3, 1, 4};
		specialSort(array);
		
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

}
