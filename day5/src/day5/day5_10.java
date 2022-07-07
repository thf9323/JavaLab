package day5;
import java.util.*;
public class day5_10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] na = new int[10];
		int[] count = new int[10];
		
		Random random = new Random();// 객체생성

		for(int i=0; i<na.length; i++) {
			na[i] = random.nextInt(10); //0~10미만 까지
			System.out.print(na[i]);
		}
		System.out.println();
		
		for(int j=0; j<count.length; j++) {
				count[na[j]]++;
			
		}
		for (int i=0; i< na.length; i++) {
			System.out.println(i +"의 개수 : "+count[i]);
		}
		
		
	}

}
