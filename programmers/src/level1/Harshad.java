package level1;

public class Harshad {
	public boolean solution(int x) {
		boolean answer = false;
		int sum = 0;
		for (char c : (String.valueOf(x)).toCharArray()) {
			sum += (Integer.valueOf(c) - 48);
		}
		answer = (x % sum == 0) ? true : false;
		
		return answer;
	}
	
	public static void main(String[] args) {
		Harshad hs = new Harshad();
	
		System.out.println("\nANSWER : " + hs.solution(12));
	}

}
