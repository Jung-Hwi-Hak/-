package Chapter2객체지향입문.ch13복습;

public class TranceTest {

	public static void main(String[] args) {
		Taxi taxi = new Taxi("잘나간다 운수");
		Human human = new Human("Jung", 20000);
		
		human.take(taxi);
		human.showHumanInfo();
		taxi.showTaxiInfo();
	}

}
