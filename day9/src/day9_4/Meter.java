package day9_4;

public interface Meter {
	public int BASE_FARE = 3000;
	
	
	public void start();
	public int stop(int distance);
	public default void afterMidnight() {
		System.out.println("자정이 넘었습니다. 할증이 필요한 경우 이 메서드를 오버라이드 하세요");
	}
	
	
	
}
