package level1;


public class PrimeNumber {
	public int solution(int n) {
		int answer = 0;
		int cnt = 1;
		
		for (int i = 2; i <= n; i++) {
			for (int j = 2; j < i; j++) {
				if( (i % j == 0)) {
					System.out.print(i + ", ");
					cnt++;
					break;
				}
			}
		}
			answer = n - cnt;
		
		
		
      return answer;
	}
	
	public static void main(String[] args) {
		PrimeNumber prime = new PrimeNumber();
		System.out.println("\n ANSWER : " + prime.solution(10));
	}

}
