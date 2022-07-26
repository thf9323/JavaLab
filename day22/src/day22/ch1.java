package day22;

public class ch1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {11,13,17,18,23,29,31};
		int ans = 17;
		
		int result = bsearch(arr, ans);
		
		if(result != -1) {
			System.out.println(result + "번째 요소 일치");
		}else {
			System.out.println("찾는 값이 없습니다.");
		}
	}
	public static int bsearch(int[] arr, int ans) {
		
		int head = 0;
		int tail = 6;
		while(head<=tail) {
			int center = (head+tail)/2;
			
			
			
			if(arr[center] == ans) {
				
				return center;
			}else if(arr[center]<17) {
				head = center+1;
			}else {
				tail = center-1;
				
			}
			
		}
		return -1;
		
	}
}


