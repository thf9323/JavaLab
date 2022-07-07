package day6;

public class tvTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 객체 생성,tv클래스로  tv 인스턴스 생성
		
		
		Tv t1 = new Tv();
		Tv t2 = new Tv();
		
		t1.channel = 7;
		t2.channel = 11;
		
		t1.channelDown(); // 하나 내림 7 -> 6
		t2.channelUp();// channel 변경 하나 내림 7 -> 6
		
		System.out.println("현재 채널" + t1.channel);
		System.out.println("현재 채널" + t2.channel);
		

	}
	

}
