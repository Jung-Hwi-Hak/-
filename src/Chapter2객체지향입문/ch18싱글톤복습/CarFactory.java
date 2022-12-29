package Chapter2객체지향입문.ch18싱글톤복습;

public class CarFactory {

	private static CarFactory instance = new CarFactory(); // 유일 객체 인스턴스
	private int seq = 1000; // 시퀀스
	
	public static CarFactory getInstance() {
		return instance;
	}
	
	public CarFactory() {}
	
	public Car createCar() {
		Car car = new Car();
		seq++;
		car.setCarNum(seq);
		return car;
	}
	
}
