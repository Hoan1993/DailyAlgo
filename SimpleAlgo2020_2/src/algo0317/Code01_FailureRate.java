package algo0317;

public class Code01_FailureRate {

	public static void main(String[] args) {
		int n = 4;
		int [] stages = {4,4,4,4,4};
		int [] result = solution(n, stages);

		for(int i=0; i<result.length; i++) {
			System.out.print(result[i]+" ");
		}
	}

	private static int[] solution(int n, int[] stages) {
		double [] answer = new double[stages.length];
		double countFail = 0;
		double totalNum = stages.length;
		
		System.out.println(totalNum);
		
		for(int i=1; i<=n; i++) {
			//System.out.println(totalNum+" "+countFail);
			countFail = 0;
			for(int j=0; j<stages.length; j++) {
				if(i==stages[j]) {
					countFail++;
				}
				
			}
			if(totalNum != 0) {
				System.out.println("countFail은 "+countFail+" totalNum은 "+totalNum);
				answer[i-1] = countFail/totalNum;
				System.out.println("결과값  =>"+i+" "+answer[i]);
				} else {
					answer[i] = 0;
				}
				totalNum = totalNum - countFail;
			
		}
		System.out.println("이건 테스트");
		for(int i=0; i<answer.length; i++) {
			System.out.print(answer[i]+" ");
		}
		System.out.println();
		
		
		
		
		
		

		
		// 여기서 answer배열을 tempAnswer이라는 n크기의 배열에 담는다
		double [] tempAnswer = new double[n];
		for(int i=0; i<n; i++) {
			tempAnswer[i] = answer[i];
		}
		
		System.out.println("두번쨰 테스트");
		for(int i=0; i<tempAnswer.length; i++) {
			System.out.print(tempAnswer[i]+" ");
		}
		System.out.println();
		
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
		System.out.println("이게 마지막 테스트이길...");
		for(int i=0;i<result.length; i++) {
			System.out.println(result[i]+" ");
		}
		System.out.println();
		
		
		
		return result;
	}

}
