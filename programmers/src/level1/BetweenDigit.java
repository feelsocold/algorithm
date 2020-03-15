package level1;

public class BetweenDigit {
	public long between(int a, int b) {
		long answer = 0L;
		
		long big = (a > b) ? a : b;
		long small = (a < b) ? a : b;
		
		for (long i = small; i <= big; i++) {
			answer += i;
		}
		
		return answer;
	}
	
	public static void main(String[] args) {
		BetweenDigit BD = new BetweenDigit();
	
		System.out.println("\nANSWER : " + BD.between(3, 3));
	}

}
