package Chapter2객체지향입문.ch18싱글톤;

public class Company {

	private static Company instance = new Company();
	
	String test;
	public String getTest() {
		return test;
	}

	public void setTest(String test) {
		this.test = test;
	}

	private Company() {}
	
	public static Company getInstance() {
		
		if(instance == null) instance = new Company();
		return instance;
	}
}
