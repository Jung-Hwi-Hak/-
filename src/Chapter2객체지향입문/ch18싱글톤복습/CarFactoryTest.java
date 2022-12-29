package Chapter2객체지향입문.ch18싱글톤복습;

public class CarFactoryTest {

	public static void main(String[] args) {

		CarFactory factory = CarFactory.getInstance();
		
		Car car1 = factory.createCar();
		Car car2 = factory.createCar();
		
		System.out.println(car1.getCarNum());
		System.out.println(car2.getCarNum());
		
		
	}

}
