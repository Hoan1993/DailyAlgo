package algo0316;

public class Code01_SecretMap01 {
	public static void main(String[] args) {
		int n = 5;
		int [] arr1 = {1, 20, 28, 18, 11};
		int [] arr2 = {30, 1, 21, 17, 28};
		
		String [] answer = solution(n, arr1, arr2);
		
		for(int i=0; i<answer.length; i++) {
			System.out.println(answer[i]);
		}
	}

	private static String[] solution(int n, int[] arr1, int[] arr2) {
		// TODO Auto-generated method stub
		String [] binaryArr1 = new String[n];
		String [] binaryArr2 = new String[n];
		
		for(int i=0; i<arr1.length; i++) {
			binaryArr1[i] = Integer.toBinaryString(arr1[i]);
			binaryArr2[i] = Integer.toBinaryString(arr2[i]);
		}
		
		for(int i=0; i<binaryArr1.length; i++) {
			System.out.println(binaryArr1[i]);
		}
		System.out.println();
		for(int i=0; i<binaryArr1.length; i++) {
			while(binaryArr1[i].length() != n) {
				binaryArr1[i] = "0"+binaryArr1[i];
			}
			
			while(binaryArr2[i].length() != n) {
				binaryArr2[i] = "0"+binaryArr2[i];
			}
		}
		
		for(int i=0; i<binaryArr1.length; i++) {
			System.out.println(binaryArr1[i]);
			System.out.println(binaryArr2[i]);
		}
		System.out.println();
		
		char [][] doubleArr1 = new char[n][n];
		char [][] doubleArr2 = new char[n][n];
		
		for(int i=0; i<n; i++) {
			for(int j=0; j<n; j++) {
				doubleArr1[i][j] = binaryArr1[i].charAt(j);
				doubleArr2[i][j] = binaryArr2[i].charAt(j);
			}
		}
		
		for(int i=0; i<n; i++) {
			for(int j=0; j<n; j++) {
				System.out.print(doubleArr1[i][j]+" ");
			}
			System.out.println();
		}
		System.out.println();
		
		for(int i=0; i<n; i++) {
			for(int j=0; j<n; j++) {
				System.out.print(doubleArr2[i][j]+" ");
			}
			System.out.println();
		}
		String [] result = new String[n]; 
		for(int i=0; i<n; i++) {
			String tempStr = "";
			for(int j=0; j<n; j++) {
				if(doubleArr1[i][j] == '1' || doubleArr2[i][j] == '1') {
					tempStr += "#";
				} else {
					tempStr += " ";
				}
			
			}
			result[i] = tempStr;
		}
		
		
		
		for(int i=0; i<result.length; i++) {
			System.out.println(result[i]+" ");
		}
		
		
		
		return result;
	}
}
