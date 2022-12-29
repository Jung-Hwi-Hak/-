package Chapter2객체지향입문.ch11캡슐화;

public class MakeReport {

	StringBuffer buffer = new StringBuffer();
	
	private String line = "======================================\n";
	private String title = "이름\t 주소 \t\t 전화번호 \n";
	
	private void makeHeader() {
		buffer.append(line);
		buffer.append(title);
		buffer.append(line);
	}
	
	private void generateBody() {
		buffer.append("James \t");
		buffer.append("Seoul Korea \t");
		buffer.append("010-2020-2020\n");
		
		buffer.append("Tomas \t");
		buffer.append("NewYork US \t");
		buffer.append("010-1010-1010\n");
	}
	
	private void makeFooter() {
		buffer.append(line);
	}
	
	public String getReport() {
		makeHeader();
		generateBody();
		makeFooter();
		
		return buffer.toString();
	}
}
