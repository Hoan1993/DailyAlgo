package algo1224;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;

public class Code01_SplitString {

	public static void main(String[] args) {
		String [] test = new String[] {"이유덕","이재영","권종표","이재영","박민호",
									"강상희","이재영","김지완","최승혁","이성연","박영서",
									"박민호","전경헌","송정환","김재성","이유덕","전경헌"};
		// 김씨, 이씨 성이 각각 몇 명 있는지
		int countKim = countN(test, "김");
		int countLee = countN(test, "이");
		// 이재영이 몇 명 있는지
		int countLJY = countFN(test, "이재영");
		
		System.out.println(countKim);
		System.out.println(countLee);
		System.out.println(countLJY);
		
		// 중복제거
		HashSet <String> hs = new HashSet<String>();
		hs = distinctArray(test);
		
		
		// 오름차순 정렬 및 출력.
		List<String> arr = new ArrayList<>(hs);
		Collections.sort(arr);
		
		for(String s : arr) {
			System.out.print(s+" ");
		}
		


	}

	private static HashSet<String> distinctArray(String[] test) {
		HashSet<String> hs = new HashSet<>();
		for(int i=0; i<test.length; i++) {
			hs.add(test[i]);
		}
		System.out.println(hs.toString());
		return hs;
		
	}

	private static int countFN(String[] test, String string) {
		int count = 0;
		for(int i=0; i<test.length; i++) {
			String temp = test[i];
			if(temp.equals(string)) {
				count++;
			}
		}
		return count;
	}

	private static int countN(String [] test, String findName) {
		int count = 0;
		for(int i=0; i<test.length; i++) {
			String [] temp= test[i].split("");
			if(temp[0].equals(findName) || temp[0].equals(findName)) {
				count++;
			}
		}
		
		return count;
		
	}

}
