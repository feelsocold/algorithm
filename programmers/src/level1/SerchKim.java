package level1;


public class SerchKim {
	public String search(String[] seoul) {
		String answer = "";
		int index = 0;
		for (String s : seoul) {
			System.out.println(index);
			if(s.equals("Kim")) {
				answer = "김서방은 " + index + "에 있다";
				break;
			}
			index++;
		}
      return answer;
	}
	
	public static void main(String[] args) {
		
		SerchKim sk = new SerchKim();
		
		String[] seoul = {"Jane", "Kim", "lee"};
		
		System.out.println(sk.search(seoul));
		
		
	}

}
