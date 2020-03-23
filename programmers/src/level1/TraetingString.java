package level1;

import java.util.regex.Pattern;

public class TraetingString {
	public boolean solution(String s) {
		//answer = Pattern.matches("^[0-9]*$", s);
		boolean answer = (s.length()== 4 || s.length()==6) ? true : false;

		if(answer) {
			for (char c : s.toCharArray()) {
				if(Integer.valueOf(c) < 48 || Integer.valueOf(c) > 57) {
					answer = false;
					break;
				}	
			}
		}
		
		
		
		// 0: 48, 9: 57
		
		
		
		
		
		
		return answer;
	}
	
	public static void main(String[] args) {
		TraetingString treat = new TraetingString();
		
		System.out.println("\nANSWER : " + treat.solution("123a"));
	}

}
