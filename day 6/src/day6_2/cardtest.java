package day6_2;

public class cardtest {

	public static void main(String[] args) {
		// 클래스 변수는 객체 생성 없이도 바로 호출 가능하다.
		System.out.println("card width =" + Card.width);
		System.out.println("card highth =" + Card.hight);
		
		//인스턴스 변수는 객체를 생성해야만 호출 가능하다.
		Card c1 = new Card();
		c1.kind  = "heart";
		c1.number  = 7;
		
		Card c2 = new Card();
		c2.kind  = "spade";
		c2.number  = 4;
		
		System.out.println("c1은 "+ c1.kind+ "," + c1.number + "이며 크기는(" + c1.width + "," +c1.hight+ ")" );
		System.out.println("c2은 "+ c2.kind+ "," + c2.number + "이며 크기는(" + c2.width + "," +c2.hight+ ")" );
		
		System.out.println("c1의 width와 hight울 50, 80으로 변경");
		c1.width = 50;
		c1.hight = 80;
		
		System.out.println("c1은 "+ c1.kind+ "," + c1.number + "이며 크기는(" + c1.width + "," +c1.hight+ ")" );
		System.out.println("c2은 "+ c2.kind+ "," + c2.number + "이며 크기는(" + c2.width + "," +c2.hight+ ")" );
		
	}

}
