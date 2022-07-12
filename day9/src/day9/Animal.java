package day9;

public class Animal {
	String name;
	 void setName(String name) {
	        this.name = name;
//	    	}
	    }
	}

class Tiger extends Animal implements Predator{
	public String getFood() {
		return "apple";
	}
}
class Lion extends Animal implements Predator{
	public String getFood() {
		return "banana";
}
}
//implements Predator  인터페이스 구현한다.

class Zookeeper{
	void feed(Predator predator) {
		System.out.println("feed " + predator.getFood());
	}
}

	