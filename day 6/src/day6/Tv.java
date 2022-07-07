package day6;

public class Tv {
	String color;
	boolean power;
	int channel;
	// TODO Auto-generated method stub

	void power() {
		power = ! power;
	}
	void channelUp() {
		++channel;
	}
	void channelDown() {
		--channel;
	}
}
