package day15;
import java.util.*;
public class sq {

	public static void main(String[] args) {
		int a;
		int b;
		Scanner sc =new Scanner(System.in);
		System.out.println("a와 b를 입력하세요");
		// TODO Auto-generated method stub
		System.out.print("a :");
		a= sc.nextInt();
		System.out.print("b :");
		b= sc.nextInt();
		
		
		if(a>b) {
			System.out.println("a가 더 크다");
		}else
		System.out.println("b가 더 크다");
	}

}
