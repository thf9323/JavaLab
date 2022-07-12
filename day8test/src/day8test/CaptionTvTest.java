package day8test;


public class CaptionTvTest{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CaptionTv ctv = new CaptionTv();
		ctv.channel = 10;
		ctv.channelUp();
		System.out.println(ctv.channel);
		ctv.displayCaption("hello,world");
		ctv.Caption = true;
		ctv.displayCaption("hello,world");

	}

}
