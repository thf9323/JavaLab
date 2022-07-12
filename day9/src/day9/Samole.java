package day9;

public class Samole {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Zookeeper zookeeper = new Zookeeper();
		Tiger tiger = new Tiger();
		Lion lion = new Lion();
		zookeeper.feed(tiger);
		zookeeper.feed(lion);
	}

}
