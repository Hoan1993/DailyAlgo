package algo1216;

import java.util.Scanner;

public class Code01_spiralArray {

	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);

		int row = kb.nextInt();
		int column = kb.nextInt();

		spiralArray(row, column);

		kb.close();

	}

	private static void spiralArray(int row, int column) {
		int[][] array = new int[row][column];

		int count = 0;
		int flag = 0;
		int i = 0, j = 0;
		while (true) {
			switch (flag) {
			case 0:
				array[i][j++] = count++;
				if (j == column || array[i][j] != 0) {
					j--;
					i++;
					flag = 1;
				}
				break;
			case 1:
				array[i++][j] = count++;
				if (i == row || array[i][j] != 0) {
					i--;
					j--;
					flag = 2;
				}
				break;
			case 2:
				array[i][j--] = count++;
				if (j == -1 || array[i][j] != 0) {
					i--;
					j++;
					flag = 3;
				}
				break;
			case 3:
				array[i--][j] = count++;
				if (i == 0 || array[i][j] != 0) {
					i++;
					j++;
					flag = 0;
				}
				break;

			}
			if (count == row * column) {
				break;
			}
		}

		for (i = 0; i < row; i++) {
			for (j = 0; j < column; j++) {
				System.out.printf("%3d ", array[i][j]);
			}
			System.out.println();
		}

	}

}
