package day23;

public class ch1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arrD = { 12, 25, 36, 20, 30, 8, 42 };
		int[] arrH = new int[11];
		
		int x = 12;

		for (int i = 0; i < arrD.length; i++) {
			int k = arrD[i] % 11;

			while (true) {
				if (arrH[k] != 0) {
					k = (k + 1) % 11;
				} else {
					arrH[k] = arrD[i];
					break;
				}
			}
		}

		for(x = 0; x <arrH.length; x++) {
			System.out.printf("%d ",arrH[x]);
			System.out.println("의 저장 위치는 "+ x +"번째 입니다.");

		}
	}
}