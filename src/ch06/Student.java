package ch06;

public class Student {
		
	public int studentNumber;
	public String studentName;
	public int grade; // 멤버 변수이며 객체가 만들어질 때 자동으로 초기화가 됨. int : 0, String : null
	
	public Student(int studentNumber, String studentName, int grade) { // 생성자.

		// this. 키워드를 사용하여 멤버 변수라는 것을 명시해줌
		this.studentNumber = studentNumber;
		this.studentName = studentName;
		this.grade = grade;
	}
	
	
	public String showStudentInfo() {
		return studentNumber + "학번의 이름은 " + studentName + "이고, " +grade+ "학년 입니다.";
	}
}
