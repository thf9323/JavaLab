package day6_9;

public class Car {

	String color;
	String greaType;
	int door;
	
	Car(){
		this("white", "auto", 4);
	}
		
	Car(String color) {
		this(color, "auto", 4);
	}
	
	Car(String color, String gearType, int door){
		this.color = color;
		this.greaType = greaType;
		this.door = door;
		
	}
}
