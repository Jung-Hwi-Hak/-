package Chapter2객체지향입문.ch12This;

public class Person {

	String name;
	int age;
	
	public Person() {
		this("이름없음", 0);
	}
	
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	public void showPerson() {
		System.out.println(name +", "+ age);
	}
	
	public Person getPerson() {
		return this; // 자신의 힙 메모리 주소를 반환해줌
	}
	
	public static void main(String[] agrs) {
		
		Person person = new Person();
		person.showPerson();
		System.out.println(person);
		
		
		Person person2 = person.getPerson();
		System.out.println(person2);
	}
}
