package level1;

public class PushWord {
	public String push(String s, int n) {
		String answer = "";

		char[] arr = s.toCharArray();	
		
		int uni = 0;
		char uniChar;
		
		for (int i = 0; i < arr.length; i++) {
			uni = arr[i];
			boolean bool = Character.isUpperCase(arr[i]);

			//if not Space
			if(uni != 32) {
				// plus 1
				uni = uni + n;				
			
				// UpperCase
				if(bool == true) {
					if(uni > 90) {
						uni = uni - 26;
					}
				}
				// LowerCase
				else if(bool == false) {
					if(uni > 122) {
						uni -= 26;
					}
					
				}
			}else {
				uni = uni;
			}
			uniChar = (char)uni;
			answer += uniChar;
		}
		
      return answer;
	}
	
	public static void main(String[] args) {
		
		PushWord p = new PushWord();
		System.out.println(p.push("a B", 4));
		
	}

}
