package day8;

public class Time {
	private int hour, int minute, int seconde;

	Time(int hour,int minute, int second){
		setHour(hour);
		setMinute(minute);
		setSeconde(second);
	}
	public int getHour() {
		return hour;
	}
	public void setHour(int hour) {
		if(hour <0|| hour>23)return;
		this.hour= hour;
	}
	public int getMinute() {
		return minute;
	}
	public void setMinute(int minute) {
		if(minute <0|| minute>59)return;
		this.minute= minute;
	}
	public int getSeconde() {
		return seconde;
	}
	public void setSeconde(int seconde) {
		if(seconde <0|| seconde>59)return;
		this.seconde= seconde;
	}
	public String toString() {
		return hour +":" +minute + ":" +seconde;
	}
}
//////////////
