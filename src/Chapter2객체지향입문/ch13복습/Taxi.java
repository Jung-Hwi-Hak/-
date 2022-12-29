package Chapter2객체지향입문.ch13복습;

public class Taxi {

	String company; // 택시 회사
	int money;
	
	public Taxi() {}
	
	public Taxi(String company) {
		this.company = company;
	}
	
	public void take(int money) {
		this.money += money;
	}
	

	public void showTaxiInfo() {
		System.out.println(company + " 수입은 " + money + "원 입니다.");
	}
}
