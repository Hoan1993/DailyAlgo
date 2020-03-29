package algo0318;

public class Code01_FailurRateException {
	
	public static void main(String[] args) {
		int n = 2;
		int [] stages = {1,1,1,3,2};
		int [] result = solution(n, stages);

		for(int i=0; i<result.length; i++) {
			System.out.print(result[i]+" ");
		}
	}
	

	
    public static int[] solution(int n, int[] stages) {
		double [] answer = new double[stages.length];
		double countFail = 0;
		double totalNum = stages.length;
		
		for(int i=1; i<=n; i++) {
			//System.out.println(totalNum+" "+countFail);
			countFail = 0;
			for(int j=0; j<stages.length; j++) {
				if(i==stages[j]) {
					countFail++;
				}
				
			}
			if(totalNum != 0) {
				answer[i-1] = countFail/totalNum;
				} else if(totalNum==0) {
					answer[i-1] = 0;
				}
				totalNum = totalNum - countFail;
			
		}

		// 여기서 answer배열을 tempAnswer이라는 n크기의 배열에 담는다
		double [] tempAnswer = new double[n];
		for(int i=0; i<n; i++) {
			tempAnswer[i] = answer[i];
		}

		int [] result = new int[n];
		
		for(int i=0; i<result.length; i++) {
			result[i] = i+1;
		}
		
		for (int i = tempAnswer.length - 1; i > 0; i--) {
			for (int j = 0; j < i; j++) {
				if (tempAnswer[j] < tempAnswer[j + 1]) {
					double temp = tempAnswer[j];
					tempAnswer[j] = tempAnswer[j + 1];
					tempAnswer[j + 1] = temp;

					int tmp = result[j];
					result[j] = result[j + 1];
					result[j + 1] = tmp;

				}
			}
		}

		return result;
    }
}
