package algo0224;

import java.util.Scanner;

public class Code03_SprialArray {
	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		int row = kb.nextInt();
		int colm = kb.nextInt();
		
		sprialArray(row, colm);
		
		kb.close();
		
	}

	private static void sprialArray(int row, int colm) {
		int [][] array = new int[row][colm];
		
		int count = 1;
		int i = 0;
		int j = 0;
		int flag = 0;
		
		while(true) {
			switch(flag) {
				case 0 :
					array[i][j++] = count++;
					if(j == colm || array[i][j] != 0) {
						j--;
						i++;
						flag = 1;
					}
					break;
				case 1 :
					array[i++][j] = count++;
					if(i == row || array[i][j] != 0) {
						i--;
						j--;
						flag = 2;
					}
					break;
				case 2 :
					array[i][j--] = count++;
					if(j == -1 || array[i][j] != 0) {
						j++;
						i--;
						flag = 3;
					}
					break;
				case 3 :
					array[i--][j] = count++;
					if(i == 0 || array[i][j] != 0) {
						i++;
						j++;
						flag = 0;
					}
					break;
			}
			if(count == (colm*row)+1) {
				break;	
			}
		}
		
		for(int x=0; x<array.length; x++) {
			for(int y=0; y<array[x].length; y++) {
				System.out.printf("%4d", array[x][y]);
			}
			System.out.println();
		}
		
		
	}
}
