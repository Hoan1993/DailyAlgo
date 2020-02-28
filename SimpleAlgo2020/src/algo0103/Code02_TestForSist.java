package algo0103;

public class Code02_TestForSist {

	public static void main(String[] args) {
		
		// 1. 콘솔 창에서 자바 소스코드 컴파일 하고 실행
		// javac Hello.java  ==> 
		// java Hello
		
		// 2. 자바의 기본자료형과 각 자료형의 크기 
		// byte -> 1바이트
		// short -> 2바이트
		// int -> 4바이트
		// long -> 8바이트
		
		// float -> 4바이트
		// double -> 8바이트
		
		// char -> 2바이트
		// boolean -> 1바이트
		
		// 3. 연산자(단항연사자) 코드 실행 후 결과값 옳은 것 고르기 
		int num1 = 10;
		System.out.println(num1++);  // ==> 10
		System.out.println(++num1);  // ==> 12
		
		
		// 4. 코드 실행 결과로 옳은 것 고르기
		float num2 = 15.123456f;
		System.out.printf("%.2f", num2); // 소수점 세자리까지 나온다.
		System.out.println();
		// 5. 코드 실행 결과로 옳은 것 찾기 - 반복문(while)
		
		// 6. 코드 내용 중 빈 칸에 들어갈 알맞은 코드 찾기 - 반복문(for문) 잘 보기
		// 가능한 문제1)

		int sum = 0;
		for(int i=1; i<=100; i++) {
			if(i%3 == 0) {
				sum += i;
			}
		}
		System.out.println(sum);
	
	
		// 7. 코드 실행 결과로 옳은 것 차직 - 반복문(while)
		
		// 8. 메서드 호출 시 출력되는 결과 옳은 것 찾기 - 신중하게 분석
		
		// 9. 상속, 인터페이스 관련 문제 순서대로 나열된 보기를 찾는 문제.
		
		// 10. 배열에서 내림차순 정렬 소스 빈칸에 들어갈 코드를 찾으시오.
		
		int [] test = new int[] {1,3,2,15,11};
		for(int i=test.length-1; i>0; i--) {
			for(int j=0; j<i; j++) {
				if(test[j] < test[j+1]) {
					int temp = test[j];
					test[j] = test[j+1];
					test[j+1] = temp;
				}
			}
		}
		
		for(int i=0; i<test.length; i++) {
			System.out.print(test[i]+" ");
		}
		
		
		
		
		
		
		
		
		
	}

}
