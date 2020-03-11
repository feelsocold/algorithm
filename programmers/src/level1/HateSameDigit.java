package level1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class HateSameDigit {
	public int[] hate(int[] arr) {
		int[] answer = {};
		int fore = -1;
		
		List<Integer> list = new ArrayList<>();
		
		for (int i = 0; i < arr.length; i++) {

			if(arr[i] != fore) {
				list.add(arr[i]);
			}
			fore = arr[i];
		}
		
		answer = new int[list.size()];
		int size = 0;
		for (Integer i : list) {
			answer[size++] = i;
		}

		return answer;
	}
	
	public static void main(String[] args) {
		HateSameDigit hsd = new HateSameDigit();
		int[] test = { 4, 4, 4, 3, 3 };
		int[] test2 = { 1,1,3,3,0,1,1 };
		int[] test3 = { 0,1,1,3,3,0,1,1 };
		
		//System.out.println("\nANSWER : " + Arrays.toString(hsd.hate(test)));
		//System.out.println("\nANSWER : " + Arrays.toString(hsd.hate(test2)));
		System.out.println("\nANSWER : " + Arrays.toString(hsd.hate(test3)));
	}

}
