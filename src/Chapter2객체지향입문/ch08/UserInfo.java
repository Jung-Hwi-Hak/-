package Chapter2객체지향입문.ch08;

public class UserInfo {

	String name;
	String age;
	String sex;
	String cm;
	String kg;
	
	public UserInfo() {}
	public UserInfo(String name, String age) {}
	
	public String showUserInfo() {
		return "키가 " + cm + "이고 몸무게가 " +kg+ " 킬로인 남성이 있습니다. 이름은 "+name+" 이고 나이는 "+age+"세 입니다.";
	}
}
