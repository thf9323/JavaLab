package day7_1;

public class nnn {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i = 0;
		int sum = 0;
		
		
		for(i=1; i<=100; i++) {
			if(i%3==0) {
			sum += i;	
			System.out.printf("%d +%d = %d%n",i,i,i+i );

			}
		}
		System.out.println("합계는 :"+ sum);

	}

}
