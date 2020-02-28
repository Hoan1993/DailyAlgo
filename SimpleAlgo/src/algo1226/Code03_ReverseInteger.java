package algo1226;

import java.util.Arrays;
import java.util.Collections;

public class Code03_ReverseInteger {

	public static void main(String[] args) {
		System.out.println(solution(1234561112));
		

	}

	  public static long solution(long n) {
	      long answer = 0;
	      
	      String strN = Long.toString(n);
	      String [] temp = strN.split("");
	      Arrays.sort(temp);
	      Collections.reverse(Arrays.asList(temp));
	      String an = String.join("", temp);
	      answer = Long.parseLong(an);
	      return answer;
	  }

}
