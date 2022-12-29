package Chapter2객체지향입문.ch07;

public class UserInfoTest {

	public static void main(String[] args) {
		
		UserInfo userInfo = new UserInfo(); // 인터페이스
		userInfo.userId = "Jung";
		userInfo.userPassWord = "4488";
		userInfo.userName = "정휘학";
		userInfo.phoneNumber = "01012345678";
		userInfo.userAddress = "Seoul";
		
		System.out.println(userInfo.showUserInfo());
		
		UserInfo user = new UserInfo("Hwi", "0808", "Jung");
		System.out.println(user.showUserInfo());

	}

}
