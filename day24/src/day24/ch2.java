package day24;

public class ch2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr = { 5, 4, 3, 1, 2 };

		for (int i = 1; i <5; i++) {
			int j = i-1;
			int temp = arr[i];

			while (j >= 0  && temp < arr[j]) {
				arr[j+1]= arr[j];
				j--;
			}
			arr[j+1]= temp;

	}
		for(int each : arr) {
			System.out.print(each +" ");
		}
	}
}
	
