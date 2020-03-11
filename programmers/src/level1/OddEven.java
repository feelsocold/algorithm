package level1;


public class OddEven {
	public String oddEven(int num) {
		String answer = "";
		answer = (num%2 == 0) ? "Even" : "Odd";
      return answer;
	}
	
	public static void main(String[] args) {
		OddEven oE = new OddEven();
		System.out.println(oE.oddEven(3));
	}

}
