package day7_1;
class Tv{
	boolean power;
	int channel;
	
	void power() {power = !power;}
	void channelUp() { ++channel;}
	void channelDown() { --channel;}
}
class CaptionTv extends Tv{
	boolean Caption;
	void displayCaption(String text) {
		if(caption) {
			System.out.println(text);
		}
	}
}

public class CaptionTvTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		CaptionTv ctv = new CaptionTv();
		ctv.channel = 10;
		ctv.channelUp();
		System.out.println(ctv.channel);
		ctv.displayCaption("hello,world");
		ctv.caption = true;
		ctv.displayCaption("hello,world");
	}

}
