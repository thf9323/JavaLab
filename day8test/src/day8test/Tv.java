package day8test;

class Tv {
	boolean power;
	int channel;
	
	void power() {power = !power;}
	void channelUp() { ++channel;}
	void channelDown() { --channel;}
}
class CaptionTv extends Tv{
	boolean Caption;
	void displayCaption(String text) {
		if(Caption) {
			System.out.println(text);
		}
	}
}
