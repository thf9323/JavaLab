package day6;

public class Tvtest4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//길이가 3인 tv객체 배열
		Tv[] tvarr = new Tv[3];
		
		for (int i=0; i <tvarr.length; i++) {
			tvarr[i] = new Tv();
			tvarr[i].channel =i +10;//각각 객체의 channel에 다른 값을 저장 
			
		}
		for (int i= 0; i<tvarr.length; i++) {
			tvarr[i].channelUp();//객체들마다 채널이 1씩 증가
			System.out.printf("tvarr[%d].channel= %d%n",i,tvarr[i].channel);
		}
	}

}
