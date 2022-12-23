package ch04;

public class StudentTest {

	public static void main(String[] args) {
		
//		Student : 데이터 타입, Student() : 생성자
		Student studentLee = new Student(); // 인스턴스 생성
		
		studentLee.studentID = 2910;
		studentLee.setStudentName("Lee");
		studentLee.address = "효성동";
		studentLee.showStudentInfo();
		
		Student studentJung = new Student();
		
		studentJung.studentID = 4488;
		studentJung.studentName = "Jung";
		studentJung.address = "삼보주택";
		studentJung.showStudentInfo();
		
		System.out.println(studentJung);
		System.out.println(studentLee);
	}

}
