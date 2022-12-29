package Chapter2객체지향입문.ch13복습;


public class Human {

	String name;
	int money;
	
	public Human(String name, int money) {
		this.name = name;
		this.money = money;
		
	}
	
	public void take(Taxi taxi) {
		
		taxi.take(10000);
		money -= 10000;
	}
	
	public void showHumanInfo() {
		System.out.println(name + "님의 남은 돈은 "+money+"원 입니다.");
	}
}
