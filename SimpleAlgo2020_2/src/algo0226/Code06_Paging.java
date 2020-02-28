package algo0226;

import java.util.Scanner;

public class Code06_Paging {
	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		
		int totalPage = kb.nextInt();
		int perPage = kb.nextInt();
		
		int result = totalPage/perPage;
		
		if(totalPage%perPage != 0) {
			result += 1;
		}
		
		System.out.println(result);
		
		kb.close();
	}
}
