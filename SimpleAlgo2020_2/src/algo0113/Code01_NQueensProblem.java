package algo0113;

public class Code01_NQueensProblem {

	private static int N = 40;
	private static int [] cols = new int[N+1];
	

	public static void main(String[] args) {
		boolean result = queens(0);
		System.out.println(result);
	}

	private static boolean queens(int level) {
		if(!promising(level)) {
			return false;
		} else if(level == N){ 
			for(int i=1; i<= N; i++) 
				System.out.println("("+i+" , "+cols[i]+")");
			return true;
		} 
		for(int i=1; i<=N; i++) {
			cols[level+1] = i;
			if(queens(level+1)) 
				return true;
			
		}
		return false;
		
	}

	private static boolean promising(int level) {
		for(int i=1; i<level; i++) {
			if(cols[i] == cols[level]) 
				return false;
			else if(level-i == cols[level]-cols[i])
				return false;
		}
		return true;
	}

}
