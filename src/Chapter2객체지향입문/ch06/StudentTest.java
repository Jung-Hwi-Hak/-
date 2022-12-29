package Chapter2객체지향입문.ch06;

public class StudentTest {

	public static void main(String[] args) {
		
		Student studentLee = new Student(4488, "Lee", 1);
		
//		studentLee.studentNumber = 4488;
//		studentLee.studentName = "Lee";
//		studentLee.grade = 1;
		
		System.out.println(studentLee.showStudentInfo()); 
	}

}
