package algo1224;

public class Code02_JustSimpleTest {

	public static void main(String[] args) {
		long a = 1234;
		int [] temp =solution(a);
		for(int i=0; i<temp.length; i++) {
			System.out.print(temp[i]+", ");
		}
	}
	
	  public static int[] solution(long n) {
	      int[] answer = {};
	      String strN= String.valueOf(n);
	      String [] temp = strN.split("");
	      //System.out.println(temp[3]);
	      for(int i=temp.length-1; i>0; i--) {
	          for(int j=0; j<i; j++) {
	              if(temp[j].compareTo(temp[j+1]) < 0) {
	                  String tem = temp[j];
	                  temp[j] = temp[j+1];
	                  temp[j+1] = tem;
	              }
	          }
	      }
	      for(int i=0; i<temp.length; i++) {
	    	  System.out.print(temp[i]+", ");
	      }
	      
	      answer = new int[temp.length];
	      for(int i=0; i<temp.length; i++) {
	          answer[i] = Integer.parseInt(temp[i]);
	      }
	    
	      return answer;
	  }

}
