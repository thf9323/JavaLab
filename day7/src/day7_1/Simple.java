package day7_1;
import java.util.*;
public class Simple {

	public static void main(String[] args) {
		
		 Scanner sc = new Scanner(System.in);


		 String xString = "i";

		 while(true) {
			 System.out.println("월을 입력해주세요.>");

			 int month = sc.nextInt();


		 switch (month) {
			 case 1: xString = "January";
					 break;
			 case 2: xString = "February";
			 break;
			 case 3: xString = "JMarch";
			 break;
			 case 4: xString = "April";
			 break;
			 case 5: xString = "May";
			 break;
			 case 6: xString = "June";
			 break;
			 case 7: xString = "July";
			 break;
			 case 8: xString = "August";
			 break;
			 case 9: xString = "September";
			 break;
			 case 10: xString = "October";
			 break;
			 case 11: xString = "November";
			 break;
			 case 12: xString = "December";
			 break;
			 default: xString = "Invalid month";
			 break;
		 }
		 System.out.println(xString);
		 if(month==0) {
			 break;
		 }
		 } System.out.println("종료합니다.");
	}

}
