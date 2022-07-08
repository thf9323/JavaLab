package day7_1;

class Sample{
	String name;
	
	public void setName(String name) {
        this.name = name;
}
}

public class Animal {
	public static void main(String[] args) {
		Sample cat =new Sample();
		cat.setName("boby");

		Sample dog =new Sample();
        dog.setName("happy");
        
        System.out.println(cat.name);
        System.out.println(dog.name);
		
	}
	
}
