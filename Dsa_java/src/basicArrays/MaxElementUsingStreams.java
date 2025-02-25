package basicArrays;

import java.util.Arrays;

public class MaxElementUsingStreams {
	public static void main(String[] args) {
		int [] arr= {1,4,6,7,2};
		int largest=Arrays.stream(arr).max().orElseThrow();
		System.out.println(largest);
		
		
	}

}
