package level1;


public class DigitAddition {
	public int digitAddition(int n) {
		int answer = 0;

		String numToS = n + "";
		
		for (int i = 0; i < numToS.length(); i++) {
			answer += Integer.parseInt(String.valueOf(numToS.charAt(i)));
		}
		
      return answer;
	}
	
	public static void main(String[] args) {
		DigitAddition addition = new DigitAddition();
		System.out.println(addition.digitAddition(123));
	}

}
