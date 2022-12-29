package Chapter2객체지향입문.ch23ArrayList예제;

import java.util.ArrayList;

/**
 * Student.java
 * Class 설명을 작성하세요.
 *
 * @autor owner
 * @since 2022.12.29
 */
public class Student {

    int studentID;
    String studentName;
    int studentTotalScore;
    ArrayList<Subject> subjects = new ArrayList<>();

    public Student(){}

    public Student(int studentID, String studentName){
        this.studentID = studentID;
        this.studentName = studentName;
    }

    public void addSubject(String subjectName, int subjectScore){
        Subject subject = new Subject(subjectName, subjectScore);
        subjects.add(subject);
    }

    public void showStudentInfo(){

        for(Subject subject : subjects){
            studentTotalScore += subject.subjectScore;
            System.out.println("학생 "+studentName+ "의 "+subject.subjectName+" 과목 성적은 "+subject.subjectScore+"입니다.");
        }
        System.out.println("학생 "+studentName+ "의 총점은 "+studentTotalScore+" 입니다.");
    }
}
