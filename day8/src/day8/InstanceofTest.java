package day8;


public class InstanceofTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FireEngine fe = new FireEngine();
		
		if(fe instanceof FireEngine) {
			System.out.println("this is a FireEngine instance");;
		}
		if(fe instanceof Car) {
			System.out.println("this is a Car instance");
		}
		if(fe instanceof Object) {
			System.out.println("this is an Object instance.");
		}
		System.out.println(fe.getClass().getName());

	}
}
class Car{}
class FireEngine extends Car{}
