package javastudy;

public class MyCal implements Calculator {

	@Override//에너테이션
	public int plus(int i, int j) {
		// TODO Auto-generated method stub
		
		return i+j;
	
	}

	@Override
	public int multiple(int i, int j) {
		// TODO Auto-generated method stub
		return i*j;
	}

}
