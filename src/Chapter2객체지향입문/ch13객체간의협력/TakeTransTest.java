package Chapter2객체지향입문.ch13객체간의협력;

public class TakeTransTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		Student studentJ = new Student("James", 5000);
		Student studentL = new Student("Lee", 10000);
		
		Bus bus100 = new Bus(100);
		Bus bus500 = new Bus(500);
		
		studentJ.takeBus(bus100);
		
		Subway greenSubway = new Subway(2);
		studentL.takeSubway(greenSubway);

		studentJ.showInfo();
		studentL.showInfo();
		
		bus100.showBusInfo();
		greenSubway.showSubwayInfo();
		
		bus500.showBusInfo();
	}

}
