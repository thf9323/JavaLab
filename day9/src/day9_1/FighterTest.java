package day9_1;

public class FighterTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Fighter f = new Fighter();
		
		if (f instanceof Uint)
			System.out.println("f는 Uint클래스의 자손입니다.");
		if (f instanceof Fightable)
			System.out.println("f는 Fightable 인터페이스를 구현했습니다..");
		if (f instanceof Movable)
			System.out.println("f는 Movable인터페이스를 구현했습니다.");
		if (f instanceof Attackable)
			System.out.println("f는 attackable인터페이스를 구현했습니다.");
		if (f instanceof Object)
			System.out.println("f는 Object클래스의 자손입니다.");

	}

}
