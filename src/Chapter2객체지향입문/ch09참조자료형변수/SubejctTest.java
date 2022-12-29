package Chapter2객체지향입문.ch09참조자료형변수;

public class SubejctTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Student student = new Student(100, "Jung"); // 인스턴스
		
		student.setKoreaSubject("국어", 100);
		student.setMathSubject("수학", 100);
		
		student.showScore();
		
	}

}
