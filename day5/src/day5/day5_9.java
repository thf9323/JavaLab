package day5;

public class day5_9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] na =new int[10];
		int temp = 0;
		int j = 0;
		
		for(int i=0; i< na.length; i++) {
			na[i] = i;
			System.out.print( na[i]);
		}
		System.out.println();
		
		for(int i=0; i<100; i++) {
			j = (int)(Math.random()*10);
			temp= na[0];
			na[0]= na[j];
			na[j]= temp;			
		}
		for (int i=0; i< na.length; i++) {
			System.out.print(na[i]);
		}
		
		
		
//		int[] ball = new int[45];
//		int temp = 0;
//		int j = 0;
//		
//		for(int i= 0; i < ball.length; i++) {
//			ball[i]= i+1;
//			
//			
//		}
//		for(int i= 0; i<6; i++) {
//			j = (int)(Math.random() * 45);
//			temp =ball[i];
//			ball[i]= ball[j];
//			ball[j]= temp;
//		}
//		for(int i=0; i<6; i++) {
//			System.out.printf("ball[%d] =%d%n ",i,ball[i]);
//		}

	}

}
