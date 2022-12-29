package Chapter2객체지향입문.ch09참조자료형변수;

public class Student {

	int studentID; // 멤버 변수
	String studentName;
	
	Subject korea; //참조 자료형 변수
	Subject math;
	
	public Student(int id, String name) {
		
		this.studentID = id;
		this.studentName = name;
		
		korea = new Subject();
		math = new Subject();
	}
	
	public void setKoreaSubject(String name, int score) {
	
		korea.subjectName = name;
		korea.score = score;
	}
	
	public void setMathSubject(String name, int score) {
		
		math.subjectName = name;
		math.score = score;
	}
	
	public void showScore() {
		
		int total = korea.score + math.score;
		System.out.println(studentName + " 학생의 총점은 : "+ total + "점 입니다.\n" + korea.subjectName +" : "+ korea.score );
	}
}
