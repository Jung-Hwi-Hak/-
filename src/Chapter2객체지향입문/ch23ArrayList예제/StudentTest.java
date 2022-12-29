package Chapter2객체지향입문.ch23ArrayList예제;

/**
 * StudentTest.java
 * Class 설명을 작성하세요.
 *
 * @autor owner
 * @since 2022.12.29
 */
public class StudentTest {

    public static void main(String[] args){

        Student studentJung = new Student(1001, "Jung");

        studentJung.addSubject("국어", 100);
        studentJung.addSubject("수학", 50);
        studentJung.showStudentInfo();
    }
}
