package day5;
import java.util.*;
public class ex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int value = 0;
		int sum = 0;
		
		do {
			value = sc.nextInt();
			sum += value;
			
		} while (value < 100);
			System.out.println("sum :" +sum);
		
	}		
}
	
