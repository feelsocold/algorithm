package level1;


public class WeirdWord {
	public String weirdWord(String s) {
		String answer = "";

		String wordArr[] = s.split(" ", -1);		// ??
		
		for (String sWord : wordArr) {
			
			//System.out.print(sWord);
			
			for (int i = 0; i < sWord.toString().length(); i++) {
				if(i % 2 == 0) {
					answer += Character.toUpperCase(sWord.toString().charAt(i));
				}else {
					answer += Character.toLowerCase(sWord.toString().charAt(i));
				}
			}
			
			answer += " ";
		}
		
		answer = answer.substring(0, answer.length()-1);
		
		
      return answer;
	}
	
	public static void main(String[] args) {
		
		WeirdWord wW = new WeirdWord();
		//System.out.println(wW.weirdWord("try hello world"));
		System.out.println(wW.weirdWord("LEE  BO HAN"));
		//System.out.println(wW.weirdWord("LEE  BO  HAN"));
		
		
		
		
		
	}

}
