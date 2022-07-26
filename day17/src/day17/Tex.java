package day17;

import java.util.*;

public class Tex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("요소수 : ");
		int a = sc.nextInt();
		int[] arr = new int[a];

		for (int i = 0; i < a; i++) {
			System.out.print("a[" + i + "]=");
			int arrno = sc.nextInt();

			arr[i] = arrno;
		}
		System.out.print("찾을 숫자 :");
		int no = sc.nextInt();
		for (int i = 0; i < no; i++) {

			if (arr[i] == no) {
				System.out.println("그 값은 " + "arr[" + i + "]" + "있습니다.");
				break;
			}
			if (i == arr.length-1) { // 4
				System.out.println("찾을 수없습니다.");
				break;
			}
		}

	}

//		if(==no) {
//			System.out.println("그 값은 "+arrno+"있습니다.");
//		}else {
//			System.out.println("찾을 수없습니다.");
//		}
//		System.out.print("a ={");
//		for (int i = 0; i < a.length - 1; i++) {
//			System.out.print(a[i] + ",");
//		}
//		System.out.println(a[input - 1] + "}");
}
