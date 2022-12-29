package Chapter2객체지향입문.ch11캡슐화;

public class MakeReportTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MakeReport builder = new MakeReport();
		String report = builder.getReport();
		
		System.out.println(report);
	}

}
