package Euclidean;

import java.util.*;

public class Euclidean {

	public static void main(String[] args) {

		int r;
		Scanner sc = new Scanner(System.in);
		System.out.println("숫자를 입력하세요 :" + " ");
		int a = sc.nextInt();
		int b = sc.nextInt();
		r = a % b;
		while (r != 0) {
			if (r == 0) {

			} else {
				a = b;
				b = r;
				

			}
break;
		}
		System.out.print(a + " 와 " + b + "최대 공약수는 " + b + "입니다.");

	}

}
