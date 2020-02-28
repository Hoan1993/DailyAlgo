package algo0106;

public class Code01_CountsInABlob {

	private static int [][] binary_image = {
			{1, 0, 0, 0, 0, 0, 0, 1, 0, 1},
			{0, 0, 1, 0, 1, 1, 0, 1, 0, 0},
			{0, 0, 0, 1, 0, 0, 0, 1, 1, 0},
			{0, 1, 0, 0, 0, 1, 0, 0, 0, 0},
			{0, 1, 1, 1, 0, 0, 1, 1, 1, 0},
			{0, 1, 0, 0, 0, 1, 0, 1, 1, 1},
			{0, 0, 0, 1, 0, 0, 0, 1, 0, 0},
			{0, 1, 1, 1, 0, 1, 0, 0, 1, 0},
			{0, 1, 1, 1, 0, 1, 0, 1, 1, 0},
			{0, 1, 1, 1, 0, 1, 0, 0, 0, 1}
	};
	
	private static int N = 10;
	
	//private static int blank = 0;
	private static int image = 1;
	private static int counted = 2;
	

	
	public static void main(String[] args) {
		int counts =CountsBlob(9,1);
		System.out.println(counts);
	}



	private static int CountsBlob(int x, int y) {
		//int counts = 0;
		if(x < 0 || y < 0 || x >= N || y >= N) {
			return 0;
		} else if(binary_image[x][y] != image) {
			return 0;
		} else {
	
			binary_image[x][y] = counted;
			 return 1+CountsBlob(x, y-1)+CountsBlob(x-1, y-1)
					 		+CountsBlob(x+1, y)+CountsBlob(x+1, y+1)
					 		+CountsBlob(x, y+1)+CountsBlob(x+1, y+1)
					 		+CountsBlob(x-1, y)+CountsBlob(x-1, y-1);
		}
		
	//	return counts;
		
	}

}
