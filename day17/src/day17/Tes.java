package day17;
import java.util.*;
public class Tes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.print("사람 수 : ");
		int a = scan.nextInt();
		int sum = 0;
		int avr = 0;
		int arr[] = new int[a];
		
		System.out.println("점수를 입력하세요");
		for(int i=0; i<a; i++) {
			System.out.print((i+1)+"번의 점수 =" );
			int arrno = scan.nextInt();
			arr[i] =arrno;
			sum += arrno;
			
			
			
			
			
			
		}
		int max = arr[0];
		int min = arr[0];
		for (int i = 1; i < arr.length; i++) {
			if (max < arr[i]) {
				max = arr[i];
			} 
			if (min > arr[i]) {
				min = arr[i];
			}
		}
		System.out.println("합계는 "+sum+ "입니다.");
		System.out.println("평균는 "+(sum/a)+ "입니다.");
		System.out.println("최고점는 "+max+ "입니다.");
		System.out.println("최저점는 "+min+ "입니다.");
//		System.out.print("a = {");
//		for (int j= 0; j<arr.length -1; j++) {
//			System.out.print(arr[j] + ", ");
//			
//		}
//		System.out.println(arr[arr.length-1]+ "}");
//

	}

}
