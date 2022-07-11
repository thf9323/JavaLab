package day8;

public class CastingTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car car =null;
		FireEngine fe = new FireEngine();
		FireEngine fe2 = null;
		
		fe.water();
		car = fe;
	//	car.water();
		fe2 = (FireEngine)car;
		fe2.water();

	}

}
