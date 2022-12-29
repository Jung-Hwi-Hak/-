package Chapter2객체지향입문.ch10접근제어지시자;

public class BirthDayTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		BirthDay date = new BirthDay();
		
		date.setYear(2022);
		date.setMonth(12);
		date.setDay(20);
		
		date.showDate();
	}

}
