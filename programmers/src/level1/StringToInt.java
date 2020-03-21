package level1;

public class StringToInt {
	public int toInt(String s) {
		int answer = 0;
				
		/*
		char sign = s.charAt(0);
		
		if("-".equals(Character.toString(sign))) {
			return answer = Integer.parseInt(s.substring(1)) * -1; 
		}else{
			return answer = Integer.parseInt(s.substring(1));	
		} */
		return Integer.parseInt(s);
	}
	
	public static void main(String[] args) {
		StringToInt to = new StringToInt();
		//System.out.println("\nANSWER : " + to.toInt("1234"));
		//System.out.println("\nANSWER : " + to.toInt("+1234"));
		System.out.println("\nANSWER : " + to.toInt("-1234"));
	}

}
