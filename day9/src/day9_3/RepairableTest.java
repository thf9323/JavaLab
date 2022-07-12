package day9_3;

public class RepairableTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Tank tank = new Tank();
		Dropship dropship = new Dropship();
		
		Marin marin =new Marin();
		SCV scv = new SCV();
		
		scv.repair(tank);
		scv.repair(dropship);
		//scv.repair(marin);

	}

}
