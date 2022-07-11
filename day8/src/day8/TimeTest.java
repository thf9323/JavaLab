package day8;

import java.sql.Time;

public class TimeTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Time t =new Time(12,35,30);
		System.out.println(t);
		//t.hour = 13;
		t.setHours(t.getHours()+1);
		System.out.println(t);
	}

}
