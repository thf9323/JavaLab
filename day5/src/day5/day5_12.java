package day5;
import java.util.*;
public class day5_12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String src = "ABCDE";
		
		for(int i=0; i <src.length(); i++) {
			char ch = src.charAt(i);
			System.out.println("src.charAt("+i+"): "+ch);
		}
		char[] chArr = src.toCharArray();
		System.out.println(chArr);
		
	}

}
// 글자 비교는 .equals(abc)