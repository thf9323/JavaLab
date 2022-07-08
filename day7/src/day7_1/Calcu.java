package day7_1;

public class Calcu {
	
	static int rt = 0;
	
	static int add(int num) {
		rt +=num;
		return rt;
	}
	
	static int sub(int num) {
		rt -= num;
		return rt;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		System.out.println(Calcu.add(3));
//        System.out.println(Calcu.add(4));
		Calcu cal1 = new Calcu();  // 계산기1 객체를 생성한다.
		Calcu cal2 = new Calcu();  // 계산기2 객체를 생성한다.

        System.out.println(cal1.add(3));
        System.out.println(cal1.add(4));

        System.out.println(cal2.sub(3));
        System.out.println(cal2.sub(7));
	}

}
