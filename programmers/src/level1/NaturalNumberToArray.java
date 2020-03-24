package level1;
import java.util.*;
public class NaturalNumberToArray {
	public int[] solution(long n) {
		int[] answer = {};
				
		String arr[] = String.valueOf(n).split("");
		List<Integer> list = new ArrayList<Integer>();
		
		for (String s : arr) {
			list.add(Integer.parseInt(s));
		}
		Collections.reverse(list);
		
		answer = new int[list.size()];
		
		int size = 0;
		for (Integer i : list) {
			answer[size++] = i;
		}
	
		return answer;
	}
	
	public static void main(String[] args) {
		NaturalNumberToArray nNt = new NaturalNumberToArray();
		
		System.out.println("\nANSWER : " + Arrays.toString(nNt.solution(12345)));
	}

}
