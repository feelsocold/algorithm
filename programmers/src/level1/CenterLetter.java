package level1;


public class CenterLetter {
	public String centerLetter(String s) {
		String answer = "";
		
		int cnt = (s.length() % 2 == 0) ? (s.length() - 2) / 2 : Math.round(s.length() / 2);  
			
			for (int i = 0; i < cnt; i++) {
				s = s.substring(1);					// 첫번째 글자 cut
				s = s.substring(0, s.length()-1);	// 마지막 글자 cut
			}
		answer = s;
		
      return answer;
	}
	
	public static void main(String[] args) {
		CenterLetter center = new CenterLetter();
		System.out.println(center.centerLetter("abcde"));
		System.out.println(center.centerLetter("abcd"));
		
	}

}
