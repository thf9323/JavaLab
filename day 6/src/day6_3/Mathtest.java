package day6_3;

public class Mathtest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Math m = new Math();
		long result1 = m.add(5L, 3L);
		long result2 = m.st(5L, 3L);
		long result3 = m.mt(5L, 3L);
		double result4 = m.de(5L, 3L);
		
		System.out.println("add(5L, 3L) =" + result1);
		System.out.println("st(5L, 3L) =" + result2);
		System.out.println("mt(5L, 3L) =" + result3);
		System.out.println("de(5L, 3L) =" + result4);
	}

}
