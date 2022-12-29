package Chapter2객체지향입문.ch18싱글톤;

import java.util.Calendar;

public class CompanyTest {

	public static void main(String[] args) {
		
		Company company1 = Company.getInstance();
		Company company2 = Company.getInstance();
		
		company1.test = "test";
		System.out.println(company1.test);
		System.out.println(company2.test);
		
		Calendar calendar = Calendar.getInstance();
		System.out.println(calendar);

	}

}
