package programmers.level1;


public class Watermelon {
	public String watermelon(int n) {
		String answer = "";
		String waterMelon = "수박";
      
		int cnt = 0;
		cnt = n / 2;
		
		for (int i = 0; i < cnt; i++) {
			answer += waterMelon;
		}

		if(n % 2 != 0) {
			answer += "수";
		}
      return answer;
	}
	
	public static void main(String[] args) {
		
		Watermelon wm = new Watermelon();
		System.out.println(wm.watermelon(2));
		System.out.println(wm.watermelon(5));
		System.out.println(wm.watermelon(7));
	}

}
