package Chapter2객체지향입문.ch08;

public class UserInfoTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		UserInfo userInfo = new UserInfo();
		
		userInfo.name = "정휘학";
		userInfo.age = "28";
		userInfo.cm = "180";
		userInfo.kg = "61";
		
		System.out.println(userInfo.showUserInfo());
	}

}
