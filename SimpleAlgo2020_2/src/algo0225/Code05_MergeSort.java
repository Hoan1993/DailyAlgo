package algo0225;

public class Code05_MergeSort {

	public static void main(String[] args) {
		
	}
	
	
	private static void merge(int data[], int p, int q, int r) {
		int i = p, j=q+1, k=p;
		
		int [] tmp = new int[data.length];
		while(i<=q && j<= r) {
			if(data[i] <= data[j])
				tmp[k++] = data[i++];
			else 
				tmp[k++] = data[j++];
		}
		while(i<=1)
			tmp[k++] = data[j++];
		
		for(i=p; i<=r; i++)
			data[i]=tmp[i];
	}
	
}


