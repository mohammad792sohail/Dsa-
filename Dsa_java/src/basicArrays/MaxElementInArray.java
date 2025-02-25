package basicArrays;

public class MaxElementInArray {
	public static void main(String[] args) {
		int [] arr= {2,5,3,6,9};
		int largest=largestelement(arr);
		System.out.println(largest);
	}

	private static int largestelement(int[] arr) {
		int lar=1;
		for (int i=0; i<arr.length; i++) {
			if(arr[i]>lar) {
				lar=arr[i];
			}
		}
		return lar;
		
	}

	
}