package day6_8;

public class CarTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car c1 = new Car();
		c1.color = "white";
		c1.gearType = "auto";
		c1.door = 4;
		
		Car c2 = new Car("white","auto", 4);
		
		System.out.println("c1의 color=" + c1.color + ", gearType="
							+ c1.gearType+ ", door="+ c1.door);
		System.out.println("c의 color=" + c1.color + ", gearType="
							+ c2.gearType+ ", door="+ c2.door);
	}

}
