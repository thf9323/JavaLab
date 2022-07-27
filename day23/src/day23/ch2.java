package day23;

public class ch2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr= {12,13,11,14,10};//13 11 14 10 ->11 14 10 12
		System.out.println("정렬 전");
		for (int each : arr) {
			System.out.print(each + " ");
		}
		System.out.println();
		System.out.println();
		for(int i = 0; i<4; i++) {
			int min = i;
			for(int k=i+1; k<5; k++) {
				if(arr[k]<arr[min]) {
					min = k;
				}
			}
			int temp =arr[min];
			arr[min] = arr[i];
			arr[i]= temp;
		
			//전체를 하나씩 가져와 출력
			for (int each : arr) {
				System.out.print(each + " ");
			}
			System.out.println();
		}
		for(int j=0; j<arr.length; j++) {
			System.out.print(arr[j]+" ");
		}
	}
}